package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
/**
 * 
 * @author dwojdyla
 * @12.06.2016
 * 
 * In der Klasse werden wird geprüft ob ein User vorhanden ist.
 */
public class LoginValidator implements Validator {
  public void validate(FacesContext context, UIComponent component,
      Object value) throws ValidatorException {
    String user = (String) value;
    if (!user.equalsIgnoreCase("tester")) {
      FacesMessage message = new FacesMessage();
      message.setDetail("User " + user + " does not exists");
      message.setSummary("Login Incorrect");
      message.setSeverity(FacesMessage.SEVERITY_ERROR);
      throw new ValidatorException(message);
    }
  }
} 