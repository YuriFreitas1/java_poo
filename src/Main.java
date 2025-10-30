import modelos.hbomax.Filme;
import modelos.hbomax.Serie;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Filme hbomax = new Filme();
        hbomax.setNome("avengers");
        hbomax.setAnodelancamento(2009);

        hbomax.exibirinformacoes();
        hbomax.avalia(0);
        hbomax.avalia(1);
        hbomax.avalia(2);
        System.out.println("Total de avaliações: "+ hbomax.getTotalavaliacoes());


        Serie dexter = new Serie();
        dexter.setNome("dexter");
        dexter.setAnodelancamento(2017);
        dexter.exibirinformacoes();
        dexter.setTemporadas(10);
        dexter.setEpisodiosPorTemporada(10);
        dexter.setMinutosPorEpisodio(50);

        System.out.println("tempo para maratonar: "+dexter.getDuracaoemminutos());

        Filme filmedoyuri = new Filme();
        filmedoyuri.setNome("Karate Kid");
        filmedoyuri.setAnodelancamento(2009);
        filmedoyuri.exibirinformacoes();
        filmedoyuri.avalia(0);
        filmedoyuri.avalia(1);
        filmedoyuri.avalia(2);


        ArrayList<Filme> listadefilmes = new ArrayList<>();
        listadefilmes.add(hbomax);
        listadefilmes.add(filmedoyuri);
        System.out.println(listadefilmes.get(0).getNome());
        System.out.println(listadefilmes.get(0));
    }
}
