package com.example.bearcoffee.module.users.info;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class InformationMapper {
    private static InformationMapper INSTANCE;

    public static InformationMapper getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InformationMapper();
        }

        return INSTANCE;
    }

    public InformationMapper() {
    }

    public static InformationsDTO toDTO(InformationEntity info) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(info, InformationsDTO.class);
    }

    public static InformationEntity toEntity(InformationMapper infoDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(infoDTO, InformationEntity.class);
    }

    public static Page<InformationsDTO> toPageDTO(Page<InformationEntity> page) {
        return page.map(new Function<>() {
            @Override
            public InformationsDTO apply(InformationEntity entity) {
                return InformationMapper.toDTO(entity);
            }
        });
    }

    public static List<InformationsDTO> toListDTO(List<InformationEntity> entityList) {
        List<InformationsDTO> list = new ArrayList<>();
        for (InformationEntity e : entityList) {
            list.add(InformationMapper.toDTO(e));
        }
        return list;
    }
}
