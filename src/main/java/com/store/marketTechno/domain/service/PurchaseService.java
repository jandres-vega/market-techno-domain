package com.store.marketTechno.domain.service;

import com.store.marketTechno.domain.Purchase;
import com.store.marketTechno.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll(){
        return purchaseRepository.getAll();
    }
    public Optional<List<Purchase>> getByClient(int idClient){
        return  purchaseRepository.getByClient(idClient);
    }

    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }


}
