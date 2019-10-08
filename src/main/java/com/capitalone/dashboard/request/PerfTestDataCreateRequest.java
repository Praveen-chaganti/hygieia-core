package com.capitalone.dashboard.request;


import com.capitalone.dashboard.model.TestCapability;
import com.capitalone.dashboard.model.TestSuite;
import com.capitalone.dashboard.model.TestSuiteType;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

public class PerfTestDataCreateRequest {



    /**
     * perf test runID should be unique for each execution.
     */
    @NotNull
    private String runId;

    /**
     * Provide a test name, a new testname will create a new collector Item
     */
    @NotNull
    private String testName;



    /**
     * Provide a  platform name, a new platformName will create a new collector Item. default should be Jmeter.
     */
    @NotNull
    private String perfTool;

    /**
     * Type of test should be performance
     */
    @NotNull
    private TestSuiteType type;

    /**
     * Provide the test result status
     */
    private String resultStatus;

    /**
     * Provide a report URL if available
     */
    private String reportUrl;


    /**
     * Creation timestamp
     */
    private long timestamp;

    /**
     * Description of the test result that might make sense to a human
     */
    private String description;

    /**
     * Start test execution time {@link java.util.Date#getTime()}
     */
    private long startTime;

    /**
     * End test execution time {@link java.util.Date#getTime()}
     */
    private long endTime;

    /**
     * Test duration in milliseconds
     */
    private long duration;

    /**
     * Count of number of failed transactions
     */
    private int failureCount;

    /**
     * Count of number of passed transactions.
     */
    private int successCount;

    /**
     * Count of test cases that were skipped in all test suites
     */
    private int skippedCount;

    private int unknownStatusCount;

    /**
     * The total number of transactions.
     */
    private int totalCount;


    private String targetAppName;
    private String targetEnvName;
    /**
     * build artifact data of test
     */
    private Object buildArtifact;
    /**
     * performance risk assessment status
     */
    private String perfRisk;

    /**
     * Collection of {@link TestSuite}s generated by this perf results.
     */
    private Collection<TestCapability> testCapabilities = new ArrayList<>();

    private String instanceUrl;



    public String getRunId() {
        return runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getPerfTool() {
        return perfTool;
    }

    public void setPerfTool(String perfTool) {
        this.perfTool = perfTool;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(int failureCount) {
        this.failureCount = failureCount;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getSkippedCount() {
        return skippedCount;
    }

    public void setSkippedCount(int skippedCount) {
        this.skippedCount = skippedCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getUnknownStatusCount() {
        return unknownStatusCount;
    }

    public void setUnknownStatusCount(int unknownStatusCount) {
        this.unknownStatusCount = unknownStatusCount;
    }

    public TestSuiteType getType() {
        return type;
    }

    public void setType(TestSuiteType type) {
        this.type = type;
    }

    public String getTargetAppName() {
        return targetAppName;
    }

    public void setTargetAppName(String targetAppName) {
        this.targetAppName = targetAppName;
    }

    public String getTargetEnvName() {
        return targetEnvName;
    }

    public void setTargetEnvName(String targetEnvName) {
        this.targetEnvName = targetEnvName;
    }

    public Collection<TestCapability> getTestCapabilities() {
        return testCapabilities;
    }

    public void setTestCapabilities(Collection<TestCapability> testCapabilities) {
        this.testCapabilities = testCapabilities;
    }

    public String getInstanceUrl() {
        return instanceUrl;
    }

    public void setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    public Object getBuildArtifact() {
        return buildArtifact;
    }

    public void setBuildArtifact(Object buildArtifact) {
        this.buildArtifact = buildArtifact;
    }

    public String getPerfRisk() {
        return perfRisk;
    }

    public void setPerfRisk(String perfRisk) {
        this.perfRisk = perfRisk;
    }





}
