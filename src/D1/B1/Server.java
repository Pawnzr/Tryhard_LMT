package D1.B1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1506);//1.tạo lớp ServerSocket với port 1506
        Socket my_client = server.accept();//2. accept kết nối

        DataOutputStream dos = new DataOutputStream(my_client.getOutputStream());
        DataInputStream dis = new DataInputStream(my_client.getInputStream());
        while(true){
        if (dis.readInt()%2==0){
            dos.writeUTF("So chan");
        }
        else{
            dos.writeUTF("So le");
        }
    }
}}
