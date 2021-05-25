package commonProgramm;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {

    public static void main(String[] args) throws IOException {

        readDataFromTextFileUsingFileReaderAndBufferReader();
        System.out.println("---------------------------");
        readDataFromFileUsingScannerAndFile();
        System.out.println("#################################");
        readDataFromFileWithoutUsingAnyLoop();


    }

    public static void readDataFromTextFileUsingFileReaderAndBufferReader() throws IOException {

        //two way to read the data from text file - file reader & buffer reader
        //approach 1. file reader and buffer reader
        FileReader fr = new FileReader("./readerFile");
        BufferedReader br = new BufferedReader(fr);
        String str = "";

        while((str = br.readLine())!= null){

            System.out.println(str);
        }

        br.close();

    }

    public static void readDataFromFileUsingScannerAndFile() throws FileNotFoundException {
        //approach 2 using File and Scanner class
        File file = new File("./readerFile");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }

    public static void readDataFromFileWithoutUsingAnyLoop() throws FileNotFoundException {
        //Approach 3 - without using any loop
        File file = new File("./readerFile");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\\Z");
        System.out.println(scanner.next());

    }

}
