package com.anc.metier;

import java.util.Collection;

import com.anc.entities.anc;

public interface Ianc {
	public anc findByCode(int code);
	public Collection<anc> findAll();
	public void add(anc produit);
	public void update(anc produit);
	public void delete(int code);

}
