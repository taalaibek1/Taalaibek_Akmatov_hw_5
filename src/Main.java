public class Main {
    public static void main(String[] args) {
        Hero[] heroes =  createHerous();

        for(int i=0; i <heroes.length; i++ ){
            Hero hero= heroes[i];
            System.out.println("Hero: " + hero.getsuperAbility() + " || Health: " + hero.getHealth() + " || damage: " + hero.getDamage());
        }

        Hero firstHero = new Hero(100, 25, "hero 2");
        System.out.println("First Hero's Health: " + firstHero.getHealth() + " || damage: " + firstHero.getDamage() + " || Super ability: " + firstHero.getsuperAbility());

        Hero secondHero = new Hero(200, 35);
        System.out.println("Second Hero's Health: " + secondHero.getHealth() + " || damage: " + secondHero.getDamage());

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setTypeOfDefence("Physical");
        System.out.println("Boss' health:" + boss.getHealth() + " || damage: " + boss.getDamage() + " || defence: " + boss.getTypeOfDefence());

    }



    public static Hero[] createHerous (){
        Hero hero1 = new Hero(300, 50, "hero 1" );
        Hero hero2 = new Hero(100, 40, "hero 2");
        Hero hero3 = new Hero(200, 30, "hero 3");

        Hero [] heroes = new Hero [3];
        heroes[0] = hero1;
        heroes[1]=hero2;
        heroes[2]=hero3;

        return heroes;

    }
}

