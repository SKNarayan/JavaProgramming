package udemyPractice;

public class OparatorBasic {

    public static void main(String[] args){
        double firstVariable = 20;
        double secondVariable = 80;
        double total = (firstVariable + secondVariable) * 25;
        double reminder = total % 40;

        System.out.println(total);
        System.out.println(reminder);
        if(reminder <= 20)
            System.out.println("Total was over the limit");
    }

}
