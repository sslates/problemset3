package org.cschool.cs;

public class Set3 {

	boolean p = true;
	boolean q = false;

	public boolean notPorQ(boolean p, boolean q) {
		return (!p && !q || p && q || !p && q || q && !p);

	}

	public boolean notporq2(boolean p, boolean q) {
		return !(p || q);

	}

	public boolean notpandnotq3(boolean p, boolean q) {
		return !p && !q;

	}

	public boolean notpandq(boolean p, boolean q) {
		return !p && q;
	}

	public boolean pandnotq(boolean p, boolean q) {
		return p && !q;
	}

	public static void main(String[] args) {

		boolean p = true;
		boolean q = true;

		Set3 set3 = new Set3();

		System.out.println("tt" + " " + set3.notporq2(p, q) + " " + set3.notpandnotq3(p, q) + " " + set3.notpandq(p, q)
				+ " " + set3.pandnotq(p, q));

		p = true;
		q = false;

		System.out.println("tf" + " " + set3.notporq2(p, q) + " " + set3.notpandnotq3(p, q) + " " + set3.notpandq(p, q)
				+ " " + set3.pandnotq(p, q));

		p = false;
		q = true;

		System.out.println("ft" + " " + set3.notporq2(p, q) + " " + set3.notpandnotq3(p, q) + " " + set3.notpandq(p, q)
				+ " " + set3.pandnotq(p, q));

		p = false;
		q = false;

		System.out.println("ff" + " " + set3.notporq2(p, q) + " " + set3.notpandnotq3(p, q) + " "
				+ set3.notpandq(p, q) + " " + set3.pandnotq(p, q));
	}

	/* work out NOT ( p or q) and then return that value */

}
