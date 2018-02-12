public class Komplextest {
    public static void main(String[] args) {
        Komplex z = new Komplex(25,50);
        System.out.println(z.toString());

        Komplex z2 = new Komplex(-2,-3);
        System.out.println(z2.toString());

        z.add(z2);
        System.out.println("adding them :" + z);

        System.out.println("Argument of z: " + z.arg());

        System.out.println();

        z.setA(2);
        z.setB(5);


    }
}
