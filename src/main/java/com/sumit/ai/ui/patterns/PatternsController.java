package com.sumit.ai.ui.patterns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatternsController {

	@Autowired
	ModelParser modelParser;

	@GetMapping("/pattern")
	public String getPattern() {
		return "Patterns";
	}

	@PostMapping("/getCycles")
	public List<List<Point>> getCycles(@RequestBody Model model) {
		List<List<Point>> cycles = modelParser.detectCycles(model);
		return cycles;
	}

}