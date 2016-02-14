package com.hackbu.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Game extends ApplicationAdapter {
	private SpriteBatch batch;
	Texture background;
	private OrthographicCamera camera;
    private Texture playerImage;
    private Rectangle player;
    private int xRes = 800;
    private int yRes = 600;

	@Override
	public void create () {
		//background = new Texture("clouds2.jpg");
		camera = new OrthographicCamera();
		camera.setToOrtho(false, xRes, yRes);
        batch = new SpriteBatch();
        playerImage = new Texture("player.png");
        player = new Rectangle();
        player.x = xRes/2;
        player.y = 40;
        player.width = 64;
        player.height = 64;

	}

	@Override
	public void render () {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        batch.setProjectionMatrix(camera.combined);
		batch.begin();
        batch.draw(playerImage, player.x, player.y);
        batch.end();
	}
}
