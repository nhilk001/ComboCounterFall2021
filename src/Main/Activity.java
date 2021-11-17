/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author shamc Lets change this to all come from the database
 */
public class Activity {

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
    private int min;
    private int sec;
    private String time;
    private String date;

    private String mode;
    private int totalForce;
    private int goalForce;

    public Activity(int min, int sec, String time, String date, String mode, int totalForce) {
        this.min = min;
        this.sec = sec;
        this.time = time;
        this.date = date;
        this.mode = mode;
        this.totalForce = totalForce;
    }

    public Activity(int timeElapsed, int sec, String time, String date, String mode, int totalForce, int goalForce) {
        this.min = timeElapsed;
        this.sec = 0;
        this.time = time;
        this.date = date;
        this.mode = mode;
        this.totalForce = totalForce;
        this.goalForce = goalForce;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public String getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time.format(dtf);
    }

    public String getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date.toString();
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int getTotalForce() {
        return totalForce;
    }

    public void setTotalForce(int totalForce) {
        this.totalForce = totalForce;
    }
}
