package com.secapp.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAirplane is a Querydsl query type for Airplane
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAirplane extends EntityPathBase<Airplane> {

    private static final long serialVersionUID = 980393320L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAirplane airplane = new QAirplane("airplane");

    public final StringPath dummy = createString("dummy");

    public final DateTimePath<java.util.Date> firstFlight = createDateTime("firstFlight", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QManufacturer manufacturer;

    public final StringPath name = createString("name");

    public final StringPath review = createString("review");

    public QAirplane(String variable) {
        this(Airplane.class, forVariable(variable), INITS);
    }

    public QAirplane(Path<? extends Airplane> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAirplane(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAirplane(PathMetadata metadata, PathInits inits) {
        this(Airplane.class, metadata, inits);
    }

    public QAirplane(Class<? extends Airplane> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.manufacturer = inits.isInitialized("manufacturer") ? new QManufacturer(forProperty("manufacturer")) : null;
    }

}

