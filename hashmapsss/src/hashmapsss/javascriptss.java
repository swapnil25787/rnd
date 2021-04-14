package hashmapsss;

import java.io.File;
import java.io.FileNotFoundException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class javascriptss {

	public static void main(String[] args) throws ScriptException, FileNotFoundException {
		// TODO Auto-generated method stub
		  ScriptEngineManager factory = new ScriptEngineManager();
		    ScriptEngine engine = factory.getEngineByName("JavaScript");
		    engine.eval("print('Hello, World')");
		    File f = new File("D:\\AutomationFramework\\hashmapsss\\src\\hashmapsss\\test.js");
	        // expose File object as variable to script
	        engine.put("file", f);

	        // evaluate a script string. The script accesses "file" 
	        // variable and calls method on it
	        engine.eval("print(file.getAbsolutePath())");
	
		    // create a script engine manager
	      
	        // create JavaScript engine
	      
	        // evaluate JavaScript code from given file - specified by first argument
	        engine.eval(new java.io.FileReader(f));
	
	}

}
