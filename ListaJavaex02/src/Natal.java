public class Natal extends  CartaoWeb {
    public Natal (String destinatario) {
        super();
        this.destinatario = destinatario;
    }
    @Override
    public void roretornarMensagem(String remetente){
        System.out.println("--NATAL--");
        System.out.println("Natal é época de renascimento;" +
                " \nÉ época de reacender o fogo da vida, de renovar os sonhos e metas para o ano novo que já se anuncia. " +
                "\nDe: "+remetente+"\nPara: "+destinatario);
    }

}
