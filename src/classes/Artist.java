package classes;

import java.util.ArrayList;

public class Artist {
    public String nome;
    public int idade;
    public String genero_musical;
    public ArrayList<Album> albums;

    public Artist(){}

    public Artist(String nome, int idade, String genero_musical) {
        this.nome = nome;
        this.idade = idade;
        this.genero_musical = genero_musical;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getGenero_musical() {
        return genero_musical;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }
}
