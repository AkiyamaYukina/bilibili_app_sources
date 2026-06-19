package com.bilibili.lib.v8;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIV8Array.class */
public final class JNIV8Array extends JNIV8Object implements Iterable<Object> {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIV8Array$V8Iterator.class */
    public class V8Iterator implements Iterator<Object> {
        private int index = 0;
        final JNIV8Array this$0;

        public V8Iterator(JNIV8Array jNIV8Array) {
            this.this$0 = jNIV8Array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.this$0.getV8Length();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.index >= this.this$0.getV8Length()) {
                throw new NoSuchElementException();
            }
            JNIV8Array jNIV8Array = this.this$0;
            int i7 = this.index;
            this.index = i7 + 1;
            return jNIV8Array.getV8Element(i7);
        }
    }

    @Keep
    public JNIV8Array(V8Engine v8Engine, long j7, Object[] objArr) {
        super(v8Engine, j7, objArr);
    }

    public static native JNIV8Array Create(V8Engine v8Engine);

    public static native JNIV8Array CreateWithArray(V8Engine v8Engine, Object[] objArr);

    public static JNIV8Array CreateWithElements(V8Engine v8Engine, Object... objArr) {
        return CreateWithArray(v8Engine, objArr);
    }

    public static native JNIV8Array CreateWithLength(V8Engine v8Engine, int i7);

    private native Object _getV8Element(int i7, int i8, Class cls, int i9);

    private native Object[] _getV8Elements(int i7, int i8, Class cls, int i9, int i10);

    public boolean equals(Object obj) {
        if (!(obj instanceof JNIV8Array)) {
            return super.equals(obj);
        }
        JNIV8Array jNIV8Array = (JNIV8Array) obj;
        if (jNIV8Array.getV8Length() != getV8Length()) {
            return false;
        }
        return Arrays.equals(jNIV8Array.getV8Elements(), getV8Elements());
    }

    @Nullable
    public Object getV8Element(int i7) {
        return _getV8Element(0, 0, Object.class, i7);
    }

    @Nullable
    public <T> T getV8ElementTyped(int i7, @NonNull Class<T> cls, int i8) {
        return (T) _getV8Element(i7, cls.hashCode(), cls, i8);
    }

    @Nullable
    public <T> T getV8ElementTyped(@NonNull Class<T> cls, int i7) {
        return (T) _getV8Element(0, cls.hashCode(), cls, i7);
    }

    @NonNull
    public Object[] getV8Elements() {
        return _getV8Elements(0, 0, Object.class, 0, Integer.MAX_VALUE);
    }

    @NonNull
    public Object[] getV8Elements(int i7, int i8) {
        return _getV8Elements(0, 0, Object.class, i7, i8);
    }

    @NonNull
    public <T> T[] getV8ElementsTyped(int i7, @NonNull Class<T> cls) {
        return (T[]) _getV8Elements(i7, cls.hashCode(), cls, 0, Integer.MAX_VALUE);
    }

    @NonNull
    public <T> T[] getV8ElementsTyped(int i7, @NonNull Class<T> cls, int i8, int i9) {
        return (T[]) _getV8Elements(i7, cls.hashCode(), cls, i8, i9);
    }

    @NonNull
    public <T> T[] getV8ElementsTyped(@NonNull Class<T> cls) {
        return (T[]) _getV8Elements(0, cls.hashCode(), cls, 0, Integer.MAX_VALUE);
    }

    @NonNull
    public <T> T[] getV8ElementsTyped(@NonNull Class<T> cls, int i7, int i8) {
        return (T[]) _getV8Elements(0, cls.hashCode(), cls, i7, i8);
    }

    public native int getV8Length();

    public boolean isEmpty() {
        return getV8Length() == 0;
    }

    @Override // java.lang.Iterable
    @NonNull
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Object> iterator2() {
        return new V8Iterator(this);
    }
}
