package com.bilibili.playset.detail.data;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/l.class */
public interface l {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/l$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f84544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f84545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f84546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f84547d;

        public a(long j7, @NotNull String str, int i7, int i8) {
            this.f84544a = j7;
            this.f84545b = str;
            this.f84546c = i7;
            this.f84547d = i8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f84544a == aVar.f84544a && Intrinsics.areEqual(this.f84545b, aVar.f84545b) && this.f84546c == aVar.f84546c && this.f84547d == aVar.f84547d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f84547d) + I.a(this.f84546c, E.a(Long.hashCode(this.f84544a) * 31, 31, this.f84545b), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("GotoBatchManager(playlistId=");
            sb.append(this.f84544a);
            sb.append(", title=");
            sb.append(this.f84545b);
            sb.append(", attr=");
            sb.append(this.f84546c);
            sb.append(", mediaCount=");
            return C4277b.a(this.f84547d, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/l$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f84548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f84549b;

        public b(@NotNull String str, boolean z6) {
            this.f84548a = str;
            this.f84549b = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f84548a, bVar.f84548a) && this.f84549b == bVar.f84549b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84549b) + (this.f84548a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("GotoItemDetail(uri=");
            sb.append(this.f84548a);
            sb.append(", isAudioCard=");
            return androidx.appcompat.app.i.a(sb, this.f84549b, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/l$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f84550a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -753517349;
        }

        @NotNull
        public final String toString() {
            return "GotoLogin";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/l$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f84551a;

        public d(long j7) {
            this.f84551a = j7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f84551a == ((d) obj).f84551a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f84551a);
        }

        @NotNull
        public final String toString() {
            return android.support.v4.media.session.a.a(new StringBuilder("GotoSearch(playlistId="), this.f84551a, ")");
        }
    }
}
