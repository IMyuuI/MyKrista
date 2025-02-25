package ru.krista.example;

public class Calculator {
    public double num1,num2,result;
    public String sign;
    public String str;

    public Calculator(String str){
        this.str = str;
    }

    public void Calc(){
        String[] parts = str.split(" ");
        for (int i = 0; i <= parts.length-1; i++){
            if (i==0){
                try{
                    this.num1 = Integer.parseInt(parts[i]);
                } catch (NumberFormatException e){
                    System.out.println("Не удалось получить число из строки!");
                    break;
                }
            }
            if (i==1)
                this.sign = parts[i];
            if (i==2){
                try{
                    this.num2 = Integer.parseInt(parts[i]);
                } catch (NumberFormatException e){
                    System.out.println("Не удалось получить число из строки!");
                    break;
                }
            }
        }
        switch (this.sign){
            case "+":
                plus();
                break;
            case "-":
                minus();
                break;
            case "*":
                zvezda();
                break;           
            case "/":
                slash();
                break;
            default:
                System.out.println("Знак не найден!");
                break;
        }
    }
    public void plus(){
        System.out.println(result = this.num1+this.num2);
    }
    public void minus(){
        System.out.println(result = this.num1-this.num2);
    }
    public void zvezda(){
        System.out.println( result = this.num1*this.num2);
    }
    public void slash(){
        if (this.num2!=0)
            System.out.println(result = this.num1/this.num2);
        else
            System.out.println("Незя так делить!");
    }
}
