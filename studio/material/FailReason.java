package com.bilibili.studio.material;

import G.p;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/FailReason.class */
public abstract class FailReason {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f108434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f108435b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/FailReason$Cancel.class */
    public static final class Cancel extends FailReason {
        public Cancel(@Nullable String str) {
            super("111117", str, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/FailReason$a.class */
    public static final class a extends FailReason {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f108436c;

        public a(@NotNull String str) {
            super("111113", android.support.v4.media.a.a("id", str, " to url error"), null);
            this.f108436c = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f108436c, ((a) obj).f108436c);
        }

        public final int hashCode() {
            return this.f108436c.hashCode();
        }

        @Override // com.bilibili.studio.material.FailReason
        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("IdToUrlError(materialId="), this.f108436c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/FailReason$b.class */
    public static final class b extends FailReason {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f108437c;

        public b(@NotNull String str) {
            super("111115", str, null);
            this.f108437c = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f108437c, ((b) obj).f108437c);
        }

        @Override // com.bilibili.studio.material.FailReason
        @NotNull
        public final String getMsg() {
            return this.f108437c;
        }

        public final int hashCode() {
            return this.f108437c.hashCode();
        }

        @Override // com.bilibili.studio.material.FailReason
        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("MissingProcessorError(msg="), this.f108437c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/FailReason$c.class */
    public static final class c extends FailReason {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f108438c;

        public c(@NotNull String str) {
            super("111117", C4496a.a("network error: ", str), null);
            this.f108438c = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f108438c, ((c) obj).f108438c);
        }

        public final int hashCode() {
            return this.f108438c.hashCode();
        }

        @Override // com.bilibili.studio.material.FailReason
        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("NetworkError(materialId="), this.f108438c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/FailReason$d.class */
    public static final class d extends FailReason {
        public d(@Nullable String str) {
            super("111116", str, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/FailReason$e.class */
    public static final class e extends FailReason {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/FailReason$f.class */
    public static final class f extends FailReason {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f108439c;

        public f(@NotNull String str) {
            super("111114", p.a(str, " unzip error"), null);
            this.f108439c = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f108439c, ((f) obj).f108439c);
        }

        public final int hashCode() {
            return this.f108439c.hashCode();
        }

        @Override // com.bilibili.studio.material.FailReason
        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("UnzipError(path="), this.f108439c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/FailReason$g.class */
    public static final class g extends FailReason {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f108440c;

        public g(@NotNull String str) {
            super("111112", str, null);
            this.f108440c = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.areEqual(this.f108440c, ((g) obj).f108440c);
        }

        @Override // com.bilibili.studio.material.FailReason
        @NotNull
        public final String getMsg() {
            return this.f108440c;
        }

        public final int hashCode() {
            return this.f108440c.hashCode();
        }

        @Override // com.bilibili.studio.material.FailReason
        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("UrlError(msg="), this.f108440c, ")");
        }
    }

    public /* synthetic */ FailReason(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? CaptureSchema.OLD_INVALID_ID_STRING : str, (i7 & 2) != 0 ? "" : str2, null);
    }

    public FailReason(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f108434a = str;
        this.f108435b = str2;
    }

    @NotNull
    public String getCode() {
        return this.f108434a;
    }

    @Nullable
    public String getMsg() {
        return this.f108435b;
    }

    @NotNull
    public String toString() {
        return androidx.constraintlayout.motion.widget.p.a("FailReason(code='", getCode(), "', msg=", getMsg(), ")");
    }
}
