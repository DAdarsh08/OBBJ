package com.SBI;

import com.SBI.utilities.Utilities;

import java.util.Scanner;

public class Currency {
    int totalpaise;


    public Currency(int rupees, int paise) {
        this.totalpaise = rupees * 100 + paise;
    }

    public Currency() {
        int paise;
        int rupees;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rupees");
        rupees = Integer.parseInt(sc.nextLine());
        System.out.println("Enter  the paise");
        paise = Integer.parseInt(sc.nextLine());
        this.totalpaise = rupees * 100 + paise;


    }

    public static void main(String[] args) {
        Currency currency = new Currency(-12, 5);
        System.out.println(currency);
        System.out.println(currency.totalpaise);
    }

    @Override
    public String toString() {
        int totalpaise = this.totalpaise;
        String sign = "";
        if (totalpaise < 0) {
            totalpaise = -totalpaise;
            sign = "-";
        }
        int rupees = totalpaise / 100;
        int paise = totalpaise % 100;

        return
                sign + "₹ " + Utilities.pad(rupees) +
                        "." + Utilities.pad(paise);
    }
}
