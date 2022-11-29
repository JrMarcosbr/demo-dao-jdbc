package model.dao;

import java.util.List;

import model.entities.Departament;

public interface DepartamentDao {
		void insert(Departament obj);
		void update(Departament obj);
		void deletebyId(int id);
		Departament FindbyId(int id);
		List<Departament> findAll();
		
}
