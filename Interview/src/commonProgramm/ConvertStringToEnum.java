package commonProgramm;

import java.util.Scanner;

//way to define the enum, where to define the enum
enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDADY

}

public class ConvertStringToEnum {

public static void main(String[] args){
    ConvertStringToEnum convertStringToEnum = new ConvertStringToEnum();
    try {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        convertStringToEnum.lookUp(inputStr);
    }catch (IllegalArgumentException e){
        System.out.println(" No enum constant available ");
    }
}

public void lookUp(String str){
    Days day = Days.valueOf(str.toUpperCase());
    System.out.println("Found Enum: " + day);
}

}
