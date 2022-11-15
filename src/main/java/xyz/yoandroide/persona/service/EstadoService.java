package xyz.yoandroide.persona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.yoandroide.persona.model.Estado;
import xyz.yoandroide.persona.repository.EstadoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    public List<Estado> findAllByCountry(Long countryId) {
        return estadoRepository.findAll().stream()
				.filter(estado -> estado.getPais().getId() == countryId)
				.collect(Collectors.toList());
    }
}
