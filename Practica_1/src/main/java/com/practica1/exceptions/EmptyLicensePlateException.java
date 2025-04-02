package com.practica1.exceptions;

public class EmptyLicensePlateException extends Exception{
    public EmptyLicensePlateException(){
        super("No hay vehículos registrados.");
    }
}
