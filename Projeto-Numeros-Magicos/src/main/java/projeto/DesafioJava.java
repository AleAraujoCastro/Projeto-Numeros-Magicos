package projeto;

public class DesafioJava {
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int[][] x = {{8,27},{49,49},{9,9},{25,25}};
		
		boolean primo = false;
		int qtdMagic = 0;
		for(int k = 0; k < x.length; k++) {
			for(int i = x[k][0]; i<=x[k][1]; i++) {
				double sqrt = Math.sqrt(i);
				if(sqrt - Math.floor(sqrt) == 0) {
					for(int j=2; j<=i/2; j++) {
						if(i%j == 0) {
							primo = false;
						} else {
							primo = true;
						}
					}
					if(primo) {
						qtdMagic +=1;
						primo = false;
					}
				}
			}
		}
		
		System.out.println("Quantidade de números mágicos: " + qtdMagic);

	}

}
