package me.aksenov.springstarterjava.service;

import me.aksenov.springstarterjava.model.PopIt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PopItDao extends JpaRepository<PopIt, Long> {

    @Query("select p from PopIt p where p.color = :color")
    List<PopIt> getByColor(String color);
}
