package com.charan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charan.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
