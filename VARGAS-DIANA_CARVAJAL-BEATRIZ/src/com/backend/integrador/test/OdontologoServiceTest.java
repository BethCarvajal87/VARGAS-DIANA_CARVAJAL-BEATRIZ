package com.backend.integrador.test;

import com.backend.integrador.dao.impl.OdontologoDaoH2;
import com.backend.integrador.entity.Odontologo;
import com.backend.integrador.service.OdontologoService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OdontologoServiceTest {

    OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    void deberiaHaberUnaListaNoVacia(){
        //arrange
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        assertFalse(odontologos.isEmpty());
        assertTrue(odontologos.size() >= 1);
    }

}