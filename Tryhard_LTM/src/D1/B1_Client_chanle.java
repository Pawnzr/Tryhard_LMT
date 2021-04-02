/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author 84965
 */
public class B1_Client_chanle {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 2349);
        
        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        
        System.out.println("Nhap vao 1 so nguyen duong");
        int n = new Scanner(System.in).nextInt();
        
        dos.writeInt(n);
        System.out.println(n+" "+dis.readUTF());
    }
}
