package design;

import com.google.gson.Gson;

public class GeneralOfficer {

    static GeneralOfficer gOfficer = new GeneralOfficer();

    private GeneralOfficer() {
    }

    public GeneralOfficer getInstance() {
        return gOfficer;


    }

    public int responsibilities(){
        int number =300;
        int hour = 40;

        int total = number*hour;

        System.out.println("Working " + hour+" hours, with $"+number+" dollar for an hour GM making $"+total
                +" dollar a month !");
        return total;

    }

}