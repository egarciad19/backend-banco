/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dase.gestortareas.repositories;

import com.dase.gestortareas.entities.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author egarc
 */
public interface SolicitudRepository extends JpaRepository<Solicitud, Object>{
    
}
