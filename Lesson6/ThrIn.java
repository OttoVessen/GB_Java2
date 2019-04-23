package Lesson6;

import java.io.DataInputStream;
import java.io.IOException;

public class ThrIn  implements Runnable{

        DataInputStream in;

        public ThrIn(DataInputStream in) {
            this.in = in;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("\nСообщение > " + in.readUTF());
                    System.out.print("Введите сообщение > ");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    break;
                }
            }
        }
}
