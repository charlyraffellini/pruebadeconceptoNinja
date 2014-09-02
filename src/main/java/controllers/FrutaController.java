package controllers;

import ninja.Result;
import ninja.Results;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charly on 9/2/14.
 */
public class FrutaController {

    public Result getAllFrutas(){

        List<FrutaDto> frutas = new ArrayList<FrutaDto>();
        frutas.add(new FrutaDto("banana", "yelow"));
        frutas.add(new FrutaDto("apple", "red"));
        return Results.json().render(frutas);
    }
}


class FrutaDto {

    public String name;
    public String color;

    public FrutaDto(String name, String color){
        this.name = name;
        this.color = color;
    }
}
