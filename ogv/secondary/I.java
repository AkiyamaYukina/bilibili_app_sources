package com.bilibili.ogv.secondary;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/I.class */
public interface I {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/I$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f72608a;

        public a(boolean z6) {
            this.f72608a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f72608a == ((a) obj).f72608a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72608a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("Failure(isNetworkError="), this.f72608a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/I$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f72609a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1514002559;
        }

        @NotNull
        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/I$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<com.bilibili.ogv.secondary.api.h> f72610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableState f72611b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull List<? extends com.bilibili.ogv.secondary.api.h> list) {
            this.f72610a = list;
        }
    }
}
