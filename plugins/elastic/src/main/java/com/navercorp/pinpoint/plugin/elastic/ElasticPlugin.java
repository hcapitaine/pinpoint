package com.navercorp.pinpoint.plugin.elastic;

import com.navercorp.pinpoint.bootstrap.instrument.transformer.TransformTemplate;
import com.navercorp.pinpoint.bootstrap.instrument.transformer.TransformTemplateAware;
import com.navercorp.pinpoint.bootstrap.plugin.ProfilerPlugin;
import com.navercorp.pinpoint.bootstrap.plugin.ProfilerPluginSetupContext;
import com.navercorp.pinpoint.plugin.elastic.interceptor.TransportClientInterceptor;

/**
 * Created by hcapitaine on 02/08/16.
 */
public class ElasticPlugin implements ProfilerPlugin, TransformTemplateAware {

    private TransformTemplate transformTemplate;

    @Override
    public void setTransformTemplate(TransformTemplate transformTemplate) {
        this.transformTemplate = transformTemplate;
    }

    @Override
    public void setup(ProfilerPluginSetupContext context) {
        addTransformers();
    }

    private void addTransformers() {
        transformTemplate.transform("org.elasticsearch.client.transport.TransportClient", new TransportClientInterceptor());
    }

}
