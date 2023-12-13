package com.example.projectdummy.repository;
import com.example.projectdummy.model.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DummyRepository extends JpaRepository<Dummy, Long> {
}
