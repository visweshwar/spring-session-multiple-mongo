package org.springframework.session.mongodb.examples.repository.primary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Marcos Barbero
 */
public interface PrimaryRepository extends MongoRepository<PrimaryModel, String> {
}
