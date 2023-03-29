package com.example.bearcoffee.module.users;

import com.example.bearcoffee.core.Filter;
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
public class UserPaginationRequest {
    private String searchUsername;

    private Integer searchStatus;

    public List<Filter> getFilters() {
        List<Filter> list = new ArrayList<>();
        if (searchUsername != null && !searchUsername.isEmpty()) {
            list.add(new Filter("username", QueryOperator.LIKE, searchUsername, null));
        }
        if (searchStatus != null) {
            list.add(new Filter("status", QueryOperator.EQUALS, String.valueOf(searchStatus), null));
        }
        return list;
    }
}
