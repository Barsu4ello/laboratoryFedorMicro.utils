package com.cvetkov.fedor.laboratoryworkmicro.utils.enums;

public enum Role {

    ADMIN("ADMIN"),
    USER("USER");

    private final String name;

    Role(String role) {
        this.name = role;
    }

    public String getName() {
        return name;
    }
}
