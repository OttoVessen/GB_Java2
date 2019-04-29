package Lesson6;


import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        Server sr = new Server();
        sr.start();
        sr.catchClient();
        new Thread() {
            public void run() {
                while (true) {
                    String message = null;
                    try {
                        message = sr.in.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (message != null) {
                        try {
                            sr.sendMessage(message);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                try {
                    sr.writeToConsole();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        sr.writeToConsole();
    }
}

class Server {
    BufferedReader in = null;
    PrintWriter out = null;
    ServerSocket serverSocket = null;
    Socket socket = null;
    String input;
    BufferedReader console = null;

    void start() {
        try {
            serverSocket = new ServerSocket(6666);
        } catch (IOException e) {
            System.out.println("Не удалось подключиться");
            System.exit(1);
        }
        System.out.print("Ожидаю подключения клиента");
    }

    void catchClient() throws IOException {
        try {
            socket = serverSocket.accept();
            System.out.println("Клиент подключен");
        } catch (IOException e) {
            System.out.println("Нет подключения");
            System.exit(1);
        }

        in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(),true);

        System.out.println("Ожидаю подключения клиента");
    }

    void sendMessage(String msg) throws IOException {
        if (msg.equalsIgnoreCase("")) close();
        out.println("Server---> " + msg);
        System.out.println(msg);
    }

    void close() throws IOException {
        out.close();
        in.close();
        socket.close();
        serverSocket.close();
    }

    void writeToConsole() throws IOException {
        while (true) {
            console = new BufferedReader(new InputStreamReader(System.in));
            String message = console.readLine();
            sendMessage(message);
        }
    }
}
