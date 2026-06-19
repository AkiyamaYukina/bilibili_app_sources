package com.bilibili.ship.theseus.ugc.endpage.qoe;

import I.E;
import K7.N;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import c6.O;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class UgcDmQoeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Info f96667b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeInfo$Info.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class Info {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f96668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f96669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f96670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f96671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f96672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final List<ScoreItem> f96673f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final LayerMask f96674g;

        @Nullable
        public final Form h;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeInfo$Info$Form.class */
        @StabilityInferred(parameters = 0)
        @Bson
        public static final class Form {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f96675a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final List<QoeOption> f96676b;

            public Form(int i7, @NotNull List<QoeOption> list) {
                this.f96675a = i7;
                this.f96676b = list;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Form)) {
                    return false;
                }
                Form form = (Form) obj;
                return this.f96675a == form.f96675a && Intrinsics.areEqual(this.f96676b, form.f96676b);
            }

            public final int hashCode() {
                return this.f96676b.hashCode() + (Integer.hashCode(this.f96675a) * 31);
            }

            @NotNull
            public final String toString() {
                return N.a(new StringBuilder("Form(type="), this.f96675a, ", options=", this.f96676b, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeInfo$Info$LayerMask.class */
        @StabilityInferred(parameters = 1)
        @Bson
        public static final class LayerMask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @SerializedName("close_count_down_second")
            private final long f96677a;

            public LayerMask() {
                this(0L, 1);
            }

            public LayerMask(long j7, int i7) {
                this.f96677a = (i7 & 1) != 0 ? 0L : j7;
            }

            public final long a() {
                return this.f96677a;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LayerMask) && this.f96677a == ((LayerMask) obj).f96677a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f96677a);
            }

            @NotNull
            public final String toString() {
                return androidx.compose.ui.input.pointer.k.a(this.f96677a, "LayerMask(showDuration=", ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeInfo$Info$QoeOption.class */
        @StabilityInferred(parameters = 0)
        @Bson
        public static final class QoeOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f96678a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final Float f96679b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final String f96680c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public final List<String> f96681d;

            public QoeOption(@NotNull String str, @Nullable Float f7, @Nullable String str2, @Nullable List<String> list) {
                this.f96678a = str;
                this.f96679b = f7;
                this.f96680c = str2;
                this.f96681d = list;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof QoeOption)) {
                    return false;
                }
                QoeOption qoeOption = (QoeOption) obj;
                return Intrinsics.areEqual(this.f96678a, qoeOption.f96678a) && Intrinsics.areEqual(this.f96679b, qoeOption.f96679b) && Intrinsics.areEqual(this.f96680c, qoeOption.f96680c) && Intrinsics.areEqual(this.f96681d, qoeOption.f96681d);
            }

            public final int hashCode() {
                int iHashCode = this.f96678a.hashCode();
                int iHashCode2 = 0;
                Float f7 = this.f96679b;
                int iHashCode3 = f7 == null ? 0 : f7.hashCode();
                String str = this.f96680c;
                int iHashCode4 = str == null ? 0 : str.hashCode();
                List<String> list = this.f96681d;
                if (list != null) {
                    iHashCode2 = list.hashCode();
                }
                return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
            }

            @NotNull
            public final String toString() {
                List<String> list = this.f96681d;
                StringBuilder sb = new StringBuilder("QoeOption(title=");
                sb.append(this.f96678a);
                sb.append(", score=");
                sb.append(this.f96679b);
                sb.append(", imgUrl=");
                return N1.o.a(this.f96680c, ", desc=", ")", sb, list);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeInfo$Info$ScoreItem.class */
        @StabilityInferred(parameters = 1)
        @Bson
        public static final class ScoreItem {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f96682a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f96683b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final float f96684c;

            public ScoreItem() {
                this(0.0f, 7, null, null);
            }

            public ScoreItem(float f7, int i7, String str, String str2) {
                str = (i7 & 1) != 0 ? "" : str;
                str2 = (i7 & 2) != 0 ? "" : str2;
                f7 = (i7 & 4) != 0 ? 0.0f : f7;
                this.f96682a = str;
                this.f96683b = str2;
                this.f96684c = f7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ScoreItem)) {
                    return false;
                }
                ScoreItem scoreItem = (ScoreItem) obj;
                return Intrinsics.areEqual(this.f96682a, scoreItem.f96682a) && Intrinsics.areEqual(this.f96683b, scoreItem.f96683b) && Float.compare(this.f96684c, scoreItem.f96684c) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.f96684c) + E.a(this.f96682a.hashCode() * 31, 31, this.f96683b);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("ScoreItem(title=");
                sb.append(this.f96682a);
                sb.append(", url=");
                sb.append(this.f96683b);
                sb.append(", score=");
                return C.d.a(this.f96684c, ")", sb);
            }
        }

        public Info() {
            throw null;
        }

        public Info(long j7, String str, String str2, int i7, int i8, List list, LayerMask layerMask, Form form, int i9) {
            j7 = (i9 & 1) != 0 ? 0L : j7;
            str = (i9 & 2) != 0 ? "" : str;
            str2 = (i9 & 4) != 0 ? "" : str2;
            i7 = (i9 & 8) != 0 ? 0 : i7;
            i8 = (i9 & 16) != 0 ? 0 : i8;
            list = (i9 & 32) != 0 ? CollectionsKt.emptyList() : list;
            this.f96668a = j7;
            this.f96669b = str;
            this.f96670c = str2;
            this.f96671d = i7;
            this.f96672e = i8;
            this.f96673f = list;
            this.f96674g = layerMask;
            this.h = form;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return this.f96668a == info.f96668a && Intrinsics.areEqual(this.f96669b, info.f96669b) && Intrinsics.areEqual(this.f96670c, info.f96670c) && this.f96671d == info.f96671d && this.f96672e == info.f96672e && Intrinsics.areEqual(this.f96673f, info.f96673f) && Intrinsics.areEqual(this.f96674g, info.f96674g) && Intrinsics.areEqual(this.h, info.h);
        }

        public final int hashCode() {
            int iA = e0.a(I.a(this.f96672e, I.a(this.f96671d, E.a(E.a(Long.hashCode(this.f96668a) * 31, 31, this.f96669b), 31, this.f96670c), 31), 31), 31, this.f96673f);
            int iHashCode = 0;
            LayerMask layerMask = this.f96674g;
            int iHashCode2 = layerMask == null ? 0 : layerMask.hashCode();
            Form form = this.h;
            if (form != null) {
                iHashCode = form.hashCode();
            }
            return ((iA + iHashCode2) * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            List<ScoreItem> list = this.f96673f;
            StringBuilder sb = new StringBuilder("Info(id=");
            sb.append(this.f96668a);
            sb.append(", title=");
            sb.append(this.f96669b);
            sb.append(", feedbackTitle=");
            sb.append(this.f96670c);
            sb.append(", type=");
            sb.append(this.f96671d);
            sb.append(", style=");
            O.b(sb, this.f96672e, ", scoreItems=", list, ", layerMask=");
            sb.append(this.f96674g);
            sb.append(", form=");
            sb.append(this.h);
            sb.append(")");
            return sb.toString();
        }
    }

    public UgcDmQoeInfo(boolean z6, Info info, int i7) {
        this.f96666a = (i7 & 1) != 0 ? false : z6;
        this.f96667b = info;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UgcDmQoeInfo)) {
            return false;
        }
        UgcDmQoeInfo ugcDmQoeInfo = (UgcDmQoeInfo) obj;
        return this.f96666a == ugcDmQoeInfo.f96666a && Intrinsics.areEqual(this.f96667b, ugcDmQoeInfo.f96667b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f96666a);
        Info info = this.f96667b;
        return (iHashCode * 31) + (info == null ? 0 : info.hashCode());
    }

    @NotNull
    public final String toString() {
        return "UgcDmQoeInfo(show=" + this.f96666a + ", info=" + this.f96667b + ")";
    }
}
