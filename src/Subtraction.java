package src;

public  class Subtraction implements CalcAct{
    private String minus;
    
    public Subtraction(double valueA, String act, double valueB) {
        this.minus = "-";
    }
    public String getMinus() {
        return minus;
    }
    public void setMinus(String minus) {
        this.minus = minus;
    }
        
    @Override
    public void calcAct(double valueA, String act, double valueB) {
        if (act.equals(minus)) {
            double resalt = valueA - valueB;
            System.out.println(resalt);
        }
        
    }


}
