package com.access.modifiers.outside;

import com.access.modifiers.PackageTest;
import com.access.modifiers.ProtectedTest;

public class PackageOutsidePackage extends PackageTest{

	public static void main(String[] args) {

		System.out.println("Accessing package variables, methods and constructor outside the package");
		/*PackageTest pt = new PackageTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();*/
		
		/*PackageOutsidePackage pop = new PackageOutsidePackage();
		System.out.println(pop.username);
		System.out.println(pop.password);
		pop.login();*/


	}
}
