package com.tadiwa;

// EXPLAIN: Class marked as final to prevent it from being inherited or extended by another class
// Can be a useful design choice for security reasons to prevent a hacker from extending a core
// class like a transaction processor and adding malicious custom logic at runtime

public final class ImmutablePerson {

    // EXPLAIN: Final fields means fullName and age
    // can only be assigned a value once
    public final String fullName;
    public final int age;

    public ImmutablePerson(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        ImmutablePerson tadiwa = new ImmutablePerson("Tadiwanashe", 20);
    }
}
