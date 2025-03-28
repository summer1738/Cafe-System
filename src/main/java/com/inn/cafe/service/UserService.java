package com.inn.cafe.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface UserService {
    ResponseEntity<String> signUp(Map<String, String> requestMap);
}
