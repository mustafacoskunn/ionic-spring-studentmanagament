package com.example.studentmanagament.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import javax.persistence.*;


@Entity
@Data
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Students  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty(value = "created_id")
    @Column(name = "created_id", length = 60)
    private Long createdId;

    @Column(name = "age", length = 60)
    private Long age;

    @Column(name = "name", length = 60)
    private String name;

    @Column(name = "address", length = 60)
    private String address;

}
