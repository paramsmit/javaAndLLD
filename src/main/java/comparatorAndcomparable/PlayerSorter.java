package comparatorAndcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerSorter {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

//        System.out.println("Before Sorting : " + footballTeam);
//        Collections.sort(footballTeam);
//        System.out.println("After Sorting : " + footballTeam);

//        System.out.println("Before Sorting : " + footballTeam);
//        PlayerRankingComparator playerComparator = new PlayerRankingComparator();
//        Collections.sort(footballTeam, playerComparator);
//        System.out.println("After Sorting : " + footballTeam);

        Comparator<Player> byRanking =
                (Player p1, Player p2) -> Integer.compare(player1.getRanking(), player2.getRanking());

        Comparator<Player> byRanking1 = Comparator
                .comparing(Player::getRanking);

        Comparator<Player> byAge1 = Comparator
                .comparing(Player::getAge);
    }
}
