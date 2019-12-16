/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Eduardo
 */
public class Data {

    public String mes, dia, ano, hora;
    SimpleDateFormat horaformatada = new SimpleDateFormat("HH:mm");

    public void le_hora() {
        Date data = new Date();
        hora = horaformatada.format(data);
    }

    public void le_data() {
        Date data = new Date();
        mes = "" + data.getMonth();
        dia = "" + data.getDay();
        ano = "" + (1900 + data.getYear());

        switch (data.getMonth()) {
            case 0:
                mes = "01";
                break;
            case 1:
                mes = "02";
                break;
            case 2:
                mes = "03";
                break;
            case 3:
                mes = "04";
                break;
            case 4:
                mes = "05";
                break;
            case 5:
                mes = "06";
                break;
            case 6:
                mes = "07";
                break;
            case 7:
                mes = "08";
                break;
            case 8:
                mes = "09";
                break;
            case 9:
                mes = "10";
                break;
            case 10:
                mes = "11";
                break;
            case 11:
                mes = "12";
                break;
        }
        switch (+data.getDate()) {
            case 1:
                dia = "01";
                break;
            case 2:
                dia = "02";
                break;
            case 3:
                dia = "03";
                break;
            case 4:
                dia = "04";
                break;
            case 5:
                dia = "05";
                break;
            case 6:
                dia = "06";
                break;
            case 7:
                dia = "07";
                break;
            case 8:
                dia = "08";
                break;
            case 9:
                dia = "09";
            case 10:
                dia = "10";
                break;
            case 11:
                dia = "11";
                break;
            case 12:
                dia = "12";
                break;
            case 13:
                dia = "13";
                break;
            case 14:
                dia = "14";
                break;
            case 15:
                dia = "15";
                break;
            case 16:
                dia = "16";
                break;
            case 17:
                dia = "17";
                break;
            case 18:
                dia = "18";
            case 19:
                dia = "19";
                break;
            case 20:
                dia = "20";
                break;
            case 21:
                dia = "21";
                break;
            case 22:
                dia = "22";
                break;
            case 23:
                dia = "23";
                break;
            case 24:
                dia = "24";
                break;
            case 25:
                dia = "25";
                break;
            case 26:
                dia = "26";
                break;
            case 27:
                dia = "27";
            case 28:
                dia = "28";
                break;
            case 29:
                dia = "29";
                break;
            case 30:
                dia = "30";
                break;
            case 31:
                dia = "31";
        }
    }
}
