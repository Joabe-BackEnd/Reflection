package classes;

import java.util.ArrayList;
import java.util.Objects;

public class ListaDeObjetos {
    private ArrayList<Object> lista;

    public ListaDeObjetos() {
        this.lista = new ArrayList<>();
    }

    public void adicionarNaLista(Object obj){
        if (obj.getClass().getName().contains("String") || obj.getClass().getName().contains("Integer")){
            this.lista.add(obj);
        }else {
            System.out.println("Lista não pode conter objetos nulos");
        }
    }

    public void exibirLista(){
        for (int i = 0; i < this.lista.size(); i++) {
            System.out.println(this.lista.get(i));
        }
    }
}
