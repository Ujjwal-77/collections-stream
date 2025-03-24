package streams.bufferedstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("input"));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("output"))){
                
        }
        catch(Exception e){

        }
    }
}
