package com.bilibili.ogv.operation3.filmlisthub;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/l.class */
public interface l {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/l$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f71113a;

        public a(boolean z6) {
            this.f71113a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f71113a == ((a) obj).f71113a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71113a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("Failure(isNetworkError="), this.f71113a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/l$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f71114a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1289634748;
        }

        @NotNull
        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/l$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ogv.operation3.filmlisthub.api.b f71115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableState f71116b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

        public c(@NotNull com.bilibili.ogv.operation3.filmlisthub.api.b bVar) {
            this.f71115a = bVar;
        }
    }
}
