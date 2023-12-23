package io.github.arungahlawat.automation.api.cerberusApi.integrationTests.utils;

import io.github.arungahlawat.automation.api.cerberusApi.integrationTests.IntegrationTestsConstants;
import io.github.arungahlawat.automation.core.utils.io.FileUtils;
import org.apache.commons.configuration2.Configuration;

public class IntegrationTestsFileUtils extends FileUtils {
    public static Configuration getConfig() {
        return getConfig(IntegrationTestsConstants.PROPERTIES_FILE_PATH);
    }
}
