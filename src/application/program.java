package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {


		//Department obj = new Department(1 , "Books");
		
		//Seller seller = new Seller(21, "Bob", "Bob@gmail.com" , new Date(), 3000.0, obj);
		
		SellerDAO sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: seller findById ====");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
	}

}
