package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Classe;
import models.Matiere;
import models.Professeur;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-11T15:49:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cours.class)
public class Cours_ { 

    public static volatile SingularAttribute<Cours, Professeur> professeurId;
    public static volatile SingularAttribute<Cours, Matiere> matiereId;
    public static volatile SingularAttribute<Cours, Integer> id;
    public static volatile SingularAttribute<Cours, Classe> classeId;

}