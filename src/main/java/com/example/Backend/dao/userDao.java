//package com.example.Backend.dao;
//
//import com.example.Backend.model.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface userDao extends JpaRepository<User, Long> {
//
//    User findByEmail(String email);
//
//    @Query("SELECT u FROM User u WHERE u.username = :username")
//    User findByUsername(@Param("username") String username);
//
//    boolean existsByUsername(String username);
//}