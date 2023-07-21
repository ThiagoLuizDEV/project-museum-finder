package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;

/**
 * Um registro que representa um museu com seus atributos básicos.
 *
 * @param id o identificador único do museu
 * @param name o nome do museu
 * @param description uma breve descrição do museu
 * @param address o endereço físico do museu
 * @param collectionType o tipo de coleção que o museu exibe
 * @param subject o assunto principal ou tema do museu
 * @param url o site do museu
 * @param coordinate a coordenada geográfica do museu */
public record MuseumDto(Long id, String name, String description, String address,
                        String collectionType, String subject, String url, Coordinate coordinate) {
}
