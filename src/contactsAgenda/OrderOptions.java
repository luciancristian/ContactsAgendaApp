
package contactsAgenda;

public enum OrderOptions {
    FIRSTNAME,
    LASTNAME,
    BIRTHDATE,
    NUMBER;
    
    @Override
    public String toString() {
        return this.name().toUpperCase();
    }
}    