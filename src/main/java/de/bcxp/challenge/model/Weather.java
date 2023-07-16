package de.bcxp.challenge.model;

import com.opencsv.bean.CsvBindByName;

/**
 * Bean of the Weather
 */
public class Weather {

    @CsvBindByName(column = "Day")
    private int day;
    @CsvBindByName(column = "MxT")
    private float maxTemp;
    @CsvBindByName(column = "MnT")
    private float minTemp;
    @CsvBindByName(column = "AvT")
    private float avgTemp;
    @CsvBindByName(column = "AvDP")
    private float avDP;
    @CsvBindByName(column = "1HrP")
    private float hrP;
    @CsvBindByName(column = "TPcpn")
    private float tPcpn;
    @CsvBindByName(column = "PDir")
    private float pDir;
    @CsvBindByName(column = "AvSp")
    private float AvSp;
    @CsvBindByName(column = "Dir")
    private float dir;
    @CsvBindByName(column = "MxS")
    private float mxS;
    @CsvBindByName(column = "SkyC")
    private float skyC;
    @CsvBindByName(column = "MxR")
    private float mxR;
    @CsvBindByName(column = "Mn")
    private float mn;
    @CsvBindByName(column = "R")
    private float r;
    @CsvBindByName(column = "AvSLP")
    private float avSLP;


    public Weather(int day, float maxTemp, float minTemp, float avgTemp, float avDP, float hrP, float tPcpn,
                   float pDir, float avSp, float dir, float mxS, float skyC, float mxR, float mn, float r,
                   float avSLP) {
        this.day = day;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.avgTemp = avgTemp;
        this.avDP = avDP;
        this.hrP = hrP;
        this.tPcpn = tPcpn;
        this.pDir = pDir;
        AvSp = avSp;
        this.dir = dir;
        this.mxS = mxS;
        this.skyC = skyC;
        this.mxR = mxR;
        this.mn = mn;
        this.r = r;
        this.avSLP = avSLP;
    }

    public Weather() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public float getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(float maxTemp) {
        this.maxTemp = maxTemp;
    }

    public float getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(float minTemp) {
        this.minTemp = minTemp;
    }

    public float getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(float avgTemp) {
        this.avgTemp = avgTemp;
    }

    public float getAvDP() {
        return avDP;
    }

    public void setAvDP(float avDP) {
        this.avDP = avDP;
    }

    public float getHrP() {
        return hrP;
    }

    public void setHrP(float hrP) {
        this.hrP = hrP;
    }

    public float gettPcpn() {
        return tPcpn;
    }

    public void settPcpn(float tPcpn) {
        this.tPcpn = tPcpn;
    }

    public float getpDir() {
        return pDir;
    }

    public void setpDir(float pDir) {
        this.pDir = pDir;
    }

    public float getAvSp() {
        return AvSp;
    }

    public void setAvSp(float avSp) {
        AvSp = avSp;
    }

    public float getDir() {
        return dir;
    }

    public void setDir(float dir) {
        this.dir = dir;
    }

    public float getMxS() {
        return mxS;
    }

    public void setMxS(float mxS) {
        this.mxS = mxS;
    }

    public float getSkyC() {
        return skyC;
    }

    public void setSkyC(float skyC) {
        this.skyC = skyC;
    }

    public float getMxR() {
        return mxR;
    }

    public void setMxR(float mxR) {
        this.mxR = mxR;
    }

    public float getMn() {
        return mn;
    }

    public void setMn(float mn) {
        this.mn = mn;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getAvSLP() {
        return avSLP;
    }

    public void setAvSLP(float avSLP) {
        this.avSLP = avSLP;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "day=" + day +
                ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                ", avgTemp=" + avgTemp +
                ", avDP=" + avDP +
                ", hrP=" + hrP +
                ", tPcpn=" + tPcpn +
                ", pDir=" + pDir +
                ", AvSp=" + AvSp +
                ", dir=" + dir +
                ", mxS=" + mxS +
                ", skyC=" + skyC +
                ", mxR=" + mxR +
                ", mn=" + mn +
                ", r=" + r +
                ", avSLP=" + avSLP +
                '}';
    }
}
