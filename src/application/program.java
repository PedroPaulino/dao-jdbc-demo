package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {


		//Department obj = new Department(1 , "Books");
		
		//Seller seller = new Seller(21, "Bob", "Bob@gmail.com" , new Date(), 3000.0, obj);
		
		Scanner sc = new Scanner(System.in);
		
		SellerDAO sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("==== TEST 2: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("==== TEST 3: seller findAll ====");

		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		};
		
		System.out.println("==== TEST 4: seller insert ====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted ! New id = " + newSeller.getId());
		
		System.out.println("==== TEST 5: seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("==== TEST 6: seller delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		
		
		
	}

}
