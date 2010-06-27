package jagrammar.typehierarchy;

public class Utilities{

	public static int cyrcularShift(int i,int n){
		if (n == 0) return i;
		return (i >> n | i << (32 - n));
	}

	public static void main(String[] args){
		System.out.println(cyrcularShift(3,33));
		System.out.println(cyrcularShift(3,1));
	}
}