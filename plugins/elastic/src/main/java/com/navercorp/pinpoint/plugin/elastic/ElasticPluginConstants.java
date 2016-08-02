package com.navercorp.pinpoint.plugin.elastic;

import com.navercorp.pinpoint.common.trace.*;

public class ElasticPluginConstants {

    public static final ServiceType ELASTIC_SERVICE_TYPE = ServiceTypeFactory.of(2900, "ELASTIC_EXECUTE_QUERY",
            ServiceTypeProperty.RECORD_STATISTICS, ServiceTypeProperty.TERMINAL,
            ServiceTypeProperty.INCLUDE_DESTINATION_ID);

    public static final AnnotationKey ELASTIC_ANNOTATION_KEY = AnnotationKeyFactory.of(970, "Elastic", AnnotationKeyProperty.VIEW_IN_RECORD_SET);
}
