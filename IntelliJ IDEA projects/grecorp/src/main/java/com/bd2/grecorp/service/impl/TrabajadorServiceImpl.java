package com.bd2.grecorp.service.impl;

import com.bd2.grecorp.entities.Trabajador;
import com.bd2.grecorp.repositories.TrabajadorRepository;
import com.bd2.grecorp.service.TrabajadorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TrabajadorServiceImpl implements TrabajadorService {

    private final TrabajadorRepository trabajadorRepository;

    public TrabajadorServiceImpl(TrabajadorRepository trabajadorRepository) {
        this.trabajadorRepository = trabajadorRepository;
    }

    @Override
    public List<Trabajador> getTrabajadores() {
        return trabajadorRepository.findAll();
    }

}
