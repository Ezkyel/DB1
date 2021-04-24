package mdcjava;



public class Anexo2 {

    int intPrim;

    public static void main(String[] args) {

        //Um exemplo de utilização de cada tipo durante o desenvolvimento de software.

        //Primitivos com seus valores default.
        int intPrim;
        char charPrim = '\u0000';
        byte bytePrim = 0;
        short shortPrim = 0;
        long longPrim = 0L;
        double doublePrim = 0.0d;
        boolean booleanPrim = false;
        float floatPrim = 0.0f;

        //Wrappers dos primitivos criados.
        //Integer intRef = Integer.valueOf(intPrim);
        Character charRef = Character.valueOf(charPrim);
        Byte byteRef = Byte.valueOf(bytePrim);
        Short shortRef = Short.valueOf(shortPrim);
        Long longRef = Long.valueOf(longPrim);
        Double doubleRef = Double.valueOf(doublePrim);
        Boolean booleanRef = Boolean.valueOf(booleanPrim);
        Float floarRef = Float.valueOf(floatPrim);

        String txt1 = "A";
        String txt2 = "B";

        String concat = txt1.concat(txt2);

        System.out.println(concat);



    }

}
