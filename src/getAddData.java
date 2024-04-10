package src;


public abstract class getAddData {
    double valueA;
    String act;
    double valueB;
    
    public getAddData(double valueA, String act, double valueB) {
        this.valueA = valueA;
        this.act = act;
        this.valueB = valueB;
    }
    public double getValueA() {
        return valueA;
    }
    public String getAct() {
        return act;
    }
    public double getValueB() {
        return valueB;
    }
    public void setValueA(double valueA) {
        this.valueA = valueA;
    }
    public void setAct(String act) {
        this.act = act;
    }
    public void setValueB(double valueB) {
        this.valueB = valueB;
    }
    
    public abstract double calcAct();
}
