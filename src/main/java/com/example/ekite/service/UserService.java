package com.example.ekite.service;

import com.example.ekite.apis.UserApiDelegate;
import com.example.ekite.models.User;
import com.example.ekite.models.UserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UserService implements UserApiDelegate {
    private final Map<Integer, User> users = new HashMap<>();
    private final AtomicInteger idCounter = new AtomicInteger(1);

    @Override
    public ResponseEntity<User> createUser(UserRequest userCreate) {
        Integer id = idCounter.getAndIncrement();
        User newUser = User.builder()
                .id(id)
                .email(userCreate.getEmail())
                .name(userCreate.getName())
                .build();
        users.put(id, newUser);

        return ResponseEntity.status(201).body(newUser);
    }

    @Override
    public ResponseEntity<Void> deleteUser(Integer id) {
        users.remove(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<User> getUserById(Integer id) {
        return ResponseEntity.ok(users.get(id));
    }

    @Override
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(new ArrayList<>(users.values()));
    }


    @Override
    public ResponseEntity<User> updateUser(Integer id,
                                            UserRequest userRequest) {
        User existing = users.get(id);
        if (existing == null) return ResponseEntity.notFound().build();
        if (userRequest.getName() != null) existing.setName(userRequest.getName());
        if (userRequest.getEmail() != null) existing.setEmail(userRequest.getEmail());

        return ResponseEntity.ok(existing);
    }
}
