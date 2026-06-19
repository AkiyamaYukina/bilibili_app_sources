package com.bilibili.lib.v8;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/InspectorBackend.class */
public interface InspectorBackend {
    void connectInspector(Object obj);

    void disconnectInspector();

    void dispatchInspectorMessage(String str);

    boolean isDisposed();

    void scheduleInspectorBreak();
}
