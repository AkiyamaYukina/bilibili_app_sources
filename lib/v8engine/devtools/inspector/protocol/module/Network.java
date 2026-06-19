package com.bilibili.lib.v8engine.devtools.inspector.protocol.module;

import android.content.Context;
import com.bilibili.lib.v8engine.devtools.json.annotation.JsonValue;
import jg0.C7682i;
import jg0.l;
import kg0.InterfaceC7764a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Network.class */
public class Network implements InterfaceC7764a {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Network$InitiatorType.class */
    public enum InitiatorType {
        PARSER("parser"),
        SCRIPT("script"),
        OTHER("other");

        private final String mProtocolValue;

        InitiatorType(String str) {
            this.mProtocolValue = str;
        }

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Network$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Network$b.class */
    public static final class b {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Network$c.class */
    public static final class c {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Network$d.class */
    public static final class d {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/protocol/module/Network$e.class */
    public static final class e {
    }

    public Network(Context context) {
        C7682i c7682i;
        synchronized (C7682i.class) {
            try {
                if (C7682i.f122407d == null) {
                    C7682i.f122407d = new C7682i(new l(context.getApplicationContext()));
                }
                c7682i = C7682i.f122407d;
            } catch (Throwable th) {
                throw th;
            }
        }
        c7682i.getClass();
    }
}
