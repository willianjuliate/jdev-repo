package aplicacao;

import entidades.Funcionario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author willian
 */
public class Programa {
    public static void main(String[] args) {
        List<Funcionario> list = new ArrayList<>();
        
        String path = "c:\\tmp\\in.txt";
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String funcionario = br.readLine();            
            while(funcionario != null) {
                String[] dados = funcionario.split(",");  
                Funcionario f = new Funcionario(dados[0], Double.parseDouble(dados[1]));
                list.add(f);
                funcionario = br.readLine();
            }
            
            Collections.sort(list); // Para implementar o Collections.sort é preciso usar o Compareble<T>
            
            for (Funcionario f: list) {
                System.out.println(f.getNome() + "\t"+ f.getSalario());
            }
            
        }
        catch(IOException err) {
            System.out.println(err.getMessage());
        }
    }
}
