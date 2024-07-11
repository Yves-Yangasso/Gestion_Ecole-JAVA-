package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Etudiant;
import models.Matiere;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-11T15:49:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Note.class)
public class Note_ { 

    public static volatile SingularAttribute<Note, Float> note;
    public static volatile SingularAttribute<Note, Matiere> matiereId;
    public static volatile SingularAttribute<Note, Integer> id;
    public static volatile SingularAttribute<Note, Etudiant> etudiantId;

}