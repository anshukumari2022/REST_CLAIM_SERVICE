package com.allstate.restservice.claimservice.client;


import com.allstate.claim.GetPolicyDetailsRequest;
import com.allstate.claim.GetPolicyDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class SoapClient {

    private final WebServiceTemplate webServiceTemplate;

    @Autowired
    public SoapClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public GetPolicyDetailsResponse sendSoapRequest(GetPolicyDetailsRequest soapRequest) {
        // Use the Spring WebServiceTemplate to send the SOAP request and receive the response
        return (GetPolicyDetailsResponse) webServiceTemplate.marshalSendAndReceive(soapRequest);
    }
}
