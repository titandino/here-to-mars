package com.darkan.pkmn.engine.text.font;

import com.darkan.pkmn.engine.gfx.mesh.Mesh;
import com.darkan.pkmn.engine.gfx.texture.Texture;
import com.darkan.pkmn.engine.gfx.texture.TextureManager;
import com.darkan.pkmn.engine.text.Text;

public class Font {
	
	private Texture textureAtlas;
	private FontMeshLoader fontMeshLoader;
	
	public Font(String fontFile) {
		this.textureAtlas = TextureManager.getTexture(fontFile+".png");
		this.fontMeshLoader = new FontMeshLoader(fontFile+".fnt");
	}

	public Texture getTextureAtlas() {
		return textureAtlas;
	}

	public FontMeshLoader getFontMeshLoader() {
		return fontMeshLoader;
	}
	
	public Mesh create(Text text) {
		return fontMeshLoader.create(text);
	}

}
