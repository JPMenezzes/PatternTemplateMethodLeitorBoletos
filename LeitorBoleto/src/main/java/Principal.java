import br.com.ifto.LeituraRetornoBancoBradesco;
import br.com.ifto.LeituraRetornoBancoBrasil;

import java.net.URI;
import java.net.URISyntaxException;

public class Principal {
    public static void main(String[] args) throws URISyntaxException {
        final var processadorBrasil = new LeituraRetornoBancoBrasil();
        URI caminhoArquivo = Principal.class.getResource("banco-brasil-1.csv").toURI();
        System.out.println("\n" + "Lendo arquivo " + caminhoArquivo + "\n");

        processadorBrasil.processar(caminhoArquivo);

        final var processadorBradesco = new LeituraRetornoBancoBradesco();
        caminhoArquivo = Principal.class.getResource("bradesco-1.csv").toURI();
        System.out.println("\n" + "Lendo arquivo " + caminhoArquivo + "\n");

        processadorBradesco.processar(caminhoArquivo);
    }
}
