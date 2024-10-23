public class Playlist {
    private Canzone[]miaPlaylist;
    private int lunghezza;

    public Canzone[] getMiaPlaylist() {
        return miaPlaylist;
    }

    public void setMiaPlaylist(Canzone[] miaPlaylist) {
        this.miaPlaylist = miaPlaylist;
    }
    public Playlist(){
        lunghezza=100;
        miaPlaylist=new Canzone[lunghezza];
    }
    public int numeroCanzoni(){
        int conta=0;
        for(int i=0;i<miaPlaylist.length;i++){
            if(miaPlaylist[i]!=null){
                conta++;
            }
        }
        return conta;
    }
    public void aggiungiCanzone(Canzone nuovaCanzone){
        int contaOccupato=0;
        boolean pieno=false;
        for(int i=0;i<miaPlaylist.length;i++){
            if(miaPlaylist[i]!=null){
                contaOccupato++;
                if (contaOccupato==miaPlaylist.length){
                    System.out.println("La playlist è piena");
                    pieno=true;
                    break;
                }
            }
        }
        if (!pieno){
            for(int i=0;i<miaPlaylist.length;i++){
                if(miaPlaylist[i]==null){
                    miaPlaylist[i]=nuovaCanzone;
                    break;
                }
            }
        }
    }
    public void aggiungiCanzone(String nomeCanzone,String nomeCantante, double durata){
        int contaOccupato=0;
        boolean pieno=false;
        Canzone nuovaCanzone=new Canzone(nomeCanzone,nomeCantante,durata);
        for(int i=0;i<miaPlaylist.length;i++){
            if(miaPlaylist[i]!=null){
                contaOccupato++;
                if (contaOccupato==miaPlaylist.length){
                    System.out.println("La playlist è piena");
                    pieno=true;
                    break;
                }
            }
        }
        if (!pieno){
            for(int i=0;i<miaPlaylist.length;i++){
                if(miaPlaylist[i]==null){
                    miaPlaylist[i]=nuovaCanzone;
                    break;
                }
            }
        }
    }
    public void cancellaCanzone(Canzone canzoneCanc){
        Canzone temp=new Canzone();
        for(int i=0;i<miaPlaylist.length;i++){
            if(miaPlaylist[i].equals(canzoneCanc)){
                temp=miaPlaylist[miaPlaylist.length-1];
                miaPlaylist[miaPlaylist.length-1]=miaPlaylist[i];
                miaPlaylist[i]=temp;
                lunghezza--;
            }
        }
    }
    public String ricercaCantante(String nomeCanzone){
        String cantante="";
        for(int i=0;i<miaPlaylist.length;i++){
            if(miaPlaylist[i].equals(nomeCanzone)){
                cantante=miaPlaylist[i].getNomeCantante();
            }
        }
        return cantante;
    }
    public Canzone[] ricercaCanzoni(String nomeCantante){
        Canzone[]canzoniTrovate=new Canzone[miaPlaylist.length];
        int conta=0;
        for(int i=0;i<miaPlaylist.length;i++){
            if(miaPlaylist[i]!=null&&miaPlaylist[i].getNomeCantante().equals(nomeCantante)){
                canzoniTrovate[conta]=miaPlaylist[i];
                conta++;
            }
        }
        Canzone[]finale=new Canzone[conta];
        for(int i=0;i<conta;i++){
            finale[i]=canzoniTrovate[i];
        }
        return finale;
    }
    public String toString(){
        String risultato = "[";
        for (int i = 0; i < miaPlaylist.length; i++) {
            if (miaPlaylist[i] != null) {
                risultato += miaPlaylist[i];
                if (i < miaPlaylist.length - 1) {
                    risultato += ", ";
                }
            }
        }
        risultato += "]";
        return risultato;
    }
}
