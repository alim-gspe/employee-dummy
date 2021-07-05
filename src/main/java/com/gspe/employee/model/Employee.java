package com.gspe.employee.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String division;

    @OneToMany(mappedBy = "employee")
    private List<AccountNumber> accountNumbers;
}
