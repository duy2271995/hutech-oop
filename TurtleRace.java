import java.awt.*;
import java.util.Random;

class SimpleWindow {
    public SimpleWindow(int i, int i1, String winner) {
        // To change body of created methods use File | Settings | File Templates.
    }

    public static void delay(int i) {
        // To change body of created methods use File | Settings | File Templates.
    }

    public void moveTo(int i, int i1) {
        // To change body of created methods use File | Settings | File Templates.
    }

    public void writeText(String s) {
        // To change body of created methods use File | Settings | File Templates.
    }

    public void waitForMouseClick() {
        // To change body of created methods use File | Settings | File Templates.
    }
}

class ColorTurtle extends Turtle {
    public ColorTurtle(SimpleWindow w, int i, int yStart, Color red) {
        // To change body of created methods use File | Settings | File Templates.
    }

    public ColorTurtle(SimpleWindow w, int i, int i1) {
        super(w, i, i1);
    }
}

class RaceTrack {
    private int yFinish;

    public RaceTrack(SimpleWindow w, int yStart, int yFinish) {
        // To change body of created methods use File | Settings | File Templates.
    }

    public int getyFinish() {
        return yFinish;
    }

    public void draw(SimpleWindow w) {
        // To change body of created methods use File | Settings | File Templates.
    }
}

class Turtle {
    private int y;

    public Turtle(SimpleWindow w, int i, int i1) {
        // To change body of created methods use File | Settings | File Templates.
    }

    Turtle() {
    }

    public void penDown() {
        // To change body of created methods use File | Settings | File Templates.
    }

    public int getY() {
        return y;
    }

    public void forward(int turtle1) {
        // To change body of created methods use File | Settings | File Templates.
    }
}

class RacingEvent {
    private SimpleWindow w;
    private RaceTrack track;
    private Turtle t1 = new Turtle(w, 200, 400);
    private Turtle t2 = new Turtle(w, 300, 400);

    public RacingEvent(RaceTrack track, Turtle t1, Turtle t2) {
        this.t1 = t1;
        this.t2 = t2;
        this.track = track;
    }

    public void Race() {
        t1.penDown();
        t2.penDown();
        Random rand = new Random();

        Turtle t1 = new Turtle(w, 200, 400);
        Turtle t2 = new Turtle(w, 300, 400);

        while (t1.getY() > track.getyFinish() && t2.getY() > track.getyFinish()) {
            int turtle1 = rand.nextInt(3);
            int turtle2 = rand.nextInt(3);
            t1.forward(turtle1);
            t2.forward(turtle2);

            SimpleWindow.delay(10);
        }

        int diff1 = t1.getY() - track.getyFinish();
        int diff2 = t2.getY() - track.getyFinish();

        SimpleWindow w = new SimpleWindow(200, 100, "Winner");

        if (t1.getY() <= track.getyFinish()) {
            w.moveTo(20, 40);
            w.writeText("T1 won with a " + diff2 + " step(s) lead!");
        } else if (t2.getY() <= track.getyFinish()) {
            w.moveTo(20, 40);
            w.writeText("T2 won with a " + diff1 + " step(s) lead!");
        }
    }
}

public class TurtleRace {
    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(600, 600, "TurtleRace");
        int yStart = 400;
        int yFinish = 100;

        RaceTrack track = new RaceTrack(w, yStart, yFinish);
        ColorTurtle t1 = new ColorTurtle(w, 250, yStart, java.awt.Color.RED);
        ColorTurtle t2 = new ColorTurtle(w, 350, yStart, java.awt.Color.BLUE);

        track.draw(w);
        w.waitForMouseClick();

        RacingEvent event = new RacingEvent(track, t1, t2);
        /* Call Race Method */
        event.Race();
    }
}