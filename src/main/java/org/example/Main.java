package org.example;
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(60);
        boss.setHealth(1000);
        Weapon weaponBoss = new Weapon();
        weaponBoss.setWeaponName("Katana");
        weaponBoss.setWeaponType(WeaponType.SWORD);
        boss.setWeapon(weaponBoss);

        Skeleton firstSkeleton = new Skeleton();
        firstSkeleton.setArrows(20);
        firstSkeleton.setDamage(30);
        firstSkeleton.setHealth(900);
        Weapon weaponSkeleton = new Weapon();
        weaponSkeleton.setWeaponType(WeaponType.BOW);
        weaponSkeleton.setWeaponName("Big bow");
        firstSkeleton.setWeapon(weaponSkeleton);

        Skeleton secondSkeleton = new Skeleton();
        secondSkeleton.setArrows(20);
        secondSkeleton.setDamage(30);
        secondSkeleton.setHealth(900);
        Weapon weaponSkeleton1 = new Weapon();
        weaponSkeleton1.setWeaponType(WeaponType.BOW);
        weaponSkeleton1.setWeaponName("Critical bow");
        secondSkeleton.setWeapon(weaponSkeleton1);

        boss.printInfo();
        firstSkeleton.printInfo();
        secondSkeleton.printInfo();
    }
}