package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

@Service
public class ProductDeliveryService {

    @Autowired
    public ProductRepository productRepository;

    public void addSomeProduct() {
        productRepository.add();
        productRepository.add();
        productRepository.add();
    }

}
