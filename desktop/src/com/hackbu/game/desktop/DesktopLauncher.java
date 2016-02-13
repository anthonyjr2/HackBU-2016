package com.hackbu.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.hackbu.game.HackBU;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "test2";
        config.width = 800;
        config.height = 600;
		new LwjglApplication(new HackBU(), config);
	}
}
