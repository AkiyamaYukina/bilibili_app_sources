package com.bilibili.lib.v8engine.devtools.inspector.protocol.module;

import android.content.Context;
import com.bilibili.lib.v8engine.devtools.json.annotation.JsonValue;
import java.util.IdentityHashMap;
import kg0.InterfaceC7764a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Page.class */
public class Page implements InterfaceC7764a {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Page$ResourceType.class */
    public enum ResourceType {
        DOCUMENT("Document"),
        STYLESHEET("Stylesheet"),
        IMAGE("Image"),
        FONT("Font"),
        SCRIPT("Script"),
        XHR("XHR"),
        WEBSOCKET("WebSocket"),
        OTHER("Other");

        private final String mProtocolValue;

        ResourceType(String str) {
            this.mProtocolValue = str;
        }

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }

    public Page(Context context) {
        new IdentityHashMap();
    }
}
