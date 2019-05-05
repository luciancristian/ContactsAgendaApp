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
public class PhMobileNumber extends PhNumber implements Serializable {

    public PhMobileNumber(String PhNumber) {
        super(PhNumber);
    }

    @Override
    public boolean numberValidation(String PhNumber) {
        if (PhNumber.matches("^[07]{2}[0-9]\\d{7}")) {
            return true;
        } else {
            return false;
        }
    }
}
