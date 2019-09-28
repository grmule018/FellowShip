package com.bridgelabz.designpatterns.behavioral.visitor;

public class Fruit implements ItemElement {
	
	private int PricePerKg;
	private int weight;
	private String name;

	public Fruit(int priceKg, int wt, String nm){
		this.PricePerKg=priceKg;
		this.weight=wt;
		this.name = nm;
	}
	
	public int getPricePerKg() {
		return PricePerKg;
	}


	public int getWeight() {
		return weight;
	}

	public String getName(){
		return this.name;
	}
	
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
