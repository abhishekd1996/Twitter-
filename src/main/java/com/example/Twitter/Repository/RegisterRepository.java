package com.example.Twitter.Repository;

import com.example.Twitter.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Repository
public interface RegisterRepository extends JpaRepository<User, UUID> {




}
