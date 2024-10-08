package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato: candidatos){
            entrarEmContato(candidato);
        }

    }

    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso.");
            }
        }while (continuaTentando && tentativasRealizadas <= 3);

        if (atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " pois excedeu o número máximo("+ tentativasRealizadas +") de tentativas");
        }
    }

//    método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i=0; i < candidatos.length; i++){
            System.out.println("O candidato de numero "+(i+1)+" é "+candidatos[i]);
        }
    }

    static void selecionarCandidato() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual <= candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salário de " + salarioPretendido);

            if (salarioPretendido <= salarioBase){
                System.out.println(candidato + " foi selecionado.");
                candidatosSelecionados++;
            } else {
                System.out.println("Que pena, candidato " + candidato + " não foi selecionado.");
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidato(){
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
