package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("/////// processo seletivo ///////");
        SelecionarCandidato();
        AnalisarCandidato();
    }

    static void SelecionarCandidato() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual <= candidatos.length){
            String candidato = candidatos[candidatoAtual];
            float salarioPretendido = Float.parseFloat(String.format("%.2f",valorPretendido()));

            System.out.println("O candidato " + candidato + " solicitou o salário de " + salarioPretendido);

            if (salarioPretendido >= salarioBase){
                System.out.println("O candidato " + candidato + " foi selecionado.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void AnalisarCandidato(){
        double valorBase = 2000;

        if (valorBase > valorPretendido()){
            System.out.println("Ligar para o candidato.");
        } else if (valorBase == valorPretendido()) {
            System.out.println("Ligar para o candidato com contra-proposta.");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

}
