package udemyPractice;

public class CharBoolean {

    public static void main(String[] args){
        char registeredSymbol = '\u00AE';
        System.out.println("The unicode of registered symbol is: " + registeredSymbol);

        boolean booleanValue = false;
        boolean isMale = true;
        System.out.println("Boolean Value is: " + booleanValue);
        System.out.println("He is not a Male: " + !isMale);
    }

}
