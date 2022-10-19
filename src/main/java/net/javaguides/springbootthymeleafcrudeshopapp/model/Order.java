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
    private String tshirtColor;
    @Column(name = "tshirt_material")
    private String tshirtMaterial;
    @Column(name = "tshirt_size")
    private String tshirtSize;
    @Column(name = "tshirt_quantity")
    private int tshirtQuantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tshirt_id")
    private Tshirt tshirt;

    public Order() {
        this.customerName = customerName;
    }

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

    public String getTshirtColor() {
        return tshirtColor;
    }

    public void setTshirtColor(String tshirtColor) {
        this.tshirtColor = tshirtColor;
    }

    public String getTshirtMaterial() {
        return tshirtMaterial;
    }

    public void setTshirtMaterial(String tshirtMaterial) {
        this.tshirtMaterial = tshirtMaterial;
    }

    public String getTshirtSize() {
        return tshirtSize;
    }

    public void setTshirtSize(String tshirtSize) {
        this.tshirtSize = tshirtSize;
    }

    public int getTshirtQuantity() {
        return tshirtQuantity;
    }

    public void setTshirtQuantity(int tshirtQuantity) {
        this.tshirtQuantity = tshirtQuantity;
    }

    public Tshirt getTshirt() {
        return tshirt;
    }

    public void setTshirt(Tshirt tshirt) {
        this.tshirt = tshirt;
    }
}
