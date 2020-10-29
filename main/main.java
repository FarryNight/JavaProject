import java.util.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.*;

public class Welcome{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        String greeting = "welcome java !";
        String str;
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
            System.out.print('\n');
        do{
            str = in.nextLine();
            System.out.println(str);
        }while( !str.equals("end") );
        try{
            File f = new File("L:\\JavaProject\\main\\test.txt");
            File f_out = new File("L:\\JavaProject\\main\\output.txt");
            FileOutputStream fout = new FileOutputStream(f,true);
            FileOutputStream f_new = new FileOutputStream(f_out);
            FileInputStream fin = new FileInputStream(f);
            //output to file by byte.
            String a_s = in.next()+"\r\n";;
            byte[] b = a_s.getBytes();
            for(int i=0 ; i<b.length; i++){
                fout.write(b[i]);
            }
            fout.write('\n');
            //read the file by byte.
            int len;
            while( (len = fin.read())!= -1 ){
                System.out.print((char)len);
                f_new.write(len);
            }

            fin.close();
            fout.flush();//refresh
            fout.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        };
    }
}