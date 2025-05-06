public class Player{
 static int totalPlayers=0;
String playerName;
public Player(String  name){
playerName=name;
totalPlayers++;
}
public static void main(String[] args){
Player p1= new Player("Alice");
Player p2=new Player("Bob");
System.out.println("Total Players:"+Player.totalPlayers);
}
}