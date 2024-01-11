

public class Main
{
    public static void main(final String[] args)
    {
        final Bank b1;
        final Bank b2;

        final Date d1;
        final Date d2;

        final Name n1;
        final Name n2;

        final Studant s1;
        final Studant s2;


        b1 = new Bank(100.00,"abc123","gates");
        b2 = new Bank(500.00,"xyz789","woods");

        d1 = new Date(1995,12,30);
        d2 = new Date(1995,10,28);

        n1= new Name("Tiger","woods");
        n2 = new Name("Bill", "Gstes");

        s1= new Studant(n1,"A00123456",d1,true);
        s2 = new Studant(n2,"A00987654",d2,false);


        System.out.println(b1.getBallanceCdn());
        System.out.println(b1.getAccountNumber());
        b1.withdraw(5.00);
        System.out.println(b1.getBallanceCdn());
        System.out.println("--");
        System.out.println(b2.getBallanceCdn());
        System.out.println(b2.getMemberLastName());
        b2.deposite(23.0);
        System.out.println(b2.getBallanceCdn());
        System.out.println("--");
        b1.transfer(50.00,b2);
        System.out.println(b1.getBallanceCdn());
        System.out.println(b2.getBallanceCdn());

        System.out.println(s1.getName().getFullName()+" ("+ s1.getName().getInitials()+")"
                +" (st #"+ s1.getStudantNumber()+")" + " Was born on " +(s1.getDateOfBirth().getYyMmDd())
                + " The student has Graduated " +(s1.isGraduated()));
        System.out.println(s2.getName().getFullName()+" ("+ s2.getName().getInitials()+")"
                +" (st #"+ s2.getStudantNumber()+")" + " Was born on " +(s2.getDateOfBirth().getYyMmDd())
                + " The student has  not Graduated " +(s2.isGraduated()));

    }
}
