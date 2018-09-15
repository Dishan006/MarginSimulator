package com.simulator.RiskSimulator;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "instruments", path = "instruments")
public interface InstrumentRepository extends MongoRepository<Instrument, String> {

    Instrument findByIsin(@Param("isin") String isin);
}
