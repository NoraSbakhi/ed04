package org.example;

import java.util.*;
/** clase Agenda que contiene una lista de contacto y métodos para añadir o eliminar contactos y modificar el numero de telefono de un contacto conreto
 * @author NoraSbakhi
 * version 1.0 29/02/2024
 * @see Contacto*/
public class Agenda
{
    private List<Contacto> contacts; // Lista de Contacto

    /**  con este método llamamos a la lista de contactos de la clase contactos */
    public Agenda()
    {
        this.contacts = new ArrayList<>();
    }
    /** Este método se encarga de agregar un contacto a una lista de contactos (contacts).
    * Si el nombre del contacto ya existe en la lista,
     *se agrega el número de teléfono proporcionado a la lista de números de teléfono del contacto existente.
     *Si el nombre no existe en la lista, se crea un nuevo objeto Contacto con el nombre y el número de teléfono proporcionados,
     *y se agrega a la lista.*/
    public void addContact(String name, String phone)
    {
    /* inicializa una variable bolleana "exixst" como falso
      se recorre la lista de contactos utulizando un bucle for
      se verifica si el nombre de contacto actual es igual al nombre proporcionado(ignorando mayus. y minus).
      si el nombre ya existe, se establece "exist" a true. y se agrega el numero proporcionado a la lista de numeros de ese contacto actual.
      una vez encontrado y actualiado el numebro se rompe el bucle. */
        boolean exists = false;

        for (Contacto c : contacts)
        {
            if (c.getName().equalsIgnoreCase(name))
            {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }
    /* despues de salir del bucle, se verifica si "exist" es falso (es decir, si el nombre no existe en la lista).
       Si el nombre no existe, se crea un nuevo objeto 'Contacto' con el nombre y el número de teléfono proporcionados.
      y se agrega el nuevo contacto a la lista 'contacts'.*/
        if (!exists)
        {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }
/**  este método sirve para elimiar un contacto de la lista de contactos.
 * utuliza un iterador para recorrer la lista
 * elimina un contacto de la lista basándose en el nombre proporcionado.
 * Si hay varios contactos con el mismo nombre, eliminará todos ellos de la lista.*/
    public void removeContact(String name)
    {
        Iterator<Contacto> it = contacts.iterator();// este es el iterador que recorre la lista contactos.

        while (it.hasNext()) // se recorre lalista mientras haya elementos no repetidos */
        {
            Contacto c = it.next();// se obtiene el proximo elemento de la lista a traves del iterador*/

            if (c.getName().equalsIgnoreCase(name)) /*  se verifica si el nombre del contacto actrual es igaul al nombre proporciaonado,
                                                        ignorando mayusculas y minusuculas*/
            {
                it.remove();//  Si el nombre coincide, se elimina el contacto actual de la lista mediante el iterador. */
            }
        }
    }
 /** Este método se encarga de modificar el número de teléfono de un contacto en la lista de contactos.
  *  Si el contacto o el antiguo número de teléfono no se encuentran, no se realiza ninguna modificación.*/
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone)
    {
        for (Contacto c : contacts) //  Se recorre la lista de contactos 'contacts' utilizando un bucle for-each.*/
        {
            if (c.getName().equalsIgnoreCase(name)) /*  Se verifica si el nombre del contacto actual (c) es igual al nombre proporcionado
                                                            (ignorando mayúsculas/minúsculas).*/
            {
                List<String> phones = c.getPhones(); //  Se obtiene la lista de números de teléfono del contacto actual.

                int index = phones.indexOf(oldPhone);
                /* Se busca el índice del antiguo número de teléfono en la lista.
                Si se encuentra el antiguo número de teléfono en la lista.
                Se reemplaza el antiguo número de teléfono con el nuevo número de teléfono.*/
                if (index != -1)
                {
                    phones.set(index, newPhone);
                }
            }
        }
    }
/** @return Devuelve la lista de contactos asociada a la instancia actual de la clase.*/
    public List<Contacto> getContacts()
    {
        return this.contacts;
    }
}