package modelos.hbomax;

public class Titulo {

    private String nome;
    private int anodelancamento;
    private double mediaavaliacoes;
    private int totalavaliacoes;
    private double somadasnotas;
    private int duracaoemminutos;


    public int getTotalavaliacoes(){
        return totalavaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnodelancamento() {
        return anodelancamento;
    }

    public double getSomadasnotas() {
        return somadasnotas;
    }

    public double getMediaavaliacoes() {
        return mediaavaliacoes;
    }

    public int getDuracaoemminutos() {
        return duracaoemminutos;
    }

    //getters

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnodelancamento(int anodelancamento) {
        this.anodelancamento = anodelancamento;
    }

    public void setTotalavaliacoes(int totalavaliacoes) {
        this.totalavaliacoes = totalavaliacoes;
    }

    public void setMediaavaliacoes(double mediaavaliacoes) {
        this.mediaavaliacoes = mediaavaliacoes;
    }

    public void setSomadasnotas(double somadasnotas) {
        this.somadasnotas = somadasnotas;
    }

    public void setDuracaoemminutos(int duracaoemminutos) {
        this.duracaoemminutos = duracaoemminutos;
    }

    public void exibirinformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("ano: "+anodelancamento);
    }


    public double calcularmedia(){
        mediaavaliacoes = somadasnotas / totalavaliacoes;
        return mediaavaliacoes;
    }


    public void avalia(double nota){
        totalavaliacoes++;
        somadasnotas += nota;
    }
}
