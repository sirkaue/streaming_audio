package br.com.sirkaue.application;

import br.com.sirkaue.models.MinhasPreferidas;
import br.com.sirkaue.models.Music;
import br.com.sirkaue.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music music = new Music();
        music.setTitulo("null");
        music.setCantor("null");

        for (int i = 0; i < 1000; i++) {
            music.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            music.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("null");
        podcast.setApresentador("null");

        for (int i = 0; i < 50; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(music);
    }
}