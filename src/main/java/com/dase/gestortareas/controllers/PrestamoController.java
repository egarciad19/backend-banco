/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dase.gestortareas.controllers;

import com.dase.gestortareas.commons.CommonController;
import com.dase.gestortareas.entities.Prestamo;
import com.dase.gestortareas.services.PrestamoSvc;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author egarc
 */
@RestController

@RequestMapping(path = "/prestamo")
public class PrestamoController extends CommonController<Prestamo, PrestamoSvc>{
    
}