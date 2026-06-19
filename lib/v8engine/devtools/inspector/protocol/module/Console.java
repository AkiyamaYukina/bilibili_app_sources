package com.bilibili.lib.v8engine.devtools.inspector.protocol.module;

import com.bilibili.lib.v8engine.devtools.json.annotation.JsonValue;
import com.tencent.map.geolocation.TencentLocation;
import kg0.InterfaceC7764a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Console.class */
public final class Console implements InterfaceC7764a {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Console$MessageLevel.class */
    public enum MessageLevel {
        LOG("log"),
        WARNING("warning"),
        ERROR("error"),
        DEBUG("debug");

        private final String mProtocolValue;

        MessageLevel(String str) {
            this.mProtocolValue = str;
        }

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Console$MessageSource.class */
    public enum MessageSource {
        XML("xml"),
        JAVASCRIPT("javascript"),
        NETWORK(TencentLocation.NETWORK_PROVIDER),
        CONSOLE_API("console-api"),
        STORAGE("storage"),
        APPCACHE("appcache"),
        RENDERING("rendering"),
        CSS("css"),
        SECURITY("security"),
        OTHER("other");

        private final String mProtocolValue;

        MessageSource(String str) {
            this.mProtocolValue = str;
        }

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Console$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Console$b.class */
    public static final class b {
    }
}
