package br.com.sirkaue.models;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " É sucesso absoluto " +
                    "e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " Geral curtindo!");
        }
    }
}
