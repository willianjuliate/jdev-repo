package datas;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author willian
 */
public class RelogioConsole {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            try {
                LocalTime relogio = LocalTime.now();
                System.out.println(relogio.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                Thread.sleep(1000);
                
                Process startProcess = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
                startProcess.waitFor();    

            } catch (IOException | InterruptedException e) {
                System.out.println("XXXXX");
            }

        }
    }
}
