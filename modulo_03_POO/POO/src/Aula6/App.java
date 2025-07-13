package Aula6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Josivan", 33));
        pessoas.add(new Pessoa("Rodrigo", 15));
        pessoas.add(new Pessoa("Bruno", 11));

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " | Idade: " + pessoa.getIdade());
        }

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() >= 18) {
                System.out.println("--------------------------------------------------------");
                System.out.println("Pessoas com idade maiores de 18 anos: ");
                System.out.println("Nome: " + pessoa.getNome() + " | Idade: " + pessoa.getIdade());
                System.out.println("------------------------------------------------------------");
            }
        }

        System.out.println("Nome: " + pessoas.get(0).getNome() + " & " + pessoas.get(pessoas.size() - 1).getNome());

        System.out.println("------------------------------------------------");
        System.out.println("Quantidade de pessoas na lista: " + pessoas.size());
        System.out.println("------------------------------------------------------");

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caneta", 2.00));
        produtos.add(new Produto("Lápis", 1.50));
        produtos.add(new Produto("Caderno", 9.50));

        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + " | Preço: R$ " + produto.getPreco());
        }

        System.out.println("---------------------------------------------------");

        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal = produto.getPreco() + produto.getPreco();
        }

        System.out.println("Valor total dos produtos: " + valorTotal);

        System.out.println("----------------------------------------------------");

        for (Produto produto : produtos) {
            produto.exibirInfo();

            produtos.get(1).setPreco(5.00);
        }
        System.out.println("--------------------------------------");

        List<Nome> nomes = new ArrayList<>();
        nomes.add(new Nome("Ana"));
        nomes.add(new Nome("Bruno"));
        nomes.add(new Nome("Carla"));
        nomes.add(new Nome("Diego"));

        System.out.println("Lista de nomes completa:");
        for (Nome nome : nomes) {
            nome.exibirLista();
        }
        System.out.println("--------------------------");
        nomes.remove(1);

        System.out.println("Lista após a remoção nome:");
        for (Nome nome : nomes) {
            System.out.println(nome.getNome());
        }
        System.out.println("-------------------------------");

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Fruta("Maça"));
        frutas.add(new Fruta("Banana"));
        frutas.add(new Fruta("Uva"));

        System.out.println("Lista de frutas: ");
        for (Fruta fruta : frutas) {
            fruta.exibirLista();
        }

        boolean temBanana = false;

        for (Fruta fruta : frutas) {
            if (fruta.getFruta().equals("Banana")) {
                temBanana = true;
                break;
            }
        }
        if (temBanana == true) {
            System.out.println("Está na lista");
        } else {
            System.out.println("Não está na lista");
        }
        System.out.println("---------------------------");



    
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("O Alquimista", "Paulo Coelho"));
        livros.add(new Livro("1984", "George Orwell"));
        livros.add(new Livro("Dom Casmurro", "Machado de Assis"));

        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
        System.out.println("------------------------------");



        List<NumerosInteiros> numeros = new ArrayList<>();
        numeros.add(new NumerosInteiros(5));
        numeros.add(new NumerosInteiros(1));
        numeros.add(new NumerosInteiros(8));
        numeros.add(new NumerosInteiros(3));
        numeros.add(new NumerosInteiros(2));

        Collections.sort(numeros, Comparator.comparing(NumerosInteiros::getNumero));
        System.out.println("Lista Ordenada: ");
        for (NumerosInteiros numero : numeros) {
            System.out.println(numeros);
        }
    }
}
