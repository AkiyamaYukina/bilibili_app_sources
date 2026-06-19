package com.bilibili.lib.v8;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIV8GenericObject.class */
public final class JNIV8GenericObject extends JNIV8Object {
    public static final String TAG = "JNIV8GenericObject";

    @Keep
    public JNIV8GenericObject(V8Engine v8Engine, long j7, Object[] objArr) {
        super(v8Engine, j7, objArr);
    }

    public static native JNIV8GenericObject Create(V8Engine v8Engine);

    public static JNIV8GenericObject fromMap(V8Engine v8Engine, @NonNull Map<String, Object> map) {
        JNIV8GenericObject jNIV8GenericObjectCreate = Create(v8Engine);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Map) {
                jNIV8GenericObjectCreate.setV8Field(entry.getKey(), fromMap(v8Engine, (Map) value));
            } else {
                jNIV8GenericObjectCreate.setV8Field(entry.getKey(), value);
            }
        }
        return jNIV8GenericObjectCreate;
    }
}
