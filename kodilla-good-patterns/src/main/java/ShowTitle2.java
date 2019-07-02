import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.stream.Collectors;

public class ShowTitle2 {

        public static void main(String[] args) {

            MovieStore movieStore  = new MovieStore();
            movieStore.getMovies().entrySet().stream()
                    .map(entry->entry.getValue())
                   .forEach(s-> System.out.print(String.join("!",s)));

        }

}


