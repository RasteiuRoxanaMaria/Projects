package aut.utcluj.isp.ex3;

/**
 * @author stefan
 */
public class Product {
    private String id;
    private String name;
    private Double price;
    public int n=0;

    public Product(String id, String name, Double price) {
        this.id=id;
        this.name=name;
        this.price=price;
        n++;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

}
