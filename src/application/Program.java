package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {
	public static void main(String args[]){
//		Departament obj = new Departament(1, "Books");
//		System.out.println(obj);
//		
//		Seller seller = new Seller(21, "Marcos","emal@gmail.com", new Date(), 3000,obj);
		Departament departament = new Departament(1, null);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.FindbyId(2);
		
		System.out.println(seller);
		
		 
		List<Seller> list = sellerDao.findByDepartament(departament);
		for (Seller obj : list) {
			System.out.println(obj);	
		}
		
		List<Seller> listw = sellerDao.findAll();
		for (Seller obj : listw) {
			System.out.println(obj);	
		}
		
		
		System.out.println("Insert");
		Seller InsertSeller = new Seller(null , "Marcos", "gmai.com@gmail.com", new Date(), 3000, departament);
		sellerDao.insert(InsertSeller);
		System.out.println("Inserted! id = "+ InsertSeller.getId());
		
		System.out.println("UPdate");
		seller = sellerDao.FindbyId(1);
		seller.setName("Marcola");
		sellerDao.update(seller);
		
		System.out.println("Delete");
		int id = 6;
		sellerDao.deletebyId(id);
		
		
	}
}
