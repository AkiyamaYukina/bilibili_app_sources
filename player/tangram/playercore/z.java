package com.bilibili.player.tangram.playercore;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/z.class */
public interface z {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/z$a.class */
    public static final class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<com.bilibili.player.tangram.basic.a> f79469a;

        public a(@NotNull List<com.bilibili.player.tangram.basic.a> list) {
            this.f79469a = list;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f79469a, ((a) obj).f79469a);
        }

        public final int hashCode() {
            return this.f79469a.hashCode();
        }

        @NotNull
        public final String toString() {
            return com.bapis.bilibili.account.interfaces.v1.k.a("Qualities(qualities=", ")", this.f79469a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/z$b.class */
    public static final class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f79470a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1251106995;
        }

        @NotNull
        public final String toString() {
            return "SharingCurrent";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/z$c.class */
    public static final class c implements z {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return com.bilibili.player.tangram.basic.a.b(0, 0);
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        @NotNull
        public final String toString() {
            return android.support.v4.media.a.a("Specific(quality=", String.valueOf(0), ")");
        }
    }
}
