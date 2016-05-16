package com.dchdemo.osp.acmeinc;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dchdemo.osp.acmeinc.dbutil.Policy;
import com.dchdemo.osp.acmeinc.dbutil.PolicyUtil;

@Path("api/policy")
public class PolicyEndpoint extends BaseEndpoint {

	   
    @GET
    @Path("{polNum}")
    @Produces(MediaType.APPLICATION_JSON)
    public Policy getPolicyDetails(	@PathParam("polNum") String polNum	){
    	return PolicyUtil.getPolicyDetail(polNum);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void editPolicyDetails( Policy editedPolicy	){
    	PolicyUtil.savePolicyDetail(editedPolicy);
    }
}
