package com.kodilla.stream.invoice.simple;

import java.util.Objects;

public final class SimpleProduct {
    private final String productname;
    private final double productPrice;

    public SimpleProduct(String productname, double productPrice) {
        this.productname = productname;
        this.productPrice = productPrice;
    }

    public String getProductname() {
        return productname;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleProduct that = (SimpleProduct) o;
        return Double.compare(that.productPrice, productPrice) == 0 && Objects.equals(productname, that.productname);
    }

}
