package com.example.OneToOne.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ModelRepository<T extends Model> extends JpaRepository<T,Long> {
}
