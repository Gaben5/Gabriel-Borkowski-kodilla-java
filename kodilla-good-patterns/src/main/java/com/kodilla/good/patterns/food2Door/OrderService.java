package com.kodilla.good.patterns.food2Door;


public class OrderService {
    private final SellService sellService;
    private final InfService infService;

    public OrderService(SellService sellService, InfService infService) {
        this.sellService = sellService;
        this.infService = infService;
    }
    public void process(final BuyRequest buyRequest){
        boolean isAvailable = sellService.sell(buyRequest.getOrdersSuppliers(),buyRequest.getProduct(),buyRequest.getQuantity());

        if (isAvailable){
            buyRequest.getOrdersSuppliers().process();
            infService.information(buyRequest.getOrdersSuppliers());
            new Dto(buyRequest.getOrdersSuppliers(), true);
        }else {
            new Dto(buyRequest.getOrdersSuppliers(), false);
        }
    }
}
