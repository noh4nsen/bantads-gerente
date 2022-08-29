package com.bantads.gerente.bantadsgerente.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.bantads.gerente.bantadsgerente.data.GerenteRepository;
import com.bantads.gerente.bantadsgerente.model.Gerente;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ConsumerCadastro {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private GerenteRepository gerenteRepository;

    @RabbitListener(queues = "autocadastro-gerente")
    public void receive(@Payload String json) throws JsonMappingException, JsonProcessingException {
        try{
            Gerente gerente = objectMapper.readValue(json, Gerente.class);
            gerenteRepository.save(gerente);            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
