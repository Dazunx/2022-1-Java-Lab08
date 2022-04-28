package edu.handong.csee.java.lab08.math;

public class MathCalculator {
    private String name;

    public void setName(String str){
        name = str;
    }
    public String getName(){
        return name;
    }
    public int getMax(int a, int b){
        if(a>b) return a;
        else return b; 
    }
    public int getMin(int a, int b){
        if (a<b) return a;
        else return b;
    }
    public int getAbs(int num){
        return Math.abs(num);
    }
    public int getSum(int a, int b){
        return a+b;
    }
    public int getDiff(int a, int b){
        return a-b;
    }
    public int getProduct(int a, int b){
        return a*b;
    }
    public int getQuotient(int a, int b){
        return (int)a/b;
    }
    public int getRemainder(int a, int b){
        return a%b;
    }
    public int getPower(int a, int b){
        if(a==0) return 1;
        else return (int)Math.pow(a,b);
    }
    public int getFactorial(int num){
        if(num==1) return 1;
        else return num*getFactorial(num-1);
    }
    public int getGcd(int a, int b){
        if(b==0) return a;
        return getGcd(b,a%b);
    }
    public int getLcm(int a, int b){
        return (a*b)/getGcd(a,b);
    }
    public int getSquare(int num){
        return num*num;
    }

}