package com.example.projectdummy.repository;
import com.example.projectdummy.model.ExtraDummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraDummyRepository extends JpaRepository<ExtraDummy, Long> {
}
