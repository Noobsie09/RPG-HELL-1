
public class Main {
    public static void main(String[] args) {

        System.out.println("*****RPG HELL (PART I)*****");

        System.out.println("-------------------------------------------");

        Spieler spieler = new Spieler("Rafael", "Barbar");

        String name = spieler.getName();
        String klasse = spieler.getKlasse();

        System.out.println("Dein Name ist " + name + " und deine Klasse ist " + klasse + ".");


        System.out.println("-------------------------------------------");


        System.out.println("Deine Starteigenschaften lauten wie folgt:");

        System.out.println("Level: " + spieler.getLevel());
        System.out.println("Lebensenergie: " + spieler.getLebensenergie());
        System.out.println("Zauberenergie: " + spieler.getZauberenergie());
        System.out.println("Angriff: " + spieler.getAngriff());
        System.out.println("Präzision: " + spieler.getPraezision());
        System.out.println("Vitalität: " + spieler.getVitalitaet());
        System.out.println("Verteidigung: " + spieler.getVerteidigung());
        System.out.println("Willenskraft: " + spieler.getWillenskraft());


        System.out.println("-------------------------------------------");


        System.out.println("LEVELANSTIEG!!!");

        //1. Angfriff; 2. Präzision; 3. Vitalität; 4. Verteidigung; 5. Willenskraft
        spieler.levelAnstieg(true, false, true, false, false);
        System.out.println("Wähle bis zu 2 Eigenschaften, die du jeweils um 1 erhöhern möchtest, wählst  du nur eine Eigenschaft, wird diese um 2 erhöht");

        System.out.println("Deine Lebens- und Zauberenergie wird zusätzlich um 5% erhöht und dein Level steigt um 1");
        System.out.println(" ");
        System.out.println("Deine neuen Eigenschaften sind also: ");

        double Lebensenergie2 = spieler.getLebensenergie();
        double Zauberenergie2 = spieler.getZauberenergie();
        int Angriff2 = spieler.getAngriff();
        int Praezision2 = spieler.getPraezision();
        int Vitalitaet2 = spieler.getVitalitaet();
        int Verteidigung2 = spieler.getVerteidigung();
        int Willenskraft2 = spieler.getWillenskraft();

        System.out.println("Lebensenergie: " + Lebensenergie2);
        System.out.println("Zauberenergie: " + Zauberenergie2);
        System.out.println("Angriff: " + Angriff2);
        System.out.println("Präzision: " + Praezision2);
        System.out.println("Vitalität: " + Vitalitaet2);
        System.out.println("Verteidigung: " + Verteidigung2);
        System.out.println("Willenskraft: " + Willenskraft2);


        System.out.println("-------------------------------------------");


        System.out.println("LEVELANSTIEG!!!");

        //1. Angfriff; 2. Präzision; 3. Vitalität; 4. Verteidigung; 5. Willenskraft
        spieler.levelAnstieg(true, true, false, false, false);
        System.out.println("Wähle bis zu 2 Eigenschaften, die du jeweils um 1 erhöhern möchtest, wählst  du nur eine Eigenschaft, wird diese um 2 erhöht");

        System.out.println("Deine Lebens- und Zauberenergie wird zusätzlich um 5% erhöht und dein Level steigt um 1");
        System.out.println(" ");
        System.out.println("Deine neuen Eigenschaften sind also: ");

        double Lebensenergie3 = spieler.getLebensenergie();
        double Zauberenergie3 = spieler.getZauberenergie();
        int Angriff3 = spieler.getAngriff();
        int Praezision3 = spieler.getPraezision();
        int Vitalitaet3 = spieler.getVitalitaet();
        int Verteidigung3 = spieler.getVerteidigung();
        int Willenskraft3 = spieler.getWillenskraft();

        System.out.println("Lebensenergie: " + Lebensenergie3);
        System.out.println("Zauberenergie: " + Zauberenergie3);
        System.out.println("Angriff: " + Angriff3);
        System.out.println("Präzision: " + Praezision3);
        System.out.println("Vitalität: " + Vitalitaet3);
        System.out.println("Verteidigung: " + Verteidigung3);
        System.out.println("Willenskraft: " + Willenskraft3);


        System.out.println("-------------------------------------------");


        System.out.println("LEVELANSTIEG!!!");

        //1. Angfriff; 2. Präzision; 3. Vitalität; 4. Verteidigung; 5. Willenskraft
        spieler.levelAnstieg(false, true, false, false, true);
        System.out.println("Wähle bis zu 2 Eigenschaften, die du jeweils um 1 erhöhern möchtest, wählst  du nur eine Eigenschaft, wird diese um 2 erhöht");

        System.out.println("Deine Lebens- und Zauberenergie wird zusätzlich um 5% erhöht und dein Level steigt um 1");
        System.out.println(" ");
        System.out.println("Deine neuen Eigenschaften sind also: ");

        double Lebensenergie4 = spieler.getLebensenergie();
        double Zauberenergie4 = spieler.getZauberenergie();
        int Angriff4 = spieler.getAngriff();
        int Praezision4 = spieler.getPraezision();
        int Vitalitaet4 = spieler.getVitalitaet();
        int Verteidigung4 = spieler.getVerteidigung();
        int Willenskraft4 = spieler.getWillenskraft();

        System.out.println("Lebensenergie: " + Lebensenergie4);
        System.out.println("Zauberenergie: " + Zauberenergie4);
        System.out.println("Angriff: " + Angriff4);
        System.out.println("Präzision: " + Praezision4);
        System.out.println("Vitalität: " + Vitalitaet4);
        System.out.println("Verteidigung: " + Verteidigung4);
        System.out.println("Willenskraft: " + Willenskraft4);


        System.out.println("-------------------------------------------");


        System.out.println("LEVELANSTIEG!!!");

        //1. Angfriff; 2. Präzision; 3. Vitalität; 4. Verteidigung; 5. Willenskraft
        spieler.levelAnstieg(false, false, true, false, true);
        System.out.println("Wähle bis zu 2 Eigenschaften, die du jeweils um 1 erhöhern möchtest, wählst  du nur eine Eigenschaft, wird diese um 2 erhöht");

        System.out.println("Deine Lebens- und Zauberenergie wird zusätzlich um 5% erhöht und dein Level steigt um 1");
        System.out.println(" ");
        System.out.println("Deine neuen Eigenschaften sind also: ");

        double Lebensenergie5 = spieler.getLebensenergie();
        double Zauberenergie5 = spieler.getZauberenergie();
        int Angriff5 = spieler.getAngriff();
        int Praezision5 = spieler.getPraezision();
        int Vitalitaet5 = spieler.getVitalitaet();
        int Verteidigung5 = spieler.getVerteidigung();
        int Willenskraft5 = spieler.getWillenskraft();

        System.out.println("Lebensenergie: " + Lebensenergie5);
        System.out.println("Zauberenergie: " + Zauberenergie5);
        System.out.println("Angriff: " + Angriff5);
        System.out.println("Präzision: " + Praezision5);
        System.out.println("Vitalität: " + Vitalitaet5);
        System.out.println("Verteidigung: " + Verteidigung5);
        System.out.println("Willenskraft: " + Willenskraft5);
    }
}
