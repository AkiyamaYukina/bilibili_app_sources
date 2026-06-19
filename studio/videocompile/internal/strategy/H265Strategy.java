package com.bilibili.studio.videocompile.internal.strategy;

import OA0.a;
import X1.F;
import androidx.annotation.Keep;
import androidx.compose.ui.graphics.e0;
import androidx.constraintlayout.motion.widget.p;
import androidx.media3.exoplayer.analytics.C4668j;
import h6.C7417v;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/strategy/H265Strategy.class */
public final class H265Strategy implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static List<String> f108791b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final H265Strategy f108790a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final List<String> f108792c = CollectionsKt.listOf(new String[]{"OMX.google.gsm.decoder", "c2.qti", "OMX.qcom", "OMX.hisi"});

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/strategy/H265Strategy$CodecInfo.class */
    @Keep
    public static final class CodecInfo {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        private String f108793m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        private String f108794n;

        public CodecInfo() {
            this(null, null, 3, null);
        }

        public CodecInfo(@Nullable String str, @Nullable String str2) {
            this.f108794n = str;
            this.f108793m = str2;
        }

        public /* synthetic */ CodecInfo(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? "null" : str, (i7 & 2) != 0 ? "null" : str2);
        }

        public static /* synthetic */ CodecInfo copy$default(CodecInfo codecInfo, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = codecInfo.f108794n;
            }
            if ((i7 & 2) != 0) {
                str2 = codecInfo.f108793m;
            }
            return codecInfo.copy(str, str2);
        }

        @Nullable
        public final String component1() {
            return this.f108794n;
        }

        @Nullable
        public final String component2() {
            return this.f108793m;
        }

        @NotNull
        public final CodecInfo copy(@Nullable String str, @Nullable String str2) {
            return new CodecInfo(str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CodecInfo)) {
                return false;
            }
            CodecInfo codecInfo = (CodecInfo) obj;
            return Intrinsics.areEqual(this.f108794n, codecInfo.f108794n) && Intrinsics.areEqual(this.f108793m, codecInfo.f108793m);
        }

        @Nullable
        public final String getM() {
            return this.f108793m;
        }

        @Nullable
        public final String getN() {
            return this.f108794n;
        }

        public int hashCode() {
            String str = this.f108794n;
            int iHashCode = 0;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.f108793m;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public final void setM(@Nullable String str) {
            this.f108793m = str;
        }

        public final void setN(@Nullable String str) {
            this.f108794n = str;
        }

        @NotNull
        public String toString() {
            return p.a("CodecInfo(n=", this.f108794n, ", m=", this.f108793m, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/strategy/H265Strategy$CodecProfiler.class */
    @Keep
    public static final class CodecProfiler {

        @NotNull
        private List<CodecInfo> audioCodecs;

        @NotNull
        private List<CodecInfo> ca_h_d;

        @NotNull
        private List<CodecInfo> ca_h_e;

        @NotNull
        private List<CodecInfo> ca_s_d;

        @NotNull
        private List<CodecInfo> ca_s_e;

        @NotNull
        private List<CodecInfo> cv_h_d;

        @NotNull
        private List<CodecInfo> cv_h_e;

        @NotNull
        private List<CodecInfo> cv_s_d;

        @NotNull
        private List<CodecInfo> cv_s_e;

        @NotNull
        private List<CodecInfo> videoCodecs;

        public CodecProfiler() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        public CodecProfiler(@NotNull List<CodecInfo> list, @NotNull List<CodecInfo> list2, @NotNull List<CodecInfo> list3, @NotNull List<CodecInfo> list4, @NotNull List<CodecInfo> list5, @NotNull List<CodecInfo> list6, @NotNull List<CodecInfo> list7, @NotNull List<CodecInfo> list8, @NotNull List<CodecInfo> list9, @NotNull List<CodecInfo> list10) {
            this.ca_h_e = list;
            this.ca_s_e = list2;
            this.ca_h_d = list3;
            this.ca_s_d = list4;
            this.cv_h_e = list5;
            this.cv_s_e = list6;
            this.cv_h_d = list7;
            this.cv_s_d = list8;
            this.audioCodecs = list9;
            this.videoCodecs = list10;
        }

        public /* synthetic */ CodecProfiler(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? new ArrayList() : list, (i7 & 2) != 0 ? new ArrayList() : list2, (i7 & 4) != 0 ? new ArrayList() : list3, (i7 & 8) != 0 ? new ArrayList() : list4, (i7 & 16) != 0 ? new ArrayList() : list5, (i7 & 32) != 0 ? new ArrayList() : list6, (i7 & 64) != 0 ? new ArrayList() : list7, (i7 & 128) != 0 ? new ArrayList() : list8, (i7 & 256) != 0 ? new ArrayList() : list9, (i7 & 512) != 0 ? new ArrayList() : list10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CodecProfiler copy$default(CodecProfiler codecProfiler, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                list = codecProfiler.ca_h_e;
            }
            if ((i7 & 2) != 0) {
                list2 = codecProfiler.ca_s_e;
            }
            if ((i7 & 4) != 0) {
                list3 = codecProfiler.ca_h_d;
            }
            if ((i7 & 8) != 0) {
                list4 = codecProfiler.ca_s_d;
            }
            if ((i7 & 16) != 0) {
                list5 = codecProfiler.cv_h_e;
            }
            if ((i7 & 32) != 0) {
                list6 = codecProfiler.cv_s_e;
            }
            if ((i7 & 64) != 0) {
                list7 = codecProfiler.cv_h_d;
            }
            if ((i7 & 128) != 0) {
                list8 = codecProfiler.cv_s_d;
            }
            if ((i7 & 256) != 0) {
                list9 = codecProfiler.audioCodecs;
            }
            if ((i7 & 512) != 0) {
                list10 = codecProfiler.videoCodecs;
            }
            return codecProfiler.copy(list, list2, list3, list4, list5, list6, list7, list8, list9, list10);
        }

        @NotNull
        public final List<CodecInfo> component1() {
            return this.ca_h_e;
        }

        @NotNull
        public final List<CodecInfo> component10() {
            return this.videoCodecs;
        }

        @NotNull
        public final List<CodecInfo> component2() {
            return this.ca_s_e;
        }

        @NotNull
        public final List<CodecInfo> component3() {
            return this.ca_h_d;
        }

        @NotNull
        public final List<CodecInfo> component4() {
            return this.ca_s_d;
        }

        @NotNull
        public final List<CodecInfo> component5() {
            return this.cv_h_e;
        }

        @NotNull
        public final List<CodecInfo> component6() {
            return this.cv_s_e;
        }

        @NotNull
        public final List<CodecInfo> component7() {
            return this.cv_h_d;
        }

        @NotNull
        public final List<CodecInfo> component8() {
            return this.cv_s_d;
        }

        @NotNull
        public final List<CodecInfo> component9() {
            return this.audioCodecs;
        }

        @NotNull
        public final CodecProfiler copy(@NotNull List<CodecInfo> list, @NotNull List<CodecInfo> list2, @NotNull List<CodecInfo> list3, @NotNull List<CodecInfo> list4, @NotNull List<CodecInfo> list5, @NotNull List<CodecInfo> list6, @NotNull List<CodecInfo> list7, @NotNull List<CodecInfo> list8, @NotNull List<CodecInfo> list9, @NotNull List<CodecInfo> list10) {
            return new CodecProfiler(list, list2, list3, list4, list5, list6, list7, list8, list9, list10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CodecProfiler)) {
                return false;
            }
            CodecProfiler codecProfiler = (CodecProfiler) obj;
            return Intrinsics.areEqual(this.ca_h_e, codecProfiler.ca_h_e) && Intrinsics.areEqual(this.ca_s_e, codecProfiler.ca_s_e) && Intrinsics.areEqual(this.ca_h_d, codecProfiler.ca_h_d) && Intrinsics.areEqual(this.ca_s_d, codecProfiler.ca_s_d) && Intrinsics.areEqual(this.cv_h_e, codecProfiler.cv_h_e) && Intrinsics.areEqual(this.cv_s_e, codecProfiler.cv_s_e) && Intrinsics.areEqual(this.cv_h_d, codecProfiler.cv_h_d) && Intrinsics.areEqual(this.cv_s_d, codecProfiler.cv_s_d) && Intrinsics.areEqual(this.audioCodecs, codecProfiler.audioCodecs) && Intrinsics.areEqual(this.videoCodecs, codecProfiler.videoCodecs);
        }

        @NotNull
        public final List<CodecInfo> getAudioCodecs() {
            return this.audioCodecs;
        }

        @NotNull
        public final List<CodecInfo> getCa_h_d() {
            return this.ca_h_d;
        }

        @NotNull
        public final List<CodecInfo> getCa_h_e() {
            return this.ca_h_e;
        }

        @NotNull
        public final List<CodecInfo> getCa_s_d() {
            return this.ca_s_d;
        }

        @NotNull
        public final List<CodecInfo> getCa_s_e() {
            return this.ca_s_e;
        }

        @NotNull
        public final List<CodecInfo> getCv_h_d() {
            return this.cv_h_d;
        }

        @NotNull
        public final List<CodecInfo> getCv_h_e() {
            return this.cv_h_e;
        }

        @NotNull
        public final List<CodecInfo> getCv_s_d() {
            return this.cv_s_d;
        }

        @NotNull
        public final List<CodecInfo> getCv_s_e() {
            return this.cv_s_e;
        }

        @NotNull
        public final List<CodecInfo> getVideoCodecs() {
            return this.videoCodecs;
        }

        public int hashCode() {
            return this.videoCodecs.hashCode() + e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(this.ca_h_e.hashCode() * 31, 31, this.ca_s_e), 31, this.ca_h_d), 31, this.ca_s_d), 31, this.cv_h_e), 31, this.cv_s_e), 31, this.cv_h_d), 31, this.cv_s_d), 31, this.audioCodecs);
        }

        public final void setAudioCodecs(@NotNull List<CodecInfo> list) {
            this.audioCodecs = list;
        }

        public final void setCa_h_d(@NotNull List<CodecInfo> list) {
            this.ca_h_d = list;
        }

        public final void setCa_h_e(@NotNull List<CodecInfo> list) {
            this.ca_h_e = list;
        }

        public final void setCa_s_d(@NotNull List<CodecInfo> list) {
            this.ca_s_d = list;
        }

        public final void setCa_s_e(@NotNull List<CodecInfo> list) {
            this.ca_s_e = list;
        }

        public final void setCv_h_d(@NotNull List<CodecInfo> list) {
            this.cv_h_d = list;
        }

        public final void setCv_h_e(@NotNull List<CodecInfo> list) {
            this.cv_h_e = list;
        }

        public final void setCv_s_d(@NotNull List<CodecInfo> list) {
            this.cv_s_d = list;
        }

        public final void setCv_s_e(@NotNull List<CodecInfo> list) {
            this.cv_s_e = list;
        }

        public final void setVideoCodecs(@NotNull List<CodecInfo> list) {
            this.videoCodecs = list;
        }

        @NotNull
        public String toString() {
            List<CodecInfo> list = this.ca_h_e;
            List<CodecInfo> list2 = this.ca_s_e;
            List<CodecInfo> list3 = this.ca_h_d;
            List<CodecInfo> list4 = this.ca_s_d;
            List<CodecInfo> list5 = this.cv_h_e;
            List<CodecInfo> list6 = this.cv_s_e;
            List<CodecInfo> list7 = this.cv_h_d;
            List<CodecInfo> list8 = this.cv_s_d;
            List<CodecInfo> list9 = this.audioCodecs;
            List<CodecInfo> list10 = this.videoCodecs;
            StringBuilder sbA = C7417v.a("CodecProfiler(ca_h_e=", ", ca_s_e=", ", ca_h_d=", list, list2);
            F.c(", ca_s_d=", ", cv_h_e=", sbA, list3, list4);
            F.c(", cv_s_e=", ", cv_h_d=", sbA, list5, list6);
            F.c(", cv_s_d=", ", audioCodecs=", sbA, list7, list8);
            return C4668j.a(", videoCodecs=", ")", sbA, list9, list10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x0268, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 1905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videocompile.internal.strategy.H265Strategy.a(android.content.Context, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // OA0.a
    @NotNull
    public final String getClassTag() {
        return "H265Strategy";
    }
}
