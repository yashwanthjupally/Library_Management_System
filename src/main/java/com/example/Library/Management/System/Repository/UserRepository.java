package com.example.Library.Management.System.Repository;

import com.example.Library.Management.System.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
