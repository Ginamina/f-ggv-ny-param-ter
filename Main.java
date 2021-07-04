class Main{
  public static void main(String[] args) {
    printTomatoSoupRecipe("edami", "pogácsa");
  }

  public static void printTomatoSoupRecipe(String cheeseType, String sideDish) {
    System.out.println("Pirítsd meg olívaolajon a hagymát és fokhagymát.");
    System.out.println("Tedd hozzá a felkockázott paradicsomot, sózd és borsozd meg, majd öntsd fel 2 dl vízzel");
    System.out.println("Főzd kis lángon 15-20 percig.");
    System.out.println("Ha szétfőtt a paradicsom, add hozzá a száraz kenyeret, olívaolajat, bazsalikomot, és adj hozzá egy kis vizet.");
    System.out.println("Főzd még 5 percig.");
    System.out.println("Szórj rá reszelt " + cheeseType + "-t.");
    System.out.println("Szolgáld fel " + sideDish +  "-val/vel.");
  }
}