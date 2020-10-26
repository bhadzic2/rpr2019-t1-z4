package ba.unsa.etf.rpr;


public class Supermarket{
    private Artikl[] artikli=new Artikl[1000];
    private int br=0;
    public void dodajArtikl(Artikl a){
        if(br<1000){
            artikli[br]=new Artikl(a.getNaziv(), a.getCijena(),a.getKod());
            br++;
        }
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

    private void pomjeriSve(int pozicija){
        for(int i=pozicija;i<br;i++){
            artikli[i]=artikli[i+1];
        }
        artikli[br]=null;
        br--;
    }
}