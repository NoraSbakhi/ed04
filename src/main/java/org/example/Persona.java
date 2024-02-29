package org.example;

import java.util.ArrayList;
import java.util.List;

/** esta clase  contiende dos atributos: el nombre del contacto y un listado de teléfonos asociados a dicho contacto.
 *  * @author NoraSbakhi
 *  * version 1.0 29/02/2024*/
public class Persona
{
    private String name;
    private List<String> phones;
/** constructos para la clase contacto, asigna un atributo nombre y teléfono
 * primero asigan el nombre al atributo noame, luego inicializa el atributo
 * como una nueva instancia y fianlemnte agrega el numeor de telfono proporcionado a la lista phones
 * @param name parametro de name
 *  @param phone parametro de número de telefono*/

    public Persona(String name, String phone)

    {
        this.setName(name);
        this.setPhones(new ArrayList<>()); // inicializa el aributo phones como una nueva instande de ArrayList
        this.getPhones().add(phone);
    }
    /** @return método que devuelve el nombre del contacto*/
    public String getName()
    {
        return this.name;
    }
    /** @return método que devuelve el numero de telefono del contacto*/
    public List<String> getPhones()
    {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}