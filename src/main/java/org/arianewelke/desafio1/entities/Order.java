package org.arianewelke.desafio1.entities;

public class Order {
    Integer code;
    Double basic;
    Double discount;

    public Order() {}

    public Order(Integer code, Double discount, Double basic) {
        this.code = code;
        this.discount = discount;
        this.basic = basic;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }
}
