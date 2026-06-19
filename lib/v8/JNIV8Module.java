package com.bilibili.lib.v8;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIV8Module.class */
public abstract class JNIV8Module {
    private String name;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIV8Module$IJNIV8Suspendable.class */
    public interface IJNIV8Suspendable {
        void onResume();

        void onSuspend();
    }

    public JNIV8Module(String str) {
        this.name = str;
    }

    public abstract void Require(@NonNull V8Engine v8Engine, JNIV8GenericObject jNIV8GenericObject);

    public final String getName() {
        return this.name;
    }
}
