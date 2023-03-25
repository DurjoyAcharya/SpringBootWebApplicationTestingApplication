package com.app.springbootwebapplicationtesting.Algorithm;

public class PowRecursion {
    public static void main(String[] args) {
        assert Double.compare(power(2,0),Math.pow(2,0))==0;
        assert Double.compare(power(0, 2), Math.pow(0, 2)) == 0;
        assert Double.compare(power(2, 10), Math.pow(2, 10)) == 0;
        assert Double.compare(power(10, 2), Math.pow(10, 2)) == 0;
    }
    public static long power(int a, int b)
    {
        return b==0 ? 1:a*power(a,b-1); //Recursion based finding power of a number
    }
}
