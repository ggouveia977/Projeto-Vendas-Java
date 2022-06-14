package views;

import models.Caminhao;
import models.Carro;
import models.Moto;

public class Principal{
    public static void main(String[] args) {

        Carro carro = new Carro("Gasolina", "ABC-1234");
        // carro.setCombustivel("Gasolina");
        // carro.setCor("Preto");
        // carro.setMarca("GM");
        // carro.setModelo("Onix");
        // carro.setPlaca("AAA-1111");
        // carro.setVelocidadeMaxima(180);
        // System.out.println("Marca: " + carro.getMarca());
        System.out.println("Combustível: " + carro.getCombustivel());
        System.out.println("Criado em: " + carro.getCriadoEm());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Texto: "+ carro.paraTexto());

        System.out.println("");
        
        
        Moto moto = new Moto("CBA-4321");
        // moto.setPotencia("150cc");
        // moto.setCor("Preto");
        // moto.setMarca("Honda");
        // moto.setModelo("Onix");
        // moto.setPlaca("AAA-1111");
        // moto.setVelocidadeMaxima(180);
        // System.out.println("Marca: " + moto.getMarca());
        // System.out.println("Potência: " + moto.getPotencia());
        System.out.println("Criado em: " + moto.getCriadoEm());
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Texto: "+ moto.paraTexto());


        System.out.println("");

        Caminhao caminhao = new Caminhao();
        System.out.println(caminhao);
        
    }
}