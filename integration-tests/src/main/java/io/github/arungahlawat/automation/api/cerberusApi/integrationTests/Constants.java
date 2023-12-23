package io.github.arungahlawat.automation.api.cerberusApi.integrationTests;

import io.github.arungahlawat.automation.core.enums.Env;

import java.util.HashMap;
import java.util.Map;

public class IntegrationTestsConstants {
    public static final String PROPERTIES_FILE_PATH = "properties/integration-tests.properties";
    public static final Map<Env,String > URI = new HashMap<>(){{
        put(Env.TEST, "");
        put(Env.STAGE, "");
    }};
}
