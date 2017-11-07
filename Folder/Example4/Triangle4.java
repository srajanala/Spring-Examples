package org.saisindhu.pacakage4;

public class Triangle4 {
	private String type;
	private int height;
	
	public Triangle4(String type){
		this.type=type;
	}
	
	public Triangle4(int height){
		this.height=height;
	}
	public Triangle4(String type, int height){
		this.type=type;
		this.height=height;
	}
	public String getType(){
		return type;
	}
	public int getHeight(){
		return height;
	}
	public void draw(){
		System.out.println(getType()+" Traingle drawn with height "+getHeight());
	}

}
