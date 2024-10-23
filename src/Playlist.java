public class Playlist {
    private Canzone[] miaPlaylist;
    private int lunghezza;

    public Canzone[] getMiaPlaylist() {
        return miaPlaylist;
    }
    public void setMiaPlaylist(Canzone[] miaPlaylist) {
        this.miaPlaylist = miaPlaylist;
    }
    public Playlist() {
        lunghezza = 100;
        miaPlaylist = new Canzone[lunghezza];
    }
    public int numeroCanzoni() {
        int conta = 0;
        for (int i = 0; i < miaPlaylist.length; i++) {
            if (miaPlaylist[i] != null) {
                conta++;
            }
        }
        return conta;
    }
    public void aggiungiCanzone(Canzone nuovaCanzone) {
        boolean pieno = true;
        for (int i = 0; i < miaPlaylist.length; i++) {
            if (miaPlaylist[i] == null) {
                miaPlaylist[i] = nuovaCanzone;
                pieno = false;
                break;
            }
        }
        if (pieno) {
            System.out.println("La playlist è piena");
        }
    }
    public void aggiungiCanzone(String nomeCanzone, String nomeCantante, double durata) {
        Canzone nuovaCanzone = new Canzone(nomeCanzone, nomeCantante, durata);
        aggiungiCanzone(nuovaCanzone);
    }
    public void cancellaCanzone(Canzone canzoneCanc) {
        for (int i = 0; i < miaPlaylist.length; i++) {
            if (miaPlaylist[i] != null && miaPlaylist[i].equals(canzoneCanc)) {
                miaPlaylist[i] = null;
                return;
            }
        }
    }
    public String ricercaCantante(String nomeCanzone) {
        for (int i = 0; i < miaPlaylist.length; i++) {
            if (miaPlaylist[i] != null && miaPlaylist[i].getNomeCanzone().equals(nomeCanzone)) {
                return miaPlaylist[i].getNomeCantante();
            }
        }
        return "";
    }
    public Canzone[] ricercaCanzoni(String nomeCantante) {
        Canzone[] canzoniTrovate = new Canzone[miaPlaylist.length];
        int conta = 0;
        for (int i = 0; i < miaPlaylist.length; i++) {
            if (miaPlaylist[i] != null && miaPlaylist[i].getNomeCantante().equals(nomeCantante)) {
                canzoniTrovate[conta] = miaPlaylist[i];
                conta++;
            }
        }
        Canzone[] finale = new Canzone[conta];
        for (int i = 0; i < conta; i++) {
            finale[i] = canzoniTrovate[i];
        }
        return finale;
    }
    public String toString() {
        String risultato = "[";
        for (int i = 0; i < miaPlaylist.length; i++) {
            if (miaPlaylist[i] != null) {
                risultato += miaPlaylist[i].toString();
                if (i < miaPlaylist.length - 1) {
                    risultato += ", ";
                }
            }
        }
        risultato += "]";
        return risultato;
    }
}
