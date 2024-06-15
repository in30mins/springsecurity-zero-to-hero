package com.in60mins.mapper;

import com.in60mins.dto.ManagerDTO;
import com.in60mins.model.Manager;

public class ManagerMapper {
    public static Manager mapToManager(ManagerDTO managerDTO){
        return new Manager(
                managerDTO.getId(),
                managerDTO.getName(),
                managerDTO.getEmail()
        );
    }
    public static ManagerDTO mapToManagerDTO(Manager manager){
        return new ManagerDTO(
                manager.getId(),
                manager.getName(),
                manager.getEmail()
        );
    }
}
