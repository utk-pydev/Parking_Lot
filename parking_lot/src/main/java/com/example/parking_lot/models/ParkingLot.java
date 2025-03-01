package com.example.parking_lot.models;

import java.util.List;

public class ParkingLot {
    int id;
    String name;
    String address;
    List<ParkingSlot> parkingSlotList;
    List<Gate> entryGates;
    List<Gate> exitGates;
}
