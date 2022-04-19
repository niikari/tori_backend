package com.tehtava.openshift.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tehtava.openshift.models.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

}
