package com.htm.game.level.impl;

import org.lwjgl.util.vector.Vector2f;

import com.htm.game.level.Level;
import com.htm.game.object.Entity;
import com.htm.graphic.texture.Texture;
import com.htm.utils.TextureLoader;

public class Tutorial extends Level {
	Texture bgTex;
	Entity bg;
	
	Entity player;

	@Override
	public void init() {
		bgTex = TextureLoader.getTexture("tutorialbg.png");
		bg = new Entity(bgTex, new Vector2f(0.0f, 0.0f), new Vector2f(800.0f, 600.0f));
		addEntity(bg);
	}

	@Override
	public void update(double delta) {
		
	}

	@Override
	public void finish() {
		
	}

}
