package main;
public class Ember {
    private String nev;
    private int kor;
    private char neme;
    private int MunkToltEv;

    public Ember(String nev, int kor, char neme, int MunkToltEv) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
        this.MunkToltEv = MunkToltEv;
    }

    public Ember(String nev, int kor, char neme) {
        this(nev,kor,neme,0);
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public char getNeme() {
        return neme;
    }

    public int getMunkToltEv() {
        return MunkToltEv;
    }
    
}
