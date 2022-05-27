package org.mineacademy.nashornplus;

import net.md_5.bungee.api.plugin.Plugin;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

public final class NashornPlusBungee extends Plugin {

	@Override
	public void onEnable() {

		//engineManager = new ScriptEngineManager();
		// engineFactory = new org.openjdk.nashorn.api.scripting.NashornScriptEngineFactory();

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

	public static NashornPlusBungee getInstance() {
		return null;
	}
	
	public ScriptEngineManager getEngineManager() {
		return null;
	}

	public ScriptEngineFactory getEngineFactory() {
		return null;
	}
}
