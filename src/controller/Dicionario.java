package controller;

import br.edu.fateczl.Lista;
import model.Palavra;

@SuppressWarnings("unchecked")
public class Dicionario {

	Lista<Palavra>[] dic = new Lista[26];

	public Dicionario() {
		int tamanho = dic.length;
		for (int i = 0; i < tamanho; i++) {
			dic[i] = new Lista<Palavra>();
		}
	}

	public void add(Palavra palavra) throws Exception {
		int hash = palavra.hashCode();
		Lista<Palavra> l = dic[hash];
		if (l.isEmpty()) {
			l.addFirst(palavra);
		} else {
			l.addLast(palavra);
		}
	}

	public void remove(Palavra palavra) throws Exception {
		int hash = palavra.hashCode();
		Lista<Palavra> l = dic[hash];
		if (!l.isEmpty()) {
			int size = l.size();
			for (int i = 0; i < size; i++) {
				Palavra p = l.get(i);
				if (palavra.verbete.equals(p.verbete)) {
					l.remove(i);
					break;
				}
			}
		}
	}

	public Palavra search(Palavra palavra) throws Exception {
		int hash = palavra.hashCode();
		Lista<Palavra> l = dic[hash];
		if (!l.isEmpty()) {
			int size = l.size();
			for (int i = 0; i < size; i++) {
				Palavra p = l.get(i);
				if (palavra.verbete.equals(p.verbete)) {
					System.out.print(p.toString() + " - ");
					System.out.print("Posição " + i + " da lista - ");
					System.out.println("Indice " + hash + " do vetor");
					return p;
				}
			}
		}
		return null;
	}

	public void list(String caractere) throws Exception {
		int hash = hash(caractere);
		Lista<Palavra> l = dic[hash];
		if (!l.isEmpty()) {
			int size = l.size();
			for (int i = 0 ; i < size ; i++) {
				System.out.print(l.get(i) + " -> ");
			}
		}
		System.out.println("NULL");
	}

	private int hash(String caractere) {
		char c = caractere.toLowerCase().charAt(0);
		int ch = c - 97;
		return ch;
	}
	
}
