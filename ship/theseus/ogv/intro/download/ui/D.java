package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpanKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/D.class */
public final /* synthetic */ class D implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f92427b;

    public /* synthetic */ D(Object obj, int i7) {
        this.f92426a = i7;
        this.f92427b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.f92426a) {
            case 0:
                return GridItemSpan.m1425boximpl(LazyGridSpanKt.GridItemSpan(((d0) this.f92427b).f92544b == DownloadItemStyle.GRID ? 1 : ((LazyGridItemSpanScope) obj).getMaxLineSpan()));
            default:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1209695625, iIntValue, -1, "kntr.app.ad.common.inspector.ui.main.request.RequestDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RequestDetailScreen.kt:440)");
                    }
                    kntr.app.ad.common.inspector.core.work.r rVar = (kntr.app.ad.common.inspector.core.work.r) this.f92427b;
                    String str = rVar.k;
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    int length = str2.length();
                    String str3 = rVar.k;
                    String strA = str3;
                    if (length > 100) {
                        String str4 = str3;
                        if (str3 == null) {
                            str4 = "";
                        }
                        strA = G.p.a(StringsKt.take(str4, 100), "...");
                    }
                    String str5 = strA;
                    if (strA == null) {
                        str5 = "";
                    }
                    TextKt.m2186TextNvy7gAk(str5, PaddingKt.m1342padding3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(12)), ColorKt.Color(4285231744L), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 3, 0, null, TextStyle.m3586copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), 0L, TextUnitKt.getSp(12), null, null, null, FontFamily.Companion.getMonospace(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777181, null), composer, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 24960, 110584);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
