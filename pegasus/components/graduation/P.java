package com.bilibili.pegasus.components.graduation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.neuron.api.Neurons;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/P.class */
@StabilityInferred(parameters = 1)
public final class P {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/P$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f76087a;

        static {
            int[] iArr = new int[GraduationSeasonAnalysisDialogType.values().length];
            try {
                iArr[GraduationSeasonAnalysisDialogType.ANALYSIS.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[GraduationSeasonAnalysisDialogType.THIS_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[GraduationSeasonAnalysisDialogType.YEAR_HOT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[GraduationSeasonAnalysisDialogType.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f76087a = iArr;
        }
    }

    public static void a(int i7, int i8) {
        Neurons.reportClick(true, "activity.graduation-report.share-or-exit.0.click", MapsKt.plus(MapsKt.plus(MapsKt.mapOf(new Pair[]{TuplesKt.to("from_spmid", "activity.graduation.recommend-page.0"), TuplesKt.to("spmid", "activity.graduation-report.share-or-exit.0")}), MapsKt.mapOf(TuplesKt.to("graduation_report_type", String.valueOf(i7)))), MapsKt.mapOf(TuplesKt.to("click_type", String.valueOf(i8)))));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static int b(@NotNull GraduationSeasonAnalysisDialogType graduationSeasonAnalysisDialogType) throws NoWhenBranchMatchedException {
        int i7 = a.f76087a[graduationSeasonAnalysisDialogType.ordinal()];
        int i8 = 1;
        if (i7 != 1) {
            i8 = 2;
            if (i7 != 2) {
                i8 = 3;
                if (i7 != 3) {
                    if (i7 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i8 = 0;
                }
            }
        }
        return i8;
    }
}
