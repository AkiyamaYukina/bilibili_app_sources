package com.bilibili.playerbizcommonv2.videomentioned;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/f.class */
@StabilityInferred(parameters = 1)
public abstract class f {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/f$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f82012a;

        public a(boolean z6) {
            this.f82012a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f82012a == ((a) obj).f82012a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f82012a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("Edit(selectAll="), this.f82012a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/f$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f82013a = new Object();
    }
}
