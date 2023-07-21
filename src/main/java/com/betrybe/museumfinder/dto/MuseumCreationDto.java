package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;

/**
 * Um registro que representa os dados necessários para criar um novo museu.
 *
 * @param name o nome do museu
 * @param description uma breve descrição do museu
 * @param address o endereço físico do museu
 * @param collectionType o tipo de coleção que o museu exibe
 * @param subject o assunto principal ou tema do museu
 * @param url o site do museu
 * @param coordinate a coordenada geográfica do museu */
public record MuseumCreationDto(String name, String description, String address,
                                String collectionType, String subject, String url,
                                Coordinate coordinate) {
}
