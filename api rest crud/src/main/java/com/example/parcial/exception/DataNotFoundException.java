package com.example.parcial.exception;

import java.io.Serial;


public class DataNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = -5052930694766358091L;
    public DataNotFoundException(String aMensa){
        super(aMensa);
    }
}
