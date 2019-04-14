package com.glqdlt.ex.springbootstarter;

public class MySetup {
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Boolean getAutoSetup() {
        return autoSetup;
    }

    public void setAutoSetup(Boolean autoSetup) {
        this.autoSetup = autoSetup;
    }

    private String prefix;

    private Boolean autoSetup;

    @Override
    public String toString() {
        return "MySetup{" +
                "prefix='" + prefix + '\'' +
                ", autoSetup=" + autoSetup +
                '}';
    }
}
