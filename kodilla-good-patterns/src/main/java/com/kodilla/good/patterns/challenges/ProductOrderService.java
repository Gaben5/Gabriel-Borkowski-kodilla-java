package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private final InformationService informationService;
    private final SellService sellService;
    private final SellRepository sellRepository;
    public ProductOrderService(final InformationService informationService, final SellService sellService, final SellRepository sellRepository) {
        this.informationService = informationService;
        this.sellService = sellService;
        this.sellRepository = sellRepository;
    }
    public SaleDto process(final BuyRequest buyRequest) {
        boolean isAvailable = sellService.sell(buyRequest.getUser(),buyRequest.getProduct());

        if (isAvailable) {
            informationService.inform(buyRequest.getUser());
            sellRepository.createSale(buyRequest.getUser(), buyRequest.getProduct());
            return new SaleDto(buyRequest.getUser(), true);
        } else {
            return new SaleDto(buyRequest.getUser(), false);
        }
    }
}
