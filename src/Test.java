import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Raids r1 = new Raids("Naxxramas",25);
        Raids r2 = new Raids("Naxxramas",25);
        Roles a1 = new Roles("Ballongknut","Warrior","Fury","melee");
        Roles a2 = new Roles("Sonics","Warrior","Fury","melee");
        Roles a3 = new Roles("Dolmer","Paladin","Protection","tank");
        Roles a4 = new Roles("Lealuna","Paladin","Protection","tank");
        Roles a5 = new Roles("Plebtank","Paladin","Protection","tank");
        Roles a6 = new Roles("Sylive","Death Knight","Blood","tank");
        Roles a7 = new Roles("Coké","Death Knight","Frost","melee");
        Roles a8 = new Roles("Gortha","Priest","Discipline","healer");
        Roles a9 = new Roles("Shameal","Shaman","Restoration","healer");
        Roles a10 = new Roles("Juan","Druid","Feral","melee");
        Roles a11 = new Roles("Walker","Death Knight","Blood","melee");
        Roles a12 = new Roles("Slizac","Shaman","Enhancement","melee");
        Roles a13 = new Roles("Alnico","Shaman","Elemental","ranged");
        Roles a14 = new Roles("Lilt","Rogue","Assasination","melee");
        Roles a15 = new Roles("Teteh","Hunter","Beast Master","ranged");
        Roles a16 = new Roles("Bonecaller","Warlock","Destruction","ranged");
        Roles a17 = new Roles("Armaga","Mage","Fire","ranged");
        Roles a18 = new Roles("Schmeal","Shaman","Restoration","healer");
        Roles a19 = new Roles("Gortha","Priest","Holy","healer");
        Roles a20 = new Roles("Crazykami","Rogue","Combat","melee");
        Roles a21 = new Roles("Myre","Druid","Feral","melee");
        Roles a22 = new Roles("Emaenriel","Warlock","Affliction","ranged");
        Roles a23 = new Roles("Malizzy","Warlock","Affliction","ranged");
        Roles a24 = new Roles("Skumle","Shaman","Restoration","healer");
        Roles a25 = new Roles("Toxpat","Hunter","Beast Master","ranged");
        Roles a26 = new Roles("Snelis","Druid","Restoration","healer");
        Roles a27 = new Roles("Noizz","Druid","Balance","ranged");
        Roles a28 = new Roles("Hidon","Warlock","Affliction","ranged");
        Roles a29 = new Roles("Justice","Death Knight","Blood","melee");
        Roles a30 = new Roles("Dukun","Shaman","Restoration","Healer");
        Roles a31 = new Roles("Proudmane","Shaman","Enchancement","melee");
        Roles a32 = new Roles("Thaloc","Warlock","Destruction","ranged");
        Roles a33 = new Roles("Wolfscream","Shaman","Enchancement","melee");
        Roles a34 = new Roles("Chuchulingo","Shaman","Restoration","healer");
        Roles a35 = new Roles("Mobba","Hunter","Beast Master","ranged");
        Roles a36 = new Roles("Tusktusk","Rogue","Combat","melee");
        //Classes c1 = new Classes("Warrior");
        //Classes c2 = new Classes("Paladin");
        Roster raid10 = new Roster(r1);
        Roster raid25 = new Roster(r2);
        //raid25.add25();
        raid25.checkRoster();
        //raid10.addplayer25(JOptionPane.showInputDialog());
/*      raid10.addplayer10(a1); //Ballong
        raid10.addplayer10(a2); //Sonics
        raid10.addplayer10(a3); //Dolmer
        raid10.addplayer10(a4); //Lealuna
        raid10.addplayer10(a5); //Plebtank
        raid10.addplayer10(a6); //Sylive
        raid10.addplayer10(a7); //Coké
        raid10.addplayer10(a8); //Gortha
        raid10.addplayer10(a9); //Shameal
        raid10.addplayer10(a10); //Juan
        raid10.addplayer10(a11); //Walker
        raid10.addplayer10(a12); //Slizac
        raid10.addplayer10(a13); //Alnico
        raid10.addplayer10(a14); //Lilt
        raid10.addplayer10(a15); //Teteh
        raid10.addplayer10(a16); //Bonecaller
        raid10.addplayer10(a17); //Armaga
        raid10.addplayer10(a18); //Schmeal
        raid10.addplayer10(a19); //Gortha
        raid10.addplayer10(a20); //Crazykami
        raid10.addplayer10(a21); //Myre
        raid10.addplayer10(a22); //Emaenriel
        raid10.addplayer10(a23); //Malizzy
        raid10.addplayer10(a24); //Skumle
        raid10.addplayer10(a25); //Toxpat
        raid10.addplayer10(a26); //Snelis
        raid10.addplayer10(a27); //Noizz
        raid10.addplayer10(a28); //Hidon
        raid10.addplayer10(a29); //Justice
        raid10.addplayer10(a30); //Dukun
        raid10.addplayer10(a31); //Proudmane
        raid10.addplayer10(a32); //Thaloc
        raid10.addplayer10(a33); //Wolfscream
        raid10.addplayer10(a34); //Chuchulingo
        raid10.addplayer10(a35); //Mobba
        raid10.addplayer10(a36); //Tusktusk
        */
        raid25.addplayer25(a1); //Ballong
        raid25.addplayer25(a3); //Dolmer
        raid25.addplayer25(a13); //Alnico
        raid25.addplayer25(a17); //Armaga
        raid25.addplayer25(a9); //Shameal
        raid25.addplayer25(a19); //Gortha
        raid25.addplayer25(a20); //Crazykami
        raid25.addplayer25(a21); //Myre
        raid25.addplayer25(a22); //Emaenriel
        raid25.addplayer25(a6); //Sylive
        raid25.addplayer25(a23); //Malizzy
        raid25.addplayer25(a2); //Sonics
        raid25.addplayer25(a24); //Skumle
        raid25.addplayer25(a25); //Toxpat
        raid25.addplayer25(a15); //Teteh
        raid25.addplayer25(a11); //Walker
        raid25.addplayer25(a5); //Plebtank
        raid25.addplayer25(a27); //Noizz
        raid25.addplayer25(a28); //Hidon
        raid25.addplayer25(a29); //Justice
        raid25.addplayer25(a30); //Dukun
        raid25.addplayer25(a31); //Proudmane
        raid25.addplayer25(a14); //Lilt
        raid25.addplayer25(a32); //Thaloc
        raid25.addplayer25(a33); //Wolfscream
        raid25.addplayer25(a34); //Chuchulingo
        raid25.addplayer25(a7); //Coké
        raid25.addplayer25(a35); //Mobba
        raid25.addplayer25(a36); //Tusktusk
        //System.out.println(r2);
        //System.out.println(raid10);
        //System.out.println(r2);
        //System.out.println(raid25);
        //raid10.checkRoster();
        System.out.println(raid25);
        //raid25.checkRoster();
        //System.out.println(r2);
        raid25.checkBench();
    }
}
