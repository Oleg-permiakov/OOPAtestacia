package src;

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        
        System.out.println("Введите первое значение с разделением через точку");
        Scanner scan = new Scanner(System.in);
        double valueA = Double.parseDouble(scan.nextLine());
        System.out.println("Введите действие");
        String act = scan.nextLine();
        System.out.println("Введите второе значение с разделением через точку");
        double valueB = Double.parseDouble(scan.nextLine());
        scan.close();

        Calculator resalt = new Calculator(new Addition(valueA, act, valueB));
        resalt.calcAct();
        
    }
    

}