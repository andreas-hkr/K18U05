import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // - Använd klasserna Klockslag och Observation som studerats tidigare
        // - Läs in observationer från fil och spara i en lista
        //   (stationsid tim min temperatur vindhastighet vindriktning)
        // - Sortera i tidsordning
        // - Sortera efter stationsid
        // - Skriv ut stationsid, tid, och temperatur efter varje sortering

        List<Observation> observations = new ArrayList<>();
        Scanner fileIn = new Scanner(new File("obs.txt"));

        while (fileIn.hasNext()) {
            Observation obs = new Observation();
            obs.nr = fileIn.nextInt();
            obs.tid.tim = fileIn.nextInt();
            obs.tid.min = fileIn.nextInt();
            obs.temp = fileIn.nextInt();
            obs.vindhast = fileIn.nextInt();
            obs.vindrikt = fileIn.nextInt();
            observations.add(obs);
        }

        Collections.sort(observations);
        System.out.println("Efter tid: ");
        for (var obs : observations) {
            System.out.format("%d %s %.2f%n", obs.nr, obs.tid, obs.temp);
        }

        System.out.println();
        Collections.sort(observations, new CompID());
        System.out.println("Efter id: ");
        for (var obs : observations) {
            System.out.format("%d %s %.2f%n", obs.nr, obs.tid, obs.temp);
        }

    }
}

class CompID implements Comparator<Observation> {

    @Override
    public int compare(Observation o1, Observation o2) {
        if (o1.nr < o2.nr) {
            return  -1;
        } else if (o1.nr == o2.nr) {
            return 0;
        } else {
            return 1;
        }
    }
}