package com.practica1.exceptions;

public class DuplicateLicensePlateException extends Exception{
    public DuplicateLicensePlateException(String licencePlate){
        super("La matrícula " + licencePlate + " ya está registrada.");
    }
}
