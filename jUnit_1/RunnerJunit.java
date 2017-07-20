package jUnit_1;

import junit.framework.TestCase;

public class RunnerJunit extends TestCase {

	public static void main(String[] args) {

		junit.textui.TestRunner.run(TestCalcul.class);
	}
}
