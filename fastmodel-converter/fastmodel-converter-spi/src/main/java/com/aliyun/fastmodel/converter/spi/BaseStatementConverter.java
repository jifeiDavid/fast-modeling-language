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

package com.aliyun.fastmodel.converter.spi;

import com.aliyun.fastmodel.core.tree.BaseStatement;

/**
 * 提供一些公用的方法内容处理
 *
 * @author panguanjing
 * @date 2021/6/2
 */
public abstract class BaseStatementConverter<T extends BaseStatement, R extends BaseStatement, C extends ConvertContext>
    implements StatementConverter<T, R, C> {

}
