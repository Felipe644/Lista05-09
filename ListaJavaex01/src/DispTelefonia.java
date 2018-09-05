public abstract class DispTelefonia {
    protected String cor;
    protected String formato;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Cor: " + cor +
                "\nFormato: " + formato;
    }
}
