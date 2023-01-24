package com.Onetomany.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Onetomany.entity.Address;
@Transactional
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
