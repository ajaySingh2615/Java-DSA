package com.methods;

public class FindBinomialCoefficient {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        System.out.println(binomialCoefficient(n, r));
    }

    public static int binomialCoefficient(int n, int r){
        int fact_n = FindFactorial.factorial(n);
        int fact_r = FindFactorial.factorial(r);
        int fact_n_minus_fact_r = FindFactorial.factorial(n-r);

        return fact_n / (fact_r * fact_n_minus_fact_r);
    }
}
