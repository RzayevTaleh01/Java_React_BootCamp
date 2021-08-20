package Lesson4_Task3;
public class PlayerManager implements PlayerService{
    @Override
    public void addPlayer(Player player) {
        System.out.println(player.getName()+" Adlı Oyunçu Əlavə Olundu");
    }

    @Override
    public void deletePlayer(Player player) {
        System.out.println(player.getName()+" Adlı Oyunçu Sistemdən Silindi");

    }

    @Override
    public void updatePlayer(Player player) {
        System.out.println(player.getName()+" Adlı Oyunçu Məlumatlarınız Yeniləndi");

    }
}
