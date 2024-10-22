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
}
