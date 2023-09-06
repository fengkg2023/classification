package com.psbc.dams.classification.web.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollectStatus {

    int getstatus(String auto);

    int updateStatus(String auto);
}
