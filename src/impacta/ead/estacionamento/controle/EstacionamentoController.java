package impacta.ead.estacionamento.controle;

import java.time.LocalDateTime;
import java.util.List;

import impacta.ead.estacionamento.negocio.Movimentacao;
import impacta.ead.estacionamento.negocio.Vaga;
import impacta.ead.estacionamento.negocio.Veiculo;
import impacta.ead.estacionamento.persistencia.DAOEstacionamento;
import impacta.ead.estacionamento.utilitario.EstacionamentoUtil;

public class EstacionamentoController {

	
	
	public void processarEntrada(String placa,String marca, String modelo,String cor) throws EstacionamentoException, VeiculoException {
	
//		verificar se o estacionamento está lotado 
		if(!Vaga.temVagaLivre()) {
			throw new EstacionamentoException("Estacionamento Lotado!");
			
			
		};
		
//		verificar o padrão de String da placa
		if(EstacionamentoUtil.validarPadrãoPlaca(placa)) {
			throw new VeiculoException("Placa Invalida!");
		}
//		criar uma instancia do veiculo com os dados informados
		Veiculo veiculo = new Veiculo(placa, marca, modelo, cor);

//		criar a movimentação vincunlando o veiculo e com a data de entrada corrente 
		
		Movimentacao movimentacao = new Movimentacao(veiculo, LocalDateTime.now());
		
//		retirar na base de dados a informação
		DAOEstacionamento dao = new DAOEstacionamento();
		dao.criar(movimentacao);
//		atualizar o numero de vagas ocupadas
		
		
		
	}
	
	/*
	 * A partir dos dados do veiculo informados pelo operador, realiza 
	 * o fluxo de entrada do veiculo no estacionamento, registrando 
	 * a movimentação gerada
	 *   
	 * 
	 * @param placa Placa do veiculo
	 * @param marca Marca do veiculo
	 * @param modelo Modelo do veiculo
	 * @param cor Cor do veiculo
	 *  
	 */
	
	public Movimentacao processarSaida(String placa) {
//		TODO implementar
		return null;
	}
	
	public List<Movimentacao> emitirRelatorio(LocalDateTime data){
//		TODO implementar
		return null;
		
	
	}
}
