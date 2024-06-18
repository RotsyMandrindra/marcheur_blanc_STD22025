package hei.school.marcheurblanc.localisation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Rue {
    private Lieu lieu1;
    private Lieu lieu2;
    private String nom;

    public Rue(Lieu lieu1, Lieu lieu2, String nom) {
        this.lieu1 = lieu1;
        this.lieu2 = lieu2;
        this.nom = nom;
    }

    public Lieu savoirLeLieuAuBoutDeLaRue(Lieu lieu){
        if (lieu.equals(lieu1)){
            return lieu2;
        }else if (lieu.equals(lieu2)){
            return lieu1;
        }
        return null;
    }
}
