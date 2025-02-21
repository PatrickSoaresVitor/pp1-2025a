import javax.swing.*;

public class Carro {
    // variáveis
    // tipo de dados primitivos
    public int ano;
    public float velocidade;
    // tipo de dado é uma classe
    public String marca, modelo;
    //Métodos Construtores
    //Sem parametro
    public Carro(){
        this.marca = "Vazia";
        this.modelo = "Vazio";
    }
    //Com parametro
    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }
    //Métodos
    public void exibirDetalhes(){
        // this representa o objeto que chama o método
        JOptionPane.showMessageDialog(null,
                "Marca: " + this.marca + "; "+
                "Modelo: " + this.modelo + "; "+
                "Ano: " + this.ano + "; "+
                "Velocidade: " + this.velocidade);
    }
    //Metodo de instancia
    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }
    public void frear(float x){
        float vel = this.velocidade - x;
        if(vel < 0){
            System.out.println("Freagem não ocorreu");
        }
        else{
            this.velocidade = vel;
        }
    }
}
