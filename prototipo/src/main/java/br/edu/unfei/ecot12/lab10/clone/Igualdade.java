package br.edu.unfei.ecot12.lab10.clone;

public interface Igualdade<T extends Igualdade<T>> {
	public abstract boolean isEqual(T obj);
}
