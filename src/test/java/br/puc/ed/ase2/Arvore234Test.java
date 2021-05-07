package br.puc.ed.ase2;

import br.pucpr.ed.ase2.arvore.Arvore234;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * A execução dos testes 1 a 6 com sucesso valem valem 0,2 ponto cada. O teste 7 vale 0,3 ponto.
 * A inspeção do código-fonte vale 0,5.
 * Total: 6 * 0,2 + 0,3 = 1,5 + 0,5 = 2
 */
public class Arvore234Test {

    /**
     * Testa as 3 primeiras inclusões que representam o caso mais simples.
     * Os 3 elementos são inseridos de forma ordenada dentro do array da raiz.
     * A execução deste teste com sucesso vale 0,2 ponto.
     */
    @Test
    void teste1(){
        Arvore234 arvore234 = new Arvore234();
        arvore234.adicionar(70);
        arvore234.adicionar(50);
        arvore234.adicionar(30);
        Assertions.assertEquals(30, arvore234.getRaiz().getElemento(0));
        Assertions.assertEquals(50, arvore234.getRaiz().getElemento(1));
        Assertions.assertEquals(70, arvore234.getRaiz().getElemento(2));
    }

    /**
     * Testa a primeira divisão de nó na raiz, com a inclusão do número 40.
     * A execução deste teste com sucesso vale 0,2 ponto.
     */
    @Test
    void teste2(){
        Arvore234 arvore234 = new Arvore234();
        arvore234.adicionar(70);
        arvore234.adicionar(50);
        arvore234.adicionar(30);
        arvore234.adicionar(40);
        Assertions.assertEquals(50, arvore234.getRaiz().getElemento(0));
        Assertions.assertEquals(30, arvore234.getRaiz().getFilho(0).getElemento(0));
        Assertions.assertEquals(40, arvore234.getRaiz().getFilho(0).getElemento(1));
        Assertions.assertEquals(70, arvore234.getRaiz().getFilho(1).getElemento(0));
    }

    /**
     * Testa a inclusão dos elementos 20 e 80, que devem ser inseridos nas folhas e não na raiz.
     * A execução deste teste com sucesso vale 0,2 ponto.
     */
    @Test
    void teste3(){
        Arvore234 arvore234 = new Arvore234();
        arvore234.adicionar(70);
        arvore234.adicionar(50);
        arvore234.adicionar(30);
        arvore234.adicionar(40);
        arvore234.adicionar(20);
        arvore234.adicionar(80);
        Assertions.assertEquals(50, arvore234.getRaiz().getElemento(0));
        Assertions.assertEquals(20, arvore234.getRaiz().getFilho(0).getElemento(0));
        Assertions.assertEquals(30, arvore234.getRaiz().getFilho(0).getElemento(1));
        Assertions.assertEquals(40, arvore234.getRaiz().getFilho(0).getElemento(2));
        Assertions.assertEquals(70, arvore234.getRaiz().getFilho(1).getElemento(0));
        Assertions.assertEquals(80, arvore234.getRaiz().getFilho(1).getElemento(1));
    }

    /**
     * Testa a primeira divisão de nó fora da raiz, com a inclusão de 25 e 90.
     * A execução deste teste com sucesso vale 0,2 ponto.
     */
    @Test
    void teste4(){
        Arvore234 arvore234 = new Arvore234();
        arvore234.adicionar(70);
        arvore234.adicionar(50);
        arvore234.adicionar(30);
        arvore234.adicionar(40);
        arvore234.adicionar(20);
        arvore234.adicionar(80);
        arvore234.adicionar(25);
        arvore234.adicionar(90);
        Assertions.assertEquals(30, arvore234.getRaiz().getElemento(0));
        Assertions.assertEquals(50, arvore234.getRaiz().getElemento(1));
        Assertions.assertEquals(20, arvore234.getRaiz().getFilho(0).getElemento(0));
        Assertions.assertEquals(25, arvore234.getRaiz().getFilho(0).getElemento(1));
        Assertions.assertEquals(40, arvore234.getRaiz().getFilho(1).getElemento(0));
        Assertions.assertEquals(70, arvore234.getRaiz().getFilho(2).getElemento(0));
        Assertions.assertEquals(80, arvore234.getRaiz().getFilho(2).getElemento(1));
        Assertions.assertEquals(90, arvore234.getRaiz().getFilho(2).getElemento(2));
    }

    /**
     * Testa outra divisão de nó, com a inclusão de 75.
     * A execução deste teste com sucesso vale 0,2 ponto.
     */
    @Test
    void teste5(){
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
        Assertions.assertEquals(30, arvore234.getRaiz().getElemento(0));
        Assertions.assertEquals(50, arvore234.getRaiz().getElemento(1));
        Assertions.assertEquals(80, arvore234.getRaiz().getElemento(2));
        Assertions.assertEquals(20, arvore234.getRaiz().getFilho(0).getElemento(0));
        Assertions.assertEquals(25, arvore234.getRaiz().getFilho(0).getElemento(1));
        Assertions.assertEquals(40, arvore234.getRaiz().getFilho(1).getElemento(0));
        Assertions.assertEquals(70, arvore234.getRaiz().getFilho(2).getElemento(0));
        Assertions.assertEquals(75, arvore234.getRaiz().getFilho(2).getElemento(1));
        Assertions.assertEquals(90, arvore234.getRaiz().getFilho(3).getElemento(0));
    }

    /**
     * Testa mais uma divisão de nó na raiz, com a inclusão do elemento 10.
     * Desta vez a raiz possui 4 filhos.
     * A execução deste teste com sucesso vale 0,2 ponto.
     */
    @Test
    void teste6(){
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
        Assertions.assertEquals(50, arvore234.getRaiz().getElemento(0));
        Assertions.assertEquals(30, arvore234.getRaiz().getFilho(0).getElemento(0));
        Assertions.assertEquals(80, arvore234.getRaiz().getFilho(1).getElemento(0));
        Assertions.assertEquals(10, arvore234.getRaiz().getFilho(0).getFilho(0).getElemento(0));
        Assertions.assertEquals(20, arvore234.getRaiz().getFilho(0).getFilho(0).getElemento(1));
        Assertions.assertEquals(25, arvore234.getRaiz().getFilho(0).getFilho(0).getElemento(2));
        Assertions.assertEquals(40, arvore234.getRaiz().getFilho(0).getFilho(1).getElemento(0));
        Assertions.assertEquals(70, arvore234.getRaiz().getFilho(1).getFilho(0).getElemento(0));
        Assertions.assertEquals(75, arvore234.getRaiz().getFilho(1).getFilho(0).getElemento(1));
        Assertions.assertEquals(90, arvore234.getRaiz().getFilho(1).getFilho(1).getElemento(0));
    }

    /**
     * Testa a busca de um elemento na árvore.
     * A execução deste teste com sucesso vale 0,3 ponto.
     */
    @Test
    void teste7(){
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
        Assertions.assertEquals(90, arvore234.buscar(90));
        Assertions.assertEquals(10, arvore234.buscar(10));
        Assertions.assertEquals(70, arvore234.buscar(70));
        Assertions.assertEquals(null, arvore234.buscar(5));
    }
}
