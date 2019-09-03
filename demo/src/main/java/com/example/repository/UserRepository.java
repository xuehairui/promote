package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * User Jpa支持
 * @author xue.hairui
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
