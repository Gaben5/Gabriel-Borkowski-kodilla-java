package com.kodilla.good.patterns.food2Door;

public class InfServiceImp implements InfService{
    @Override
    public void information(Supplier supplier) {
        System.out.println("Dear "+ supplier.getName()+" thank you for shopping in our store");
    }
}
