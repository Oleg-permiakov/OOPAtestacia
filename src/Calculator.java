package src;

public class Calculator {
    private CalcAct calculator;

    public Calculator(CalcAct calculator) {
        this.calculator = calculator;
    }
    
    public void calcAct(){
        calculator.calcAct(28, "+", 32);
    }
 
}
