package apidocs.demo.apidocs.entity;

import lombok.Data;

@Data
public class ErrorResponse {
    private String error_code;
    private String error_message;

}
