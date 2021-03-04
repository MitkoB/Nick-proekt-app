package com.example.nick.exception;


public class CategoryNotFound extends RuntimeException{
    public CategoryNotFound() {
        super("Category not found");
    }
}
