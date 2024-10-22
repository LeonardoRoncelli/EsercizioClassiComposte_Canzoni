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
}
