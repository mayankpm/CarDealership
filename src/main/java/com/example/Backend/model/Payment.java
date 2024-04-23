//package com.example.Backend.model;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Builder
//@Table(name = "PAYMENT")
//public class Payment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @Column(name = "card_number", nullable = false)
//    private String cardNumber;
//
//    @Column(name = "expiry_date", nullable = false)
//    private String expiryDate;
//
//    @Column(name = "cvv", nullable = false)
//    private int cvv;
//
//    @OneToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//}