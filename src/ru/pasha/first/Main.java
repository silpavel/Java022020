package ru.pasha.first;
import java.util.*;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Seasons[] seasons=Seasons.values();
        iLike(seasons);
    }
    static void iLike(Seasons[] seasons){
        for (Seasons v:seasons) {
            out.printf("season= %s, avgtemp= %d, description: %s\n",
                    v, v.getTemperature(), v.description());
        }
    }
}
