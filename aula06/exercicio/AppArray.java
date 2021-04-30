import java.util.ArrayList;

public class AppArray {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {

            System.out.println("Indice : " + i + ": " + lista.get(i));
            
        }

        //foreach - Para cada
        for (Integer valor : lista) { //para cada 'valo' da 'lista'
            if(valor == 3) {
                System.out.println("Achei o valor " + valor);

            }
            

            
        }
        


    }
    
}
