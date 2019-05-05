import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args){

        Forum theForumUser = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForumUser.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear()<1999)
                .filter(forumUser -> forumUser.getNumberOfPublishedPosts()>0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUserList -> forumUserList));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
