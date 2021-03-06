package org.aoju.bus.gitlab.models;

import org.aoju.bus.gitlab.utils.JacksonJson;

public class Identity {

    private String provider;
    private String externUid;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getExternUid() {
        return externUid;
    }

    public void setExternUid(String externUid) {
        this.externUid = externUid;
    }

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }
}
