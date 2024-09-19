package Generator;

import models.Animal;

public class IdGenerate {
    public static Long person = 1L;
    public static Long animal = 1L;

    public static Long  personId (){
        return  person++;
    }
    public static Long  animalId (){
        return  animal++;
    }

}
