package antonio.u5d7.entities;


import java.time.LocalDate;
import java.util.UUID;

public class BlogPost {
    private UUID blog_id;
    private String titolo;
    private String contenuto;
    private String categoria;
    private LocalDate tempoLettura;
    private String cover;

    public BlogPost() {
    }

    public BlogPost(String contenuto, String categoria, LocalDate tempoLettura, String cover, String titolo) {
        this.contenuto = contenuto;
        this.categoria = categoria;
        this.tempoLettura = tempoLettura;
        this.cover = cover;
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getTempoLettura() {
        return tempoLettura;
    }

    public void setTempoLettura(LocalDate tempoLettura) {
        this.tempoLettura = tempoLettura;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public UUID getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(UUID blog_id) {
        this.blog_id = blog_id;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "blog_id=" + blog_id +
                ", titolo='" + titolo + '\'' +
                ", contenuto='" + contenuto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", tempoLettura=" + tempoLettura +
                ", cover='" + cover + '\'' +
                '}';
    }
}
