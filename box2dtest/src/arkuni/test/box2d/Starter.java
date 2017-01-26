package arkuni.test.box2d;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Starter {
	public static void main(String[] args) {
		new LwjglApplication(new Box2dExample(), "title", 480, 320, false);
	}
	
}
