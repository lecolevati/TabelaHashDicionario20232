package view;

import controller.Dicionario;
import model.Palavra;

public class Principal {

	public static void main(String[] args) {
		Palavra p1 = new Palavra("Ator","Pessoa que representa em teatro, cinema, rádio, televisão; artista, intérprete");
		Palavra p2 = new Palavra("Abrir","Retirar o que está fechando um espaço, superfície etc.; descerrar: abrir uma embalagem");
		Palavra p3 = new Palavra("Hálito","Exalação, emanação, cheiro bom ou mau");
		Palavra p4 = new Palavra("Lontra","Nome de vários mamíferos da ordem dos carniceiros, família dos mustelídeos, que vivem em tocas, à beira da água");
		Palavra p5 = new Palavra("Tolher","Ocasionar descontentamento ou dificuldades a; estorvar");
		Palavra p6 = new Palavra("Trancar","Segurar ou fechar com tranca");
		Palavra p7 = new Palavra("Talho","Corte produzido por fio ou gume");
	
		Dicionario d = new Dicionario();
		
		try {
			d.add(p1);
			d.add(p2);
			d.add(p3);
			d.add(p4);
			d.add(p5);
			d.add(p6);
			d.add(p7);
			
			d.list("a");
			d.list("h");
			d.list("l");
			d.list("t");
			
			Palavra p = new Palavra();
			p.verbete = "Trancar";

			d.search(p);
			
			d.remove(p);
			
			d.list("t");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
