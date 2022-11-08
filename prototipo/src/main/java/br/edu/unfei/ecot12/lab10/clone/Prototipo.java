package br.edu.unfei.ecot12.lab10.clone;

public interface Prototipo<T extends Prototipo<T>> {
	public abstract T clone();
}
