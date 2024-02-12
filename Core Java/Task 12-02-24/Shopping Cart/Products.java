import java.util.*;

public class Products {

    private ArrayList<String> productList;

    public Products() {
        this.productList = new ArrayList<>();
    }

    public ArrayList<String> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<String> productList) {
        this.productList = productList;
    }

    public void addProductToList(String product) {
        productList.add(product);
    }

    public void sortProductList() {
        Collections.sort(productList);
    }

}
