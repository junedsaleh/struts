/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author juned
 */
public class delete extends ActionSupport{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
     public String execute() throws Exception{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/juned","juned","juned");
        Statement st = con.createStatement();
        String q = "delete from registration where sid="+getId();
        int i = st.executeUpdate(q);
        if(i>0) {
            return SUCCESS;
        }else{
            return INPUT;
        }    
    }
}
