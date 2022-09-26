package com.EM.EntityMap.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "employee_details")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    private String empName;
    private Integer empAge;
    @JsonManagedReference
   @OneToOne(cascade =CascadeType.ALL)
   @JoinColumn(name = "fk_add_id")
   private Address address;

  //  @OneToMany(cascade = CascadeType.ALL)
  //  @JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id")
  //  private List<Address> address;


}

