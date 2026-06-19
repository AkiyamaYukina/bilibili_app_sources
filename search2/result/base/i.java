package com.bilibili.search2.result.base;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/i.class */
@StabilityInferred(parameters = 1)
public abstract class i {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/i$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f87551a;

        public a() {
            this(null);
        }

        public a(@Nullable String str) {
            this.f87551a = str;
        }

        @Override // com.bilibili.search2.result.base.i
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f87551a, ((a) obj).f87551a);
        }

        @Override // com.bilibili.search2.result.base.i
        public final int hashCode() {
            String str = this.f87551a;
            return str == null ? 0 : str.hashCode();
        }

        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("StateShowError(errorMessage="), this.f87551a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/i$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends i {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/i$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c extends i {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/i$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d extends i {
    }

    public boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }
}
