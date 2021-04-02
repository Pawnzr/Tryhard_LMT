import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class B1_Server_chanle {
     public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(2349)   ;
        Socket my_client = server.accept();
        
        DataOutputStream dos = new DataOutputStream(my_client.getOutputStream());
        DataInputStream dis = new DataInputStream(my_client.getInputStream());
        
        int n = dis.readInt();
        if (n%2==0) {
            dos.writeUTF("La so chan");
        }
        else dos.writeUTF("La so le");
    }
}
