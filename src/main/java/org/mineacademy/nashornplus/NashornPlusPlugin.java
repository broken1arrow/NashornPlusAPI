package org.mineacademy.nashornplus;

import org.bukkit.plugin.java.JavaPlugin;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

public final class NashornPlusPlugin extends JavaPlugin {

	@Override
	public void onEnable() {

		//engineManager = new ScriptEngineManager();
		//engineFactory = new org.openjdk.nashorn.api.scripting.NashornScriptEngineFactory();

		// Register Nashorn library
		// engineManager.registerEngineName("Nashorn", engineFactory);

		//
		// Example usage
		//

		/*final javax.script.ScriptEngine engine = engineManager.getEngineByName("Nashorn");
		
		// Run JavaScript code as usual
		try {
			engine.eval("print('Hello World!');");
		
		} catch (final javax.script.ScriptException ex) {
			ex.printStackTrace();
		}*/
	}

	public static NashornPlusPlugin getInstance() {
		return null;
	}

	public ScriptEngineManager getEngineManager() {
		return null;
	}

	public ScriptEngineFactory getEngineFactory() {
		return null;
	}
}
