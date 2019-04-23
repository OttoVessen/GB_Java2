package Lesson6;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        try (Scanner scanner = new Scanner(System.in);
             Socket socket = new Socket("localhost", 1111)) {

            Message message = new Message(scanner,socket);
            message.inOut();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}





