public class Celulares extends ApCelular {
    private boolean telaTouch;
    private boolean reproduzMusica;
    private boolean sinconizaRadio;

    public boolean getTelaTouch() {
        return telaTouch;
    }

    public void setTelaTouch(boolean telaTouch) {
        this.telaTouch = telaTouch;
    }

    public boolean getReproduzMusica() {
        return reproduzMusica;
    }

    public void setReproduzMusica(boolean reproduzMusica) {
        this.reproduzMusica = reproduzMusica;
    }

    public boolean getSinconizaRadio() {
        return sinconizaRadio;
    }

    public void setSinconizaRadio(boolean sinconizaRadio) {
        this.sinconizaRadio = sinconizaRadio;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTelaTouch: " + telaTouch +
                "\nReproduz Musica: " + reproduzMusica +
                "\nSinconiza Radio: " + sinconizaRadio;
    }
}
