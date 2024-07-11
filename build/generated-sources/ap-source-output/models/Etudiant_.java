package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Utilisateur;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-11T15:49:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Etudiant.class)
public class Etudiant_ { 

    public static volatile SingularAttribute<Etudiant, String> matricule;
    public static volatile SingularAttribute<Etudiant, Integer> inscription;
    public static volatile SingularAttribute<Etudiant, String> telephone;
    public static volatile SingularAttribute<Etudiant, Integer> id;
    public static volatile SingularAttribute<Etudiant, String> nom;
    public static volatile SingularAttribute<Etudiant, String> prenom;
    public static volatile SingularAttribute<Etudiant, Utilisateur> userId;
    public static volatile SingularAttribute<Etudiant, String> email;

}