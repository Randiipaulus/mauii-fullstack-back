package com.mauii.school.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Cloud not found the user with id" + id);
    }
}
