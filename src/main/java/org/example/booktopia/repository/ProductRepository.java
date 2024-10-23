package org.example.booktopia.repository;

import org.example.booktopia.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p where p.category.id IN :categoryIds and p.isDeleted = false ")
    List<Product> findAllByCategoryIds(@Param("categoryIds") Iterator<Long> categoryIds);

    @Query("SELECT p FROM Product p WHERE p.isDeleted = false AND p.quantity > 0")
    List<Product> findAll();

    @Query("SELECT p FROM Product p WHERE p.id = :id AND p.isDeleted = false")
    Optional<Product> findById(@Param("id") Long id);

    @Query("SELECT COUNT(p) > 0 FROM Product p WHERE p.isbn = :isbn")
    Boolean existsByName(@Param("isbn") String isbn);
}
