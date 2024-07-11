package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Utilisateur;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-11T15:49:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Professeur.class)
public class Professeur_ { 

    public static volatile SingularAttribute<Professeur, String> matricule;
    public static volatile SingularAttribute<Professeur, String> adresse;
    public static volatile SingularAttribute<Professeur, String> telephone;
    public static volatile SingularAttribute<Professeur, Integer> id;
    public static volatile SingularAttribute<Professeur, String> nom;
    public static volatile SingularAttribute<Professeur, String> prenom;
    public static volatile SingularAttribute<Professeur, Utilisateur> userId;
    public static volatile SingularAttribute<Professeur, String> email;

}