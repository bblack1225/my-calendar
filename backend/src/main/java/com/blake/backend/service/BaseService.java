package com.blake.backend.service;

import com.blake.backend.model.vo.BaseRequest;
import com.blake.backend.model.vo.BaseResponse;

public interface BaseService<T extends BaseRequest, S extends BaseResponse> {

    S execute(T request);
}
