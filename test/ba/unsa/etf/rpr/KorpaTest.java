package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class KorpaTest {

    @Test
    void dodajArtiklTest() {
        Korpa k=new Korpa();
        Artikl namjestaj=new Artikl("stolica", 50, "12");
        boolean t=k.dodajArtikl(namjestaj);
        assertTrue(t);
    }

    @Test
    void getArtikliTest() {
        /*Korpa korpa=new Korpa;
        assertTrue(korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        */
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(new Artikl("sijalica", 1, "345"));
        korpa.dodajArtikl(new Artikl("olovka", 2, "377"));
      //  Artikl[] niz={Artikl("sijalica", 1, "345"),Artikl("olovka", 2, "377")};
      //  assertArrayEquals(niz, korpa.getArtikli());
    }

  /*  @Test
    void izbaciArtiklSaKodomTest() {
        Korpa korpa=new Korpa();
        Artikl poredi=new Artikl("Biciklo", 1000, "1");
        korpa.dodajArtikl(poredi);
        Artikl izb=korpa.izbaciArtiklSaKodom("2");
        korpa.izbaciArtiklSaKodom("2");
        assertEquals(poredi.getKod(), izb.getKod());
    }
*/
    @Test
    void dajUkupnuCijenuArtikalaTest() {
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(new Artikl("Knjiga", 15, "1"));
        korpa.dodajArtikl(new Artikl("Teka", 3, "2"));
        assertEquals(18,korpa.dajUkupnuCijenuArtikala());

    }
}