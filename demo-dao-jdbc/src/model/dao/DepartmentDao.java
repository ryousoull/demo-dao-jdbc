package model.dao;

import model.entities.Departamet;

import java.util.List;

public interface DepartmentDao {
    void insert(Departamet obj);
    void update(Departamet obj);
    void deletebById(Integer id);
    Departamet findById(Integer id);
    List<Departamet> findAll();
}
