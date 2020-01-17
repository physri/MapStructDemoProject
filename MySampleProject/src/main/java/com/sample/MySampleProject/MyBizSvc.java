package com.sample.MySampleProject;

import org.springframework.stereotype.Component;

@Component
public class MyBizSvc {
	SortAlgorithm algorithm = new QuickSortAlgorithm();
	public void doSorting() {
		System.out.println("");
	}
}
