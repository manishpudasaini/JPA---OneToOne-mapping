package com.jpapractice.practice.service;

import com.jpapractice.practice.entity.Address;

public interface AddressService {
    Address addAddress(Address address);
    Address getAddress(int id);
}
