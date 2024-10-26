package teste123;

public class Teste {
	
	public static int atv (int x, int y) {
		for (int i=1; i<5; i++) {
			if (x%2==0) {
				x+=3;
			}else {
				x*=2;
			}
			if (y%2==0) {
				y-=1;
			}else {
				y+=3;
			}
		}
		int retorno = x+y;
		return retorno;
	}
	

	
	public static void main(String []args) {
		int teste = atv(1,4);
		System.out.println(teste);

		
	}

}
