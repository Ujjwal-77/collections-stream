package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResources {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new FileReader("info.txt"))){
            String first=br.readLine();
            System.out.println("First Line");
        }
        catch(IOException e){
            System.out.println("Error Reading file");
        }
    }
}
