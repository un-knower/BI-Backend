package com.yxt.data.migration.json.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Service;

/**
 * Created by Skye on 2017/6/27.
 */

@Configuration
@PropertySource("classpath:config.properties")
@ComponentScan(basePackages = {"com.yxt",})

@Service
public class JobInfo {
    @Value("${source.db.name}")
    private String sourceDbName;


    @Value("${source.db.table.name}")
    private String sourceTbName;

    @Value("${source.db.url}")
    private String sourceDbUrl;

    @Value("${source.db.username}")
    private String sourceDbUsername;

    @Value("${source.db.password}")
    private String sourceDbPassword;

    @Value("${source.db.table.where}")
    private String where;

    @Value("${target.hdfs.compress}")
    private String compress;

    @Value("${target.hdfs.defaultFS}")
    private String defaultFS;

    @Value("${target.hdfs.fieldDelimiter}")
    private String fieldDelimiter;

    @Value("${target.hdfs.fileName}")
    private String fileName;

    @Value("${target.hdfs.fileType}")
    private String fileType;

    @Value("${target.hdfs.path}")
    private String path;

    @Value("${target.hdfs.writeMode}")
    private String writeMode;


    @Value("${job.columns}")

    private String columns;

    @Value("${job.channel}")
    private int channel;

    @Value("${migration.datax.tool.folder}")
    private String dataxFloder;

    @Value("${migration.datax.tool.job.folder}")
    private String jobFileFloder;

    private boolean finished = false;
    private boolean hasException = false;
    private String costTime="";
    private String readWriteRateSpeed="";
    private String readWriteRecordSpeed="";
    private long readWriteRecords = 0;
    private long readWriteFailRecords = 0;

    private String sourceDbType;


    public String getDataxFloder() {
        return dataxFloder;
    }

    public void setDataxFloder(String dataxFloder) {
        this.dataxFloder = dataxFloder;
    }

    public String getJobFileFloder() {
        return jobFileFloder;
    }

    public void setJobFileFloder(String jobFileFloder) {
        this.jobFileFloder = jobFileFloder;
    }
    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean isHasException() {
        return hasException;
    }

    public void setHasException(boolean hasException) {
        this.hasException = hasException;
    }

    public String getCostTime() {
        return costTime;
    }

    public void setCostTime(String costTime) {
        this.costTime = costTime;
    }

    public String getReadWriteRateSpeed() {
        return readWriteRateSpeed;
    }

    public void setReadWriteRateSpeed(String readWriteRateSpeed) {
        this.readWriteRateSpeed = readWriteRateSpeed;
    }

    public String getReadWriteRecordSpeed() {
        return readWriteRecordSpeed;
    }

    public void setReadWriteRecordSpeed(String readWriteRecordSpeed) {
        this.readWriteRecordSpeed = readWriteRecordSpeed;
    }


    public long getReadWriteRecords() {
        return readWriteRecords;
    }

    public void setReadWriteRecords(long readWriteRecords) {
        this.readWriteRecords = readWriteRecords;
    }

    public long getReadWriteFailRecords() {
        return readWriteFailRecords;
    }

    public void setReadWriteFailRecords(long readWriteFailRecords) {
        this.readWriteFailRecords = readWriteFailRecords;
    }

    public String getSourceDbType() {
        return sourceDbType;
    }

    public void setSourceDbType(String sourceDbType) {
        this.sourceDbType = sourceDbType;
    }


    public String getSourceDbName() {
        return sourceDbName;
    }

    public String getSourceTbName() {
        return sourceTbName;
    }

    public void setSourceTbName(String sourceTbName) {
        this.sourceTbName = sourceTbName;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();

    }

    public void setSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
    }





    public String getSourceDbUrl() {
        return sourceDbUrl;
    }

    public void setSourceDbUrl(String sourceDbUrl) {
        this.sourceDbUrl = sourceDbUrl;
    }

    public String getSourceDbUsername() {
        return sourceDbUsername;
    }

    public void setSourceDbUsername(String sourceDbUsername) {
        this.sourceDbUsername = sourceDbUsername;
    }

    public String getSourceDbPassword() {
        return sourceDbPassword;
    }

    public void setSourceDbPassword(String sourceDbPassword) {
        this.sourceDbPassword = sourceDbPassword;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getCompress() {
        return compress;
    }

    public void setCompress(String compress) {
        this.compress = compress;
    }

    public String getDefaultFS() {
        return defaultFS;
    }

    public void setDefaultFS(String defaultFS) {
        this.defaultFS = defaultFS;
    }

    public String getFieldDelimiter() {
        return fieldDelimiter;
    }

    public void setFieldDelimiter(String fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getWriteMode() {
        return writeMode;
    }

    public void setWriteMode(String writeMode) {
        this.writeMode = writeMode;
    }

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
}
