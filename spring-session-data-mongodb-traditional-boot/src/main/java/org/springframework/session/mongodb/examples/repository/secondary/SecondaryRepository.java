package org.springframework.session.mongodb.examples.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Marcos Barbero
 */
public interface SecondaryRepository extends MongoRepository<SecondaryModel, String> {
}
