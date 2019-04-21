package com.example.recycleview;

import java.util.ArrayList;

public class HeroData {
    public static String[][] data = new String[][]{
            {"Layla", "Malefic Gunner", "https://i.pinimg.com/originals/cf/83/ed/cf83edaef65181e7c60a381edeb97caa.jpg"},
            {"Zilong", "Son of The Dragon", "https://mlwallpaper.com/wp-content/uploads/2018/01/Zilong-Eastern-Warrior-Heroes-Fighter-Assassin-of-Skins-Starlight-V1.jpg"},
            {"Miya", "Moonlight Archer", "https://i.pinimg.com/736x/3c/a0/79/3ca079f5a577aaf81cf110933f968d1c.jpg"},
            {"Eudora", "Lightning Sorceress", "https://i.pinimg.com/originals/4a/5e/00/4a5e00d9eb1aea2a6e50db41fea9da51.jpg"},
            {"Alucard", "Demon Hunter", "https://i.pinimg.com/736x/57/36/0a/57360ab2a3b056b4e9cad5a7647a0efa.jpg"},
            {"Balmond", "Berseker", "https://vignette.wikia.nocookie.net/mobile-legends/images/b/b8/Berserker_Rework.jpg/revision/latest?cb=20181220053607"},
            {"Tigreal", "Warrior of Dawn", "https://2.bp.blogspot.com/-E9WGOfddKSY/Wy1gHw2OtkI/AAAAAAAAFyE/ATkBMRqeCz0IyMAOvHJs-JQJ3u5e3ktiQCLcBGAs/s1600/Tigreal%2BWarrior%2Bof%2BDawn%2BWallpapers.jpg"}
    };

    public static ArrayList<Hero> getListData(){
        Hero hero = null;
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            hero = new Hero();
            hero.setName(aData[0]);
            hero.setRemarks(aData[1]);
            hero.setPhoto(aData[2]);

            list.add(hero);
        }

        return list;
    }
}

