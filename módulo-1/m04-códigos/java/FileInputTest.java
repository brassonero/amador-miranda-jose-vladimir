package main;

import java.io.File;
import java.io.FileInputStream;

public class FileInputTest {

    public static void main(String[]args) throws FileNotException, IOException{

        File file1 = new File();
        FileInputStream fin = new FileInputStream(file1);

        File file2 = new File();
        FileInputStream fout = new FileInputStream(file2);

        int contador = 0;

        int b;
        while((b = fin.read()) != -1){
            System.out.printf("[%d]", b);
            if((contador + 1) % 20 == 0) {
                System.out.println();
            }

            contador++;
            fout.write(b);
            b = fin.read();
        }
        System.out.printf("Total bytes %d", contador);
        System.out.println();

        fin.close();
        fout.close();
    }
}
