package org.example.lab3;

import org.example.lab3.util.ActivationFunction;

public class Parceptron {
    private int n;
    private double[] w;
    private double b;

    public Parceptron(int n) {
        this.n = n;
        w = new double[n];
        b = 0;
    }

    private int trainOneExample(double[] x, int target ){
        int classified = 0;
        double predict = b;

        for(int i = 0; i < n; i++) {
            predict += w[i] * x[i];
        }

        if( )
    }

}
