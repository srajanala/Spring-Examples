package org.saisindhu.package6;

public class Triangle6 {
	private Pointer Point1;
	private Pointer Point2;
	private Pointer Point3;
	public Pointer getPoint1() {
		return Point1;
	}
	public void setPoint1(Pointer point1) {
		Point1 = point1;
	}
	public Pointer getPoint2() {
		return Point2;
	}
	public void setPoint2(Pointer point2) {
		Point2 = point2;
	}
	public Pointer getPoint3() {
		return Point3;
	}
	public void setPoint3(Pointer point3) {
		Point3 = point3;
	}

	public void draw(){
		System.out.println("Point1 : (" + getPoint1().getX() +", " + getPoint1().getY() + ")");
		System.out.println("Point2 : (" + getPoint2().getX() +", " + getPoint2().getY() + ")");
		System.out.println("Point3 : (" + getPoint3().getX() +", " + getPoint3().getY() + ")");
	}

}
