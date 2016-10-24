package com.secapp.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Airplane.class)
public abstract class Airplane_ {

	public static volatile SingularAttribute<Airplane, Long> id;
	public static volatile SingularAttribute<Airplane, String> manufacturer;
	public static volatile SingularAttribute<Airplane, String> name;
	public static volatile SingularAttribute<Airplane, String> review;
	public static volatile SingularAttribute<Airplane, Date> firstFlight;

}

