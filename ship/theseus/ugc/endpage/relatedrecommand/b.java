package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import I1.C2157f0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.B;
import com.bilibili.app.authorspace.ui.pages.p;
import com.bilibili.app.gemini.ugc.feature.o;
import com.bilibili.app.preferences.fragment.u0;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/b.class */
@StabilityInferred(parameters = 1)
public final class b {
    public static void a(int i7, @NotNull o oVar, @NotNull IReporterService iReporterService, @NotNull C7893a c7893a, @NotNull C8043a c8043a) {
        C7893a.C1318a c1318aC = c7893a.c();
        String strValueOf = String.valueOf(c1318aC != null ? Long.valueOf(c1318aC.f123395a.f123397a) : null);
        String str = c8043a.a().f123882d;
        String str2 = oVar.k;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = oVar.i;
        if (str3 == null) {
            str3 = "";
        }
        iReporterService.report(new NeuronsEvents.NormalEvent("player.player.full-endpage-relatedvideo.0.player", new String[]{"relatedvideo_position", String.valueOf(i7 + 1), GameCardButton.extraAvid, strValueOf, "track_id", str, "topic_track_id", str2, "goto", str3, "card_id", String.valueOf(oVar.m)}));
        BLog.i("UGCEndPageRecommendReporter", B.b(i7, oVar.m, "Reported click event for position ", ", avid: "));
    }

    public static void b(int i7, @NotNull o oVar, boolean z6, @NotNull C7893a c7893a, @NotNull C8043a c8043a) {
        if (z6 ? oVar.o : oVar.p) {
            BLog.d("UGCEndPageRecommendReporter", "Skip duplicate exposure report for position " + i7 + ", thumbScreenMode: " + z6);
            return;
        }
        if (z6) {
            oVar.o = true;
        } else {
            oVar.p = true;
        }
        C7893a.C1318a c1318aC = c7893a.c();
        long j7 = c1318aC != null ? c1318aC.f123395a.f123397a : 0L;
        String str = c8043a.a().f123882d;
        Pair pair = TuplesKt.to(GameCardButton.extraAvid, String.valueOf(j7));
        Pair pair2 = TuplesKt.to("track_id", str);
        String str2 = oVar.i;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        Pair pair3 = TuplesKt.to("goto", str3);
        Pair pair4 = TuplesKt.to("card_id", String.valueOf(oVar.m));
        Pair pairA = p.a(i7, 1, "relatedvideo_position");
        String str4 = oVar.k;
        if (str4 == null) {
            str4 = "";
        }
        Neurons.reportExposure$default(true, "player.player.full-endpage-relatedvideo.0.show", MapsKt.hashMapOf(new Pair[]{pair, pair2, pair3, pair4, pairA, TuplesKt.to("topic_track_id", str4)}), (List) null, 8, (Object) null);
        u0.a(C2157f0.a(i7, oVar.m, "Reported exposure event for position ", ", avid: "), ", thumbScreenMode: ", z6, "UGCEndPageRecommendReporter");
    }
}
