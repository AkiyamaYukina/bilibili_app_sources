package com.bilibili.playerbizcommonv2.videomentioned;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/g.class */
@StabilityInferred(parameters = 1)
public abstract class g {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/g$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f82014a = new g();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/g$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f82015a = new g();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/g$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f82016a = new g();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/g$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d<E extends UIComponent.ViewEntry, F extends UIComponent.ViewEntry> extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final B<E, F> f82017a;

        public d(@NotNull B<E, F> b7) {
            this.f82017a = b7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f82017a, ((d) obj).f82017a);
        }

        public final int hashCode() {
            return this.f82017a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "SUCCESS(section=" + this.f82017a + ")";
        }
    }
}
