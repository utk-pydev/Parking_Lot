package com.example.parking_lot.models;

import java.time.LocalTime;

public class Ticket {
    int id;
    LocalTime issueTime;
    VehicleType vehicleType;
    Gate gate;
    ParkingSlot parkingSlot;
}
