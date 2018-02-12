public class Komplex {
    //variabler
    private double a;
    private double b;

    //konstruktor
    public Komplex(double re, double in){
        this.a = re;
        this.b = in;
    }

    //metoder
    public String toString(){
        if(b < 0){
            return a + " - " + (-b) + " i";
        }else {
            return a + " + " + b + " i";
        }
    }

    public void add(Komplex z2) {
        a = a+z2.a;
        b = b+z2.b;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double arg() {
        return Math.atan(a/b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Komplex komplex = (Komplex) o;

        if (Double.compare(komplex.a, a) != 0) return false;
        return Double.compare(komplex.b, b) == 0;
    }


}
