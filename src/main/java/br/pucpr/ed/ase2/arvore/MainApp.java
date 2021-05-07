package br.pucpr.ed.ase2.arvore;

public class MainApp {

    public static void main(String[] args) {
        Arvore234 arvore234 = new Arvore234();
        arvore234.adicionar(70);
        arvore234.adicionar(50);
        arvore234.adicionar(30);
        arvore234.adicionar(40);
        arvore234.adicionar(20);
        arvore234.adicionar(80);
        arvore234.adicionar(25);
        arvore234.adicionar(90);
        arvore234.adicionar(75);
        arvore234.adicionar(10);
        System.out.println();
        Integer buscar = arvore234.buscar(20);
        System.out.println(buscar);
        buscar = arvore234.buscar(5);
        System.out.println(buscar);
    }

}
