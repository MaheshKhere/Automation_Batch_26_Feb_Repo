package launch_Browser;

import baseClass.BaseClass;

public class Class_002 extends BaseClass {

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate_url("https://www.facebook.com");
		take_screenshot("homepage");
		
	}

}
