public class p2p1_1S21{
	public static void main(String[] args) {
		int a=12;
		if (a<10){
			System.out.println("si ingreso por que es verdadero");
		}
		if (a>10){
			System.out.println("este segmento si se ejecuta por que cumple la condicion");
		}
		if (true){
			System.out.println("aqui se ejecuta por que es verdadero");

		}
		if (false){
			System.out.println("este no se ejecuta por que es falso");

		}

		if ((a>10) == true){
			System.out.println("se ejecutara?");
		}
		System.out.println("continuamos con el codigo");

		System.out.println("");

		a= 17;

		if (a>18){
			System.out.println("eres mayor de edad");
		} else {
			System.out.println("eres mayor de edad");
		}

		a=2;

		if (a ==1){
			System.out.println("se evaluo a 1");
		}else if (a == 2){
			System.out.println("Se evaluo a 2");
		}else if (a == 3){
			System.out.println("se evaluoa 3");
		}else{
			System.out.println("se evaluaron los demas digitos");
		}

		//como valido para realizar una division entre 0

		int divisor=0;
		int dividendo=0;

		if (divisor == 0){
			System.out.println("no es posible hacer la division");
		}else{
			System.out.println("si puedo realizar la division");
		}
	}
}