package com.bilibili.playset.playlist.search2;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/o.class */
public interface o {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/o$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f85471a;

        public a(@NotNull String str) {
            this.f85471a = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f85471a, ((a) obj).f85471a);
        }

        public final int hashCode() {
            return this.f85471a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("Toast(toastString="), this.f85471a, ")");
        }
    }
}
