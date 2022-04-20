package br.pucrs.exerprog.lambdastream;

import java.util.LinkedList;
import java.util.List;

public class ExewcDemoTransformString {
	public static void demo(List<String> ls, TransformString tr) {
		for (String s: ls)
			System.out.println("String: " + s + "   Transform: " + tr.modify(s));
	}
	public static void main(String[] args) {
		List<String> lStr = new LinkedList<String> ();
//		DemoTransformString demo = new DemoTransformString();
		
		lStr.add("CaSA");
		lStr.add("TELA");
		lStr.add("COMputADOr");
		lStr.add("tELEFONE");
		lStr.add("ícone");
		
//		demo.demo(lStr, s -> "-" + s + "-");
		demo(lStr, s -> "-" + s + "-");
		System.out.println();
		
//		demo.demo(lStr, 
//					s ->   {int x = 10;
//							s = s + x;
//							return s;});
		demo(lStr, 
				s ->   {int x = 10;
						s = s + x;
						return s;});
		System.out.println();
	}

}
