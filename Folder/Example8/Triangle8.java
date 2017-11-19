package org.saisindhu.package8;

public class Triangle8 {
	private Point8 pointA;
	//private Point8 pointB;
	//private Point8 pointC;
	
	
	public Point8 getPointA() {
		return pointA;
	}
	public Triangle8(Point8 pointA){
		this.pointA=pointA;
	}
/*	public void setPointA(Point8 pointA) {
		this.pointA = pointA;
	} */
/*	public Point8 getPointB() {
		return pointB;
	}
	public void setPointB(Point8 pointB) {
		this.pointB = pointB;
	}
	public Point8 getPointC() {
		return pointC;
	}
	public void setPointC(Point8 pointC) {
		this.pointC = pointC;
	} */
	public void draw(){
		System.out.println("PointA : (" + getPointA().getX() +", " + getPointA().getY() + ")");
		//System.out.println("PointB : (" + getPointB().getX() +", " + getPointB().getY() + ")");
		//System.out.println("PointC : (" + getPointC().getX() +", " + getPointC().getY() + ")");
	}
}
