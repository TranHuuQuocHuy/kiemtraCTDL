package kiemtra;

public class bai1 {
	public static long F (int n) {
		if (n<=2)
			return 1;
		else {
			return F(n-1) + F(n-2);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long F = F(8);
				System.out.print(F);
	}

}