package com.practica1.exceptions;

public class TypeNotFoundException extends Exception{
    public TypeNotFoundException(String type) {
        super("No se han encontrado vehículos del tipo " + type + ".");
    }
}
