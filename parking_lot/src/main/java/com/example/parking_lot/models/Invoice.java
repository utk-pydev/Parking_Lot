package com.example.parking_lot.models;

import java.time.LocalTime;

public class Invoice {
    int id;
    Ticket ticket;
    double amount;
    LocalTime outTime;
    Gate gate;
}
