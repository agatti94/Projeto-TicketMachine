package com.mycompany.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String errorMessage){
        super(errorMessage);
    }
}
