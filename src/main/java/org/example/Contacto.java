package org.example;

import java.util.ArrayList;
import java.util.List;

/** esta clase  contiende dos atributos: el nombre del contacto y un listado de teléfonos asociados a dicho contacto.
 *  * @author NoraSbakhi
 *  * version 1.0 29/02/2024*/
class Contacto
{
    private String name;
    private List<String> phones;
/** este es el atributo contacto*/
    public Contacto(String name, String phone)
    {
        this.name = name;
        this.phones = new ArrayList<>(); /** eso es una lista de telefonos asociados al contacto*/
        this.phones.add(phone);
    }

    public String getName() /** @return método que devuelve el nombre del contacto*/
    {
        return this.name;
    }

    public List<String> getPhones() /** @return método que devuelve el numero de telefono del contacto*/
    {
        return this.phones;
    }
}