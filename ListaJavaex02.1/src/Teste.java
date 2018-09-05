import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Building> Construcao=new ArrayList<>();
        ArrayList<Car> Carro=new ArrayList<>();

        Building b1=new Building();
        Building b2=new Building();

        b1.setNumPessoas(10);
        b1.setUsoDeEnergiaRenovavel(false);
        b1.setNumDeLampadas(15);
        b1.setUsoDeArCondicionado(true);
        b1.setNumGas(5);
        b1.setConsumoENergia(500);
        b1.getCarbonFootprint();
        Construcao.add(b1);


        b2.setNumPessoas(100);
        b2.setUsoDeEnergiaRenovavel(false);
        b2.setNumDeLampadas(150);
        b2.setUsoDeArCondicionado(true);
        b2.setNumGas(50);
        b2.setConsumoENergia(5000);
        b2.getCarbonFootprint();
        Construcao.add(b2);

        //---------------------------------------------------------------------

        Car c1=new Car();
        Car c2=new Car();
        c1.setCombustivel("Gasolina");
        c1.setModelo("Gol, Volkswagen");
        c1.setKmMensal(150);
        c1.setMotor(1.6f);
        c1.getCarbonFootprint();
        Carro.add(c1);

        c2.setCombustivel("Gasolina");
        c2.setModelo("Palio, Fiat");
        c2.setKmMensal(200);
        c2.setMotor(1.8f);
        c2.getCarbonFootprint();
        Carro.add(c2);

        for(int i=0;i<Construcao.size();i++)
            System.out.println(Construcao.get(i).toString());

        for(int c=0;c<Construcao.size();c++)
            System.out.println(Carro.get(c).toString());


    }
}
