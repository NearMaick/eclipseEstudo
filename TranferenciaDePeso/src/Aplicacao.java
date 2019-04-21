
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//qual é o problema: tranferir peso entre duas pessoas:
		
		Pessoa maick = new Pessoa ();//criei minha pessoa XD
		Pessoa piabinha = new Pessoa ();//criei a pessoa do piabinha
		
		maick.nome = "NearMaick";
		maick.pesoInicial = 82;
	
		piabinha.nome = "Piaba Gameplay";
		piabinha.pesoInicial = (float) 49.8;
		
		float transferirQuanto = 18;//quilos transferidos:
		
		piabinha.pesoFinal = (float) maick.transferirPeso(transferirQuanto, maick.pesoInicial, piabinha.pesoInicial);
		
		
		System.out.println("o " + maick.nome + " tem " + maick.pesoInicial + " Kilogramas ");
		System.out.println("o " + piabinha.nome + " tem " + piabinha.pesoInicial + " Kilogramas ");
		System.out.println("O " + maick.nome + " transferiu para o " + piabinha.nome + " o peso de: " +  transferirQuanto);
		System.out.println("O peso do " + maick.nome + " atualmente é de: " + maick.pesoFinal);
		System.out.println("O peso do " + piabinha.nome + " atualmente é de: " + piabinha.pesoFinal);
	}

}
