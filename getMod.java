  package getMod;

public class getMod_lib {
	private int n,m,syou,amari;

	public getMod_lib(int n, int m) {
			this.n = n;
			this.m = m;
	}
	public int getsyou(){
		return syou;
	}
	
	public int getamari(){
		return amari;
	}
	
	public void devide(int syou,int amari){
		this.syou= n / m;
		this.amari =n % m;
	
	}
}              
