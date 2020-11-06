package pl.krysinski;

public class Main {

    public static void main(String[] args) {

        EncodeMethods encodeMethods = new EncodeMethods();

        String encodeSimple = encodeMethods.encodeSimple("KOT");
        System.out.println(encodeSimple);

    }
}
