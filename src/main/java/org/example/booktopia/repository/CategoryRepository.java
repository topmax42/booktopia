package org.example.booktopia.repository;

import org.example.booktopia.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("select c from Category c where c.id in :categoryIds and c.isDeleted = false")
    List<Long> findAllIdByAndIsDeletedIsFalse(Iterable<Long> categoryIds);
}