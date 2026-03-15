package com.refactoring.projects.project07;

public class OrderProcessor {

    public double calcularEnvio(double peso, String destino) {
        if (destino.equals("nacional")) {
            if (peso < 5) return peso * 2.5;
            else return peso * 2.5 * 0.9;
        } else {
            if (peso < 5) return peso * 5.0;
            else return peso * 5.0 * 0.85;
        }
    }
    
    class DetallePedido {
        String producto;
        int cantidad;
        double precio;
    }
}
