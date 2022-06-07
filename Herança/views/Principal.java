package views;
import models.Carro;
import models.Moto;

public class Principal {
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.setCombustivel("Gasolina");
        carro.setCor("Preto");
        carro.setMarca("GM");
        carro.setModelo("Onix");
        carro.setPlaca("ABC-1234");
        carro.setVelocidadeMaxima(180);
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Combustivel: " + carro.getCombustivel());

        Moto moto = new Moto();
        moto.setPotencia("150cc");
        moto.setCor("Preto");
        moto.setMarca("Honda");
        moto.setModelo("Onix");
        moto.setPlaca("ABC-1234");
        moto.setVelocidadeMaxima(180);
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Potencia " + moto.getPotencia());
    }
}
