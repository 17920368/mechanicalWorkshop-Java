/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotallermecanico;
import java.util.*;
/**
 *
 * @author WALMART
 */
public class ListAuto {
    
    LinkedList <Auto> ListAuto;
    LinkedList<Auto> ListAtendidos;
    int pos=0;
    
    public ListAuto()
    {
    ListAuto = new LinkedList<>();
     ListAtendidos = new LinkedList<>();
    }
    
    public void Agregar(Auto a)
    {
    ListAuto.add(a);
    }
    public Auto Mostrar(int i)
    {
    return ListAuto.get(i);
    }
    public int size()
    {
    return ListAuto.size();
    }
    
    
    public Auto Atendidos()
    throws NoSuchElementException
    {
    Auto aux=ListAuto.remove();
    ListAtendidos.add(aux);
    return aux;
    }
    public Auto getListaAtendidos(int i)
    {
    return ListAtendidos.get(i);
    }
    public int sizeAtendidos()
    {
    return ListAtendidos.size();
    }
    
    public float TotalServicio()
    {
    float total=0;
    for(int x=0;x<ListAtendidos.size();x++)
    {
    total+=ListAtendidos.get(x).getCostoS();
    
    }
    return total;
    }
    public int ListaRecibidosPorDia(long d)
    {
    for(int x=0;x<ListAuto.size();x++)
    {
    if(ListAuto.get(x).getFechaE()==d)
    {
    pos=x;
    return x;
    }
    }
    return 0;
    }
    
    public int ListaAtendidosPorDia(long d)
    {
    for(int x=0;x<ListAtendidos.size();x++)
    {
    if(ListAtendidos.get(x).getFechaE()==d)
    {
    pos=x;
    return x;
    }
    }
    return 0;
    }
    
    public float TotalPorTipodeServicio(String ser)
    {
    float total=0;
    for(int z=0;z<ListAtendidos.size();z++)
    {
    if(ser.equals(ListAtendidos.get(z).getServicio()))
    {
    total+=ListAtendidos.get(z).getCostoS();
    
    }
    }
    return total;
    }
    
    }
    

//