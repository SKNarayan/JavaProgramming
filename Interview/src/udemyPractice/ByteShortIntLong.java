package udemyPractice;

public class ByteShortIntLong {

    public static void main(String[] args) {
//        byte byteNumber = 127;
//        short shortNumber = 32767;
//        int intNumber = 2147483647;

        byte byteNumber = 10;
        short shortNumber = 20;
        int intNumber = 30;
        long longTotal = 5000L + 10L * (byteNumber + shortNumber + intNumber);
        int intTotal = (int)(1000L + 10L * (byteNumber + shortNumber + intNumber));
        short shortTotal = (short)(1000L + 10L * (byteNumber + shortNumber + intNumber));
        byte byteTotal = (byte) (1000L + 10L * (byteNumber + shortNumber + intNumber));

        System.out.println("lontTotal = " + longTotal);
        System.out.println("intTotla = " + intTotal);
        System.out.println("shortTotal = " + shortTotal);
        System.out.println("byteTotal = " + byteTotal);
    }
}
