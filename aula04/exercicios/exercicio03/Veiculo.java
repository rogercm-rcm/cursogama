package exercicios.exercicio03;

public class Veiculo {

    //Atributos
    String modelo;
    String marca;
    String consumo;
        
    //construtor
    public Veiculo(String modelo, String marca, String consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    //metodo
    public void imprimir(){
        System.out.printf("Modelo %s e marca %s\n", modelo, marca);
        //System.out.println("Modelo do veiculo - " + modelo);
        //System.out.println("Marca  do veiculo - " + marca);
    }

    public String dados() {
        return consumo;
    }
}
