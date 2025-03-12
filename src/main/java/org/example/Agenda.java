package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Agenda que almacena contactos con múltiples números de teléfono.
 *
 * @author Diego Planes
 * @version 1.0
 */

public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Crea una nueva agenda vacía.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Agrega un contacto a la agenda. Si el contacto ya existe, añade el nuevo número de teléfono.
     *
     * @param name el nombre del contacto.
     * @param phone el teléfono del contacto
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto de la agenda por su nombre.
     * @param name el nombre del contacto a eliminar
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * modifica un número de teléfono de un contacto existente.
     *
     * @param name el teléfono del contacto.
     * @param oldPhone el número de teléfono actual que será modificado.
     * @param newPhone el nuevo número de teléfono a asignar.
     */

    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de contactos de la agenda.
     * @return la lista con los contactos almacenados en la agenda.
     */

    public List<Contacto> getContacts() {
        return this.contacts;
    }
}