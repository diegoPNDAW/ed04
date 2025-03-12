package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto y una lista de números de teléfono
 *
 * @author Diego Planes
 * @version 1.0
 */
class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Crea un nuevo contacto con un nombre y un número de teléfono.
      * @param name es el nombre del contacto.
     * @param phone es el número de teléfono.
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * obtiene el nombre del contacto
     * @return el nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de números de teléfono del contacto.
     * @return la lista con los números de teléfono del contacto.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}