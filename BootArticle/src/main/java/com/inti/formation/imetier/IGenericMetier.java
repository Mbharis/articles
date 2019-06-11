package com.inti.formation.imetier;

import java.util.List;

public interface IGenericMetier<P,I> {

	public P ajouter(P p);
	public P update(P p);
	public void delete(I ref);
	public P findOne(I ref);
	public List<P> findAll();
}
