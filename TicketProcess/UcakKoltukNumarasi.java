/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ucakkoltuknumarasi;

import java.util.Scanner;
import jdk.jfr.Period;

/**
 *
 * @author Ali Osman
 */
public class UcakKoltukNumarasi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        FlightInformation flightInformation = new FlightInformation();
        CabinSeat cabinSeat = new CabinSeat();
        TickerNumber tkNumber = new TickerNumber();
        PNR pnr = new PNR();
        RemoveTicket removeTicket = new RemoveTicket();

        int tercihNumarasi;

        while (true) {

            System.out.println("""
                           Hoşgeldiniz! Ne yapmak istiyorsunuz?
                           1- Uçuş Oluşturmak
                           2- Uçuş Bilgileri Sorgulama
                           3- Uçuşu İptal Etmek
                           4- Uçuşu Yeniden Planlamak
                           5- Çıkış
                           Terchiniz: """);

            tercihNumarasi = s.nextInt();

            if (tercihNumarasi == 5) {
                break;
            } else if (tercihNumarasi == 1) {
                String name;
                String kalkisHavalimani;
                String varisHavalimani;
                int kalkisZamani;

                System.out.println("Name: ");
                name = s.next();
                flightInformation.setName(name);

                System.out.println("From: ");
                kalkisHavalimani = s.next();
                flightInformation.settAirport(kalkisHavalimani);

                System.out.println("To: ");
                varisHavalimani = s.next();
                flightInformation.setlAirport(varisHavalimani);

                System.out.println("Takeoff Time: ");
                kalkisZamani = s.nextInt();
                flightInformation.settTime(kalkisZamani);

                flightInformation.setSeatNumber(cabinSeat.Seat());
                flightInformation.setReservationNumber(pnr.pnr());
                flightInformation.setTickerNumber(tkNumber.ticketNumber());

            } else if (tercihNumarasi == 2) {
                System.out.println("---------------------------------------------------------------------");
                System.out.printf("""
                                   Name: %s
                                   To: %s -----> From: %s
                                   Takeoff Time: %d
                                   Ticket Number: %d
                                   PNR: %s
                                   Seat Number: %s
                                   """, flightInformation.getName(),
                        flightInformation.gettAirport(),
                        flightInformation.getlAirport(),
                        flightInformation.gettTime(),
                        flightInformation.getTickerNumber(),
                        flightInformation.getReservationNumber(),
                        flightInformation.getSeatNumber());
                System.out.println("----------------------------------------------------------------------------");
            } else if (tercihNumarasi == 3) {
                removeTicket.BiletIptal();
                flightInformation.setName("");
                flightInformation.setlAirport("");
                flightInformation.settAirport("");

            } else if (tercihNumarasi == 4) {

                while (true) {
                    int tercih;
                    System.out.println("""
                                       Uçuşunuz Yeniden Planlamayı Tercih Ettiniz. Uçuşunuzu Planladıktan Sonra Kontrol Etmek İçin Sorgulama Ekranına Gidiniz!
                                       1- Kalkış Havalimanını Değiştirmek
                                       2- Varış Havalimanını Değiştirmek
                                       3- Saati Değiştirmek
                                       Tercihiniz: """);
                    tercih = s.nextInt();

                    if (tercih == 1) {
                        String nAirport;
                        System.out.println("Yeni Kalkış Havalimani: ");
                        nAirport = s.next();
                        flightInformation.settAirport(nAirport);
                        break;
                    } else if (tercih == 2) {
                        String nAirport;
                        System.out.println("Yeni Varış Havalimani: ");
                        nAirport = s.next();
                        flightInformation.setlAirport(nAirport);
                        break;
                    } else if (tercih == 3) {
                        int newTime;
                        System.out.println("Yeni Kalkış Saati Planlayın: ");
                        newTime = s.nextInt();
                        flightInformation.settTime(newTime);
                        break;
                    }

                }

            }
        }

    }

}
