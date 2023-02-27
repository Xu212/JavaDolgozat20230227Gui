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

    public Ember(String nev, String SzovegKor, char neme) {
        int kor = Integer.parseInt(SzovegKor);
        this(nev,kor,neme,0);
    }
    
}
