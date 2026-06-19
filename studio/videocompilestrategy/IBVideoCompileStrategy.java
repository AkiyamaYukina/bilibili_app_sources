package com.bilibili.studio.videocompilestrategy;

import K7.M;
import androidx.appcompat.app.i;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompilestrategy/IBVideoCompileStrategy.class */
public interface IBVideoCompileStrategy {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompilestrategy/IBVideoCompileStrategy$Builder.class */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f108800a = 4.194304E7f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public ResolutionLevel f108801b = ResolutionLevel.RES_2160;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f108802c = 60;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Function2<? super String, ? super String, String> f108803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f108804e;

        @NotNull
        public final IBVideoCompileStrategy build() {
            ResolutionLevel resolutionLevel = this.f108801b;
            ArrayList arrayList = new ArrayList();
            ResolutionLevel resolutionLevel2 = ResolutionLevel.RES_2160;
            if (resolutionLevel2.getLevel() <= resolutionLevel.getLevel()) {
                arrayList.add(resolutionLevel2);
                arrayList.add(ResolutionLevel.RES_1080);
                arrayList.add(ResolutionLevel.RES_720);
                arrayList.add(ResolutionLevel.RES_480);
            } else {
                ResolutionLevel resolutionLevel3 = ResolutionLevel.RES_1080;
                if (resolutionLevel3.getLevel() <= resolutionLevel.getLevel()) {
                    arrayList.add(resolutionLevel3);
                    arrayList.add(ResolutionLevel.RES_720);
                    arrayList.add(ResolutionLevel.RES_480);
                } else {
                    ResolutionLevel resolutionLevel4 = ResolutionLevel.RES_720;
                    if (resolutionLevel4.getLevel() <= resolutionLevel.getLevel()) {
                        arrayList.add(resolutionLevel4);
                        arrayList.add(ResolutionLevel.RES_480);
                    } else {
                        arrayList.add(ResolutionLevel.RES_480);
                    }
                }
            }
            Function2<? super String, ? super String, String> function2 = this.f108803d;
            Function2<? super String, ? super String, String> function22 = function2;
            if (function2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("config");
                function22 = null;
            }
            return new a(new RA0.a(function22), this.f108800a, this.f108801b, arrayList, this.f108804e, this.f108802c);
        }

        @NotNull
        public final Builder setConfigManager(@NotNull Function2<? super String, ? super String, String> function2) {
            this.f108803d = function2;
            return this;
        }

        @NotNull
        public final Builder setDeviceCpuType(int i7) {
            this.f108804e = i7;
            return this;
        }

        @NotNull
        public final Builder setMaxBitRate(float f7) {
            this.f108800a = f7;
            return this;
        }

        @NotNull
        public final Builder setMaxFps(int i7) {
            this.f108802c = i7;
            return this;
        }

        @NotNull
        public final Builder setMaxResolutionLevel(@NotNull ResolutionLevel resolutionLevel) {
            this.f108801b = resolutionLevel;
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompilestrategy/IBVideoCompileStrategy$ClipInfoParam.class */
    public static final class ClipInfoParam {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f108805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f108806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f108807c;

        public ClipInfoParam(@NotNull String str, long j7, boolean z6) {
            this.f108805a = str;
            this.f108806b = j7;
            this.f108807c = z6;
        }

        public /* synthetic */ ClipInfoParam(String str, long j7, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i7 & 2) != 0 ? -1L : j7, z6);
        }

        public static /* synthetic */ ClipInfoParam copy$default(ClipInfoParam clipInfoParam, String str, long j7, boolean z6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = clipInfoParam.f108805a;
            }
            if ((i7 & 2) != 0) {
                j7 = clipInfoParam.f108806b;
            }
            if ((i7 & 4) != 0) {
                z6 = clipInfoParam.f108807c;
            }
            return clipInfoParam.copy(str, j7, z6);
        }

        @NotNull
        public final String component1() {
            return this.f108805a;
        }

        public final long component2() {
            return this.f108806b;
        }

        public final boolean component3() {
            return this.f108807c;
        }

        @NotNull
        public final ClipInfoParam copy(@NotNull String str, long j7, boolean z6) {
            return new ClipInfoParam(str, j7, z6);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClipInfoParam)) {
                return false;
            }
            ClipInfoParam clipInfoParam = (ClipInfoParam) obj;
            return Intrinsics.areEqual(this.f108805a, clipInfoParam.f108805a) && this.f108806b == clipInfoParam.f108806b && this.f108807c == clipInfoParam.f108807c;
        }

        @NotNull
        public final String getFilePath() {
            return this.f108805a;
        }

        public final long getUserVideoLength() {
            return this.f108806b;
        }

        public final boolean getVideoType() {
            return this.f108807c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f108807c) + C3554n0.a(this.f108805a.hashCode() * 31, 31, this.f108806b);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ClipInfoParam(filePath=");
            sb.append(this.f108805a);
            sb.append(", userVideoLength=");
            sb.append(this.f108806b);
            sb.append(", videoType=");
            return i.a(sb, this.f108807c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompilestrategy/IBVideoCompileStrategy$Param.class */
    public static final class Param {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<ClipInfoParam> f108808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f108809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f108810c;

        public Param(@NotNull List<ClipInfoParam> list, int i7, int i8) {
            this.f108808a = list;
            this.f108809b = i7;
            this.f108810c = i8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Param copy$default(Param param, List list, int i7, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                list = param.f108808a;
            }
            if ((i9 & 2) != 0) {
                i7 = param.f108809b;
            }
            if ((i9 & 4) != 0) {
                i8 = param.f108810c;
            }
            return param.copy(list, i7, i8);
        }

        @NotNull
        public final List<ClipInfoParam> component1() {
            return this.f108808a;
        }

        public final int component2() {
            return this.f108809b;
        }

        public final int component3() {
            return this.f108810c;
        }

        @NotNull
        public final Param copy(@NotNull List<ClipInfoParam> list, int i7, int i8) {
            return new Param(list, i7, i8);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Param)) {
                return false;
            }
            Param param = (Param) obj;
            return Intrinsics.areEqual(this.f108808a, param.f108808a) && this.f108809b == param.f108809b && this.f108810c == param.f108810c;
        }

        public final int getCanvasHeight() {
            return this.f108810c;
        }

        public final int getCanvasWidth() {
            return this.f108809b;
        }

        @NotNull
        public final List<ClipInfoParam> getClips() {
            return this.f108808a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f108810c) + I.a(this.f108809b, this.f108808a.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sbA = M.a("Param(clips=", ", canvasWidth=", this.f108808a);
            sbA.append(this.f108809b);
            sbA.append(", canvasHeight=");
            return C4277b.a(this.f108810c, ")", sbA);
        }
    }

    @NotNull
    BExportStrategy getFinalExportStrategy(@NotNull BExportStrategy bExportStrategy, int i7, int i8, @Nullable Integer num, @Nullable Integer num2, @Nullable Float f7);

    @NotNull
    BExportStrategy getRecommendedExportStrategy(@NotNull Param param);
}
