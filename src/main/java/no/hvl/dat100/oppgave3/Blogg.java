package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

    Innlegg[] innleggtabell;
    int nesteledig = 0;

    public Blogg() {
        this.innleggtabell = new Innlegg[20];
    }

    public Blogg(int lengde) {
        this.innleggtabell = new Innlegg[lengde];
    }

    public int getAntall() {
        return nesteledig;
    }

    public Innlegg[] getSamling() {
        return innleggtabell;
    }

    public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteledig; i++) {
            if (innlegg.erLik(innleggtabell[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean finnes(Innlegg innlegg) {
        if (finnInnlegg(innlegg) == -1) {
            return false;
        }
        return true;
    }

    public boolean ledigPlass() {
        if (nesteledig != innleggtabell.length) {
            return true;
        }
        return false;

    }

    public boolean leggTil(Innlegg innlegg) {
        if (!ledigPlass() || finnes(innlegg)) {
            return false;
        }
        innleggtabell[nesteledig] = innlegg;
        nesteledig++;
        return true;
    }

    public String toString() {
       String resultat = nesteledig + "\n";

       for (int i = 0; i < nesteledig; i++) {
           resultat += innleggtabell[i].toString();
       }
       return resultat;
    }

    // valgfrie oppgaver nedenfor

    public void utvid() {
        throw new UnsupportedOperationException(TODO.method());
    }

    public boolean leggTilUtvid(Innlegg innlegg) {

        throw new UnsupportedOperationException(TODO.method());

    }

    public boolean slett(Innlegg innlegg) {

        throw new UnsupportedOperationException(TODO.method());
    }

    public int[] search(String keyword) {

        throw new UnsupportedOperationException(TODO.method());

    }
}