package com.wallet.dto.response;

import com.wallet.model.RoleType;

import lombok.Data;

/**
 * Data Transfer Object for Role response
 */
@Data
public class RoleResponse {

    private Long id;
    private RoleType type;
}
