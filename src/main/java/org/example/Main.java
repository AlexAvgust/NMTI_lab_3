package org.example;

import org.example.lab3.Parceptron;
import java.io.IOException;
import org.example.lab3.util.AlphabetMapping;
import org.example.lab3.util.DataInitialization;
public class Main {
    public static void main(String[] args) throws IOException {
        AlphabetMapping mapping = new AlphabetMapping();
        DataInitialization dataInitialization = new DataInitialization();

        final int maxEpochs = 2000;
        int n = 20;
        int[] trainT = dataInitialization.getTraninT();
        double[][] trainX = dataInitialization.getTraninX();


        Parceptron classifier = new Parceptron(n);


        classifier.train(trainX, trainT, maxEpochs);

        int indexOfPredictedLetter = 0;

        for (int i = 0; i < trainX.length; i++) {
            int predict = classifier.predict(trainX[i]);
            if (predict == 1) {
                indexOfPredictedLetter = i;

            }
        }
        String letter = mapping.getLetter(indexOfPredictedLetter);

        System.out.println("Your prediction is letter: " + letter);
    }
}



// кон'юнкція, 2І, мінімум,
// детектор 8
// double[][] trainX = {
// { 1, 1 },
// { 1, 0 },
// { 0, 1 },
// { 0, 0 }
// };

// int[] trainT = { 1, 0, 0, 0 };

// classifier.train(trainX, trainT, maxEpochs);

// double[] test = { 1, 1 };
// System.out.println(classifier.predict(test));
