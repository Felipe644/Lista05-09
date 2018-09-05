public abstract class ApCelular extends  DispTelefonia {
    protected boolean bateria;
    protected float frequenciaDeTransmissao;
    protected String operadora;



    public boolean getBateria() {
        return bateria;
    }

    public void setBateria(boolean bateria) {
        this.bateria = bateria;
    }

    public float getFrequenciaDeTransmissao() {
        return frequenciaDeTransmissao;
    }

    public void setFrequenciaDeTransmissao(float frequenciaDeTransmissao) {
        this.frequenciaDeTransmissao = frequenciaDeTransmissao;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nBateria: " + bateria +
                "\nFrequencia De Transmissao: " + frequenciaDeTransmissao +"Mhz"+
                "\nOperadora: " + operadora ;
    }
}
