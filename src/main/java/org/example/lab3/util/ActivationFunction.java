package org.example.lab3.util;

public class ActivationFunction {
    public static int step(double x) {
        if(x > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
