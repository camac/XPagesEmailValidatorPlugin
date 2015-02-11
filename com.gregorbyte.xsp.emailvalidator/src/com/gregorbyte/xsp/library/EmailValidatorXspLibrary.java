package com.gregorbyte.xsp.library;

import com.ibm.xsp.library.AbstractXspLibrary;

public class EmailValidatorXspLibrary extends AbstractXspLibrary {

	@Override
	public String getLibraryId() {
		return "com.gregorbyte.xsp.emailvalidator.library";
	}

	@Override
	public String getPluginId() {
		return "com.gregorbyte.xsp.emailvalidator";
	}
	
	@Override
	public String[] getFacesConfigFiles() {

		String[] facesConfigs = new String[] {
				"com/gregorbyte/xsp/config/emailValidator-faces-config.xml",
		};
		
		return facesConfigs;
	}

	@Override
	public String[] getXspConfigFiles() {

		String[] xspConfigs = new String[] {
				"com/gregorbyte/xsp/config/emailValidator.xsp-config",
		};
		
		return xspConfigs;

	}

	@Override
	public boolean isGlobalScope() {
		return false;
	}	

}
