package com.learning.spring.springweb;

public record Comment(Long postId, Long id, String name, String email, String body) {
}
