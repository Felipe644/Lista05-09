public class Residencial extends DispTelefonia {
    private float compriCabo;
    private boolean fixaParede;

    public float getCompriCabo() {
        return compriCabo;
    }

    public void setCompriCabo(float compriCabo) {
        this.compriCabo = compriCabo;
    }

    public boolean getFixaParede() {
        return fixaParede;
    }

    public void setFixaParede(boolean fixaParede) {
        this.fixaParede = fixaParede;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nComprimento do Cabo: " + compriCabo +"m"+
                "\nFixado na ParedeS: " + fixaParede;
    }
}
