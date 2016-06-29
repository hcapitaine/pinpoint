package com.navercorp.pinpoint.plugin.elastic;

import com.navercorp.pinpoint.common.trace.ServiceTypeFactory;
import com.navercorp.pinpoint.common.trace.TraceMetadataProvider;
import com.navercorp.pinpoint.common.trace.TraceMetadataSetupContext;

/**
 * Created by hcapitaine
 */
public class ElasticTypeProvider implements TraceMetadataProvider {

    @Override
    public void setup(TraceMetadataSetupContext context) {
        context.addServiceType(ServiceTypeFactory.of(2900, "ELASTIC_EXECUTE_QUERY", ));
    }
}
