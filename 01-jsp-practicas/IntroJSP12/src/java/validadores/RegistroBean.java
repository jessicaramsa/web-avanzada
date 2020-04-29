package validadores;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author jessicaramsa
 */
@ManagedBean(name="registroBean", eager=true)
@SessionScoped
public class RegistroBean {
    String emailInput;
    
    public void validarEmail(FacesContext context, UIComponent component,
            Object value) throws ValidatorException {
        String email = (String) value;
        String pattern = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        String message = "Patrón a seguir: " + pattern;
        if (!email.matches(pattern)) {
            throw new ValidatorException(new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, message, message)
            );
        }
    }
    
    public void enviar() {
        System.out.println(emailInput);
    }

    public String getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(String emailInput) {
        this.emailInput = emailInput;
    }
}
