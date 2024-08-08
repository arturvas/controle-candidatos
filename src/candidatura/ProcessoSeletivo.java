package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("/////// processo seletivo ///////");
        AnalisarCandidato();
    }

    static void AnalisarCandidato(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int valorBase = 2000;

        for (String candidato : candidatos){
            System.out.println("Candidato " + candidato + " pede uma remuneração de " + String.format("%.2f",valorPretendido()));
        }

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
