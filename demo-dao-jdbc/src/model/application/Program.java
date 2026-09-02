package model.application;

import model.entities.Departamet;
import model.entities.Seller;

import java.util.Date;

public class Program {
    static void main() {
        Departamet obj = new Departamet(1, "Books");

        Seller seller = new Seller(21, "Bob", "bobGamil@", new Date(), 3000.0, obj);
        System.out.println(obj);
        System.out.println(seller);
    }
}
