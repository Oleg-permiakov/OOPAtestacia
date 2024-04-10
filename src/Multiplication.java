package src;


public class Multiplication implements CalcAct {
    private String mult;

    public Multiplication(String mult) {
        this.mult = "*";
    }

    @Override
    public void calcAct(double valueA, String act, double valueB) {
        if (act.equals(mult)) {
            double resalt = valueA * valueB;
            System.out.println(resalt);

        }
        
    }

    public String getMult() {
        return mult;
    }

    public void setMult(String mult) {
        this.mult = mult;
    }
}