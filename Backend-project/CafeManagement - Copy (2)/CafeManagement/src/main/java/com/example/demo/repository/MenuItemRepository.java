package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {

    // Method to find MenuItems by availability status
//    List<MenuItem> findByIsAvailable(boolean isAvailable);

    // Method to find MenuItems by category
    List<MenuItem> findByCategory(String category);
}

