package com.eis.carboncredits.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Owner {
    @Id
    Long ownerId;
    String name;
    String phone;

    public Owner(Long ownerId, String name) {
        this.ownerId = ownerId;
        this.name = name;
    }

    public Owner() {
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
