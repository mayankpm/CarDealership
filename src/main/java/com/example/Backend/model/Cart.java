//package com.example.Backend.model;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Builder
//@Table(name = "CART")
//public class Cart {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @OneToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    @JsonIgnore
//    private User user;
//
//    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
//    @Builder.Default
//    private List<CartItems> items = new ArrayList<>();;
//
//    public void addItem(CartItems item) {
//        items.add(item);
//        item.setCart(this);
//    }
//
//    public void removeItem(CartItems item) {
//        items.remove(item);
//        item.setCart(null);
//    }
//}