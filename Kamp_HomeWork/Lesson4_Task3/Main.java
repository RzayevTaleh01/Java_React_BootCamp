package Lesson4_Task3;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player(1,"Taleh","Rzayev",new Date(2002),"Azerbaijan");
        Player player2 = new Player(2,"Demo","Demo",new Date(2000),"Azerbaijn");

        Game game1 = new Game(1,"PUBG",2700,2003);
        Game game2 = new Game(2,"MineCraft",12700,2021);

        Company company1=new Company(1,"PUBG-de 10% Endirim",new Date(2020),new Date(2021),2700,10);
        Company company2=new Company(2,"PUBG-de 20% Endirim",new Date(2021),new Date(2022),3700,20);

        Game[] games = {game1,game2};
        for (Game game : games) {
            System.out.println("Movcud oyun : " + game.getName()+ "  qiymeti : "+ game.getPrice());
        }
        System.out.println("---------Oyun Əməliyyatlari-----------------");
        GameManager gameManager=new GameManager();
        gameManager.addGame(game1);
        gameManager.deleteGame(game2);
        gameManager.updateGame(game1);
        System.out.println("_________________________________________________");
        Player[] players={player1,player2};
        for (Player player:players){
            System.out.println("Adi "+player.getName());
            System.out.println("Soyad "+player.getLastname());
        }
        System.out.println("---------Oyuncu Əməliyyatlari-----------------");
        PlayerManager playerManager=new PlayerManager();
        playerManager.addPlayer(player1);
        playerManager.deletePlayer(player2);
        playerManager.updatePlayer(player1);

        System.out.println("_________________________________________________");
        Company[] companies={company1,company2};
        for (Company company:companies){
            System.out.println("Kompaniyanin Adi: "+company.getName());
            System.out.println("Kompaniyanin Bitme Tarixi: "+company.getDeadline());
            System.out.println("Kompaniyadakı Oyunun Son Qiyməti: "+company.getPriceAfterDiscount());
        }
        System.out.println("---------Kompaniya Əməliyyatlari-----------------");
        CompanyMeneger companyMeneger=new CompanyMeneger();
        companyMeneger.addCompany(company1);
        companyMeneger.deleteCompany(company2);
        companyMeneger.updateCompany(company1);

    }



}
