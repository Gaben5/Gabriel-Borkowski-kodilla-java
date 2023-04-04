package com.kodilla.good.patterns.food2Door;


public class OrderService {
    private final SellService sellService;
    private final InfService infService;

    public OrderService(SellService sellService, InfService infService) {
        this.sellService = sellService;
        this.infService = infService;
    }
    public void process(final BuyRequest buyRequest){
        boolean isAvailable = sellService.sell(buyRequest.getSupplier(),buyRequest.getProduct(),buyRequest.getQuantity());

        if (isAvailable){
            infService.information(buyRequest.getSupplier());
            new Dto(buyRequest.getSupplier(), true);
        }else {
            new Dto(buyRequest.getSupplier(), false);
        }
    }
}
