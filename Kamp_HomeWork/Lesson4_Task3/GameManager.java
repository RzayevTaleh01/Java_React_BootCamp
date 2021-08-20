package Lesson4_Task3;

public class GameManager implements GameService{
    @Override
    public void addGame(Game game) {
        System.out.println(game.getName()+" Oyunu Əlavə Olundu!");
    }

    @Override
    public void deleteGame(Game game) {
        System.out.println(game.getName()+" Oyunu Silindi!");
    }

    @Override
    public void updateGame(Game game) {
        System.out.println(game.getName()+" Oyunu Yeniləndi!");
    }
}
