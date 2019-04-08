package edu.xavier.csci.katherinegemperline;


import edu.xavier.csci.RomanNumeralConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CustomerController {
    RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

    @GetMapping("/decode/{id}")

    public ResponseSingleDecode encode(@PathVariable("id") String num) {
        ResponseSingleDecode response = new ResponseSingleDecode();

        response.setNumber(romanNumeralConverter.decode(num));

        return response;
    }


    @GetMapping("/encode/{id}")
    public ResponseSingleEncode decode(@PathVariable("id") int numb) {
        ResponseSingleEncode response = new ResponseSingleEncode();

        response.setNumber(romanNumeralConverter.encode(numb));

        return response;
    }

   @PostMapping("/decode")
    public ResponseMultipleDecode encode(){//what are the parameters
       ResponseSingleDecode response = new ResponseSingleDecode();

       response.setNumber(romanNumeralConverter.decode(num));

       return response;
   }
}



