public class Playlist {
    private Canzone[]miaPlaylist;

    public Canzone[] getMiaPlaylist() {
        return miaPlaylist;
    }

    public void setMiaPlaylist(Canzone[] miaPlaylist) {
        this.miaPlaylist = miaPlaylist;
    }
    public Playlist(){
        miaPlaylist=new Canzone[100];
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
}
