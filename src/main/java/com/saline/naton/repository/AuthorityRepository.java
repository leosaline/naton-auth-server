package com.saline.naton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saline.naton.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	Authority findByName(String name);
}
