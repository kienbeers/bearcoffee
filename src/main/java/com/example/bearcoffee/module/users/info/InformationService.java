package com.example.bearcoffee.module.users.info;

import com.example.bearcoffee.core.Filter;
import com.example.bearcoffee.exceptions.CustomException;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface InformationService {
    InformationEntity save(InformationsRequest post) throws CustomException;

    InformationEntity edit(Long id, InformationsRequest post) throws CustomException;

    InformationEntity delete(Long id) throws CustomException;

    Page<InformationEntity> paginate(int page, int limit, List<Filter> whereParams, Map<String, String> sortBy);

    InformationEntity getById(Long id) throws CustomException;
}
