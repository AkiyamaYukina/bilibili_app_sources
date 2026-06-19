package com.bilibili.studio.videocompilestrategy;

import androidx.window.core.layout.WindowSizeClass;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompilestrategy/a.class */
public final class a implements IBVideoCompileStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RA0.a f108811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f108812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ResolutionLevel f108813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<ResolutionLevel> f108814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f108815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f108816f;

    /* JADX INFO: renamed from: com.bilibili.studio.videocompilestrategy.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompilestrategy/a$a.class */
    public static final class C1204a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f108817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f108818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f108819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f108820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f108821e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull RA0.a aVar, float f7, @NotNull ResolutionLevel resolutionLevel, @NotNull List<? extends ResolutionLevel> list, int i7, int i8) {
        this.f108811a = aVar;
        this.f108812b = f7;
        this.f108813c = resolutionLevel;
        this.f108814d = list;
        this.f108815e = i7;
        this.f108816f = i8;
    }

    public final ResolutionLevel a(int i7) {
        ResolutionLevel next;
        ResolutionLevel resolutionLevel = ResolutionLevel.RES_480;
        Iterator<ResolutionLevel> it = this.f108814d.iterator();
        do {
            next = resolutionLevel;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
        } while (next.getLevel() > i7);
        return next;
    }

    @Override // com.bilibili.studio.videocompilestrategy.IBVideoCompileStrategy
    @NotNull
    public final BExportStrategy getFinalExportStrategy(@NotNull BExportStrategy bExportStrategy, int i7, int i8, @Nullable Integer num, @Nullable Integer num2, @Nullable Float f7) {
        float fMin;
        int iIntValue = num != null ? num.intValue() : bExportStrategy.getResolution();
        ResolutionLevel resolutionLevel = this.f108813c;
        int iMin = (iIntValue != 2160 || this.f108815e > 1) ? Math.min(iIntValue, resolutionLevel.getLevel()) : Math.min(WindowSizeClass.WIDTH_DP_EXTRA_LARGE_LOWER_BOUND, resolutionLevel.getLevel());
        int iMin2 = Math.min(num2 != null ? num2.intValue() : bExportStrategy.getFps(), this.f108816f);
        float f8 = this.f108812b;
        if (f7 != null) {
            fMin = Math.min(f7.floatValue(), f8);
        } else {
            float f9 = i7 > 0 ? (i8 * 1.0f) / i7 : 1.0f;
            if (num != null) {
                float fIntValue = f9 <= 1.0f ? num.intValue() / f9 : num.intValue() * f9;
                RA0.a aVar = this.f108811a;
                if (iMin2 < 60) {
                    float fIntValue2 = num.intValue();
                    String str = (String) aVar.f20671a.invoke("video_compile_strategy.bitrate_grade_for_low_fps", "5.0");
                    fMin = Math.min(fIntValue2 * fIntValue * (str != null ? Float.parseFloat(str) : 5.0f), f8);
                } else {
                    float fIntValue3 = num.intValue();
                    String str2 = (String) aVar.f20671a.invoke("video_compile_strategy.bitrate_grade_for_high_fps", "6.0");
                    fMin = Math.min(fIntValue3 * fIntValue * (str2 != null ? Float.parseFloat(str2) : 6.0f), f8);
                }
            } else {
                fMin = Math.min(bExportStrategy.getBitrate(), f8);
            }
        }
        return new BExportStrategy(iMin, iMin2, fMin);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x034c A[Catch: IOException -> 0x040e, TRY_ENTER, TryCatch #4 {IOException -> 0x040e, blocks: (B:87:0x031a, B:99:0x038d, B:108:0x03ba, B:111:0x03f8, B:109:0x03da, B:91:0x034c), top: B:215:0x031a }] */
    @Override // com.bilibili.studio.videocompilestrategy.IBVideoCompileStrategy
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.studio.videocompilestrategy.BExportStrategy getRecommendedExportStrategy(@org.jetbrains.annotations.NotNull com.bilibili.studio.videocompilestrategy.IBVideoCompileStrategy.Param r8) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videocompilestrategy.a.getRecommendedExportStrategy(com.bilibili.studio.videocompilestrategy.IBVideoCompileStrategy$Param):com.bilibili.studio.videocompilestrategy.BExportStrategy");
    }
}
