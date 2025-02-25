package ru.krista.example;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Введите первое число, операцию, второе число через пробел: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Calculator Calc1 = new Calculator(str);
        Calc1.Calc();
        
    }
}
