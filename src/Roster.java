import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Roster {
    private Raids raid;
    private ArrayList<Roles> playerlist = new ArrayList<>();
    private ArrayList<Roles> bench = new ArrayList<Roles>();
    private int meleeCounter = 0;
    private int healerCounter = 0;
    private int rangerCounter = 0;
    private int tankCounter = 0;
    private int playerCounter = 0;
    private int warrior, shaman, rogue, deathKnight, hunter, priest, druid, warlock, mage, paladin = 0;


    public Roster(Raids raid) {
        this.raid = raid;
    }

    public void addplayer10(Roles r) {
        String melee = "melee";
        String healer = "healer";
        String tank = "tank";
        String ranged = "ranged";
        String warriorClass = "Warrior";
        String shamanClass = "Shaman";
        String priestClass = "Priest";
        String paladinClass = "Paladin";
        String deathKnightClass = "Death Knight";
        if (playerCounter < 25) {
            if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 2 && r.getPclass() == warriorClass && warrior < 1) {
                this.playerlist.add(r);
                meleeCounter++;
                playerCounter++;
                warrior++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 2 && r.getPclass() == shamanClass && shaman < 2) {
                this.playerlist.add(r);
                meleeCounter++;
                playerCounter++;
                shaman++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == healer && healerCounter < 2 && r.getPclass() == priestClass && priest < 1) {
                healerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                priest++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == healer && healerCounter < 2 && r.getPclass() == shamanClass && shaman < 2) {
                healerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                shaman++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == tank && tankCounter < 2 && r.getPclass() == paladinClass && paladin < 1) {
                tankCounter++;
                this.playerlist.add(r);
                playerCounter++;
                paladin++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == ranged && rangerCounter < 4) {
                rangerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else {
                this.bench.add(r);
            }

            //System.out.println(playerCounter);
        }
    }

//    public void test1(Roles a1) {
//        String melee = "melee";
//        String healer = "healer";
//        String tank = "tank";
//        double tankCounter = 0;
//        double healerCounter = 0;
//        double meleeCounter = 0;
//        double playercounter = 0;
//        for (Roles r : playerlist) {
//            System.out.println(r.getName());
//            if (playercounter < 10) {
//                if (playercounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 1) {
//                    this.playerlist.add(r);
//                    meleeCounter++;
//                } else if (playercounter < getRaid().getMax_raiders() && r.getType() == healer && healerCounter < 1) {
//                    healerCounter++;
//                    this.playerlist.add(r);
//                } else if (playercounter < getRaid().getMax_raiders() && r.getType() == tank && tankCounter < 2) {
//                    tankCounter++;
//                    this.playerlist.add(r);
//                    playercounter++;
//                }
//
//            }   System.out.println(playercounter);
//        }
//    }


    public void addplayer25(Roles r) {
        Scanner userInput = new Scanner(System.in);
        String melee = "melee";
        String healer = "healer";
        String tank = "tank";
        String ranged = "ranged";
        String warriorClass = "Warrior";
        String shamanClass = "Shaman";
        String priestClass = "Priest";
        String paladinClass = "Paladin";
        String deathKnightClass = "Death Knight";
        String druidClass = "Druid";
        String rogueClass = "Rogue";
        String hunterClass = "Hunter";
        if (playerCounter < 25) {
            if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 7 && r.getPclass() == warriorClass && warrior < 2) {
                //System.out.println(getRaid());
                this.playerlist.add(r);
                meleeCounter++;
                playerCounter++;
                warrior++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 7 && r.getPclass() == shamanClass && shaman < 5) {
                this.playerlist.add(r);
                meleeCounter++;
                playerCounter++;
                shaman++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == healer && healerCounter < 5 && r.getPclass() == priestClass && priest < 2) {
                healerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                priest++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == healer && healerCounter < 5 && r.getPclass() == shamanClass && shaman < 2) {
                healerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                shaman++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == healer && healerCounter < 5 && r.getPclass() == druidClass && druid < 2) {
                healerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                druid++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == tank && tankCounter < 3 && r.getPclass() == paladinClass && paladin < 2) {
                tankCounter++;
                this.playerlist.add(r);
                playerCounter++;
                paladin++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 10 && r.getPclass() == paladinClass && paladin < 2) {
                meleeCounter++;
                this.playerlist.add(r);
                playerCounter++;
                paladin++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == healer && healerCounter < 5 && r.getPclass() == paladinClass && paladin < 2) {
                healerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                paladin++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == ranged && rangerCounter < 10) {
                rangerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 10 && r.getPclass() == druidClass && druid < 3) {
                meleeCounter++;
                this.playerlist.add(r);
                playerCounter++;
                druid++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == ranged && rangerCounter < 10 && r.getPclass() == druidClass && druid < 3) {
                rangerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                druid++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 10 && r.getPclass() == rogueClass && rogue < 2) {
                meleeCounter++;
                this.playerlist.add(r);
                playerCounter++;
                rogue++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == tank && tankCounter < 3 && r.getPclass() == deathKnightClass && deathKnight < 3) {
                tankCounter++;
                this.playerlist.add(r);
                playerCounter++;
                deathKnight++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 10 && r.getPclass() == deathKnightClass && deathKnight < 3) {
                meleeCounter++;
                this.playerlist.add(r);
                playerCounter++;
                deathKnight++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == ranged && rangerCounter < 10 && r.getPclass() == hunterClass && hunter < 3) {
                rangerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                hunter++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else
                this.bench.add(r);
            //System.out.println(playerCounter);
        }
    }

    public void checkBench() {
        for (Roles k : bench) {
            System.out.println(k.getName());
        }
    }

    public void add25() {
        String melee = "melee";
        String healer = "healer";
        String tank = "tank";
        String ranged = "ranged";
        String warriorClass = "Warrior";
        String shamanClass = "Shaman";
        String priestClass = "Priest";
        String paladinClass = "Paladin";
        String deathKnightClass = "Death Knight";
        String druidClass = "Druid";
        String rogueClass = "Rogue";
        String hunterClass = "Hunter";
        for (int i = 0; i < 2; i++) {
            String playerName = JOptionPane.showInputDialog("Enter Player name: ");
            if (playerName == "Ballongknut") {
                System.out.println(playerCounter + " " + playerName);
                //System.out.println(getRaid());
                //this.playerlist.add(r);
                meleeCounter++;
                playerCounter++;
                warrior++;
                System.out.println(playerCounter + " " + playerName);
            } else if (playerName == "Sonics" && playerCounter < 25 && playerCounter < getRaid().getMax_raiders() && meleeCounter < 7 && warrior < 2) {
                //System.out.println(getRaid());
                //this.playerlist.add(r);
                meleeCounter++;
                playerCounter++;
                warrior++;
                System.out.println(playerCounter + " " + playerName);
            } else if (playerName == "Dolmer" && playerCounter < getRaid().getMax_raiders() && tankCounter < 2 && paladin < 2) {
                tankCounter++;
                //this.playerlist.add(r);
                playerCounter++;
                paladin++;
                System.out.println(playerCounter + " " + playerName);
            }
        }
    }


    public void checkRoster() {
        for (Roles e : playerlist) ;
        System.out.println(getPlayerlist());
    }

    public Raids getRaid() {
        return raid;
    }

    public void setRaid(Raids raid) {
        this.raid = raid;
    }

    public ArrayList<Roles> getPlayerlist() {
        return playerlist;
    }

    public void setPlayerlist(ArrayList<Roles> playerlist) {
        this.playerlist = playerlist;
    }

    @Override
    public String toString() {
        return "Roster{" + "raid=" + raid + ", playerlist=" + playerlist + '}';
    }
}
