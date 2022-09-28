
package com.duoc.appcanciones.MTO;

public class cancion {
    /*La canción tiene un título, un artista,
tiempo de duración, si es favorita o no y si se encuentra descargada o no
en el dispositivo*/
    private String Titulo;
    private String Artista;
    private boolean Favorito;
    private boolean Descargada;
    private String Duracion;

    public cancion(String Titulo, String Artista, boolean Favorito, boolean Descargada, String Duracion) {
        this.Titulo = Titulo;
        this.Artista = Artista;
        this.Favorito = Favorito;
        this.Descargada = Descargada;
        this.Duracion = Duracion;
    }

    public cancion() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public boolean isFavorito() {
        return Favorito;
    }

    public void setFavorito(boolean Favorito) {
        this.Favorito = Favorito;
    }

    public boolean isDescargada() {
        return Descargada;
    }

    public void setDescargada(boolean Descargada) {
        this.Descargada = Descargada;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }
    
    @Override
    public String toString(){
    
    
    return "Cancion: " + this.Titulo + "\n#################\n" + "Artista: "+ this.Artista + "\n#################\n" + "Duración: " + this.Duracion;
    }
    
     public int[] duracionCancion (String Duracion){
         
        
         String[] Formateado = Duracion.split(":");
         
         int min = Integer.parseInt(Formateado[0]);
         int seg = Integer.parseInt(Formateado[1]);
         
         int[] MinutosSegundos = {min,seg};
         return MinutosSegundos;
     }
    
    
    public String tipoDeCancion(String Duracion){
    String TipoCancion = "Sin identificar";
    int[] MinSeg=duracionCancion(Duracion);
    
    if (MinSeg[0] >= 5 && MinSeg[1] > 0){
        TipoCancion = "Cancion larga";
    }else{
        TipoCancion = "Cancion corta";
    }
    
    return TipoCancion;
    }
    
}
