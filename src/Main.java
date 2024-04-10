package src;


public class Main {
    
    public static void main (String[] args) {
        
        double valueA = 0;
        String act = null;
        double valueB = 0;

        Calculator resalt = new Calculator(new Addition(valueA, act, valueB));
        resalt.calcAct();
        Calculator resalt1 = new Calculator(new Subtraction(valueA, act, valueB));
        resalt1.calcAct();
        Calculator resalt2 = new Calculator(new Division(valueA, act, valueB));
        resalt2.calcAct();
        Calculator resalt3 = new Calculator(new Multiplication(valueA, act, valueB));
        resalt3.calcAct();
        
    }
    

}