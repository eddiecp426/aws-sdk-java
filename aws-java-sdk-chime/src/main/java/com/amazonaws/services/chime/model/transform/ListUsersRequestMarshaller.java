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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListUsersRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListUsersRequestMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> USEREMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("user-email").build();
    private static final MarshallingInfo<String> USERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("user-type").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("max-results").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("next-token").build();

    private static final ListUsersRequestMarshaller instance = new ListUsersRequestMarshaller();

    public static ListUsersRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListUsersRequest listUsersRequest, ProtocolMarshaller protocolMarshaller) {

        if (listUsersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listUsersRequest.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(listUsersRequest.getUserEmail(), USEREMAIL_BINDING);
            protocolMarshaller.marshall(listUsersRequest.getUserType(), USERTYPE_BINDING);
            protocolMarshaller.marshall(listUsersRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listUsersRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
