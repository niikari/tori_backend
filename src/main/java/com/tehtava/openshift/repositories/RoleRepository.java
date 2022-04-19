package com.tehtava.openshift.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tehtava.openshift.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
