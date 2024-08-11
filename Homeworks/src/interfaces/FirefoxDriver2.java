package interfaces;


	class FirefoxDriver2 implements RemoteWebDriver{
		String browser="Firefox Driver";
		public void open() {
			System.out.println("Open "+browser);
		}
		public void close() {
			System.out.println("Close "+browser);
		}
		public void navigate(){
			System.out.println(browser+" navigates to google.");
		}
	    public void getScreenShot() {
	    	System.out.println(browser+" gets a Screen Shot.");
					
		}			
		public String gettitle() {
			return browser;
		}
				
	}
	class SafariDriver implements RemoteWebDriver{
		String browser="Safari Driver";
		public void open() {
			System.out.println("Open "+browser);
		}
		public void close() {
			System.out.println("Close "+browser);
		}
		public void navigate(){
			System.out.println(browser+" navigates to google.");
		}
	    public void getScreenShot() {
	    	System.out.println(browser+" gets a Screen Shot.");
					
		}			
		public String gettitle() {
			return browser;
		}
				
	}


