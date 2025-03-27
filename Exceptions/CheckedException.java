package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new FileReader("input.txt"));){
            String line;
            if((line=br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found.");
        }
        catch(IOException e){
            System.out.println("Error while Reading File");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
