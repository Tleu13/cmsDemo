package com.tleu.cms.domain.vo;

import com.tleu.cms.domain.models.Role;
import lombok.Data;

@Data
public class UserRequest {
    private String identity;
    private String name;
    private Role role;

}
