import java.util.Scanner;

public class emailCheckInterview {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("please enter your e-mail");

        String email = s.next();

        boolean username = email.substring(0, email.indexOf('@')).length()>0;
        boolean at = email.contains("@");
        boolean dot = email.substring(email.indexOf('@')+1).contains(".");

        if (username && at && dot)
            System.out.println(true);
        else
            System.out.println(false);




    }

}

/*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */