package com.store.marketTechno.domain.repository;

import com.store.marketTechno.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(int clientId);
    Purchase save(Purchase purchase);
}
