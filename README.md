# Simulação de Processo Seletivo

## Descrição

Este projeto é uma simulação de um processo seletivo em Java. O sistema tenta entrar em contato com uma lista de candidatos, simula as tentativas de contato e analisa as pretensões salariais dos candidatos para decidir quais deles serão selecionados.

## Funcionalidades

- **Contato com Candidatos:** O sistema tenta realizar contato com cada candidato até três vezes. Se o contato for bem-sucedido, a tentativa é registrada, caso contrário, o sistema informa que não foi possível contatar o candidato.
- **Simulação de Pretensão Salarial:** Cada candidato tem uma pretensão salarial gerada aleatoriamente, que é comparada com um salário base para determinar se o candidato será selecionado.
- **Impressão de Candidatos Selecionados:** O sistema pode imprimir a lista de candidatos selecionados, informando o índice de cada um.

## O que foi praticado

- **Controle de Fluxo:** Uso de loops `for`, `while`, e `do-while` para simular o processo seletivo.
- **Manipulação de Arrays:** Iteração e manipulação de arrays de candidatos.
- **Geração Aleatória:** Uso das classes `Random` e `ThreadLocalRandom` para simular o atendimento de chamadas e pretensões salariais dos candidatos.
- **Interação Simulada:** Simulação de tentativas de contato e resposta dos candidatos.

## Como Executar

1. Compile o projeto:
   ```bash
   javac candidatura/ProcessoSeletivo.java
