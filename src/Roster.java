

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


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
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
    public static final String RESET = "\033[0m";  // Text Reset
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
        String druidClass = "Druid";
        String rogueClass = "Rogue";
        String hunterClass = "Hunter";
        String mageClass = "Mage";
        String warlockClass = "Warlock";
        if (playerCounter < 10) {
            if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 3 && r.getPclass() == warriorClass && warrior < 3) {
                this.playerlist.add(r);
                meleeCounter++;
                playerCounter++;
                warrior++;
                System.out.println(playerCounter + " " + WHITE + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == tank && tankCounter < 2 && r.getPclass() == warriorClass && warrior < 2) {
                tankCounter++;
                this.playerlist.add(r);
                playerCounter++;
                warrior++;
                System.out.println(playerCounter + " " + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 3 && r.getPclass() == shamanClass && shaman < 2) {
                this.playerlist.add(r);
                meleeCounter++;
                playerCounter++;
                shaman++;
                System.out.println(playerCounter + " " + BLUE + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == healer && healerCounter < 2 && r.getPclass() == priestClass && priest < 2) {
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
                System.out.println(playerCounter + " " + BLUE + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == healer && healerCounter < 2 && r.getPclass() == druidClass && druid < 2) {
                healerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                druid++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == tank && tankCounter < 2 && r.getPclass() == paladinClass && paladin < 2) {
                tankCounter++;
                this.playerlist.add(r);
                playerCounter++;
                paladin++;
                System.out.println(playerCounter + " " + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 3 && r.getPclass() == paladinClass && paladin < 2) {
                meleeCounter++;
                this.playerlist.add(r);
                playerCounter++;
                paladin++;
                System.out.println(playerCounter + " " + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == healer && healerCounter < 2 && r.getPclass() == paladinClass && paladin < 2) {
                healerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                paladin++;
                System.out.println(playerCounter + " " + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == ranged && rangerCounter < 3 && r.getPclass() == mageClass && mage < 2) {
                rangerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                System.out.println(playerCounter + " " + CYAN + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 3 && r.getPclass() == druidClass && druid < 2) {
                meleeCounter++;
                this.playerlist.add(r);
                playerCounter++;
                druid++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == ranged && rangerCounter < 3 && r.getPclass() == druidClass && druid < 2) {
                rangerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                druid++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 3 && r.getPclass() == rogueClass && rogue < 2) {
                meleeCounter++;
                this.playerlist.add(r);
                playerCounter++;
                rogue++;
                System.out.println(playerCounter + " " + YELLOW + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == tank && tankCounter < 3 && r.getPclass() == deathKnightClass && deathKnight < 3) {
                tankCounter++;
                this.playerlist.add(r);
                playerCounter++;
                deathKnight++;
                System.out.println(playerCounter + " " + RED + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == ranged && rangerCounter < 3 && r.getPclass() == warlockClass && warlock < 2) {
                rangerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                warlock++;
                System.out.println(playerCounter + " " + PURPLE + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 3 && r.getPclass() == deathKnightClass && deathKnight < 3) {
                meleeCounter++;
                this.playerlist.add(r);
                playerCounter++;
                deathKnight++;
                System.out.println(playerCounter + " " + RED + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == ranged && rangerCounter < 3 && r.getPclass() == hunterClass && hunter < 2) {
                rangerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                hunter++;
                System.out.println(playerCounter + " " + GREEN + r.getName() + " " + RESET + r.getType());
            } else
                this.bench.add(r);

            //System.out.println(playerCounter);
        }
//        FileOutputStream fileOut = new FileOutputStream("Roster10");
//        workbook.write(fileOut);
//        fileOut.close();
//        workbook.close();
//        System.out.println("Excel OK!");

    }

    public void addplayer25(Roles r) {
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
        String mageClass = "Mage";
        String warlockClass = "Warlock";
        if (playerCounter < 25) {
            if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 10 && r.getPclass() == warriorClass && warrior < 2) {
                //System.out.println(getRaid());
                this.playerlist.add(r);
                meleeCounter++;
                playerCounter++;
                warrior++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == tank && tankCounter < 2 && r.getPclass() == warriorClass && warrior < 2) {
                tankCounter++;
                this.playerlist.add(r);
                playerCounter++;
                warrior++;
                System.out.println(playerCounter + " " + r.getName() + " " + RESET + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 10 && r.getPclass() == shamanClass && shaman < 5) {
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
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == ranged && rangerCounter < 10 && r.getPclass() == mageClass && mage < 3) {
                rangerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                System.out.println(playerCounter + " " + BLUE + r.getName() + " " + RESET + r.getType());
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
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == tank && tankCounter < 3 && r.getPclass() == deathKnightClass && deathKnight < 5) {
                tankCounter++;
                this.playerlist.add(r);
                playerCounter++;
                deathKnight++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 10 && r.getPclass() == deathKnightClass && deathKnight < 5) {
                meleeCounter++;
                this.playerlist.add(r);
                playerCounter++;
                deathKnight++;
                System.out.println(playerCounter + " " + r.getName() + " " + r.getType());
            } else if (playerCounter < getRaid().getMax_raiders() && r.getType() == ranged && rangerCounter < 10 && r.getPclass() == warlockClass && warlock < 4) {
                rangerCounter++;
                this.playerlist.add(r);
                playerCounter++;
                hunter++;
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

    public void excelOut() throws IOException {
        int counter = 0;
        int benchCounter = 0;
        FileWriter wr = new FileWriter("C:\\Users\\Roster.csv");
        PrintWriter out = new PrintWriter(wr);
        //for (int i = 0; i < playerlist.size(); i++) {
        for (Roles k : playerlist) {
            counter++;
            wr.append(counter + " " + k.getName() + " " + k.getType());
            wr.append("\n");

        }
        wr.append("\n");
        wr.append("\n");
        wr.append("**Bench**");
        for (Roles e : bench) {
            benchCounter++;
            wr.append("\n");
            wr.append(benchCounter + " " +e.getName());
        }
        out.flush();
        out.close();
        wr.close();
    }

    public void checkBench() {
        for (Roles k : bench) {
            System.out.println(k.getName());
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
