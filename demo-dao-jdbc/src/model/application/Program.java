package model.application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departamet;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    static void main() {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Departamet departamet = new Departamet(2, null);
        List<Seller> list = sellerDao.findByDepartment(departamet);
        for (Seller obj : list) {
            System.out.println(obj);
        }

    }
}
