package edu.beatriz.primeirasemana;
public class minhaClasse {
    
    public static void main (String [] args){
        String primeiroNome = "Atlas";
        String segundoNome = "Xavier";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
