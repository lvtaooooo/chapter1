package org.smart4j.chapter1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private long id;
    private String name;
    private String contact;
    private String telephone;
    private String email;
    private String remark;
}
