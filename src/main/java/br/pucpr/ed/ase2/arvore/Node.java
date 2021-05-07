package br.pucpr.ed.ase2.arvore;

public class Node {
    protected Integer[] elementos;
    protected Node pai;
    protected Node[] filhos;
    protected int quantidadeElementos;

    public Node() {
        elementos = new Integer[3];
        filhos = new Node[4];
        quantidadeElementos = 0;
    }

    /**
     *
     * @param novoElemento Novo elemento que será inserido no array do Node
     * @return O método retorna a posição em que o novo elemento foi inserido. Essa informação será
     * útil na divisão de nó, quando o segundo elemento é movido para o pai e você precisa saber
     * em que posições o nó pai vai se conectar com o nó atual e com o novo nó a direita.
     */
    public int adicionar(Integer novoElemento){
        return 0;
    }

    /**
     * Remove um elemento do array. Utilizado na divisão de nó para passar um elemento para o novo
     * nó da direita e outro elemento para o pai.
     * @param posicao Posição em que ocorrerá a remoção.
     * @return Retorna o elemento removido.
     */
    public Integer remover(int posicao){
        return null;
    }

    /**
     * De acordo com os elementos do nó atual e o elemento procurado, retorna a posição entre os filhos
     * onde o novoElemento pode ser inserido ou encontrado.
     * @param novoElemento Novo elemento que será inserido na árvore.
     * @return Retorna a posição do filho para onde será necessário navegar para incluir o novo
     * elemento.
     */
    protected int getPosicaoFilhoParaTravessia(Integer novoElemento) {
        return 0;
    }

    /**
     *
     * O método itera sobre o array para procurar o elemento. Método útil na busca de um elemento
     * da classe Arvore234.
     * @param elemento Elemento procurado
     * @return Retorna a posição do elemento encontrado. Caso o elemento não exista no array
     * retorna -1
     */
    protected int getPosicaoElementoEncontrado(Integer elemento) {
        return -1;
    }

    public Integer getElemento(int indice){
        return elementos[indice];
    }

    public Node getFilho(int indice){
        return filhos[indice];
    }

    /**
     * Método usado para conectar o nó na posição desejada.
     * @param posicao Posição para conexão
     * @param node Nó que será conectado
     */
    public void conectarFilho(int posicao, Node node){
    }

    /**
     * Método usado para desconectar o filho na posição desejada.
     * @param posicao Posição para desconexão
     * @return Retorna o nó que foi desconectado.
     */
    public Node desconectarFilho(int posicao){
        return null;
    }

    public boolean isCheio(){
        return quantidadeElementos == elementos.length;
    }

    /**
     * Método utilitário para ser usado na Arvore234
     * @return True se for folha, False caso contrário.
     */
    public Boolean isFolha(){
        return null;
    }
}
