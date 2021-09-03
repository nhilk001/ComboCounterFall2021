/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author shamc
 */
public class Activity {
    private int min;
    private int sec;
    private LocalTime time;
    private LocalDate date;

    private String mode;
    private int totalForce;

    public Activity(int min, int sec, LocalTime time, LocalDate date, String mode, int totalForce) {
        this.min = min;
        this.sec = sec;
        this.time = time;
        this.date = date;
        this.mode = mode;
        this.totalForce = totalForce;
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

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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
