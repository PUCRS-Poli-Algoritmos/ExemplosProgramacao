package br.pucrs.exerprog.lambdastream;

import java.util.List;

public class DemoTransformString {
	public void demo(List<String> ls, TransformString tr) {
		for (String s: ls)
			System.out.println("String: " + s + "   Transform: " + tr.modify(s));
	}
}
