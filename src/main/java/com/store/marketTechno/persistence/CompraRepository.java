package com.store.marketTechno.persistence;

import com.store.marketTechno.domain.Purchase;
import com.store.marketTechno.domain.repository.PurchaseRepository;
import com.store.marketTechno.persistence.crud.CompraCrudRepository;
import com.store.marketTechno.persistence.entity.Compra;
import com.store.marketTechno.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;
    @Autowired
    private PurchaseMapper mapper;
    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }


    @Override
    public Optional<List<Purchase>> getByClient(int clientId) {
        return compraCrudRepository.findByIdCliente(clientId).map(compras -> mapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        compra.getProductos().forEach(product -> product.setCompra(compra));
        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}
