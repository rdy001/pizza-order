package org.camunda.bpm.getstarted.pizza;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.HashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@ViewScoped
public class pizza implements Serializable {

    private String type;  
    private Map<String,String> types;
    
    @PostConstruct
    public void init() {
        types  = new HashMap<String, String>();
        types.put("Margarita", "Margarita");
        types.put("Salami", "Salami");
        types.put("Tonno", "Tonno");
        types.put("Prosciutto", "Prosciutto");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, String> getTypes() {
        return types;
    }

    public void setTypes(Map<String, String> types) {
        this.types = types;
    }
    


}
