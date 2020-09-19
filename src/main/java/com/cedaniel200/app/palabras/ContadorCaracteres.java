package com.cedaniel200.app.palabras;

import java.util.List;

public class ContadorCaracteres {

    public int contar(String palabra){
        return palabra.length();
    }

    public int contar(List<String> palabras){
        return palabras.stream().mapToInt(String::length).sum();
    }
}
