public class DiaDosNamorados extends CartaoWeb {
    public DiaDosNamorados(String destinatario) {
        super();
        this.destinatario=destinatario;

    }
    @Override
    public void roretornarMensagem(String remetente){
        System.out.println("--DIA DOS NAMORADOS--");
        System.out.println("Querida "+this.getDestinatario()+", Feliz Dia dos Namorados!" +
                "\nEspero que esse  tenha sido o único cartão do dia dos namorados que tenha ganhado nessa data!" +
                "\n”De todo meu coração, "+remetente+ "”");
    }


}
