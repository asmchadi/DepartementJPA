package com.department.utils;

public enum Status {
	VALID("VALIDE"), // par chef
	NONVALID("NON VALIDE"), // par chef
	PENDING("EN ATTENDANT"), // ajouter par l'enseignant
	REGECTED("REJETÉ"), // modifier par chef
	MODIFIED("MODIFIÉ"); // modifier par l'enseignant

	private Status() {
		this.text = "";
	}

	private Status(String text) {
		this.text = text;
	}

	private final String text; 
	
	public String getText() {
		return text;
	}

	public static void main(String[] args) {
		System.out.println(VALID);
	}
}
