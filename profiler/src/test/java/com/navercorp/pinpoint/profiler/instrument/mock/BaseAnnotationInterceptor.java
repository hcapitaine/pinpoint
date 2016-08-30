/*
 * Copyright 2016 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.navercorp.pinpoint.profiler.instrument.mock;

import com.navercorp.pinpoint.bootstrap.interceptor.AroundInterceptor;
import com.navercorp.pinpoint.bootstrap.interceptor.annotation.TargetMethod;

import java.util.Arrays;

/**
 * @author jaehong.kim
 */
@TargetMethod(name="base")
public class BaseAnnotationInterceptor implements AroundInterceptor {
    public boolean before;
    public boolean after;
    public boolean throwable;

    @Override
    public void before(Object target, Object[] args) {
        this.before = true;
        System.out.println(getClass().getName() + " BEFORE " + target + " " + Arrays.asList(args));
    }

    @Override
    public void after(Object target, Object[] args, Object result, Throwable throwable) {
        this.after = true;
        if(throwable != null) {
            this.throwable = true;
        }
        System.out.println(getClass().getName() + " AFTER " + target + " " + Arrays.asList(args) + " " + result + " " + throwable);
    }
}
