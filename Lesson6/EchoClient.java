package Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;




    public class EchoClient {
        public static void main(String[] args) throws IOException {
            Client cl = new Client();
            System.out.println("Клиент подключен к порту 6666\n");

            new Thread() {
                public void run() {
                    try {
                        cl.readMSG();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();

            new Thread() {
                public void run() {
                    try {
                        cl.sendMSG();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

    class Client {
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out= null;
        BufferedReader console = null;
        String userMSG, serverMSG;

        public Client() throws IOException {
            socket = new Socket("localhost",6666);
            in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(),true);
            console = new BufferedReader(new InputStreamReader(System.in));
        }

        void sendMSG() throws IOException {
            while (true) {
                if ((userMSG = console.readLine()) != null) {
                    out.println(userMSG);
                    if (userMSG.equalsIgnoreCase("close") || userMSG.equalsIgnoreCase("exit")) break;
                }
            }
        }

        void readMSG() throws IOException {
            while (true) {
                if ((serverMSG = in.readLine()) != null){
                    System.out.println(serverMSG);
                }
            }
        }

        void close() throws IOException {
            out.close();
            in.close();
            console.close();
            socket.close();
        }


    }
