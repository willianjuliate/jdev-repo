package entities;

import java.util.Objects;

/**
 *
 * @author willian
 */
public class Product implements Comparable<Product>{
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + '}';
    }  

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) { 
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return Objects.equals(this.name, other.name);
    }
}
