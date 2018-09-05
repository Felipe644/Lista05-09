public class Aniversario extends  CartaoWeb {
    public Aniversario (String destinatario) {
        super();
        this.destinatario = destinatario;
    }

    @Override
    public void roretornarMensagem(String remetente){
        System.out.println("---ANIVERSÁRIO--");
        System.out.println("Parabéns por completar" +
                "\nMais um ano de vida!" +
                "\nReceba meus votos de" +
                "um feliz aniversário," +
                "\nCelebrado com alegria" +
                "e na melhor companhia." +
                "\nMuitos anos de vida," +
                "sempre felizes e com" +
                "\nSaúde, paz e amor!" +
                "\nDe: "+remetente+"\nPara: "+destinatario);

    }

}
