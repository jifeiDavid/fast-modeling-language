/*
 * Copyright 2021-2022 Alibaba Group Holding Ltd.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.aliyun.fastmodel.transform.excel.spi.source;

import java.io.InputStream;

import com.aliyun.fastmodel.transform.excel.spi.InputStreamSource;

/**
 * ClassPathResource
 *
 * @author panguanjing
 * @date 2021/5/16
 */
public class ClassPathResource implements InputStreamSource {

    private final String path;

    public ClassPathResource(String path) {
        this.path = path;
    }

    @Override
    public InputStream getInputStream() throws Exception {
        return ClassPathResource.class.getResourceAsStream(path);
    }

}