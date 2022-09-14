package datas;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author willian
 */
public class TempoInstant  {
    public static void main(String[] args) throws InterruptedException {
        Instant inicio = Instant.now();        
        Thread.sleep(6000); // Pode ser um processo com tempo qualquer que não conhecemos
        Instant ifinal = Instant.now();        
        Duration duracao = Duration.between(inicio, ifinal);
        
        System.out.println("Duração em nano segundos: "+ duracao.toNanos());
        System.out.println("Duração em minutos minutos: "+ duracao.toMinutes());
        // ....
    }
    
}
