package com.fstop.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fstop.test.entity.country;
import org.springframework.stereotype.Repository;

@Repository
public interface countryDao extends JpaRepository<country, String> {
}
