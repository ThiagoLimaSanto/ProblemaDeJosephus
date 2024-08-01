package com.mycompany.problemajosephus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProblemaJosephus {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 20; i++) {
            pessoas.add(new Pessoa(i, "Nome" + i, "Telefone" + i, "Endereco" + i, "CPF" + i));
        }
        
        while (pessoas.size() > 1) {
            int m = random.nextInt(pessoas.size()) + 1;
            int indexToRemove = (m - 1) % pessoas.size();
            System.out.println("Removendo: " + pessoas.get(indexToRemove));
            pessoas.remove(indexToRemove);
        }

        System.out.println("Pessoa sobrevivente: " + pessoas.get(0));
    }
}
