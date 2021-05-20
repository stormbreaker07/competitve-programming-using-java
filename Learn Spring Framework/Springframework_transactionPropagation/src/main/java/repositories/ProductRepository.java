package repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void addProduct(String name) {
        String sql = "INSERT INTO ProductUser VALUES(NULL , ?)";
        jdbcTemplate.update(sql , name);
    }
}
