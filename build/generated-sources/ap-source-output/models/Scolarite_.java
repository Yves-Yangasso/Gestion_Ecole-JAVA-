package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Classe;
import models.Etudiant;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-11T15:49:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Scolarite.class)
public class Scolarite_ { 

    public static volatile SingularAttribute<Scolarite, Integer> mtnR;
    public static volatile SingularAttribute<Scolarite, Integer> mtnP;
    public static volatile SingularAttribute<Scolarite, Integer> id;
    public static volatile SingularAttribute<Scolarite, Etudiant> etudiantId;
    public static volatile SingularAttribute<Scolarite, Classe> classeId;

}