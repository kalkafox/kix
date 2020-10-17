package io.kalka.kix;

import org.newdawn.slick.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class KixGame extends BasicGame {

    public KixGame() {
        super("Kix");
    }

    @Override
    public void init(GameContainer container) throws SlickException {

    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {

    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        g.drawString("This is a test", 10, 10);
    }

    public static void main(String[] args) {
        try {

            System.setProperty("java.library.path", "./lwjgl");
            AppGameContainer app;
            app = new AppGameContainer(new KixGame());
            app.setDisplayMode(800, 600, false);
            app.start();
        }catch (SlickException ex) {
            Logger.getLogger(KixGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
