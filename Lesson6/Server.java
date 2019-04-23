package Lesson6;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {



        try (Scanner scanner = new Scanner(System.in);
             ServerSocket serverSocket = new ServerSocket(1111)){
                System.out.println("Сервер ожидает подключения!");
                Socket socket = serverSocket.accept();
                System.out.println("Кто-то подключился: " + socket.getInetAddress());

                Message message = new Message(scanner,socket);
                message.inOut();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

