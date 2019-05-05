
package contactsAgenda;


public enum FilterOptions {
    MOBILE,
    HOME,
    CURRENT_BIRTHDAY,
    CURRENT_BIRTHMONTH,
    CUSTOM;


    @Override
    public String toString() {
        return this.name().toUpperCase();
    }
}    
