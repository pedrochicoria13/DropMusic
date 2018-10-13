package classes;

import java.util.ArrayList;

public class Album extends Artist{
    public String nome_album;
    public String genero_musical_album;
    public ArrayList<Music> musicas;

    public Album(){}

    public Album(String nome_album, String genero_musical_album) {
        this.nome = nome_album;
        this.genero_musical = genero_musical_album;
    }

    public String getNome_album() {
        return nome;
    }

    public String getGenero_musical() {
        return genero_musical_album;
    }
}
