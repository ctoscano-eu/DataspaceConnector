package de.fraunhofer.isst.dataspaceconnector.controller.v2;

import de.fraunhofer.isst.dataspaceconnector.model.Representation;
import de.fraunhofer.isst.dataspaceconnector.model.RepresentationDesc;
import de.fraunhofer.isst.dataspaceconnector.model.view.RepresentationView;
import de.fraunhofer.isst.dataspaceconnector.services.resources.v2.backend.RepresentationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/representations")
@Tag(name = "Representations")
public class RepresentationController
        extends BaseResourceController<Representation, RepresentationDesc, RepresentationView, RepresentationService> {
}
