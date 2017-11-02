package org.saisindhu.package3;

public class Triangle3 {
	private String Type;
	public String getType(){
		return Type;
	}
	public void setType(String Type){
		this.Type=Type;
	}
    
	public void draw(){
	 System.out.println(getType()+" Triangle drawn");
 }
}
