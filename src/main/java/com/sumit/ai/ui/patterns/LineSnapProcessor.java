package com.sumit.ai.ui.patterns;

public class LineSnapProcessor extends Processor{

	int dx = 5;
	int dy = 5;
	@Override
	public Point process(Point pointIn) {
		Point p = pointIn.clone();
		p = super.process(p);
		p.x = ((int)(p.x/dx ))*dx;
		p.y = ((int)(p.y/dy ))*dy;
		return p ; 
	}
	

}
