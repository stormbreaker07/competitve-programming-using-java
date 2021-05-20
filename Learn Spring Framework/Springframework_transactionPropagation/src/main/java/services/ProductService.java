package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {

    /*
    required
    requires_new
    mandatory
    never
    supports
    not_supported
    nested
     */

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public void addTenProduct() {
        for(int i=0;i<10;i++) {
            productRepository.addProduct("User" + i);
        }
    }

}
