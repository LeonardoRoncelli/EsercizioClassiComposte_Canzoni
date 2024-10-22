public class Canzone {
    private String nomeCanzone;
    private String nomeCantante;
    private double durata;
    public void setNomeCanzone(String nomeCanzone){
        this.nomeCanzone=nomeCanzone;
    }
    public String getNomeCanzone(){
        return nomeCanzone;
    }
    public void setNomeCantante(String nomeCantante){
        this.nomeCantante=nomeCantante;
    }
    public String getNomeCantante(){
        return nomeCantante;
    }
    public void setDurata(double durata){
        this.durata=durata;
    }
    public double getDurata(){
        return durata;
    }
    public Canzone(){
        nomeCanzone="Sconosciuto";
        nomeCantante="Sconosciuto";
        durata=0;
    }
    public Canzone(String nomeCanzone,String nomeCantante,double durata){
        this.nomeCanzone=nomeCanzone;
        this.nomeCantante=nomeCantante;
        this.durata=durata;
    }
}
