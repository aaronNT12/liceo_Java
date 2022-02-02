package com.liceolapaz.ant.des;

public abstract class Numero {
	protected abstract Numero sumar(Numero operando);
	protected abstract Numero restar(Numero operando);
	protected abstract Numero multiplicar(Numero operando);
	protected abstract Numero dividir(Numero operando);
	protected abstract String mostrar();

}
