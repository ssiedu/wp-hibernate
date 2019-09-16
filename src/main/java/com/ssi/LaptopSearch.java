package com.ssi;

import org.hibernate.Session;

public class LaptopSearch {

	public static void main(String[] args) {
		Session session=Util.getSF().openSession();
		Laptop laptop=session.get(Laptop.class, "L111");
		System.out.println(laptop.getCode());
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getEmp().getEno());
		System.out.println(laptop.getEmp().getEname());
		System.out.println(laptop.getEmp().getSal());
		session.close();
	}

}
