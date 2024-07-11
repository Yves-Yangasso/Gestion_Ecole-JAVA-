package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Cours;
import models.Scolarite;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-11T15:49:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Classe.class)
public class Classe_ { 

    public static volatile SingularAttribute<Classe, Integer> code;
    public static volatile ListAttribute<Classe, Scolarite> scolariteList;
    public static volatile SingularAttribute<Classe, Integer> id;
    public static volatile ListAttribute<Classe, Cours> coursList;
    public static volatile SingularAttribute<Classe, String> nom;

}