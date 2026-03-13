package org.anandi.SWEN20003.workshops.workshop11.q3;

import java.util.Arrays;
import java.util.List;

public class Q3 {

    List<String> list = Arrays.asList("Avengers: End Game", "Game of Thrones", "Jon Snow", "Arya", "SWEN20003", "Suits");

    private void streamUsage() {
        long count = list.stream()
                .filter(IMDB::isTVShow) // same as name -> IMDB.isTVShow(name)
                .map(name -> IMDB.getShow(name)) // can also write as IMDB::getShow
                .filter(show -> show.getRatings() > 4.0)
                // filter method expects functional interface Predicate<T> with test(T t)
                // This is just like creating:
                // new Predicate<Show>() {
                //      @Override
                //      public boolean test(Show show) {
                //          return show.getRatings() > 4.0;
                //      }
                // map expects Function<T, R> with method: R apply(T t)

                /*
                new Function<String, Show> () {
                    @Override
                    Show apply(String name) {
                        return IMDB.getShow(String name);
                    }
                }
                 */
                .count();
    }

    private void forUsage() { // Step by step
        int count; // mutable variable
        for (String str : list) {
            if (IMDB.isTVShow(str)) {
                Show show = IMDB.getShow(str);  // intermediate results,
                                                // you have to manage this
                if (show.getRatings() > 4.0) count++; // state change
            }
        }
    }

}
