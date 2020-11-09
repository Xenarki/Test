import jdk.nashorn.internal.ir.WhileNode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHelp {
    public static void main(String[] args) {
        Help hlpobj = new Help("helpfile.txt");
        String topic;
        System.out.println("Воспользуйтесь справочной системой.\n" + "Для выхода из системы введите 'stop'.");
        do {
            topic = hlpobj.getSelection();
            if (!hlpobj.helpon(topic))
                System.out.println("Тема не найдена \n");
        } while (topic.compareTo("Stop") != 0);
    }
}
