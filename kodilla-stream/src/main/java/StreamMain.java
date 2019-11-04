import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args){

        LocalDate dateNow = LocalDate.now();
        Forum theForumUser = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForumUser.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), dateNow).getYears()>20)
                .filter(forumUser -> forumUser.getNumberOfPublishedPosts()>0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUserList -> forumUserList));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


        System.out.println(LocalDate.now());

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("This is first test to beautify", (text)->"ABC "+text+" ABC");
        poemBeautifier.beautify("This is second test to beautify", (text)-> text.toUpperCase());
        poemBeautifier.beautify("This is third test to beautify", (text)-> text.substring(8));
        poemBeautifier.beautify("This is fourth test to beautify", (text)-> text.substring(8,15));


    }
}
