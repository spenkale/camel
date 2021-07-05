/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class DebeziumPostgresEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":name";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(90);
        props.add("slotDropOnStop");
        props.add("includeUnknownDatatypes");
        props.add("maxBatchSize");
        props.add("internalKeyConverter");
        props.add("snapshotDelayMs");
        props.add("offsetStorageTopic");
        props.add("databaseSslkey");
        props.add("slotName");
        props.add("toastedValuePlaceholder");
        props.add("bridgeErrorHandler");
        props.add("databaseTcpkeepalive");
        props.add("datatypePropagateSourceType");
        props.add("schemaRefreshMode");
        props.add("publicationAutocreateMode");
        props.add("provideTransactionMetadata");
        props.add("converters");
        props.add("tombstonesOnDelete");
        props.add("heartbeatIntervalMs");
        props.add("schemaWhitelist");
        props.add("heartbeatTopicsPrefix");
        props.add("decimalHandlingMode");
        props.add("skippedOperations");
        props.add("sourceStructVersion");
        props.add("binaryHandlingMode");
        props.add("databaseHostname");
        props.add("eventProcessingFailureHandlingMode");
        props.add("offsetCommitTimeoutMs");
        props.add("snapshotSelectStatementOverrides");
        props.add("slotMaxRetries");
        props.add("databaseSslrootcert");
        props.add("slotStreamParams");
        props.add("databaseSslpassword");
        props.add("pluginName");
        props.add("offsetFlushIntervalMs");
        props.add("offsetStorageFileName");
        props.add("columnBlacklist");
        props.add("name");
        props.add("snapshotFetchSize");
        props.add("statusUpdateIntervalMs");
        props.add("offsetStoragePartitions");
        props.add("additionalProperties");
        props.add("offsetStorageReplicationFactor");
        props.add("databaseInitialStatements");
        props.add("schemaExcludeList");
        props.add("heartbeatActionQuery");
        props.add("schemaBlacklist");
        props.add("exceptionHandler");
        props.add("databasePort");
        props.add("databaseUser");
        props.add("snapshotIncludeCollectionList");
        props.add("databaseHistoryFileFilename");
        props.add("schemaIncludeList");
        props.add("columnPropagateSourceType");
        props.add("offsetStorage");
        props.add("slotRetryDelayMs");
        props.add("internalValueConverter");
        props.add("databaseSslcert");
        props.add("snapshotMaxThreads");
        props.add("xminFetchIntervalMs");
        props.add("retriableRestartConnectorWaitMs");
        props.add("maxQueueSize");
        props.add("messageKeyColumns");
        props.add("timePrecisionMode");
        props.add("columnWhitelist");
        props.add("pollIntervalMs");
        props.add("sanitizeFieldNames");
        props.add("databaseSslmode");
        props.add("hstoreHandlingMode");
        props.add("tableWhitelist");
        props.add("tableIgnoreBuiltin");
        props.add("signalDataCollection");
        props.add("exchangePattern");
        props.add("databaseServerName");
        props.add("snapshotCustomClass");
        props.add("tableBlacklist");
        props.add("queryFetchSize");
        props.add("snapshotMode");
        props.add("maxQueueSizeInBytes");
        props.add("snapshotLockTimeoutMs");
        props.add("tableExcludeList");
        props.add("offsetCommitPolicy");
        props.add("tableIncludeList");
        props.add("intervalHandlingMode");
        props.add("incrementalSnapshotChunkSize");
        props.add("columnExcludeList");
        props.add("databaseSslfactory");
        props.add("columnIncludeList");
        props.add("databasePassword");
        props.add("databaseDbname");
        props.add("publicationName");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "debezium-postgres".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "name", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

