package com.bilibili.playerbizcommonv2.widget.setting.channel;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/b.class */
public interface InterfaceC5833b {

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.b$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/b$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements InterfaceC5833b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f83222a;

        public a(@FloatRange(from = 0.0d, to = 1.0d) float f7) {
            this.f83222a = f7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f83222a, ((a) obj).f83222a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f83222a);
        }

        @NotNull
        public final String toString() {
            return C.d.a(this.f83222a, ")", new StringBuilder("HeightRatio(ratio="));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/b$b.class */
    @StabilityInferred(parameters = 1)
    public static final class C0553b implements InterfaceC5833b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0553b f83223a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof C0553b);
        }

        public final int hashCode() {
            return 343601860;
        }

        @NotNull
        public final String toString() {
            return "Top16x9";
        }
    }
}
