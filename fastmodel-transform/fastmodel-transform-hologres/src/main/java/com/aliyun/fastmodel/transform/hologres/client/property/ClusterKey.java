/*
 * Copyright (c)  2022. Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com.
 */

package com.aliyun.fastmodel.transform.hologres.client.property;

import java.util.List;

import com.aliyun.fastmodel.transform.api.client.dto.property.BaseClientProperty;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

/**
 * cluster keys
 *
 * @author panguanjing
 * @date 2022/6/13
 */
public class ClusterKey extends BaseClientProperty<List<String>> {

    public static final String CLUSTERING_KEY = HoloPropertyKey.CLUSTERING_KEY.getValue();

    public ClusterKey() {
        this.setKey(CLUSTERING_KEY);
    }

    @Override
    public String valueString() {
        return Joiner.on(",").join(this.getValue());
    }

    @Override
    public void setValueString(String value) {
        if (StringUtils.isBlank(value)) {
            this.setValue(Lists.newArrayList());
        }
        this.setValue(Splitter.on(",").splitToList(value));
    }

    @Override
    public List<String> toColumnList() {
        return getValue();
    }
}
