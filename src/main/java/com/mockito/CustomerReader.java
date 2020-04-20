package com.mockito;

public class CustomerReader {

    public EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public String findFullName(long l) {
        Customer customer = this.entityManager.find(Customer.class, l);
        return customer.firstName+ " " + customer.lastName;
    }
}
