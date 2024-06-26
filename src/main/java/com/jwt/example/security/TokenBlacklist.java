package com.jwt.example.security;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

public interface TokenBlacklist {
    void addToBlacklist(String token);
    boolean isBlacklisted(String token);
}

