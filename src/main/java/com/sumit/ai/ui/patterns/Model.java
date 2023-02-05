package com.sumit.ai.ui.patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DirectedMultigraph;

public class Model {
	
	List<Point> pts = new ArrayList<>();
	public List<Point> getPts() {
		return Collections.unmodifiableList(pts);
	}

	public void addPoint(Point p) {
		this.pts.add(p);
	}
	public void addPoints(List<Point> pts) {
		this.pts.addAll(pts);
	}

}
