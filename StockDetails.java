package com.shop;

public class StockDetails extends ShopDetails {

	@Override
	public void shopInfo() {
		// TODO Auto-generated method stub
		System.out.println("Shop located in Siadapet Chennai");

	}

	@Override
	public void shopOwner() {
		// TODO Auto-generated method stub
		System.out.println("Shop owner Is Vicky");

	}

	public static void main(String[] args) {
		StockDetails s = new StockDetails();
		s.floorDetail();
		s.shopInfo();
		s.shopOwner();
	}
}
