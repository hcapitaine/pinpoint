package com.navercorp.pinpoint.plugin.elastic;

import com.navercorp.pinpoint.common.trace.AnnotationKeyMatchers;
import com.navercorp.pinpoint.common.trace.TraceMetadataProvider;
import com.navercorp.pinpoint.common.trace.TraceMetadataSetupContext;

/**
 * @author Harold Capitaine
 */
public class ElasticTypeProvider implements TraceMetadataProvider {

    /* (non-Javadoc)
     * @see com.navercorp.pinpoint.common.trace.TraceMetadataProvider#setup(com.navercorp.pinpoint.common.trace.TraceMetadataSetupContext)
     */
    @Override
    public void setup(TraceMetadataSetupContext context) {
        context.addServiceType(ElasticPluginConstants.ELASTIC_SERVICE_TYPE, AnnotationKeyMatchers.exact(ElasticPluginConstants.ELASTIC_ANNOTATION_KEY));
        context.addAnnotationKey(ElasticPluginConstants.ELASTIC_ANNOTATION_KEY);
    }
}
