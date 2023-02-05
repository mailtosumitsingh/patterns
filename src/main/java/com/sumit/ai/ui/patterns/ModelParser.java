package com.sumit.ai.ui.patterns;

import java.util.List;

import org.jgrapht.alg.cycle.SzwarcfiterLauerSimpleCycles;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DirectedMultigraph;
import org.springframework.stereotype.Component;

@Component
public class ModelParser {
	public DirectedMultigraph<Point, DefaultEdge> parse(Model mdl) {
		final DirectedMultigraph<Point, DefaultEdge> g = new DirectedMultigraph<Point, DefaultEdge>(DefaultEdge.class);
		Point ZERO = new Point(-1,-1,"Start");
		List<Point>pts = mdl.getPts();
		Point last = ZERO;
		addVertex(ZERO,g);
			for(int i=0;i<pts.size();i++) {
				if(g.containsVertex(pts.get(i))) {
					addEdge(last, pts.get(i),g);
				}else {
				addVertex(pts.get(i),g);
				addEdge(last, pts.get(i),g);
				last = pts.get(i);
				}
			}
			return g;
	}
	private void addEdge(Point last, Point point, DirectedMultigraph<Point, DefaultEdge> g) {
		System.out.println("ADding edge: "+last.getId()+"->"+point.getId());
		g.addEdge(last, point);
	}
	private void addVertex(Point p, DirectedMultigraph<Point, DefaultEdge> g) {
		System.out.println("ADding point: "+p.toString());
		g.addVertex(p);
	}
	public List<List<Point>> detectCycles(Model mdl) {
		DirectedMultigraph<Point, DefaultEdge> g = parse(mdl);
		System.out.println(g);
		SzwarcfiterLauerSimpleCycles<Point,DefaultEdge> cycleDetector = new SzwarcfiterLauerSimpleCycles<>(g);
		List<List<Point>> cycles = cycleDetector.findSimpleCycles();
		System.out.println(cycles);
		return cycles;
	}
}
