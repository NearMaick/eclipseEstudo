
public class Pessoa {
	public String nome;
	public float pesoInicial;
	public float pesoFinal;
	
	//transferindo peso de Maick pra piaba:
	public double transferirPeso(float peso, float deQuem, float praQuem){
	float pesoEnviado;
	
	pesoEnviado = peso + praQuem;//mandando peso pra alguem;
	pesoFinal = pesoInicial - peso;//tirando o peso da pessoa que mandou;
	
		return pesoEnviado;
	}
}
