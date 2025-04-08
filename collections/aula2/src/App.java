import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List withoutGenerics = new ArrayList();
        withoutGenerics.add("cavalo");
        withoutGenerics.add(25);
        withoutGenerics.add("moto");
        withoutGenerics.add(true);

        List<String> withGenerics = new ArrayList<>();
        withGenerics.add("Aqui só pode strings");

        //iterando em uma lista sem generics
        for(Object element: withoutGenerics) {
            String str = (String) element; //cast pra pegar o elemento que é string dentro dessa lista
            System.out.println(str);
        }

        //com generics, bem mais seguro doque tem dentro da lista e bem mais fácil de manipular todos os dados, já que são de mesmo tipo
        for(String element : withGenerics) {
            System.out.println(element);
        }

    }
}
