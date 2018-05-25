<<<<<<< HEAD
package jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@ManagedBean
@RequestScoped
public class LoginBean {
    private String email;
    private String password;
    private boolean rememberMe;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String login(){
        return "studentspace";
    }

    public String register(){
        return "registerStudents";
    }
}
=======
package jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@ManagedBean
@RequestScoped
public class LoginBean {
    private String email;
    private String password;
    private boolean rememberMe;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String login(){
        return "studentspace";
    }

    public String register(){
        return "register";
    }
}
>>>>>>> 76a7c005a05286c394d6c6648f0aedff7fd1c139
