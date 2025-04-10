import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductList {
    private Set<Product> products;

    public ProductList() {
        products = new HashSet<>();
    }

    public Set<Product> sortByName(String name) {
        //hashSet n tem organização, mete o louco e insere os valores no aleatório
        Set<Product> productsByName = new TreeSet<>(products); 
        //no set também n usa *Collections.sort()* pq ele é pra List<>, o TreeSet já identifica o comparable e ordena pra nois
        return productsByName;
    }

    public Set<Product> sortByAmount(double balance) {
        Set<Product> productsByAmount = new TreeSet<>(new ComparatorByAmount());
        productsByAmount.addAll(products);
        return productsByAmount;
    }
    
}

class ComparatorByAmount implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getAmount(), p2.getAmount());
    } 
}