import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShuttleMissions {
    public static void main(String[] args) {
        String text = "Цей текст містить інформацію про різні місії шатлів. Наприклад, /shuttle/missions/Atlantis_1 була першою місією шатла Atlantis. А /shuttle/missions/Discovery_35 була 35-ю місією шатла Discovery.";

        Pattern pattern = Pattern.compile("/shuttle/missions/([a-zA-Z]+)_\\d+");
        Matcher matcher = pattern.matcher(text);

        Set<String> missions = new HashSet<>();
        while (matcher.find()) {
            String mission = matcher.group(1);
            missions.add(mission);
        }

        System.out.println("Унікальні місії шатлів:");
        for (String mission : missions) {
            System.out.println(mission);
        }
    }
}