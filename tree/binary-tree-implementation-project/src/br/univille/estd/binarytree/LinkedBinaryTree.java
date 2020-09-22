package br.univille.estd.binarytree;

/**
 * Implementacao de uma Ã¡rvore binÃ¡ria usando estrutura encadeada
 * @author leandersonandre
 *
 * @param <E>
 */
public class LinkedBinaryTree<E> {
	
	protected BTPosition<E> root; // Referencia para a raiz
	protected int size;           // Numero de nodos
	
	/**
	 * Construtor de uma Ã¡rvore vazia
	 */
	public LinkedBinaryTree() {
		root = null; // inicia com uma Ã¡rvore vazia
		size = 0;
	}
	
	/**
	 * Retorna o numero de nodos da Ã¡rvore
	 * @return
	 */
	public int size() {
		return this.size;
	}
	
	/**
	 * Retorna se um nodo Ã© interno
	 */
	public boolean isInternal(BTPosition<E> v) throws InvalidPositionException{
		if(v == null) {
			throw new InvalidPositionException("Posição inválida.");
		}
		return v.getParent() != null  ? true : false;
	}
	
	
	/**
	 * Retorna se um nodo Ã© externo
	 */
	public boolean isExternal(BTPosition<E> v) throws InvalidPositionException{
		if(v == null) {
			throw new InvalidPositionException("Posição inválida.");
		}
		return v.getParent() == null  ? true : false;
	}
	
	/**
	 * Retorna se um nodo Ã© a raiz
	 */
	public boolean isRoot(BTPosition<E> v) throws InvalidPositionException{
		if(v == null) {
			throw new InvalidPositionException("Posição inválida.");
		}
		return root.equals(v);
	}
	/**
	 * Retorna se um nodo tem o filho da esquerda
	 */
	public boolean hasLeft(BTPosition<E> v) throws InvalidPositionException{
		if(v == null) {
			throw new InvalidPositionException("Posição inválida.");
		}
		return v.getLeft() != null ? true : false;
	}
	
	/**
	 * Retorna se um nodo tem o filho da direita
	 */
	public boolean hasRight(BTPosition<E> v) throws InvalidPositionException{
		if(v == null) {
			throw new InvalidPositionException("Posição inválida.");
		}
		return v.getRight() != null ? true : false;
	}
	
	/**
	 * Retorna a raiz da Ã¡rvore
	 */
	public BTPosition<E> root() throws EmptyTreeException{
		if(this.size == 0) {
			throw new EmptyTreeException("Lista vazia.");
		}
		return this.root;
	}
	
	/**
	 * Retorna o filho da esquerda de um nodo
	 * LanÃ§a BoundaryViolationException se nao tiver filho da esquerda
	 */
	public BTPosition<E> left(BTPosition<E> v) throws InvalidPositionException, BoundaryViolationException{
		if(v == null) {
			throw new InvalidPositionException("Posição inválida.");
		}
		if(v.getLeft() == null) {
			throw new BoundaryViolationException("Posição a esquerda não existe.");
		}
		return v.getLeft();
	}
	
	/**
	 * Retorna o filho da direita de um nodo
	 * LanÃ§a BoundaryViolationException se nao tiver filho da direita
	 */
	public BTPosition<E> right(BTPosition<E> v) throws InvalidPositionException, BoundaryViolationException{
		if(v == null) {
			throw new InvalidPositionException("Posição inválida.");
		}
		if(v.getRight() == null) {
			throw new BoundaryViolationException("Posição a direita não existe.");
		}
		return v.getRight();
	}
	
	/**
	 * Retorna o pai de um nodo
	 * LanÃ§a BoundaryViolationException se nao tiver pai
	 */
	public BTPosition<E> parent(BTPosition<E> v) throws InvalidPositionException, BoundaryViolationException{
		if(v == null) {
			throw new InvalidPositionException("Posição inválida.");
		}
		if(v.getParent() == null) {
			throw new BoundaryViolationException("Posição pai não existe.");
		}
		return v.getParent();
	}
	
	/**
	 * Substitui o elemento armazenado no nodo
	 * Retorna o elemento substituido
	 */
	public E replace(BTPosition<E> v, E o) throws InvalidPositionException{
		if(v == null) {
			throw new InvalidPositionException("Posição inválida.");
		}
		E returned = v.getElement();
		v.setElement(o);
		return returned;
	}
	
	/**
	 * Retorna o irmao de um nodo
	 * LanÃ§a BoundaryViolationException se nao tiver um irmao
	 */
	public BTPosition<E> sibling(BTPosition<E> v) throws InvalidPositionException, BoundaryViolationException{
		return null;
	}
	
	/**
	 * Insere a raiz em uma arvore vazia
	 */
	public BTPosition<E> addRoot(E e) throws NonEmptyTreeException{
		if(this.size != 0) {
			throw new EmptyTreeException("A lista precisa estar vazia para adicionar um root.");
		}
		this.root.setElement(e);
		return this.root;
	}
	
	/**
	 * Insere o filho da esquerda em um nodo
	 */
	public BTPosition<E> insertLeft(BTPosition<E> v, E e) throws InvalidPositionException{
		return null;
	}
	
	/**
	 * Insere o filho da direita em um nodo
	 */
	public BTPosition<E> insertRight(BTPosition<E> v, E e) throws InvalidPositionException{
		return null;
	}
	
	/**
	 * Remove um nodo com zero ou um filho
	 * Nao pode remover um nodo com dois filhos. Deve lancar InvalidPositionException
	 */
	public E remove(BTPosition<E> v) throws InvalidPositionException{
		return null;
	}
	
	/**
	 *  Cria um novo nodo para a arvore binaria
	 */
	protected BTPosition<E> createNode(E element, BTPosition<E> parent, BTPosition<E> left, BTPosition<E> right) {
		return null;
	}

}
