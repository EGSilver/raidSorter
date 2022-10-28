import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.*;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
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

    public void excelOut() {
        int rowCount = 0;
        int columnCount = 0;
        XSSFWorkbook x = new XSSFWorkbook();
        XSSFSheet sheet = x.createSheet("Raid Roster");
        for (Roles a : playerlist) {
            Row row = sheet.createRow(rowCount++);
            for (Roles b : playerlist) {
                Cell cell = row.createCell(columnCount++);
                if (b instanceof Roles) {
                    cell.setCellValue((RichTextString) b);
                }
            }
        } try (FileOutputStream dave = new FileOutputStream("Dave.xlsx")){
            x.write(dave);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
        if (playerCounter < 10) {
            if (playerCounter < getRaid().getMax_raiders() && r.getType() == melee && meleeCounter < 7 && r.getPclass() == warriorClass && warrior < 2) {
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
