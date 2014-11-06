package org.infobip.internship.util;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author adostic
 * @since 12.06.2014 22:15
 */
@Service
public class PropertiesUtils {
	private final File propertiesFile;

	@Autowired
	public PropertiesUtils(Properties properties) {
		propertiesFile = new File(properties.getProperty("app.config.file"));
	}

	public String getPropertiesFileContent() throws IOException {
		return FileUtils.readFileToString(propertiesFile);
	}
	
	public String getPropertiesFileHtmlContent() throws IOException {
		return getPropertiesFileContent().replaceAll("\n", "<br/>");
	}
}
