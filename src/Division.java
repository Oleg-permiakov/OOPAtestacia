package src;

public  class Division implements CalcAct{
    private String div;

    public Division(double valueA, String act, double valueB) {
        this.div = "/";
    }

    @Override
    public void calcAct(double valueA, String act, double valueB) {
        if (valueB == 0) {
            System.out.println("На ноль делить нельзя");
            
        }
        if (act.equals(div)) {
            double resalt = valueA / valueB;
            System.out.println(resalt);
        }
    }

    public String getdiv() {
        return div;
    }

    public void setdiv(String div) {
        this.div = div;
    }
   
 
}

