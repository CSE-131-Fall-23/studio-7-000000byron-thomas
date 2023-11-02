package studio7;

import java.io.FileNotFoundException;

public class My_Little_Rectangle { //And the Power of Friendship
	
	public int width, length;
	public My_Little_Rectangle (int l, int w) {
		w = this.width;
		l = this.length;

	} 
	public static int area(int l, int w) {
		int area = (l * w);
		return area;
	}
	
	public static int per(int l, int w) {
		int per = (2*l + 2*w);
		return per;
	}
	
	public static void main(String[] args) {
		return My_Little_Rectangle(l,w);
	}
}
