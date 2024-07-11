package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Cours;
import models.Heure;
import models.Note;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-11T15:49:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Matiere.class)
public class Matiere_ { 

    public static volatile SingularAttribute<Matiere, String> libelle;
    public static volatile ListAttribute<Matiere, Note> noteList;
    public static volatile SingularAttribute<Matiere, Integer> id;
    public static volatile ListAttribute<Matiere, Cours> coursList;
    public static volatile SingularAttribute<Matiere, Heure> idheure;

}