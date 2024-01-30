package impacta.ead.estacionamento.negocio;
/*
 * Representa as informações relativas á vagas do estacionamento ou status de ocupação.
 * 
 * @Autho Hericlis Ventura
 * */
public class Vaga {
		public static int TOTAL_VAGAS = 100;
		private static int vagasOcupadas =0;
		
		private Vaga(){}
		/*
		 * Verificar a existencia de alguma vaga no estacionamento
		 * 
		 * 
		 * @return true se tiver alguma vaga e false se lotado.
		 * */
		public static boolean temVagaLivre() {
			// TODO implementar esse metodo.
			return false;
		}
		
		public static void inicializarOcupadas(){
//			TODO implementar
			}
		/*
		 * Retorna o numero de vagas ocupadas
		 * 
		 * @return numero total de vagas ocupadas num determinado instante*/
		
		public static  int ocupadas() {
			return Vaga.vagasOcupadas;
		}
		/*
		 * 
		 *Retornar o numero de vagas livres
		 * @return numero total de vagas livres num derteminado instante*/
		
		public static int livres() {
			return TOTAL_VAGAS - Vaga.vagasOcupadas;
		}
		/* 
		 * Atualiza o numero de vagas ocupadas após a entrada do veiculo
		 * */
		public static void entrou() {
			Vaga.vagasOcupadas ++;
		}
		
		
}
