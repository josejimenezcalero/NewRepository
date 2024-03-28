/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroaleatorioventana;

import java.awt.HeadlessException;

/**
 *
 * @author usuario
 */
public interface InterfaceVentanaDepart {

    void altaDepartamento(final String existeDepartamento);

    void borraDepartamento(final String existeDepartamento) throws HeadlessException;

    int consultaDepartamento(final String existeDepartamento, String parametro2);

    void modificaDepartamento(final String existeDepartamento) throws HeadlessException;
    
}
