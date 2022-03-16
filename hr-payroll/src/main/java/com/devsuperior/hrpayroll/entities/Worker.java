package com.devsuperior.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Double dailyInCome;
}
