package string;

public class StringManupulation {

    public static void main(String[] args){

        String str = "We know java";
        String str1 = "We know Java";

        System.out.println(str.length());
        System.out.println(str.charAt(6));

        //string comparission
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.indexOf('a')); //first occurrence
        System.out.println(str.indexOf('a', str.indexOf('a')+1)); //second occurrence
        System.out.println(str.indexOf("java"));
        System.out.println(str.indexOf("complete"));

        //sub string
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 10));
        System.out.println();

        //reverse a sstring
        char[] chars = str.toCharArray();
        for(int i = chars.length-1; i >= 0; i-- ){
            System.out.print(chars[i]);
        }
        System.out.println();

        //trim -
        String str3 = "    Today is    Holiday           ";
        System.out.println(str3.trim());// trim will remove the space before string and after string only not space in between string
        System.out.println(str3.replace(" ", ""));

        String date = "12-12-1947";
        System.out.println(date.replace("-", "/"));

        //split a string
        String str4 = "we_want_to_split_a_string";
        String splitedStr[] = str4.split("_");
        for(int i = 0; i<splitedStr.length; i++){
            System.out.println(splitedStr[i]);
        }
        System.out.println();

        //concatenate operator
        System.out.println(str.concat(str4));

        System.out.println(str3.contains("is"));
        System.out.println(str3.contains(" "));








    }


}
