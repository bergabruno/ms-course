package com.devsuperior.hrworker.repositories;

import com.devsuperior.hrworker.entites.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
