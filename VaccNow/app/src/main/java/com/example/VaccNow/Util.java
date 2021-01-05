package com.example.VaccNow;

import com.vaccNow.model.Branch;
import com.vaccNow.model.Timeslot;
import com.vaccNow.model.Vaccine;

import java.util.List;
import java.util.stream.Collectors;

public class Util {

    public static List<Branch> getBranchToDao(List<com.example.VaccNow.model.Branch> branches) {
        return branches.stream()
                .map(Util::toDoBranch)
                .collect(Collectors.toList());
    }

    public static Branch toDoBranch(com.example.VaccNow.model.Branch branch){
        Branch branchO=new Branch();
        branchO.setCapacity(branch.getCapacity());
        branchO.setId(branch.getId());
        branchO.setName(branch.getName());
        return branchO;
    }

    public static List<Vaccine> getVaccineToDao(List<com.example.VaccNow.model.Vaccine> vaccines) {
        return vaccines.stream()
                .map(Util::toDoVaccine)
                .collect(Collectors.toList());
    }

    public static Vaccine toDoVaccine(com.example.VaccNow.model.Vaccine vaccine){
        Vaccine vaccineO=new Vaccine();
        vaccineO.setId(vaccine.getId());
        vaccineO.setName(vaccine.getName());
        vaccineO.setPrice(vaccine.getPrice().toString());
        return vaccineO;
    }

    public static List<Timeslot> getTimeSlot(List<com.example.VaccNow.model.TimeSlot> timeSlots) {
        return timeSlots.stream()
                .map(Util::toDoTimeSlot)
                .collect(Collectors.toList());
    }

    public static Timeslot toDoTimeSlot(com.example.VaccNow.model.TimeSlot timeSlot){
        Timeslot timeslotO=new Timeslot();
        timeslotO.setSlot(timeSlot.getSlot());
        return timeslotO;
    }

}
