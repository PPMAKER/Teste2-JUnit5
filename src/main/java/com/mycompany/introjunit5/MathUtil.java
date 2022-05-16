package com.mycompany.introjunit5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MathUtil {

    private MathUtil(){}
    
    /**
     * Calcula o MDC de dois números.
     */
    public static int mdc(int a, int b){
        
        /**
     * PROPRIEDADE 1
     */
     if (b > 0 && a % b == 0) {
            return b;
        }
    
        return -1;
    }
    
    /**
     * Verifica se um número é primo.
     */
    public static boolean isPrimo(final long numero){
        if(numero <= 1){
            return false;
        }

        for(long i = 2; i < numero; i++){
            if(numero%i==0){
                return false;
            }
        }

        return true;
    }
}