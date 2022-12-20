package programmingmethod.enumeration;

public class enumStudy {
    public enum Week{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public static void main(String[] args){
        Week today = Week.MONDAY;
        System.out.println(today);
    }
}
