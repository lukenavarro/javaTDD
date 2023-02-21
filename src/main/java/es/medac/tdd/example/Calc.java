package es.medac.tdd.example;

public class Calc {
    private int num1;
    private int num2;
    public Calc(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int sumar(){
        return this.num1+this.num2;
    }
    public int restar(){
        return this.num1-this.num2;
    }
    public int mult(){
        return this.num1*num2;
    }

    public int div(){
        return this.num1/num2;
    }


}
