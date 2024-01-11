/**
 * model is a name
 * @author  hamraz
 * version 1.0
 */
public class Name
{
    private final String firstName;
    private final String lastName;
    /**
     *
     * @param firstName of the studant
     * @param lastName of the studant
     */
    public Name(final String firstName,
                final String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFullName() {return firstName + "" + lastName;}
    public String getInitials() {return firstName.toUpperCase().charAt(0)+"."+lastName.toUpperCase().charAt(0);}

    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}
}
