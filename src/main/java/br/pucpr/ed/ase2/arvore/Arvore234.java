package br.pucpr.ed.ase2.arvore;

public class Arvore234 {

    private Node raiz;

    public Arvore234() {
        raiz = new Node();
    }

    /**
     * Método público para a inclusão de um elemento na árvore.
     * @param novoElemento Novo elemento que será adicionado.
     */
    public void adicionar(Integer novoElemento) {
        raiz = adicionarRecursivamente(raiz, novoElemento);
    }

    /**
     * Percorre recursivamente os nós da árvore para a inclusão de um novo elemento.
     * Aproveite os métodos utilitários da classe Node para tornar a implementação mais
     * fácil.
     * @param noAtual Nó atual na travessia da árvore.
     * @param novoElemento Novo elemento que será adicionado.
     * @return
     */
    private Node adicionarRecursivamente(Node noAtual, Integer novoElemento) {
        return null;
    }

    /**
     * Este método recebe o nó cheio e executa as seguintes operações:
     * 1. Cria um novo nó a direita.
     * 2. Move o terceiro elemento do nó atual para o novo nó.
     * 3. Move o terceiro e quarto filhos para o novo nó.
     * 4. Obtém o nó pai. Caso o nó atual seja a raiz, cria um novo nó pai.
     * 5. Move o segundo elemento do nó atual para o pai.
     * 6. Utiliza a posição onde o elemento foi inserido no pai para definir em que posição
     * o nó atual e o novo nó a direita são incluídos como filhos do pai.
     * 7. Faz com que o nó atual aponte para o novo pai.
     *
     * Dica: utilize os métodos remover, adicionar, conectarFilho e desconectarFilho para realizar
     * as operações do método.
     */
    private void dividirNo(Node noAtual) {
    }


    /**
     * Busca Busca um elemento na árvore.
     * @param elemento Elemento procurado.
     * @return Retorna o elemento caso ele seja encontrado, ou null caso contrário.
     */
    public Integer buscar(Integer elemento) {
        return buscarRecursivamente(raiz, elemento);
    }

    /**
     * Método recursivo para a busca do elemento.
      * @param noAtual Nó atual na travessia da árvore.
     * @param elemento Elemento procurado.
     * @return Retorna o elemento caso ele seja encontrado, ou null caso contrário.
     */
    private Integer buscarRecursivamente(Node noAtual, Integer elemento){
        return null;
    }

    public Node getRaiz() {
        return raiz;
    }
}
