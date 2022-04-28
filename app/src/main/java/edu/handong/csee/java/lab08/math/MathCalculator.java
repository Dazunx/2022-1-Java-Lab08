package edu.handong.csee.java.lab08.math;

/**
 This is a MathCalculator class that calculates formulas. 
 */
public class MathCalculator {
    private String name;

    /**
     This method sets the user's name.
     @param str The name of the user entered by the user.
     */
    public void setName(String str){
        name = str;
    }
    /**
     This method returns the user's name.
     */
    public String getName(){
        return name;
    }
    /**
     Returns the greater of the two numbers entered by the user.
     @param a,b  two numbers entered by the user.
     */
    public int getMax(int a, int b){
        if(a>b) return a;
        else return b; 
    }
    /**
     Returns the smaller of the two numbers entered by the user.
     @param a,b  two numbers entered by the user.
     */
    public int getMin(int a, int b){
        if (a<b) return a;
        else return b;
    }
    /**
     Returns the absolute value of the number entered by the user.
     @param num number entered by the user.
     */
    public int getAbs(int num){
        return Math.abs(num);
    }
    /**
     Returns the sum of two numbers entered by the user.
     @param a,b two numbers entered by the user.
     */
    public int getSum(int a, int b){
        return a+b;
    }
    /**
     Returns the difference  of two numbers entered by the user.
     @param a,b two numbers entered by the user.
     */
    public int getDiff(int a, int b){
        return a-b;
    }
    /**
     Returns the product of two numbers entered by the user.
     @param a,b two numbers entered by the user.
     */
    public int getProduct(int a, int b){
        return a*b;
    }
    /**
     Returns the quotient of two numbers entered by the user.
     @param a,b two numbers entered by the user.
     */
    public int getQuotient(int a, int b){
        return (int)a/b;
    }
    /**
     Returns the remainder of two numbers entered by the user.
     @param a,b two numbers entered by the user.
     */
    public int getRemainder(int a, int b){
        return a%b;
    }
    /**
     Returns a to the power of b.
     @param a,b two numbers entered by the user.
     */
    public int getPower(int a, int b){
        if(a==0) return 1;
        else return (int)Math.pow(a,b);
    }
    /**
     Returns the factorial of a.
     @param num number entered by the user.
     */
    public int getFactorial(int num){
        if(num==1) return 1;
        else return num*getFactorial(num-1);
    }
    /**
     Returns the greatest common divisor of a and b.
     @param a,b two numbers entered by the user.
     */
    public int getGcd(int a, int b){
        if(b==0) return a;
        return getGcd(b,a%b);
    }
    /**
     Returns the least common multiple of a and b.
     @param a,b two numbers entered by the user.
     */
    public int getLcm(int a, int b){
        return (a*b)/getGcd(a,b);
    }
    /**
     Returns the square of num.
     Returns num*num.
     */
    public int getSquare(int num){
        return num*num;
    }

}