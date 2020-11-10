package com.example.springcloudawss3sample;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("s3")
public class S3Properties {
    private Boolean enablePathStyleAccess;

    public Boolean getEnablePathStyleAccess() {
        return enablePathStyleAccess;
    }

    public void setEnablePathStyleAccess(Boolean enablePathStyleAccess) {
        this.enablePathStyleAccess = enablePathStyleAccess;
    }

    @Override
    public String toString() {
        return "S3Properties{" +
                "enablePathStyleAccess=" + enablePathStyleAccess +
                '}';
    }
}
