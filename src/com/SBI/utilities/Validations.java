package com.SBI.utilities;

import com.SBI.InvalidAccnoException;
import com.SBI.InvalidAgeException;

public class Validations {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 0 || age > 100) throw new InvalidAgeException(age);
    }

    public static void ValidAccno(String Accno) throws InvalidAccnoException {
        if (Accno.length() > 5 || !Utilities.checkString(Accno))
            throw new InvalidAccnoException(Accno);
    }
}
