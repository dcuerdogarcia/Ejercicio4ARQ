/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio4;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DataOutputStream out= new DataOutputStream(new BufferedOutputStream(new FileOutputStream("text3.txt")));

            // create a test string
       
            String testString = "Esta e unha cadea\n";
            // use the writeUTF method
            out.writeUTF(testString);
            int writeSize1 = out.size();
            System.out.println("WeriteUTF escribiu: "+testString);
            System.out.println("Tamaño " + writeSize1 + " bytes.");

            // use the writeChars method
            System.out.println("WriteUTF escribiu: "+testString);
            int writeSize2 = out.size();
            System.out.println("Tamaño " + writeSize1 + " bytes.\n");
            System.out.println("El tamaño total es: "+(writeSize1+writeSize2));
            
            System.out.println("Lemos a primeria cadea en UTF: "+testString);
            System.out.println("Numero de bytes lidos: "+writeSize1);
            System.out.println("bytes restantes por leer: "+writeSize2);
            System.out.println("Lemos a segunda cadea: "+testString);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}