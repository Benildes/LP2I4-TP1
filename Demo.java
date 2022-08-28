package com.mycompany.tp01;

/**
//  Nome:  Benildes Fernandes de Menezes CB3004392
*/

public class Demo {

    public static void isDisponivel(LivroDeBiblioteca livro){
        if(Boolean.FALSE.equals(livro.getEmprestado())){
            livro.Empresta();
            System.out.println("O livro "+livro.titulo+" foi emprestado com sucesso! \n" +
                    "Ele deverá ser devolvido em "+livro.diasemprestimo+" dias.");
        } else{
            System.out.println("O livro "+livro.titulo+" não está disponível para empréstimo no momento.");
        }
    }

    public static void main(String[] args) {
        LivroDeBiblioteca L1 = new LivroDeBiblioteca("Introdução à POO usando JAVA", "Rafael Santos", "Campus/SBC", (short) 2003,"g11p17");
        System.out.print("SOBRE O LIVRO\n"+L1.getDados()+"\n----------------------------------------------------------------------------");
        System.out.println("\n");
        isDisponivel(L1);
        System.out.print("\n");
        isDisponivel(L1);
    }
}
