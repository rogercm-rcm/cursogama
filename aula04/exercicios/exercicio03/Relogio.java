package exercicios.exercicio03;

public class Relogio {

        //Atributos
        int hora;
        int min;
        int seg;
            
        //construtor
        public Relogio(int hora, int min, int seg) {
            this.hora = hora;
            this.min = min;
            this.seg = seg;
            
        }
    
        //metodo
        public void imprimir(){
            
            if (hora <= 23 && min <= 59 && seg <= 59) {
                System.out.printf("Agora são %02d : %02d : %02d", hora, min, seg);
            }else{
                System.out.printf("Infomrado horario errado");
            }
                              
            }

            //System.out.printf("Agora são %d : %d : %d", hora, min, seg);
            //System.out.println("Modelo do veiculo - " + modelo);
            //System.out.println("Marca  do veiculo - " + marca);
        }
    
        //public String dados() {
        //    return consumo;
        //}

    
