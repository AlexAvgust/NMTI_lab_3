package org.example.lab3;

import java.util.Arrays;
import static org.example.lab3.util.ActivationFunction.step;

public class Parceptron {
    private int n;
    private double[] w;
    private double b;

    public Parceptron(int n) {
        this.n = n;
        w = new double[n];
        b = 0;
    }

    private int trainOneExample(double[] x, int target) {
        int classified = 0;
        double predict = b;

        for (int i = 0; i < n; i++) {
            predict += w[i] * x[i];
        }
        if (step(predict) == step(target)) {
            classified = 1;
        } else {
            if (target == 1) {
                for (int i = 0; i < n; i++) {
                    w[i] += x[i];
                    b += 1;
                }
            } else {
                for (int i = 0; i < n; i++) {
                    w[i] -= x[i];
                    b -= 1;
                }
            }
        }
        return classified;
    }

    @Override
    public String toString() {
        return "b=" + b + "; w=" + Arrays.toString(w);
    }

    public void train(double[][] trainX, int[] trainT, int maxEpochs) {
        int epoch = 0;
        while (true) {
            int classified_ = 0;

            System.out.println("Epoch: " + epoch);

            for (int i = 0; i < trainX.length; i++) {
                classified_ += trainOneExample(trainX[i], trainT[i]);
            }
            System.out.println("Classified: " + classified_ + "\n  ");
            System.out.println(this);

            if (classified_ == trainX.length)
                break;

            epoch++;

            if (epoch > maxEpochs)
                break;
        }
    }

    public int predict(double[] x) {
        double preActivation = b;
        for (int i = 0; i < n; i++) {
            preActivation += w[i] * x[i];
        }
        return step(preActivation);
    }

}
