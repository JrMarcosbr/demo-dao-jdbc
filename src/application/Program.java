package application;

import java.util.Date;

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
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.FindbyId(3);
		
		System.out.println(seller);
	}
}
