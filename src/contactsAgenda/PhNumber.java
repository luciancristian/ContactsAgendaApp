/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsAgenda;

import java.io.Serializable;

/**
 *
 * @author Kasguz
 */
public abstract class PhNumber implements Serializable{
    
    String phoneNumber;
    
    public PhNumber (String PhNumber){
        if (numberValidation(PhNumber)) {
            this.phoneNumber = PhNumber;
        }
    }
    public abstract boolean numberValidation(String PhNumber);

    @Override
    public String toString (){
        return this.phoneNumber;
    }
}
