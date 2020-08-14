package apidocs.demo.rest;

import apidocs.demo.apidocs.entity.ErrorResponse;
import apidocs.demo.apidocs.entity.Person;
import apidocs.demo.apidocs.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api("Person")
public class PersonController {

    private PersonService service;


    public PersonController(PersonService service) {
        this.service = service;
    }


    @ApiResponses(
            value = { @ApiResponse(
                        code = 201,
                        message = "Person Created Successfully",
                        response = Person.class
            ),
            @ApiResponse(
                    code = 401,
                    message = "Person Created Successfully",
                    response = ErrorResponse.class
            )
            }
    )
    @PostMapping("/person")
    public Person addPerson(@RequestBody Person person){
        return this.service.createPerson(person);
    }

    @GetMapping("/person")
    public List<Person> getAll(){
        return this.service.getAll();
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = Person.class)
    })
    @GetMapping("/person/{id}")
    public Person getById(@PathVariable int id){
        return this.service.getById(id);
    }
}
