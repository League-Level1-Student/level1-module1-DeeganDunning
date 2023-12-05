package _06_vault;

public class VaultRunner {
public static void main(String[] args) {
	Vault v = new Vault();
	SecretAgent sa = new SecretAgent();
	v.tryCode(0);
	int x = sa.findCode(v);
	System.out.println("The code is: " + x);
	
}

}
