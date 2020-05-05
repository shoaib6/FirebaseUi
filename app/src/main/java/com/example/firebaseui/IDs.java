package com.example.firebaseui;

import androidx.annotation.NonNull;

public class IDs {
   String Classs;
   String Name;
   String Roll;

    public IDs(String classs, String name, String roll) {
        Classs = classs;
        Name = name;
        Roll = roll;
    }

    @Override
    public String toString() {
        return "IDs{" +
                "Classs='" + Classs + '\'' +
                ", Name='" + Name + '\'' +
                ", Roll=" + Roll +
                '}';
    }

    public String getClasss() {
        return Classs;
    }

    public void setClasss(String classs) {
        Classs = classs;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String roll) {
        Roll = roll;
    }

    public IDs() {
    }
}
