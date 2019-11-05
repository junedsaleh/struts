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
public class registration extends ActionSupport{
    user u = new user();

    public user getU() {
        return u;
    }

    public void setU(user u) {
        this.u = u;
    }
    
    String uname;
    String pwd;
    String email;
    String gender;
    String desig;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }
    
    
    
    public String execute() throws Exception{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/juned","juned","juned");
        Statement st = con.createStatement();
        String q = "INSERT INTO REGISTRATION (UNAME, PASSWORD,EMAIL,GENDER,DESIGNATION) VALUES ('"+getUname()+"', '"+getPwd()+"', '"+getEmail()+"','"+getGender()+"','"+getDesig()+"')";
        int i = st.executeUpdate(q);
        if(i>0) {
            return SUCCESS;
        }else{
            return INPUT;
        }    
    }

}
