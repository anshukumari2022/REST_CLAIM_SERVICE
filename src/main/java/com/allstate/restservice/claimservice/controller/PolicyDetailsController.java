package com.allstate.restservice.claimservice.controller;

import com.allstate.claim.GetPolicyDetailsRequest;
import com.allstate.claim.GetPolicyDetailsResponse;
import com.allstate.claim.PolicyDetails;
import com.allstate.restservice.claimservice.client.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyDetailsController {

    @Autowired
    private SoapClient soapClient;

    @GetMapping(value = "/policy/{claimNumber}")
    public PolicyDetails getPolicyDetails(@PathVariable int claimNumber){
        GetPolicyDetailsRequest getPolicyDetailsRequest = new GetPolicyDetailsRequest();
        getPolicyDetailsRequest.setClaimNumber(claimNumber);
        GetPolicyDetailsResponse getPolicyDetailsResponse = soapClient.sendSoapRequest(getPolicyDetailsRequest);
        return getPolicyDetailsResponse.getPolicyDetails();
    }

}
