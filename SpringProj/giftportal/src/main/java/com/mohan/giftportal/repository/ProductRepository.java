package com.mohan.giftportal.repository;

import com.mohan.giftportal.model.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.price > :price")
    List<Product> findProductsByPriceGreaterThan(@Param("price") int price);

   
    @Query("SELECT p FROM Product p WHERE p.manufacture = :year")
    List<Product> findProductsByManufactureYear(@Param("year") String year);
    
}
