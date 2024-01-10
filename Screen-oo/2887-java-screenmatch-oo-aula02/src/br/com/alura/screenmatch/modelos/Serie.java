package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int epPorTemporada;
    private boolean ativar;
    private int minutosPorEp;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpPorTemporada() {
        return epPorTemporada;
    }

    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }

    public boolean isAtivar() {
        return ativar;
    }

    public void setAtivar(boolean ativar) {
        this.ativar = ativar;
    }

    public int getMinutosPorEp() {
        return minutosPorEp;
    }

    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * epPorTemporada * minutosPorEp;
    }


}
