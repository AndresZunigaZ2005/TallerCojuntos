package clase2802;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Conjunto<T> implements Iterable<T>, Iterator<T>{
	
	private List<T> listaConjuntos = new ArrayList<T>();
	private int indice;
	
	public Conjunto() {
		this.indice = 0;
	}
	
	
	public Conjunto(List<T> listaConjuntos) {
		super();
		this.listaConjuntos = listaConjuntos;
		this.indice = 0;
	}
	
	
	public List<T> getListaConjuntos() {
		return listaConjuntos;
	}


	public void setListaConjuntos(List<T> listaConjuntos) {
		this.listaConjuntos = listaConjuntos;
	}

	
	
	
	
	public void anadir(T elemento) {
		listaConjuntos.add(elemento);
	}
	
	public void elmiminar(int i) {
		listaConjuntos.remove(i);
	}
	
	public boolean isContenido(T elemento) {
		return listaConjuntos.contains(elemento);
	}
	
	public boolean isConjuntoContenido(Conjunto<T> otroConjunto) {
		return otroConjunto.listaConjuntos.containsAll(this.listaConjuntos);
	}
	
	public void imprimir() {
		for (T t : listaConjuntos) {
			System.out.print(t+"   ");
		}
		System.out.println();
	}
	
	public Conjunto<T> unir(Conjunto<T> elementos){
		Conjunto<T> newConjunto = new Conjunto<>();
		newConjunto.listaConjuntos.addAll(this.listaConjuntos);
		newConjunto.listaConjuntos.addAll(elementos.listaConjuntos);
		return newConjunto;
	}

	@Override
	public Iterator<T> iterator() {
		return listaConjuntos.iterator();
	}


	@Override
	public boolean hasNext() {
		return indice<listaConjuntos.size();
	}


	@Override
	public T next() {
		if(hasNext()) {
			T elemento = listaConjuntos.get(indice);
			indice++;
			return elemento;
		}
		return null;
	}

}
