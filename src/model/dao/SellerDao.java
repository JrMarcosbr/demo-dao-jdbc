package model.dao;

import java.util.List;

import model.entities.Departament;
import model.entities.Seller;

public interface SellerDao {
	void insert(Seller obj);
	void update(Seller obj);
	void deletebyId(int id);
	Seller FindbyId(int id);
	List<Seller> findAll();
	List<Seller> findByDepartament(Departament departament);
}
