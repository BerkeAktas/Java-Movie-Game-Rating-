import java.io.IOException;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Content> contentStack = Methods.createContentStack("contents.csv");
        Queue<MovieCritic> criticMovieQueue = Methods.createMovieCriticQueue();
        Queue<GameCritic> criticGameQueue = Methods.createGameCriticQueue();
        Methods.simulation(contentStack,criticMovieQueue,criticGameQueue);
    }
}
