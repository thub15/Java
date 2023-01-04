/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addtoworkgroup;

/**
 *
 * @author Tom Hubbard
 */
public class AddToWorkgroup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        import sailpoint.object.*;
   import java.util.List;
  import java.util.ArrayList;
    
  import sailpoint.object.Identity;
  import sailpoint.object.QueryOptions;
  import sailpoint.object.Filter;
  import java.util.Iterator;
  import java.util.List;
  import java.util.ArrayList;
  import sailpoint.api.Provisioner;
  import sailpoint.object.Bundle;
  import sailpoint.object.Link;
  import sailpoint.object.AccountSelection;
  import sailpoint.object.AccountInfo;
  import sailpoint.object.RoleTarget;
  import sailpoint.object.ProvisioningPlan;
  import sailpoint.tools.Util;
  import sailpoint.object.WorkItem.OwnerHistory;

  // This is calling the Identity object
Identity workgroup = context.getObjectByName(Identity.class, "TestWG");

  List users=Arrays.asList("U136149","U010291","U122040","U122042");

  // If the users array to add to WG is not empty
  if(!users.isEmpty()){

      // Loop through each user in the array
    for(String empID : users){

      // use the sailpoint context getObjectByName method to get each users employeeID
      Identity user = context.getObjectByName(Identity.class,empID);

      // Add the user by emplID to the workgroup specified in line 39.
      user.add(workgroup);


    }
   
    }
  // This is creating a new entitlement?
 ManagedAttribute obj=new ManagedAttribute();

    Filter myFilter = Filter.and(Filter.eq("ManagedAttribute.value", "CN=BGC_App_TMS,OU=Groups,OU=Accounts,DC=nadev,DC=nisource,DC=net"),Filter.eq("ManagedAttribute.application.name","Active Directory"));
    QueryOptions queryOption = new QueryOptions();
    queryOption.addFilter(myFilter);

    Iterator itr = null;
    itr = context.search(ManagedAttribute.class, queryOption);    
 
   
    while (itr.hasNext()) {

       obj=itr.next();
//return obj;
       obj.setOwner(workgroup);
//return obj.getOwner();
       context.saveObject(workgroup);
       context.commitTransaction();
       context.decache(workgroup);
    }   

  return "success";
    }
    
}
