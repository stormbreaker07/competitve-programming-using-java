package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository addProduct;

    @Transactional
    public void ProductData(String name) {
        addProduct.addProduct(name);
        throw new RuntimeException("oh so sad");
    }
}
