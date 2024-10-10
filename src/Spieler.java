public class Spieler {
    private String name;
    private String klasse;
    private int level;
    private int angriff;
    private int praezision;
    private int vitalitaet;
    private int verteidigung;
    private int willenskraft;
    private double lebensenergie;
    private double zauberenergie;
    private double maxLebensenergie;
    private double maxZauberenergie;

    public Spieler(String name, String klasse)
    {
        this.name = name;
        this.klasse = klasse;
        this.level = 1;
        this.maxLebensenergie = 10;
        this.maxZauberenergie = 10;
        this.lebensenergie = maxLebensenergie;
        this.zauberenergie = maxZauberenergie;
        setStarteigenschaften(klasse);
    }

    //setter-Methode zum Starteigenschaften je nach Klasse zu setzen
    private void setStarteigenschaften(String klasse)
    {
        if ("Barbar".equals(klasse)) {
            angriff = 5;
            praezision = 3;
            vitalitaet = 2;
            verteidigung = 2;
            willenskraft = 5;
            System.out.println("    ,   /|\n" +
                                "   //|  | |\n" +
                                "  // |  | |\n" +
                                " //  |  | |\n" +
                                "/____|__|_|\n" +
                                "   (o o)\n" +
                                "   /|_|\\");
        } else if ("Dämonenjäger".equals(klasse)) {
            angriff = 4;
            praezision = 3;
            vitalitaet = 2;
            verteidigung = 2;
            willenskraft = 5;
            System.out.println("      /\\\n" +
                                "     /__\\\n" +
                                "    |    |\n" +
                                "    | || |\n" +
                                "    | || |\n" +
                                "    |____|");
        } else if ("Mönch".equals(klasse)) {
            angriff = 3;
            praezision = 4;
            vitalitaet = 3;
            verteidigung = 5;
            willenskraft = 5;
            System.out.println("     O\n" +
                                "    /|\\\n" +
                                "    / \\\n" +
                                "   /   \\");
        } else if ("Hexendoktor".equals(klasse)) {
            angriff = 5;
            praezision = 3;
            vitalitaet = 2;
            verteidigung = 1;
            willenskraft = 5;
            System.out.println("    .-.\n" +
                                "   (o o)\n" +
                                "   | O |\n" +
                                "   '---'\n");
        } else if ("Zauberer".equals(klasse)) {
            angriff = 4;
            praezision = 4;
            vitalitaet = 2;
            verteidigung = 2;
            willenskraft = 5;
            System.out.println("       /\\\n" +
                                "      /__\\\n" +
                                "     |    |\n" +
                                "     | || |\n" +
                                "     | || |\n" +
                                "     |____|\n" +
                                "       ||");
        } else {
            System.out.println("Ungültige Klasse! Deine jetzige Klasse ist Barbar!");
            klasse = "Barbar";
            angriff = 5;
            praezision = 3;
            vitalitaet = 2;
            verteidigung = 2;
            willenskraft = 5;

        }
    }

    //Lebensenergie wird mit angegebenen Wert erhöht aber wird geprüft, dass es nicht über die maximale Lebensenergie hinausschreitet
    public void erhoehenLebensenergie(double wert)
    {
        lebensenergie = Math.min(lebensenergie + wert, maxLebensenergie);
    }

    //Zauberenergie wird mit angegebenen Wert erhöht aber wird geprüft, dass es nicht über die maximale Zauberenergie hinausschreitet
    public void erhoehenZauberenergie(double wert)
    {
        zauberenergie = Math.min(zauberenergie + wert, maxZauberenergie);
    }

    //erhöht Angriff, geht aber nicht über 100 Punkte
    public void erhoehenAngriff()
    {
        if (angriff < 100)
        {
            angriff = angriff + 1;
        }
    }

    //erhöht Präzision, geht aber nicht über 100 Punkte
    public void erhoehenPraezision()
    {
        if (praezision < 100)
        {
            praezision = praezision + 1;
        }
    }

    //erhöht Vitalität, geht aber nicht über 100 Punkte
    public void erhoehenVitalitaet()
    {
        if (vitalitaet < 100)
        {
            vitalitaet = vitalitaet + 1;
        }
    }

    //erhöht Verteidigung, geht aber nicht über 100 Punkte
    public void erhoehenVerteidigung()
    {
        if (verteidigung < 100)
        {
            verteidigung = verteidigung + 1;
        }
    }

    //erhöht Willenskraft, geht aber nicht über 100 Punkte
    public void erhoehenWillenskraft()
    {
        if (willenskraft < 100)
        {
            willenskraft = willenskraft + 1;
        }
    }

    public void levelAnstieg(boolean angriffWahl, boolean praezisionWahl, boolean vitalitaetWahl, boolean verteidigungWahl, boolean willenskraftWahl)
    {
        //Zählen von den gewählten Eigenschaften
        int anzahlWahlen = 0;

        if (angriffWahl) {
            anzahlWahlen++;
        }
        if (praezisionWahl) {
            anzahlWahlen++;
        }
        if (vitalitaetWahl) {
            anzahlWahlen++;
        }
        if (vitalitaetWahl) {
            anzahlWahlen++;
        }
        if (willenskraftWahl) {
            anzahlWahlen++;
        }

        //Level erhöhen, falls Level + 1 höher als 40, dann wird automatisch Level auf 40 gesetzt
        level = Math.min(level + 1, 40);

        //Überprüfen der Anzahl der gewählten Eigenschaften
        if (anzahlWahlen < 1 || anzahlWahlen > 2) {
            System.out.println("Levelanstieg nicht möglich. Bitte wähle genau 1 oder 2 Eigenschaften.");
        }



        //Eigenschaften erhöhen
        //falls anzahlWahlen = 1 dann wird eine Eigenschaft um 2 erhöht, es sei denn, das Level ist über 100
        else if (anzahlWahlen == 1)
        {
            if (angriffWahl)
            {
                angriff = Math.min(angriff + 2, 100);
            }
            if (praezisionWahl)
            {
                praezision = Math.min(praezision + 2, 100);
            }
            if (vitalitaetWahl)
            {
                vitalitaet = Math.min(vitalitaet + 2, 100);
            }
            if (verteidigungWahl)
            {
                verteidigung = Math.min(verteidigung + 2, 100);
            }
            if (willenskraftWahl)
            {
                willenskraft = Math.min(willenskraft + 2, 100);
            }
        }

        //falls nicht nur eine gewählt wird, dann werden je nach gewählter Eigenschaft die Punkte verteilt
        else {
            if (angriffWahl)
            {
                angriff = Math.min(angriff + 1, 100);
            }
            if (praezisionWahl)
            {
                praezision = Math.min(praezision + 1, 100);
            }
            if (vitalitaetWahl)
            {
                vitalitaet = Math.min(vitalitaet + 1, 100);
            }
            if (verteidigungWahl)
            {
                verteidigung = Math.min(verteidigung + 1, 100);
            }
            if (willenskraftWahl)
            {
                willenskraft = Math.min(willenskraft + 1, 100);
            }
        }

        //Energie erhöhen
        maxLebensenergie *= 1.05;
        maxZauberenergie *= 1.05;
        lebensenergie = maxLebensenergie;
        zauberenergie = maxZauberenergie;

        System.out.println("Neues Level: " + level);
    }

    //alle Getter-Methoden zu den Attributen
    public String getName()
    {
        return name;
    }
    public String getKlasse()
    {
        return klasse;
    }
    public int getLevel()
    {
        return level;
    }
    public int getAngriff()
    {
        return angriff;
    }
    public int getPraezision()
    {
        return praezision;
    }
    public int getVitalitaet()
    {
        return vitalitaet;
    }
    public int getVerteidigung()
    {
        return verteidigung;
    }
    public int getWillenskraft()
    {
        return willenskraft;
    }
    public double getLebensenergie()
    {
        return lebensenergie;
    }
    public double getZauberenergie()
    {
        return zauberenergie;
    }
    public double getMaxLebensenergie()
    {
        return maxLebensenergie;
    }
    public double getMaxZauberenergie()
    {
        return maxZauberenergie;
    }

}