package com.ninos.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "active")
    private int active;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private Set<Role> roles = new HashSet<>();


    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="code_id")
    private Code code;


   @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
   private List<Address> addresses = new ArrayList<>();

   @Embedded
   @ElementCollection
   @CollectionTable(name = "payment_information", joinColumns = @JoinColumn(name = "user_id"))
   private List<PaymentInformation> paymentInformations = new ArrayList<>();


   @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
   @JsonIgnore
   private List<Rating> ratings = new ArrayList<>();


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Review> reviews = new ArrayList<>();


    private LocalDateTime createdAt;


}
