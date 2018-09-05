public class Teste {
    public static void main(String[] args) {
        System.out.println("");
        //CARTÃO DO DIA DOS NAMORADOS
        DiaDosNamorados d1 = new DiaDosNamorados("Odete");
        d1.roretornarMensagem("Aldo");
        System.out.println("\n");

        //CARTÃO DE NATAL
        Natal n1 = new Natal("Odete");
        n1.roretornarMensagem("Aldo");
        System.out.println("\n");

        //CARTÂO DE ANIVERSÁRIO
        Aniversario a1=new Aniversario("Odete");
        a1.roretornarMensagem("Aldo");


    }

}
