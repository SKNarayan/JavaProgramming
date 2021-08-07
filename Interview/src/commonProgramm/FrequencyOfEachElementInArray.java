package commonProgramm;

public class FrequencyOfEachElementInArray {

    public static void main(String[] args) {

       // int count;
        //Initializing an array
        int[] arr1 = new int[] {1, 2, 8, 3, 2, 2, 2, 5, 1};

        //create fr array to store frequencies of elements
        int fr[] = new int[arr1.length];
        int visited = -1;

        for(int i = 0; i < arr1.length; i++){
            int count = 1;
            for(int j = 0; j < arr1.length; j++){
                if(arr1[i] == arr1[j]){
                   count++;

                   fr[j] = visited;
                }

            }

            if(fr[i] != visited)
                fr[i] = count;
            }
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        for(int i = 0; i < fr.length; i++){
            System.out.print(fr[i]+ " ");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Elements   | Frequencies   ");
        System.out.println("---------------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("   " + arr1[i] + "   |   " + fr[i]);
        }
        System.out.println("---------------------------");

    }


}
