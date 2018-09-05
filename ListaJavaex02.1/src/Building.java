public class Building implements  CarbonFootprint{
    private int numPessoas;
    private boolean usoDeEnergiaRenovavel;
    private int numDeLampadas;
    private boolean usoDeArCondicionado;
    private int numGas;
    private float consumoENergia;
    private String pegada;

    @Override
    public void getCarbonFootprint() {
        this.setPegada("Não Calculado!");
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public boolean gatUsoDeEnergiaRenovavel() {
        return usoDeEnergiaRenovavel;
    }

    public void setUsoDeEnergiaRenovavel(boolean usoDeEnergiaRenovavel) {
        this.usoDeEnergiaRenovavel = usoDeEnergiaRenovavel;
    }

    public int getNumDeLampadas() {
        return numDeLampadas;
    }

    public void setNumDeLampadas(int numDeLampadas) {
        this.numDeLampadas = numDeLampadas;
    }

    public boolean gatUsoDeArCondicionado() {
        return usoDeArCondicionado;
    }

    public void setUsoDeArCondicionado(boolean usoDeArCondicionado) {
        this.usoDeArCondicionado = usoDeArCondicionado;
    }

    public int getNumGas() {
        return numGas;
    }

    public void setNumGas(int numGas) {
        this.numGas = numGas;
    }

    public float getConsumoENergia() {
        return consumoENergia;
    }

    public void setConsumoENergia(float consumoENergia) {
        this.consumoENergia = consumoENergia;
    }

    public boolean isUsoDeEnergiaRenovavel() {
        return usoDeEnergiaRenovavel;
    }

    public boolean isUsoDeArCondicionado() {
        return usoDeArCondicionado;
    }

    public String getPegada() {
        return pegada;
    }

    public void setPegada(String pegada) {
        this.pegada = pegada;
    }

    @Override
    public String toString() {
        return
                "\nNumPessoas: " + numPessoas +
                "\nUso De Energia Renovavel: " + usoDeEnergiaRenovavel +
                "\nNum De Lampadas: " + numDeLampadas +
                "\nUso De Ar-Condicionado: " + usoDeArCondicionado +
                "\nNum Gas ano: " + numGas +
                "\nConsumo Energia mês: R$" + consumoENergia+
                "\nPegada: "+pegada;
    }
}
