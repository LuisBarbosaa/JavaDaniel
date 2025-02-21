import javax.swing.*;

public class Carro {
    // variaveis
    // tipos de dados primitivos
    public int ano;
    public float velocidade;
    // tipo de dado é uma classe
    public String marca, modelo;
    // métodos construtores
    // sem parâmetro
    public Carro(){
        this.marca = "Vazia";
        this.modelo = "Vazio";
    }
    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    // métodos
    public void exibirDetalhes(){
        // this representa o objeto que chama o metodo
        JOptionPane.showMessageDialog( null,
                            "Marca: " + this.marca +
                            "  Modelo: " +this.modelo +
                            "  Ano: " + this.ano +
                            "  Velocidade: " + this.velocidade);
    }
    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }
    public void freiar(float y){
        if(this.velocidade - y >= 0){
            this.velocidade -= y;
        } else {
            System.out.println("Freagem não correspondente");
        }
    }
}
