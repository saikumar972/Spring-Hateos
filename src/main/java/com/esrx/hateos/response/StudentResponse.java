package com.esrx.hateos.response;

//import com.esrx.hateos.hateoas.StudentHateoas;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentResponse extends RepresentationModel<StudentResponse> {
    private int id;
    private String name;
}
