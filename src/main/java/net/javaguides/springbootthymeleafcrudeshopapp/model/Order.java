package net.javaguides.springbootthymeleafcrudeshopapp.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "tshirt_brand")
    private String tshirtBrand;
    @Column(name = "tshirt_color")
    private int tshirtColor;
    @Column(name = "tshirt_material")
    private int tshirtMaterial;
    @Column(name = "tshirt_size")
    private int tshirtSize;
    @Column(name = "tshirt_quantity")
    private int tshirtQuantity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTshirtBrand() {
        return tshirtBrand;
    }

    public void setTshirtBrand(String tshirtBrand) {
        this.tshirtBrand = tshirtBrand;
    }

    public int getTshirtColor() {
        return tshirtColor;
    }

    public void setTshirtColor(int tshirtColor) {
        this.tshirtColor = tshirtColor;
    }

    public int getTshirtMaterial() {
        return tshirtMaterial;
    }

    public void setTshirtMaterial(int tshirtMaterial) {
        this.tshirtMaterial = tshirtMaterial;
    }

    public int getTshirtSize() {
        return tshirtSize;
    }

    public void setTshirtSize(int tshirtSize) {
        this.tshirtSize = tshirtSize;
    }

    public int getTshirtQuantity() {
        return tshirtQuantity;
    }

    public void setTshirtQuantity(int tshirtQuantity) {
        this.tshirtQuantity = tshirtQuantity;
    }
}
