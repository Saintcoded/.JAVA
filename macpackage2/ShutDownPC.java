package macpackage2;


public class ShutDownPC {
	String os;
	Runtime runtime;
	public ShutDownPC() {
	    os = System.getProperty("os.name");
	    runtime = Runtime.getRuntime();
	}

	public void shutdown() {     
	    try {
	        if ("Windows 8.1".equals(os) || "Windows 8.0".equals(os) || "Windows 10".equals(os)) {
	            runtime.exec("shutdown -s");
	        } else {
	            System.err.println("Unsupported operating system");
	        }
	    } catch(Exception e) {
	        System.err.println("shutdown error");
	        e.printStackTrace();
	    }
	    
	}

	public void restart() {     
	    try {
	        if ("Windows 8.1".equals(os) || "Windows 8.0".equals(os) || "Windows 10".equals(os)) {
	            runtime.exec("shutdown -r");
	        } else {
	            System.err.println("Unsupported operating system");
	        }
	    } catch(Exception e) {
	        System.err.println("restart error");
	        e.printStackTrace();
	    }
	    
	}

	public void suspend() {     
	    try {
	        if ("Windows 8.1".equals(os) || "Windows 8.0".equals(os) || "Windows 10".equals(os)) {
	            runtime.exec("Rundll32.exe powrprof.dll,SetSuspendState Sleep");
	        } else {
	            System.err.println("Unsupported operating system");
	        }
	    } catch(Exception e) {
	        System.err.println("suspend error");
	        e.printStackTrace();
	    }   
	}

	public void lock() {     
	    try {
	        if ("Linux".equals(os) || "Mac OS X".equals(os)) {
	        } else if ("Windows 8.1".equals(os) || "Windows 8.0".equals(os) || "Windows 10".equals(os)) {
	            runtime.exec("Rundll32.exe user32.dll,LockWorkStation");
	        } else {
	            System.err.println("Unsupported operating system");
	        }
	    } catch(Exception e) {
	        System.err.println("pc lock error");
	        e.printStackTrace();
	    }
	    
	}

	public static void main(String args[]) {
		ShutDownPC powerOff = new ShutDownPC();
	    //powerOff.lock();
	    //powerOff.suspend();
	    powerOff.shutdown();
	    //powerOff.restart();
	}

}
