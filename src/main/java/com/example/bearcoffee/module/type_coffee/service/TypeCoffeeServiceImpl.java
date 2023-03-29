package com.example.bearcoffee.module.type_coffee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bearcoffee.core.Filter;
import com.example.bearcoffee.exceptions.CustomException;
import com.example.bearcoffee.module.type_coffee.TypeCoffeeEntity;
import com.example.bearcoffee.module.type_coffee.TypeCoffeeRepository;
import com.example.bearcoffee.module.type_coffee.TypeCoffeeRequest;
import com.example.bearcoffee.module.type_coffee.TypeCoffeeSpecifications;

@Service
@Transactional(rollbackFor = Throwable.class)
public class TypeCoffeeServiceImpl implements TypeCoffeeService {

    @Autowired
    TypeCoffeeRepository typeCoffeeRepository;

    @Override
    public TypeCoffeeEntity insert(TypeCoffeeRequest request) throws CustomException {
        TypeCoffeeEntity categoryEntity = new TypeCoffeeEntity();
        categoryEntity.setData(request);
        categoryEntity = typeCoffeeRepository.save(categoryEntity);
        return categoryEntity;
    }

    @Override
    public TypeCoffeeEntity edit(Long id, TypeCoffeeRequest post) throws CustomException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'edit'");
    }

    @Override
    public TypeCoffeeEntity delete(Long id) throws CustomException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Page<TypeCoffeeEntity> paginate(int page, int limit, List<Filter> whereParams, Map<String, String> sortBy) {
        List<Sort.Order> orders = new ArrayList<>();
        for (String field : sortBy.keySet()) {
            orders.add(new Sort.Order(Sort.Direction.fromString(sortBy.get(field)), field));
        }
        Sort sort = orders.size() > 0 ? Sort.by(orders) : Sort.by("id").descending();
        PageRequest pageable = PageRequest.of(page, limit, sort);
        Specification<TypeCoffeeEntity> specification = TypeCoffeeSpecifications.getInstance()
                .getQueryResult(whereParams);
        return typeCoffeeRepository.findAll(specification, pageable);

    }

    @Override
    public TypeCoffeeEntity open(Long id) throws CustomException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'open'");
    }

    @Override
    public TypeCoffeeEntity close(Long id) throws CustomException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }

    @Override
    public List<TypeCoffeeEntity> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}
