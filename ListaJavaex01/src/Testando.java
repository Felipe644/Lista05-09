

public class Testando {
    public static void main(String[] args) {

        //CRIANDO UM OBJETO DO TIPO CELULARES
        System.out.println("----------------------");
        System.out.println("CELULAR");
        System.out.println("----------------------");
        Celulares c1=new Celulares();
        c1.setCor("PRETO");
        c1.setFormato("COMUM");
        c1.setBateria(true);
        c1.setFrequenciaDeTransmissao(1800);
        c1.setOperadora("Oi");
        c1.setTelaTouch(true);
        c1.setReproduzMusica(true);
        c1.setSinconizaRadio(false);
        System.out.println(c1.toString());
        System.out.println("\n");

        //CRIANDO UM OBJETO DO TIPO RESIDÊNCIAL
        System.out.println("----------------------");
        System.out.println("TELEFONE RESIDÊNCIAL");
        System.out.println("----------------------");
        Residencial r1=new Residencial();
        r1.setCor("CINZA");
        r1.setFormato("COMUM");
        r1.setCompriCabo(110);
        r1.setFixaParede(false);
        System.out.println(r1.toString());



    }
}
