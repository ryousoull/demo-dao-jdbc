package model.dao;

import model.entities.Departamet;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deletebById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
