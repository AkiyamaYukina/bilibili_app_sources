package com.bilibili.playset.playlist.search2;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/n.class */
public interface n {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/n$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f85469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f85470b;

        public a() {
            this(false, false);
        }

        public a(boolean z6, boolean z7) {
            this.f85469a = z6;
            this.f85470b = z7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f85469a == aVar.f85469a && this.f85470b == aVar.f85470b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f85470b) + (Boolean.hashCode(this.f85469a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Search(isLoadMore=");
            sb.append(this.f85469a);
            sb.append(", isLoadNextPage=");
            return androidx.appcompat.app.i.a(sb, this.f85470b, ")");
        }
    }
}
