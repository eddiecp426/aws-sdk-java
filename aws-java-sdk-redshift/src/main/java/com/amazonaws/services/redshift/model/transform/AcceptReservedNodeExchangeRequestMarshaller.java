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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * AcceptReservedNodeExchangeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptReservedNodeExchangeRequestMarshaller implements Marshaller<Request<AcceptReservedNodeExchangeRequest>, AcceptReservedNodeExchangeRequest> {

    public Request<AcceptReservedNodeExchangeRequest> marshall(AcceptReservedNodeExchangeRequest acceptReservedNodeExchangeRequest) {

        if (acceptReservedNodeExchangeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AcceptReservedNodeExchangeRequest> request = new DefaultRequest<AcceptReservedNodeExchangeRequest>(acceptReservedNodeExchangeRequest,
                "AmazonRedshift");
        request.addParameter("Action", "AcceptReservedNodeExchange");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (acceptReservedNodeExchangeRequest.getReservedNodeId() != null) {
            request.addParameter("ReservedNodeId", StringUtils.fromString(acceptReservedNodeExchangeRequest.getReservedNodeId()));
        }

        if (acceptReservedNodeExchangeRequest.getTargetReservedNodeOfferingId() != null) {
            request.addParameter("TargetReservedNodeOfferingId", StringUtils.fromString(acceptReservedNodeExchangeRequest.getTargetReservedNodeOfferingId()));
        }

        return request;
    }

}
