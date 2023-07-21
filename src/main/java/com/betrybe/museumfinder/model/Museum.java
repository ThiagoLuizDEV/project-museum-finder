package com.betrybe.museumfinder.model;

/** Classe Museum. */
public class Museum {
  private Long id;
  private String name;
  private String description;
  private String address;
  private String collectionType;
  private String subject;
  private String url;
  private Coordinate coordinate;
  private Long legacyId;

  public Museum() {}
  /**
   * Constrói um novo objeto Museum com os parâmetros dados.
   *
   * @param id o identificador único do museu
   * @param name o nome do museu
   * @param description uma breve descrição do museu
   * @param address o endereço físico do museu
   * @param collectionType o tipo de coleção que o museu exibe
   * @param subject o assunto principal ou tema do museu
   * @param url o site do museu
   * @param coordinate a coordenada geográfica do museu
   * @param legacyId um identificador legado opcional para compatibilidade com versões anteriores */

  public Museum(Long id, String name, String description, String address, String collectionType,
      String subject, String url, Coordinate coordinate, Long legacyId) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.address = address;
    this.collectionType = collectionType;
    this.subject = subject;
    this.url = url;
    this.coordinate = coordinate;
    this.legacyId = legacyId;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String getAddress() {
    return address;
  }

  public String getCollectionType() {
    return collectionType;
  }

  public String getSubject() {
    return subject;
  }

  public String getUrl() {
    return url;
  }

  public Coordinate getCoordinate() {
    return coordinate;
  }

  public Long getLegacyId() {
    return legacyId;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setCoordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
  }

  public void setLegacyId(Long legacyId) {
    this.legacyId = legacyId;
  }

}
