package jsf;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.primefaces.context.RequestContext;
import query.DataQuery;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;


@ManagedBean
@RequestScoped
@SessionScoped


public class LoginController implements Serializable{
    private String username;
    private String password;
    private DataQuery dataQuery = new DataQuery();




    public String loginControl(){
        if (dataQuery.loginConterol(username, password)){
            return "studentconnect?faces-redirect=true";
        }
        RequestContext.getCurrentInstance().update("growl");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error","Email or Password Invalid"));
        return "";

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
