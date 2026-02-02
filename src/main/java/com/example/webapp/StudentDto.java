package com.example.webapp;

public record StudentDto(
        String firstname,
        String lastname,
        String email,
        Integer schoolId
) {
}
