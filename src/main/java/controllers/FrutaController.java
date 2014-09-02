package controllers;

import ninja.Context;
import ninja.Result;
import ninja.Results;
import ninja.params.Param;

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

    public Result postAFruta(@Param("name") String name,
                             @Param("color") String color,
                             Context context){
        return Results.json().render("CHABON SE GUARDO");
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
