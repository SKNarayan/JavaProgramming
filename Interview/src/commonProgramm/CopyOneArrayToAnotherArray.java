package commonProgramm;

public class CopyOneArrayToAnotherArray {

    public static void main(String args[]){

        //Initialize an array
        int[] array1 = new int[] {1, 2, 3, 4, 5, 6};

        //creating another array of size array1
        int array2[] = new int[array1.length];

        //copying all elements from array1 to the array2
        for(int i=0; i < array1.length; i++){

                array2[i] = array1[i];

        }


        System.out.println("Array1 elements");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        System.out.println("Array2 elements");
        for(int i = 0; i < array2.length; i++){

            System.out.print(array2[i] + " ");

        }

    }


}
