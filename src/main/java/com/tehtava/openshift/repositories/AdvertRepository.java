package com.tehtava.openshift.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tehtava.openshift.models.Advert;

public interface AdvertRepository extends JpaRepository<Advert, Long> {

}
