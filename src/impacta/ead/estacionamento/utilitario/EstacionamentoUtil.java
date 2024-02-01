package impacta.ead.estacionamento.utilitario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import impacta.ead.estacionamento.negocio.Movimentacao;

/*
 * Representa uma classe de apoio ás demais do sistema.
 * 
 * @Author Hericlis Ventura*/
public class EstacionamentoUtil {

	/*
	 * Valida placa com padrão nacional LLL-NNNN L= Letra N = Numero
	 * 
	 * 
	 * @param placa Placa do Veiculo
	 * 
	 * @return true se atender o padrão e false senão
	 */
	public boolean validarPadraoPlaca() {
		// TODO implementar
		return false;
	}


	/*
	 *O calculo do valorda estada do veiculo baseado no tarifario
	 *e na hora da entrada e saida do veiculo
	 * 
	 * 
	 * Altera a própria instancia do parametro
	 * 
	 * @param movimentacao Instancia da /movimentacao
	 * 
	 * 
	 * @return true se atender o padrão e false senão
	 */
	public void calcularPagamento(Movimentacao movimentacao) {
		// TODO implementar
	}


	public static boolean validarPadrãoPlaca(String placa) {
		String padrao ="[A_Z][A_Z][A_Z]-\\d\\d\\d\\d";
		Pattern p = Pattern.compile(padrao); 
		Matcher m = p.matcher(placa);
		
		
		return m.matches();
	}

}
