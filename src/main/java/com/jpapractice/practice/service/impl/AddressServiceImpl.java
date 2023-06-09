package com.jpapractice.practice.service.impl;

import com.jpapractice.practice.entity.Address;
import com.jpapractice.practice.repository.AddressRepository;
import com.jpapractice.practice.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address addAddress(Address address) {
        Address address1 = Address.builder()
                .country(address.getCountry())
                .district(address.getDistrict())
                .student(address.getStudent())
                .build();

        addressRepository.save(address1);
        return address1;
    }

    @Override
    public Address getAddress(int id) {
        return addressRepository.findById(id).get();
    }
}
