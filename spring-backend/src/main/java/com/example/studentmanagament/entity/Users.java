package com.example.studentmanagament.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email", length = 60,unique = true)
    private String email;

    @Column(name = "name", length = 60)
    private String name;

    @Column(name = "image", length = 1500)
    private String image;

    @JsonIgnore
    @Column(name = "password", length = 40)
    private String password;
}
