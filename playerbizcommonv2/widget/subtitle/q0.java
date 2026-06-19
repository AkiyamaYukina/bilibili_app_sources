package com.bilibili.playerbizcommonv2.widget.subtitle;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.widget.subtitle.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/q0.class */
public interface q0 {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/q0$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f83765a = new Object();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/q0$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f83766a = new Object();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/q0$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f83767a = new Object();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/q0$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final z0.b f83768a;

        public d(@NotNull z0.b bVar) {
            this.f83768a = bVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f83768a, ((d) obj).f83768a);
        }

        public final int hashCode() {
            return this.f83768a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "SUBTITLE_ONLY(config=" + this.f83768a + ")";
        }
    }
}
