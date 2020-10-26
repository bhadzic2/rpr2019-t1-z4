package ba.unsa.etf.rpr;

public class Korpa{
    private Artikl[] artikli=new Artikl[50];
    private int br=0;
    public boolean dodajArtikl(Artikl a){
        if(br<50){
            artikli[br]=new Artikl(a.getNaziv(), a.getCijena(),a.getKod());
            br++;
            return true;
        }
        return false;
    }
    public Artikl[] getArtikli(){
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=0;i<br;i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl novi=new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(),artikli[i].getKod());
                artikli[i]=null;
                pomjeriSve(i);
                return novi;
            }
        }
        return null;
    }
    public int dajUkupnuCijenuArtikala(){
        int cijena=0;
        for(int i=0;i<br;i++){
            cijena=cijena+artikli[i].getCijena();
        }
        return cijena;
    }
    private void pomjeriSve(int pozicija){
        for(int i=pozicija;i<br;i++){
            artikli[i]=artikli[i+1];
        }
        artikli[br]=null;
        br--;
    }
}
