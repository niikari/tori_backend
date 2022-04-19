package com.tehtava.openshift.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tehtava.openshift.models.Office;

public interface OfficeRepository extends JpaRepository<Office, Long> {

}
