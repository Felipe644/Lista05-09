public class Car implements CarbonFootprint {
    private String combustivel;
    private String modelo;
    private float kmMensal;
    private float motor;
    private String pegada;

    @Override
    public void getCarbonFootprint() {
        this.setPegada("Não Calculado!");
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getKmMensal() {
        return kmMensal;
    }

    public void setKmMensal(float kmMensal) {
        this.kmMensal = kmMensal;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
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
                "\nCombustivel: " + combustivel +
                "\nModelo: " + modelo +
                "\nKm Mensal: "+"KM" + kmMensal +
                "\nMotor: " + motor +
                "\nPegada: "+pegada;
    }
}
