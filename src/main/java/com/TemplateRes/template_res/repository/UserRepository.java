package com.TemplateRes.template_res.repository;

import com.TemplateRes.template_res.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository fournit déjà les méthodes comme save(), findAll(), findById()...
}
