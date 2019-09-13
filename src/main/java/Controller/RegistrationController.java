package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
@RestController
@RequestMapping(value="/registration", method = {RequestMethod.POST,RequestMethod.GET})
public class RegistrationController {

    @GetMapping(path = "/{batch}", produces = "application/json")
    public String register(@RequestParam(name = "firstName" ,required = false) String firstName,
                           @RequestParam(name = "middleName", required = false) String middleName,
                           @RequestParam(name = "lastName", required = false) String lastName,
                           @RequestParam(name = "gender", required = false) String gender,
                           @RequestParam(name = "DOB" , required = false) Date DOB,
                           @RequestParam(name = "address" , required =  false) String address,
                           @RequestParam( name = "contact" , required = false) String contact,
                           @PathVariable int batch) {

        return  "Registration service hit";
    }
/*
    @PostMapping(path = "/section", consumes = "application/json", produces = "application/json")
    public AssignResgistration register(@RequestBody AssignResgistration a1) {
        return a1;
    }
   */

}

