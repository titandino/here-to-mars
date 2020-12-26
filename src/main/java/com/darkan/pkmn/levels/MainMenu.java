package com.darkan.pkmn.levels;

import com.darkan.pkmn.engine.GameManager;
import com.darkan.pkmn.engine.Level;
import com.darkan.pkmn.engine.base.Window;
import com.darkan.pkmn.engine.base.input.Key;
import com.darkan.pkmn.engine.entity.Entity;
import com.darkan.pkmn.engine.gfx.mesh.MeshManager;
import com.darkan.pkmn.engine.gfx.texture.TextureManager;
import com.darkan.pkmn.engine.render.EntityRenderer;
import com.darkan.pkmn.engine.render.FontRenderer;
import com.darkan.pkmn.engine.text.Text;

import glm.vec._2.Vec2;

public class MainMenu extends Level {

	private Entity playButton;
	private Text testText;

	@Override
	public void init() {
		playButton = new Entity(new Vec2((Window.get().getWidth() / 2), 150), 230, 64, MeshManager.defaultMesh(), TextureManager.getTexture("playbutton.png"));

		Entity background = new Entity(new Vec2(GameManager.getResolution().getWidth() / 2, GameManager.getResolution().getHeight() / 2), GameManager.getResolution().getWidth(), GameManager.getResolution().getHeight(), MeshManager.defaultMesh(), TextureManager.getTexture("mainmenubg.png"));
		addEntity(background);
	}

	@Override
	public void renderExtraEntity(EntityRenderer entityRenderer) {

	}

	@Override
	public void renderExtraFont(FontRenderer fontRenderer) {
		fontRenderer.render(testText);
	}

	@Override
	public void renderUIEntity(EntityRenderer entityRenderer) {
		entityRenderer.render(playButton);
	}

	@Override
	public void renderUIFont(FontRenderer fontRenderer) {

	}

	@Override
	public void update(float delta) {
		if (Window.getMouse().colliding(playButton) && Window.getMouse().clicked(Key.M_LEFT))
			GameManager.get().setLevel(new Game());
	}

	@Override
	public void onWindowResize() {
		playButton.setPosition(new Vec2((Window.get().getWidth() / 2), 150));
	}
}
