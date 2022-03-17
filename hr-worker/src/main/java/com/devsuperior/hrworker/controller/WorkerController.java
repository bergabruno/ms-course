package com.devsuperior.hrworker.controller;

import com.devsuperior.hrworker.entites.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/workers")
@Log4j2
public class WorkerController {

    @Autowired
    private Environment env;

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> workers = workerRepository.findAll();

        return ResponseEntity.ok(workers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){

        log.info("port=" + env.getProperty("local.server.port"));

        Optional<Worker> worker = workerRepository.findById(id);

        return ResponseEntity.ok(worker.get());
    }
}
