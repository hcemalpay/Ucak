import javax.swing.*;
import java.util.Date;

public class Calculate {
    public void biletHesaplama(String selectedDeparture, String selectedArrival, boolean selectedRadioT, boolean selectedRadioGD, String selectedAge, Date selectedValueT, Date selectedValueGD) {
        CountryKmCalculate countryKmCalculate = new CountryKmCalculate();
        KmPrice kmPrice = new KmPrice();
        Jpanel jPanel = new Jpanel();

        TicketRecalculation ticketRecalculation = new TicketRecalculation();
        Discount gidisDonusIndirim = new Discount();
        double tutar;

        if (selectedRadioT && selectedRadioGD) {
            JOptionPane.showMessageDialog(null, "Yön seçimi hatalıdır veya eksiktir. Lütfen tekrar deneyiniz.");
        } else if (selectedRadioT || selectedRadioGD) {
            if (selectedDeparture != "Lütfen Seçim Yapınız" || selectedArrival != "Lütfen Seçim Yapınız") {
                if (selectedDeparture.equals("Ankara") && selectedArrival.equals("İstanbul")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.AnkaraIstanbul() * kmPrice.kmFiyati() * yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                            return;

                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.AnkaraIstanbul() * kmPrice.kmFiyati() * yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.AnkaraIstanbul() * kmPrice.kmFiyati() * yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = countryKmCalculate.AnkaraIstanbul() * kmPrice.kmFiyati();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }

                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = tutar = countryKmCalculate.AnkaraIstanbul() * gidisDonusIndirim.gidisDonusIndirim() * kmPrice.kmFiyati() * yuzdeElliIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = tutar = countryKmCalculate.AnkaraIstanbul() * gidisDonusIndirim.gidisDonusIndirim() * kmPrice.kmFiyati() * yuzdeOnIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.AnkaraIstanbul() * gidisDonusIndirim.gidisDonusIndirim() * kmPrice.kmFiyati() * yuzdeOtuzIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = tutar = countryKmCalculate.AnkaraIstanbul() * gidisDonusIndirim.gidisDonusIndirim() * kmPrice.kmFiyati() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                } else if (selectedDeparture.equals("Ankara") && selectedArrival.equals("Van")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeElliIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeOnIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeOtuzIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                } else if (selectedDeparture.equals("Van") && selectedArrival.equals("Ankara")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeElliIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeOnIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeOtuzIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = countryKmCalculate.AnkaraVan() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                } else if (selectedDeparture.equals("İstanbul") && selectedArrival.equals("Ankara")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.AnkaraIstanbul() * kmPrice.kmFiyati() * yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.AnkaraIstanbul() * kmPrice.kmFiyati() * yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.AnkaraIstanbul() * kmPrice.kmFiyati() * yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = countryKmCalculate.AnkaraIstanbul() * kmPrice.kmFiyati();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = tutar = countryKmCalculate.AnkaraIstanbul() * gidisDonusIndirim.gidisDonusIndirim() * kmPrice.kmFiyati() * yuzdeElliIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = tutar = countryKmCalculate.AnkaraIstanbul() * gidisDonusIndirim.gidisDonusIndirim() * kmPrice.kmFiyati() * yuzdeOnIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.AnkaraIstanbul() * gidisDonusIndirim.gidisDonusIndirim() * kmPrice.kmFiyati() * yuzdeOtuzIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = tutar = countryKmCalculate.AnkaraIstanbul() * gidisDonusIndirim.gidisDonusIndirim() * kmPrice.kmFiyati() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                } else if (selectedDeparture.equals("izmir") && selectedArrival.equals("Gaziantep")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeElliIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeOnIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeOtuzIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                } else if (selectedDeparture.equals("Gaziantep") && selectedArrival.equals("İzmir")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeElliIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeOnIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeOtuzIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = tutar = countryKmCalculate.IzmirGaziantep() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                } else if (selectedDeparture.equals("Tokat") && selectedArrival.equals("Çanakkale")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeElliIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeOnIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeOnIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                } else if (selectedDeparture.equals("Çanakkale") && selectedArrival.equals("Tokat")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT + " tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeElliIndirim() * 2;
                            ;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeOnIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * yuzdeOtuzIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        } else {
                            tutar = countryKmCalculate.TokatCanakkale() * kmPrice.kmFiyati() * gidisDonusIndirim.gidisDonusIndirim() * 2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT + " gidiş " + selectedValueGD + " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            ticketRecalculation.yeniden();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seçmiş olduğunuz güzergahta uçuşumuz bulunmamaktadır.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seçim yapmadığınız için hesaplama gerçekleştirilememiştir.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Yön seçimi hatalıdır veya eksiktir. Lütfen tekrar deneyiniz.");
        }
    }

    public double yuzdeOnIndirim() {
        double yuzdeOn = 0.9;
        return yuzdeOn;
    }

    public double yuzdeElliIndirim() {
        double yuzdeElli = 0.5;
        return yuzdeElli;
    }

    public double yuzdeOtuzIndirim() {
        double yuzdeOtuz = 0.7;
        return yuzdeOtuz;
    }
}
