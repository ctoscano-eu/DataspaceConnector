package de.fraunhofer.isst.dataspaceconnector.repositories.v2.implementations;

import de.fraunhofer.isst.dataspaceconnector.model.v2.Contract;
import de.fraunhofer.isst.dataspaceconnector.repositories.v2.BaseResourceRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends BaseResourceRepository<Contract> {
}