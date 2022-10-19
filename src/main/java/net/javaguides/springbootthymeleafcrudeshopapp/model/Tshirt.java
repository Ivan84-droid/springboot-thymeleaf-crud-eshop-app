package net.javaguides.springbootthymeleafcrudeshopapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name= "tshirts")
public class Tshirt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private long id;
    @Column (name = "brand")
    private String brand;
    @Column (name = "color")
    private String color;
    @Column (name = "material")
    private String material;
    @Column (name = "size")
    private String size;
    @Column (name = "price")
    private int price;
    @Column (name = "quantity")
    private int quantity;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }
}
