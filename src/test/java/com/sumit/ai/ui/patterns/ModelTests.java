package com.sumit.ai.ui.patterns;

import org.junit.jupiter.api.Test;

public class ModelTests {
@Test
public void testModel1() {
	System.out.println("Testing 1");
	Model m = new Model();
	ModelParser p = new ModelParser();
	m.addPoint(new Point(0,0,"1"));
	m.addPoint(new Point(0,1,"2"));
	m.addPoint(new Point(0,2,"3"));
	m.addPoint(new Point(0,3,"4"));
	m.addPoint(new Point(0,0,"1"));
	p.detectCycles(m);
		
}
@Test
public void testModel2() {

	System.out.println("Testing 2");
	Model m = new Model();
	ModelParser p = new ModelParser();
	m.addPoint(new Point(0,0,"1"));
	m.addPoint(new Point(0,1,"2"));
	m.addPoint(new Point(0,2,"3"));
	m.addPoint(new Point(0,3,"4"));
	m.addPoint(new Point(0,0,"5"));
	p.detectCycles(m);
}
@Test
public void testModel3() {

	System.out.println("Testing 3");
	Model m = new Model();
	ModelParser p = new ModelParser();
	m.addPoint(new Point(0,0,"1"));
	m.addPoint(new Point(0,1,"2"));
	m.addPoint(new Point(0,2,"3"));
	m.addPoint(new Point(0,3,"4"));
	m.addPoint(new Point(0,2,"2"));
	p.detectCycles(m);
}
@Test
public void testModel4() {

	System.out.println("Testing 4");
	Model m = new Model();
	ModelParser p = new ModelParser();
	m.addPoint(new Point(0,0,"1"));
	m.addPoint(new Point(0,1,"2"));
	m.addPoint(new Point(0,2,"3"));
	m.addPoint(new Point(0,3,"4"));
	m.addPoint(new Point(0,3,"3"));
	p.detectCycles(m);
}
@Test
public void testModel5() {

	System.out.println("Testing 5");
	Model m = new Model();
	ModelParser p = new ModelParser();
	m.addPoint(new Point(0,0,"1"));
	m.addPoint(new Point(0,1,"2"));
	m.addPoint(new Point(0,2,"3"));
	m.addPoint(new Point(0,3,"4"));
	m.addPoint(new Point(0,5,"5"));
	m.addPoint(new Point(0,6,"6"));
	m.addPoint(new Point(0,7,"7"));
	m.addPoint(new Point(0,8,"8"));
	m.addPoint(new Point(0,2,"3"));
	m.addPoint(new Point(0,9,"9"));
	m.addPoint(new Point(0,0,"1"));
	p.detectCycles(m);
		
}
}
