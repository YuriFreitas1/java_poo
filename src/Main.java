import modelos.hbomax.Filme;
import modelos.hbomax.Serie;


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
    }
}
