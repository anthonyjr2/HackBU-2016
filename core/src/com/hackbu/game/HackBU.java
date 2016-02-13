package com.hackbu.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HackBU extends ApplicationAdapter {
	SpriteBatch batch;
	SpriteBatch batch2;
	Texture background;
	Texture img;
	OrthographicCamera camera;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		batch2 = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		background = new Texture("clouds2.jpg");
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 600);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 10, 0);
		batch.end();
		batch2.begin();
		batch2.draw(background,10,0);
		batch2.end();
	}
}
