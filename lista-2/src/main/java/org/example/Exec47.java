package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exec47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        String sexo = "";
        float peso = 0;
        int idade = 0;
        float altura = 0;

        List<String> nomesLista = new ArrayList<>();
        List<String> sexosLista = new ArrayList<>();
        List<Float> pesosLista = new ArrayList<>();
        List<Integer> idadesLista = new ArrayList<>();
        List<Float> alturasLista = new ArrayList<>();


        while (true) {

            System.out.println("Digite o nome do paciente: ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            nomesLista.add(nome);

            System.out.println("Digite o sexo M para masculino e F para feminino: ");
            sexo = scanner.nextLine();
            sexosLista.add(sexo);

            System.out.println("Digite o peso do paciente: ");
            peso = scanner.nextFloat();
            pesosLista.add(peso);

            System.out.println("Digite a idade do paciente: ");
            idade = scanner.nextInt();
            idadesLista.add(idade);

            System.out.println("Digite a altura do paciente: ");
            altura = scanner.nextFloat();
            alturasLista.add(altura);

            System.out.println("ATENÇÃO - Digite 'fim' no campo nome para finalizar");
            System.out.println("");

            scanner.nextLine();
        }



            int mediaIdadeHomens = 0;
            List<Integer> indexMulheres = new ArrayList<>();
            List<Integer> indexHomens = new ArrayList<>();

            int qtdPessoasIdade18Mais25Menos = 0;
            int pacienteMaisVelhoIndex = 0;
            int axPacienteMaisVelhoIndex = 0;

            int pacienteMaisBaixaIndex = 0;
        float axPacienteMaisBaixa = Float.MAX_VALUE;

            for (int i = 0; i < idadesLista.size(); i++) {
                //Identificar indexHomens e mulheres
                if (sexosLista.get(i).equalsIgnoreCase("F")) {
                    indexMulheres.add(i);
                } else if (sexosLista.get(i).equalsIgnoreCase("M")) {
                    indexHomens.add(i);
                }

                if (idadesLista.get(i) >= 18 && idadesLista.get(i) <= 25) {
                    qtdPessoasIdade18Mais25Menos++;

                }

                if (axPacienteMaisVelhoIndex < idadesLista.get(i)) {
                    axPacienteMaisVelhoIndex = idadesLista.get(i);
                    pacienteMaisVelhoIndex = i;
                }

            }

            double axMediaIdadeHomens = 0;
            int qtdMulheresIntervaloAlturaEPeso70Mais = 0;

            float axHomemMaisAlto = 0;
            int homemMaisAltoIndex = 0;

            for (int i = 0; i < indexHomens.size(); i++) {
                int posicaoNaListaIdade = indexHomens.get(i);
                axMediaIdadeHomens += idadesLista.get(posicaoNaListaIdade);

                if (alturasLista.get(posicaoNaListaIdade) > axPacienteMaisBaixa) {
                    axHomemMaisAlto = alturasLista.get(posicaoNaListaIdade);
                    homemMaisAltoIndex = posicaoNaListaIdade;
                }

            }


            for (int i = 0; i < indexMulheres.size(); i++) {

                int posicaoNaLista = indexMulheres.get(i);
                if (alturasLista.get(posicaoNaLista) >= 1.60 && alturasLista.get(posicaoNaLista) <= 1.70) {
                    if (pesosLista.get(posicaoNaLista) > 70) {
                        qtdMulheresIntervaloAlturaEPeso70Mais++;
                    }
                }

                if (alturasLista.get(posicaoNaLista) < axPacienteMaisBaixa) {
                    axPacienteMaisBaixa = alturasLista.get(posicaoNaLista);
                    pacienteMaisBaixaIndex = posicaoNaLista;
                }

            }

            System.out.println("RELATÓRIO!!!");

            System.out.println("Quantidade de paciente: " + alturasLista.size());
            System.out.println("Média de idade entre os homens: " + axMediaIdadeHomens / indexHomens.size());
            System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + qtdMulheresIntervaloAlturaEPeso70Mais);
            System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + qtdPessoasIdade18Mais25Menos);
            System.out.println("Nome do paciente mais velho: " + nomesLista.get(pacienteMaisVelhoIndex));
            System.out.println("nome da mulher mais baixa: " + nomesLista.get(pacienteMaisBaixaIndex));
            System.out.println("nome do homem mais alto: " + nomesLista.get(homemMaisAltoIndex));

    }

}
