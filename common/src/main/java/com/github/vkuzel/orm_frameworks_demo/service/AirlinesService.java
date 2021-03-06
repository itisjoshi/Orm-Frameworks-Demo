package com.github.vkuzel.orm_frameworks_demo.service;

import com.github.vkuzel.orm_frameworks_demo.transport.OperatorDetail;
import com.github.vkuzel.orm_frameworks_demo.transport.PlaneDetail;
import com.github.vkuzel.orm_frameworks_demo.transport.RegistrationDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AirlinesService {

    PlaneDetail newPlaneDetailInstance();

    PlaneDetail createPlane(PlaneDetail plane);

    PlaneDetail updatePlane(PlaneDetail plane);

    PlaneDetail updatePlaneTransactionalThatThrowsException(PlaneDetail plane);

    PlaneDetail findPlaneByName(String name);

    OperatorDetail findOperatorByName(String languageCode, String name);

    Page<OperatorDetail> findAllOperators(String languageCode, Pageable pageable);

    RegistrationDetail registerNewPlane(PlaneDetail plane, OperatorDetail operator, String registrationNumber);

    RegistrationDetail findRegistrationByRegistrationNumber(String registrationNumber);
}
