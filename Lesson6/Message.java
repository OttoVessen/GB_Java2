package Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Message {

    Scanner scanner;
    Socket socket;

    public Message(Scanner scanner, Socket socket) {
        this.scanner = scanner;
        this.socket = socket;
    }

    public void inOut() throws IOException {
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        Thread threadListener = new Thread(new ThrIn(in));
        threadListener.start();


        System.out.print("Введите сообщение > ");
        while (scanner.hasNextLine()) {
            System.out.print("Введите сообщение > ");
            String str = scanner.nextLine();
            try {
                out.writeUTF(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
