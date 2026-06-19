package com.bilibili.mall.kmm.common;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/common/c.class */
@Serializable(with = e.class)
public abstract class c<T> {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/common/c$a.class */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f65590b;

        public a(int i7, @Nullable String str) {
            this.f65589a = i7;
            this.f65590b = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/common/c$b.class */
    public static final class b {
        @NotNull
        public final <T> KSerializer<c<T>> serializer(@NotNull KSerializer<T> kSerializer) {
            return new e(kSerializer);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mall.kmm.common.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/common/c$c.class */
    public static final class C0367c<T> extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f65591a;

        public C0367c(T t7) {
            this.f65591a = t7;
        }
    }
}
