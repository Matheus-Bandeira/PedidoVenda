import javax.inject.Inject;
import javax.inject.Named;

@Named("meuBean")
public class PrecoProdutoBean {
	
	@Inject
	Calculadora calculadora;
	
	public double getPreco(){
		return calculadora.calcularPreco(12, 12);
	}
}
