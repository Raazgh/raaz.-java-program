/**
 * students information
 * @author hamraz
 */


public class Studant
{
    private final Name fullName;
    private final String studantNumber;
    private final Date dateOfBirth;
    private final boolean graduated;
    /**
     *
     * @param fullName of the student
     * @param studantNumber of the student
     * @param dateOfBirth of the student
     * @param graduated of the student
     */
    public Studant(final Name  fullName,
                   final String studantNumber,
                   final Date dateOfBirth,
                   final boolean graduated)
    {
        this.fullName = fullName;
        this.studantNumber = studantNumber;
        this.dateOfBirth = dateOfBirth;
        this.graduated = graduated;

    }

    public Name getName(){return fullName;}

    public String getStudantNumber(){return studantNumber;}

    public Date getDateOfBirth(){ return dateOfBirth;}

    public boolean isGraduated(){return graduated;}

}
