/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringbuilder;
  
import sailpoint.object.*;
import java.util.*;
import sailpoint.api.Provisioner;
import sailpoint.tools.Util;
/**
 *
 * @author Tom Hubbard
 */
public class StringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Identity workgroup = context.getObjectByName(Identity.class, "TestWG");
//String wgName = workgroup.Name;
//String confirmation = "This is the workgroups name from variable";
//return confirmation + " " + wgName;
// Trying to create a stringBuilder() constructor here
StringBuilder message = new StringBuilder("Hello");
message.append("Sailpoint");
return message;

//List users=Arrays.asList("U136149","U010291","U122040","U122042");
List users=Arrays.asList("U134713", "U126318", "U132648");
//message.append(workgroup.Name);

if(!users.isEmpty()){
   
for(String empID : users){

 Identity user = context.getObjectByName(Identity.class,empID);
 

 user.add(workgroup);
//message.append( "Adding " + user.Name + " to workgroup" + " " + workgroup.Name);


}
  
}
    }
    
}
