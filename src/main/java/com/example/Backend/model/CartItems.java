//package com.example.Backend.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Builder
//@Table(name = "CART_ITEM")
//public class CartItems {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @Column(name = "quantity", nullable = false)
//    private int quantity;
//
//    @ManyToOne
//    @JoinColumn(name = "cart_id", nullable = false)
//    private Cart cart;
//
//    @ManyToOne
//    @JoinColumn(name = "car_id", nullable = false)
//    private Car car;
//
//    public void setCart(Cart cart) {
//        if (cart == null) {
//            if (this.cart != null) {
//                this.cart.getItems().remove(this);
//            }
//        } else {
//            cart.getItems().add(this);
//        }
//        this.cart = cart;
//    }
//
//}