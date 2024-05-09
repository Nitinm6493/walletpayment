package com.wallet.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.wallet.model.Type;
import com.wallet.repository.TypeRepository;

/**
 * Service used for Type related operations
 */
@Slf4j(topic = "TypeService")
@Service
@RequiredArgsConstructor
public class TypeService {

    private final TypeRepository typeRepository;

    /**
     * Fetches a single type reference (entity) by the given id
     */
    public Type getReferenceById(long id) {
        return typeRepository.getReferenceById(id);
    }
}
