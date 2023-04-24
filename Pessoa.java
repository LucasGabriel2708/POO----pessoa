package br.ufal.aracomp.poo;

class Pessoa{
    String nome;
    String profissao;
    String endereco;
    int idade;
    
    Pessoa(String n, int i, String p, String e){
    	System.out.println();
    	this.nome = n;
    	this.idade = i;
    	this.profissao = p;
    	this.endereco = e;
    }

    void falar() {
        System.out.println("Meu nome é "+ nome);
    }
    
    void falar(String frase) {
    	this.falar();
    	System.out.println(frase);
    }
    
    void falari(int a) {
    	this.falar();
    	System.out.println(a);
    }
    
    void silenciar() {
        System.out.println("Silêncio!!!");
    }

    void andar(int passos) {
        System.out.println("caminhei " + passos +  " passos!");
    }
    
    void apresentar() {
    	System.out.println("Prazer meu nome é " + nome + " tenho "+idade+" anos de idade, Meu trampo é "+ profissao+", e moro no "+endereco);
    	
    	
    }

}
