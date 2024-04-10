package src;


public  class Addition implements CalcAct{
    private String plus;

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public Addition(double valueA, String act, double valueB) {
        this.plus = "+";
    }

    @Override
    public void calcAct(double valueA, String act, double valueB) {
        if (act.equals(plus)) {
            double resalt = valueA + valueB;
            System.out.println(resalt);
        }
        
    }
}
