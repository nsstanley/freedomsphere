package com.freedomsphere.soldiertrack;

public class Htwt extends Test implements Testable {

	private int height, weight;
	
	public void setHeight(int h){
		height = h;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void setweight(int w){
		weight = w;
	}
	
	public int getWeight(){
		return weight;
	}
	
	@Override
	public boolean calculatePass() {
		// TODO Auto-generated method stub
		return false;
	}

}
