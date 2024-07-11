package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Etudiant;
import models.Professeur;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-11T15:49:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ { 

    public static volatile SingularAttribute<Utilisateur, String> role;
    public static volatile ListAttribute<Utilisateur, Professeur> professeurList;
    public static volatile SingularAttribute<Utilisateur, String> mdp;
    public static volatile SingularAttribute<Utilisateur, String> telephone;
    public static volatile SingularAttribute<Utilisateur, Integer> id;
    public static volatile ListAttribute<Utilisateur, Etudiant> etudiantList;
    public static volatile SingularAttribute<Utilisateur, String> nom;
    public static volatile SingularAttribute<Utilisateur, String> prenom;
    public static volatile SingularAttribute<Utilisateur, String> email;
    public static volatile SingularAttribute<Utilisateur, String> username;

}