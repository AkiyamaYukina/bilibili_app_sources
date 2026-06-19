package com.bilibili.lib.v8;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIV8Function.class */
public final class JNIV8Function extends JNIV8Object {
    private static final String TAG = "V8-Function";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIV8Function$Handler.class */
    public interface Handler {
        Object Callback(Object obj, Object[] objArr);
    }

    @Keep
    public JNIV8Function(V8Engine v8Engine, long j7, Object[] objArr) {
        super(v8Engine, j7, objArr);
    }

    public static native JNIV8Function Create(V8Engine v8Engine, Handler handler);

    private Object _callAsV8Function(boolean z6, int i7, int i8, Class cls, Object obj, Object... objArr) {
        return _nativeCallAsV8Function(z6, i7, i8, cls, obj, objArr);
    }

    private native Object _nativeCallAsV8Function(boolean z6, int i7, int i8, Class cls, Object obj, Object... objArr);

    @NonNull
    public Object applyAsV8Constructor(@Nullable Object[] objArr) {
        return _callAsV8Function(true, 1, 0, Object.class, null, objArr);
    }

    @Nullable
    public Object applyAsV8Function(@NonNull Object[] objArr) {
        return _callAsV8Function(false, 0, 0, Object.class, null, objArr);
    }

    @Nullable
    public <T> T applyAsV8FunctionTyped(int i7, @NonNull Class<T> cls, @NonNull Object[] objArr) {
        return (T) _callAsV8Function(false, i7, cls.hashCode(), cls, null, objArr);
    }

    @Nullable
    public <T> T applyAsV8FunctionTyped(@NonNull Class<T> cls, @NonNull Object[] objArr) {
        return (T) _callAsV8Function(false, 0, cls.hashCode(), cls, null, objArr);
    }

    @Nullable
    public Object applyAsV8FunctionWithReceiver(@NonNull Object obj, @NonNull Object[] objArr) {
        return _callAsV8Function(false, 0, 0, Object.class, obj, objArr);
    }

    @Nullable
    public <T> T applyAsV8FunctionWithReceiverTyped(int i7, @NonNull Class<T> cls, @NonNull Object obj, @NonNull Object[] objArr) {
        return (T) _callAsV8Function(false, i7, cls.hashCode(), cls, obj, objArr);
    }

    @Nullable
    public <T> T applyAsV8FunctionWithReceiverTyped(@NonNull Class<T> cls, @NonNull Object obj, @NonNull Object[] objArr) {
        return (T) _callAsV8Function(false, 0, cls.hashCode(), cls, obj, objArr);
    }

    @NonNull
    public Object callAsV8Constructor(@Nullable Object... objArr) {
        return _callAsV8Function(true, 1, 0, Object.class, null, objArr);
    }

    @Nullable
    public Object callAsV8Function(@Nullable Object... objArr) {
        return _callAsV8Function(false, 0, 0, Object.class, null, objArr);
    }

    @Nullable
    public <T> T callAsV8FunctionTyped(int i7, @NonNull Class<T> cls, @Nullable Object... objArr) {
        return (T) _callAsV8Function(false, i7, cls.hashCode(), cls, null, objArr);
    }

    @Nullable
    public <T> T callAsV8FunctionTyped(@NonNull Class<T> cls, @Nullable Object... objArr) {
        return (T) _callAsV8Function(false, 0, cls.hashCode(), cls, null, objArr);
    }

    @Nullable
    public Object callAsV8FunctionWithReceiver(@NonNull Object obj, @Nullable Object... objArr) {
        return _callAsV8Function(false, 0, 0, Object.class, obj, objArr);
    }

    @Nullable
    public <T> T callAsV8FunctionWithReceiverTyped(int i7, @NonNull Class<T> cls, @NonNull Object obj, @Nullable Object... objArr) {
        return (T) _callAsV8Function(false, i7, cls.hashCode(), cls, obj, objArr);
    }

    @Nullable
    public <T> T callAsV8FunctionWithReceiverTyped(@NonNull Class<T> cls, @NonNull Object obj, @Nullable Object... objArr) {
        return (T) _callAsV8Function(false, 0, cls.hashCode(), cls, obj, objArr);
    }
}
