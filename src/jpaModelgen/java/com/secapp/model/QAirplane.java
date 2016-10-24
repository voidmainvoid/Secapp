package com.secapp.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAirplane is a Querydsl query type for Airplane
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAirplane extends EntityPathBase<Airplane> {

    private static final long serialVersionUID = 980393320L;

    public static final QAirplane airplane = new QAirplane("airplane");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> performance = createNumber("performance", Integer.class);

    public final StringPath review = createString("review");

    public QAirplane(String variable) {
        super(Airplane.class, forVariable(variable));
    }

    public QAirplane(Path<? extends Airplane> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAirplane(PathMetadata metadata) {
        super(Airplane.class, metadata);
    }

}

