package studio7;

public class Die {

	int n;
	public Die(int n) {
		this.n=n;
	}
	
	public int Dienumber() {
		int random = (int) (Math.random() * (n - 1) + 1);
		return random;
	}
}
