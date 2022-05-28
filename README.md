# NashornPlusAPI

[![](https://jitpack.io/v/broken1arrow/NashornPlusAPI.svg)](https://jitpack.io/#broken1arrow/NashornPlusAPI)

## You use this api to NashornPlus.

You have acces to this two methods. Author to NashornPlus is kangarko. Use newest version here https://github.com/broken1arrow/NashornPlusAPI/releases
The offical NashornPlus from kangarko will not work with this api. 

```
// this method is used to use the engine
/*
                final ScriptEngineManager engineManager = getEngineManager(); 
		final javax.script.ScriptEngine engine = engineManager.getEngineByName("Nashorn");
		
		// Run JavaScript code as usual
		try {
			engine.eval("print('Hello World!');");
		
		} catch (final javax.script.ScriptException ex) {
			ex.printStackTrace();
		}

*/
// this method´s to acces the engine and factory.
        public NashornPlusPlugin getInstance(){
	        return null;
	}
	public ScriptEngineManager getEngineManager() {
		return null;
	}

	public ScriptEngineFactory getEngineFactory() {
		return null;
	}
```
