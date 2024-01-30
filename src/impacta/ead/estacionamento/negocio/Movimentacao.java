package impacta.ead.estacionamento.negocio;

import java.time.LocalDateTime;

/*
 * Representa a movimentação do veiculo dentro do estacionamento. ou seja
 * ele contem as informações de entrada e saida do veiculo e valor 
 * pago na estada
 * 
 * @Author Hericlis Ventura*/
public class Movimentacao {
		private Veiculo veiculo;
		private LocalDateTime dataHoraEntrada;
		private  LocalDateTime dataHoraSaida;
		private double valor;
}
