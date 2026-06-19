package com.bilibili.player.tangram.basic;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/c.class */
public interface c {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/c$a.class */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f79321a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 522181136;
        }

        @NotNull
        public final String toString() {
            return "Auto";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/c$b.class */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f79322a;

        public b(int i7) {
            this.f79322a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && com.bilibili.player.tangram.basic.a.b(this.f79322a, ((b) obj).f79322a);
        }

        public final int hashCode() {
            return Integer.hashCode(this.f79322a);
        }

        @NotNull
        public final String toString() {
            return android.support.v4.media.a.a("Specific(quality=", String.valueOf(this.f79322a), ")");
        }
    }
}
