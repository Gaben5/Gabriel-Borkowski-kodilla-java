package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private final InformationService informationService;
    private final SellService sellService;
    private final SellRepository sellRepository;
    private final Product product = new Product("Car", 125000);
    public ProductOrderService(final InformationService informationService, final SellService sellService, final SellRepository sellRepository) {
        this.informationService = informationService;
        this.sellService = sellService;
        this.sellRepository = sellRepository;
    }
    public SaleDto process(final BuyRequest rentRequest) {
        boolean isAvaliable = sellService.sell(rentRequest.getUser(), product, rentRequest.isAvaliable());

        if (isAvaliable) {
            informationService.inform(rentRequest.getUser());
            sellRepository.createSale(rentRequest.getUser(), product);
            return new SaleDto(rentRequest.getUser(), true);
        } else {
            return new SaleDto(rentRequest.getUser(), false);
        }
    }
}
