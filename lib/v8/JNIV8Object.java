package com.bilibili.lib.v8;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIV8Object.class */
public abstract class JNIV8Object extends JNIObject {
    private V8Engine _engine;

    public JNIV8Object(V8Engine v8Engine) {
        super(true);
        this._engine = v8Engine;
        initNativeJNIV8Object(getClass().getCanonicalName(), v8Engine, 0L);
        initAutomaticDisposure();
    }

    public JNIV8Object(V8Engine v8Engine, long j7, Object[] objArr) {
        super(true);
        this._engine = v8Engine;
        initNativeJNIV8Object(getClass().getCanonicalName(), v8Engine, j7);
        initAutomaticDisposure();
    }

    private native Object _applyV8Method(@NonNull String str, int i7, int i8, Class cls, Object[] objArr);

    private native Object _getV8Field(String str, int i7, int i8, Class cls);

    public static boolean asBoolean(Object obj) {
        boolean z6 = false;
        if (obj == null) {
            return false;
        }
        if (obj instanceof JNIV8Object) {
            return true;
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() > 0) {
                z6 = true;
            }
            return z6;
        }
        if (obj instanceof String) {
            return !((String) obj).isEmpty();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof JNIV8Undefined) {
            return false;
        }
        if (!(obj instanceof Character)) {
            throw new ClassCastException(Fp.c.b(obj, "Cannot convert to boolean: "));
        }
        boolean z7 = false;
        if (((Character) obj).charValue() > 0) {
            z7 = true;
        }
        return z7;
    }

    public static double asNumber(Object obj) {
        if (obj == null) {
            return 0.0d;
        }
        if (obj instanceof JNIV8Object) {
            return ((JNIV8Object) obj).toNumber();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            return Double.valueOf((String) obj).doubleValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1.0d : 0.0d;
        }
        if (obj instanceof JNIV8Undefined) {
            return Double.NaN;
        }
        if (obj instanceof Character) {
            return Character.getNumericValue(((Character) obj).charValue());
        }
        throw new ClassCastException(Fp.c.b(obj, "Cannot convert to number: "));
    }

    public static String asString(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof JNIV8Object) {
            return obj.toString();
        }
        if (!(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof Boolean)) {
            if (obj instanceof JNIV8Undefined) {
                return "undefined";
            }
            if (obj instanceof Character) {
                return String.valueOf(obj);
            }
            throw new ClassCastException(Fp.c.b(obj, "Cannot convert to String: "));
        }
        return String.valueOf(obj);
    }

    private native Map<String, Object> getV8Fields(boolean z6, int i7, int i8, Class cls);

    private native String[] getV8Keys(boolean z6);

    private native boolean hasV8Field(String str, boolean z6);

    private native void initNativeJNIV8Object(String str, V8Engine v8Engine, long j7);

    private static native void registerAliasForPrimitive(int i7, int i8);

    public static void registerAliasForPrimitive(Class cls, Class cls2) {
        registerAliasForPrimitive(cls.hashCode(), cls2.hashCode());
    }

    public static native void registerV8Class(String str, String str2);

    public native void adjustJSExternalMemory(long j7);

    @Nullable
    public Object applyV8Method(String str, Object[] objArr) {
        return _applyV8Method(str, 0, 0, Object.class, objArr);
    }

    @Nullable
    public <T> T applyV8MethodTyped(@NonNull String str, int i7, @NonNull Class<T> cls, @NonNull Object[] objArr) {
        return (T) _applyV8Method(str, i7, cls.hashCode(), cls, objArr);
    }

    @Nullable
    public <T> T applyV8MethodTyped(@NonNull String str, @NonNull Class<T> cls, @NonNull Object[] objArr) {
        return (T) _applyV8Method(str, 0, cls.hashCode(), cls, objArr);
    }

    @Nullable
    public Object callV8Method(@NonNull String str, Object... objArr) {
        return _applyV8Method(str, 0, 0, Object.class, objArr);
    }

    @Nullable
    public <T> T callV8MethodTyped(@NonNull String str, int i7, @NonNull Class<T> cls, @Nullable Object... objArr) {
        return (T) _applyV8Method(str, i7, cls.hashCode(), cls, objArr);
    }

    @Nullable
    public <T> T callV8MethodTyped(@NonNull String str, @NonNull Class<T> cls, @Nullable Object... objArr) {
        return (T) _applyV8Method(str, 0, cls.hashCode(), cls, objArr);
    }

    public V8Engine getV8Engine() {
        return this._engine;
    }

    @Nullable
    public Object getV8Field(@NonNull String str) {
        return _getV8Field(str, 0, 0, Object.class);
    }

    @Nullable
    public <T> T getV8FieldTyped(@NonNull String str, int i7, @NonNull Class<T> cls) {
        return (T) _getV8Field(str, i7, cls.hashCode(), cls);
    }

    @Nullable
    public <T> T getV8FieldTyped(@NonNull String str, @NonNull Class<T> cls) {
        return (T) _getV8Field(str, 0, cls.hashCode(), cls);
    }

    @NonNull
    public Map<String, Object> getV8Fields() {
        return getV8Fields(false, 0, 0, null);
    }

    @NonNull
    public <T> Map<String, T> getV8FieldsTyped(int i7, Class<T> cls) {
        return (Map<String, T>) getV8Fields(false, i7, cls.hashCode(), cls);
    }

    @NonNull
    public <T> Map<String, T> getV8FieldsTyped(Class<T> cls) {
        return (Map<String, T>) getV8Fields(false, 0, cls.hashCode(), cls);
    }

    @NonNull
    public String[] getV8Keys() {
        return getV8Keys(false);
    }

    @NonNull
    public Map<String, Object> getV8OwnFields() {
        return getV8Fields(true, 0, 0, null);
    }

    @NonNull
    public <T> Map<String, T> getV8OwnFieldsTyped(int i7, Class<T> cls) {
        return (Map<String, T>) getV8Fields(true, i7, cls.hashCode(), cls);
    }

    @NonNull
    public <T> Map<String, T> getV8OwnFieldsTyped(Class<T> cls) {
        return (Map<String, T>) getV8Fields(true, 0, cls.hashCode(), cls);
    }

    @NonNull
    public String[] getV8OwnKeys() {
        return getV8Keys(true);
    }

    public boolean hasV8Field(@NonNull String str) {
        return hasV8Field(str, false);
    }

    public boolean hasV8OwnField(@NonNull String str) {
        return hasV8Field(str, true);
    }

    public native void setV8Field(@NonNull String str, @Nullable Object obj);

    public native void setV8Fields(@NonNull Map<String, Object> map);

    public native String toDebugJSON();

    public native String toJSON();

    public native double toNumber();

    public native String toString();
}
