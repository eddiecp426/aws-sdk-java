/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateHyperParameterTuningJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateHyperParameterTuningJobRequestMarshaller {

    private static final MarshallingInfo<String> HYPERPARAMETERTUNINGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HyperParameterTuningJobName").build();
    private static final MarshallingInfo<StructuredPojo> HYPERPARAMETERTUNINGJOBCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HyperParameterTuningJobConfig").build();
    private static final MarshallingInfo<StructuredPojo> TRAININGJOBDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobDefinition").build();
    private static final MarshallingInfo<List> TRAININGJOBDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobDefinitions").build();
    private static final MarshallingInfo<StructuredPojo> WARMSTARTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WarmStartConfig").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateHyperParameterTuningJobRequestMarshaller instance = new CreateHyperParameterTuningJobRequestMarshaller();

    public static CreateHyperParameterTuningJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateHyperParameterTuningJobRequest createHyperParameterTuningJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createHyperParameterTuningJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createHyperParameterTuningJobRequest.getHyperParameterTuningJobName(), HYPERPARAMETERTUNINGJOBNAME_BINDING);
            protocolMarshaller.marshall(createHyperParameterTuningJobRequest.getHyperParameterTuningJobConfig(), HYPERPARAMETERTUNINGJOBCONFIG_BINDING);
            protocolMarshaller.marshall(createHyperParameterTuningJobRequest.getTrainingJobDefinition(), TRAININGJOBDEFINITION_BINDING);
            protocolMarshaller.marshall(createHyperParameterTuningJobRequest.getTrainingJobDefinitions(), TRAININGJOBDEFINITIONS_BINDING);
            protocolMarshaller.marshall(createHyperParameterTuningJobRequest.getWarmStartConfig(), WARMSTARTCONFIG_BINDING);
            protocolMarshaller.marshall(createHyperParameterTuningJobRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
