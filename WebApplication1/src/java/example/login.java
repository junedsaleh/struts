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
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author juned
 */
public class login extends ActionSupport {

    String uname;
    String pwd;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String execute() throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/juned", "juned", "juned");
        Statement st = con.createStatement();
        String q = "SELECT * FROM REGISTRATION WHERE UNAME='" + getUname() + "' AND PASSWORD='" + getPwd() + "'";
        ResultSet rs = st.executeQuery(q);

        if (rs.next()) {
            return SUCCESS;
        } else {
            return INPUT;
        }
    }
}
