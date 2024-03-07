package fr.pantheonsorbonne.cri;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

public class Museum {

    private Set<Exposition> expositionsList;

    private Set<Exposition> currentExpositionsList;

    public void addExposition(Exposition exposition){
        this.expositionsList.add(exposition);
        this.refreshCurrentExpositions();
    }

    public void refreshCurrentExpositions(){
        Date today = new GregorianCalendar().getTime();
        for (Exposition e : this.expositionsList ){
            if (e.getBeginningDate().before(today) && e.getEndingDate().after(today) ){
                currentExpositionsList.add(e);
            }
        }
        this.currentExpositionsList.removeIf(e -> e.getEndingDate().before(today) || e.getBeginningDate().after(today));
    }

    public Set<Exposition> getExpositionsSet(){
        return this.expositionsList;
    }

    public Set<Exposition> getCurrentExpositionsSet(){
        return this.currentExpositionsList;
    }
}
