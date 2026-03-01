import classes.ListaDeObjetos;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {

        Object objRetorno = instanciarClasse(ListaDeObjetos.class);
        ListaDeObjetos obj = (ListaDeObjetos) objRetorno;

        executarMetodo(obj, "adicionarNaLista", "tentar");
        executarMetodo(obj, "adicionarNaLista", "conseguir");
        executarMetodo(obj, "adicionarNaLista", "comemorar");
        executarMetodo(obj, "adicionarNaLista", "avançar");
        executarMetodo(obj, "adicionarNaLista", "cansar");
        executarMetodo(obj, "adicionarNaLista", 1);
        executarMetodo(obj, "adicionarNaLista", 2);
        executarMetodo(obj, "adicionarNaLista", 4);
        executarMetodo(obj, "adicionarNaLista", 67);
        executarMetodo(obj, "adicionarNaLista", 67);
        executarMetodo(obj, "exibirLista" );


    }

    private static Object instanciarClasse(Class<?> classe) throws Exception {
        return classe.getDeclaredConstructor().newInstance();
    }

    private static void executarMetodo(Object obj, String nomeDoMetodo, Object... parametros) throws Exception {

        Class<?>[] tipos = new Class[parametros.length];

        for (int i = 0; i < parametros.length; i++) {
            tipos[i] = parametros[i].getClass();
        }

        Method m = obj.getClass().getMethod(nomeDoMetodo, Object.class);
        m.invoke(obj, parametros);
    }

    private static void executarMetodo(Object obj, String nomeDoMetodo) throws Exception {


        Method m = obj.getClass().getMethod(nomeDoMetodo);
        m.invoke(obj);
    }
}
