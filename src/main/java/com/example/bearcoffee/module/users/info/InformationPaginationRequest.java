package com.example.bearcoffee.module.users.info;

import com.example.bearcoffee.core.Filter;
import com.example.bearcoffee.core.PaginationRequest;
import com.example.bearcoffee.core.QueryOperator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InformationPaginationRequest extends PaginationRequest {
    private String searchName;
    public List<Filter> getFilters() {
        List<Filter> list = new ArrayList<>();
        if (searchName != null && !searchName.isEmpty()) {
            list.add(new Filter("name", QueryOperator.LIKE, searchName, null));
        }
        return list;
    }
}
