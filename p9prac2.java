class Sport{
    public
    String SportName = "Football";
}

class League1 extends Sport{
    public
    String League= "Premier League";
}

class Club extends League1{
    public
    String Team = "Liverpool";
}


class League2 extends Sport{
    public
    String League = "Bundesliga";
}

class League3 extends Sport{
    public
    String League = "La Liga";
}


public class p9prac2 {
    public static void main(String[] args) {
        Sport clg = new Sport();
        System.out.println(clg.SportName);
        System.out.println();

        League1 League1 = new League1();
        System.out.println(League1.League);
        System.out.println(League1.SportName);
        System.out.println();

        Club Club = new Club();
        System.out.println(Club.Team);
        System.out.println(Club.League);
        System.out.println(Club.SportName);
        System.out.println();

        League2 League2 = new League2();
        System.out.println(League2.League);
        System.out.println(League2.SportName);
        System.out.println();

        League3 League3 = new League3();
        System.out.println(League3.League);
        System.out.println(League3.SportName);

    }
}
