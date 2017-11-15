package org.saisindhu.package7;

import java.util.List;

public class Triangle7 {
	
   private List<Point7> points;

	public List<Point7> getPoints() {
	return points;
	}


    public void setPoints(List<Point7> points) {
	this.points = points;
	}

	public void draw(){
		
		for(Point7 point : points ){
		System.out.println("Point : (" + point.getX() +", " + point.getY() + ")");
		}
	}

}
