import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("========= Singleton =======");
        SingletonLazy lazy = SingletonLazy.getInstance("victor",18);
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance("victor",18);
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        System.out.println("========= Singleton =======");

        System.out.println("========= Strategy =======");
        Rugido rugidoAgressivo = new RugidoAgressivo();
        Rugido rugidoDefensivo = new RugidoDefensivo();
        Rugido rugidoNormal = new RugidoNormal();
        Animal cachorro = new Animal();
        System.out.println("========= Strategy =======");
    }
}