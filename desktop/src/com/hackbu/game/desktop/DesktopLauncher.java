package com.hackbu.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.hackbu.game.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Work In Progress";
        config.width = 800;
        config.height = 600;
        config.resizable = false;
		new LwjglApplication(new Game(), config);
	}
}
