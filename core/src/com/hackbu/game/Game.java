package com.hackbu.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Game extends ApplicationAdapter {
	private SpriteBatch batch;
	Texture backgroundImage;
	private OrthographicCamera camera;
    private Texture playerImage;
    private Rectangle player;
    private int xRes = 800;
    private int yRes = 600;
    private Rectangle background;

	@Override
	public void create () {
		backgroundImage = new Texture("gamelevel1base.png");
        background = new Rectangle();
        background.x = 0;
        background.y =0;
		camera = new OrthographicCamera();
		camera.setToOrtho(false, xRes, yRes);
        batch = new SpriteBatch();
        playerImage = new Texture("player.png");
        player = new Rectangle();
        player.x = xRes/2 - 64/2;
        player.y = 80;
        player.width = 64;
        player.height = 64;

	}

	@Override
	public void render () {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        batch.setProjectionMatrix(camera.combined);
		batch.begin();
        batch.draw(backgroundImage, background.x, background.y);
        batch.draw(playerImage, player.x, player.y);
        batch.end();

        int i = 0;
        while(i<10){
            background.x -= 10 * Gdx.graphics.getDeltaTime();
            i++;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) player.x -= 200 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) player.x += 200 * Gdx.graphics.getDeltaTime();

        if(player.x < 0) player.x = 0;
        if(player.x > 800 - 64) player.x = 800 - 64;
	}
}
