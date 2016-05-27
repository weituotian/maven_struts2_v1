package hello;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class helloaction extends ActionSupport {

    HttpServletRequest request= ServletActionContext.getRequest();

    @Override
    public String execute() throws Exception {
        request.setAttribute("msg","hello struts2");
        return SUCCESS;
    }


}
