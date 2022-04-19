package com.tehtava.openshift.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tehtava.openshift.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
