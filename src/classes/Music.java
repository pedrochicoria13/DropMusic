package classes;

public class Music extends Album{

    public String nome_musica;
    public String produtor;
    public String compositor;

    public Music (String nome_musica, String produtor,String compositor){
        this.nome_musica=nome_musica;
        this.produtor=produtor;
        this.compositor=compositor;
    }

    public String getNome_musica() {
        return nome_musica;
    }

    public String getProdutor() {
        return produtor;
    }

    public String getCompositor() {
        return compositor;
    }
}
