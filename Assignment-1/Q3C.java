class Q3C {
	public static void main(String a[]){
		int x = 10;
		int y = 11;
		int z = x++ - --y - --x  +  x++;
		System.out.println("x ="+x+" y="+y+" z="+z);
	}
}