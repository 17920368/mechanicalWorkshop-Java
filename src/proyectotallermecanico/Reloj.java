/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotallermecanico;
import java.util.Calendar;
/**
 *
 * @author WALMART
 */
public class Reloj {
    public static long ahora()
    {
    return Calendar.getInstance().getTimeInMillis();
    }
}
