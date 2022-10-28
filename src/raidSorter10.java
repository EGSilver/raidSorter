import javax.swing.*;

public class raidSorter10 {
    public static void main(String[] args) {
        Raids r1 = new Raids("Naxxramas",10);
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
        //Roles a19 = new Roles("Gortha","Priest","Holy","healer");
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
        Roster raid10 = new Roster(r1);
        Roster raid25 = new Roster(r2);
        System.out.println(r1);
        int userPlayerCount = Integer.parseInt(JOptionPane.showInputDialog("Enter Player amount: "));
        for (int i = 0; i < userPlayerCount; i++) {
            String name = JOptionPane.showInputDialog("Enter Player name: ");
            if (a1.getName().equals(name)) {
                raid10.addplayer10(a1); //Ballongknut
            } else if (a2.getName().equals(name)) {
                raid10.addplayer10(a2); //Sonics
            } else if (a3.getName().equals(name)) {
                raid10.addplayer10(a3); //Dolmer
            } else if (a4.getName().equals(name)) {
                raid10.addplayer10(a4); //Lealuna
            } else if (a5.getName().equals(name)) {
                raid10.addplayer10(a5); //Plebtank
            } else if (a6.getName().equals(name)) {
                raid10.addplayer10(a6); //Sylive
            } else if (a7.getName().equals(name)) {
                raid10.addplayer10(a7); //Coké
            } else if (a8.getName().equals(name)) {
                raid10.addplayer10(a8); //Gortha
            } else if (a9.getName().equals(name)) {
                raid10.addplayer10(a9); //Shameal
            } else if (a10.getName().equals(name)) {
                raid10.addplayer10(a10); //Juan
            } else if (a11.getName().equals(name)) {
                raid10.addplayer10(a11); //Walker
            } else if (a12.getName().equals(name)) {
                raid10.addplayer10(a12); //Slizac
            } else if (a13.getName().equals(name)) {
                raid10.addplayer10(a13); //Alnico
            } else if (a14.getName().equals(name)) {
                raid10.addplayer10(a14); //Lilt
            } else if (a15.getName().equals(name)) {
                raid10.addplayer10(a15); //Teteh
            } else if (a16.getName().equals(name)) {
                raid10.addplayer10(a16); //Bonecaller
            } else if (a17.getName().equals(name)) {
                raid10.addplayer10(a17); //Armaga
            } else if (a18.getName().equals(name)) {
                raid10.addplayer10(a18); //Schmeal
                //} else if (a19.getName().equals(name)) {
                //    raid25.addplayer10(a19); //Gortha
            } else if (a20.getName().equals(name)) {
                raid10.addplayer10(a20); //Crazykami
            } else if (a21.getName().equals(name)) {
                raid10.addplayer10(a21); //Myre
            } else if (a22.getName().equals(name)) {
                raid10.addplayer10(a22); //Emaenriel
            } else if (a23.getName().equals(name)) {
                raid10.addplayer10(a23); //Malizzy
            } else if (a23.getName().equals(name)) {
                raid10.addplayer10(a23); //Malizzy
            } else if (a24.getName().equals(name)) {
                raid10.addplayer10(a24); //Skumle
            } else if (a25.getName().equals(name)) {
                raid10.addplayer10(a25); //Toxpat
            } else if (a26.getName().equals(name)) {
                raid10.addplayer10(a26); //Snelis
            } else if (a27.getName().equals(name)) {
                raid10.addplayer10(a27); //Noizz
            } else if (a28.getName().equals(name)) {
                raid10.addplayer10(a28); //Hidon
            } else if (a29.getName().equals(name)) {
                raid10.addplayer10(a29); //Justice
            } else if (a30.getName().equals(name)) {
                raid10.addplayer10(a30); //Dukun
            } else if (a31.getName().equals(name)) {
                raid10.addplayer10(a31); //Proudmane
            } else if (a32.getName().equals(name)) {
                raid10.addplayer10(a32); //Thaloc
            } else if (a33.getName().equals(name)) {
                raid10.addplayer10(a33); //Wolfscream
            } else if (a34.getName().equals(name)) {
                raid10.addplayer10(a34); //Chuchulingo
            } else if (a35.getName().equals(name)) {
                raid10.addplayer10(a35); //Mobba
            } else if (a36.getName().equals(name)) {
                raid10.addplayer10(a36); //Tusktusk
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("**Bench**");
        raid10.checkBench();

    }
}
