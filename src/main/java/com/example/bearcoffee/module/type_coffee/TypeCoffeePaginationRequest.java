package com.example.bearcoffee.module.type_coffee;

import java.util.ArrayList;
import java.util.List;

import com.example.bearcoffee.core.Filter;
import com.example.bearcoffee.core.PaginationRequest;
import com.example.bearcoffee.core.QueryOperator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TypeCoffeePaginationRequest extends PaginationRequest {
    private String searchName;
    private String searchStatus;

    public List<Filter> getFilters() {
        List<Filter> list = new ArrayList<>();
        if (searchName != null && !searchName.isEmpty()) {
            list.add(new Filter("name", QueryOperator.LIKE, searchName, null));
        }
        if (searchStatus != null && !searchStatus.isEmpty()) {
            list.add(new Filter("status", QueryOperator.EQUALS, searchStatus, null));
        }
        return list;
    }
}
