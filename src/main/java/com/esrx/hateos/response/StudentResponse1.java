package com.esrx.hateos.response;

import com.esrx.hateos.hateoas.StudentHateoas;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // Optional: Exclude null fields
public class StudentResponse1 extends StudentHateoas {
    private int id;
    private String name;
}
