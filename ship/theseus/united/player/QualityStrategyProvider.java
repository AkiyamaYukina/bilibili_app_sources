package com.bilibili.ship.theseus.united.player;

import B41.m;
import F3.C1839u;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.z;
import com.bilibili.app.gemini.base.resolver.qn.AutoQualityControl;
import com.bilibili.app.gemini.base.resolver.qn.AutoQualityRange;
import com.bilibili.app.gemini.base.resolver.qn.QualityScene;
import com.bilibili.player.tangram.playercore.F;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import com.bilibili.ship.theseus.united.page.playingarea.a;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import dagger.Module;
import kntr.common.behavior.prediction.h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import vk.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/QualityStrategyProvider.class */
@StabilityInferred(parameters = 0)
@Module
public final class QualityStrategyProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f104308a = LazyKt.lazy(new C1839u(11));

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static String a(f fVar) throws NoWhenBranchMatchedException {
        String strValueOf;
        if (fVar instanceof f.d) {
            strValueOf = String.valueOf(((f.d) fVar).f104521a.getAvid());
        } else if (fVar instanceof f.e) {
            strValueOf = String.valueOf(((f.e) fVar).f104523a.f117673b);
        } else if (fVar instanceof f.a) {
            strValueOf = String.valueOf(((f.a) fVar).f104514a.f117639b);
        } else if (fVar instanceof f.c) {
            strValueOf = String.valueOf(((f.c) fVar).f104516a.getPlayArc().getAid());
        } else {
            if (!(fVar instanceof f.b)) {
                throw new NoWhenBranchMatchedException();
            }
            strValueOf = String.valueOf(((f.b) fVar).f104515a.f117647c);
        }
        return strValueOf;
    }

    public static boolean b() {
        return ((Boolean) f104308a.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0341  */
    /* JADX WARN: Type inference failed for: r0v103, types: [com.bilibili.ship.theseus.united.player.b] */
    /* JADX WARN: Type inference failed for: r0v92, types: [com.bilibili.ship.theseus.united.player.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bilibili.player.tangram.playercore.E c(kotlinx.coroutines.CoroutineScope r18, final com.bilibili.ship.theseus.united.page.screenstate.c r19, final com.bilibili.ship.theseus.united.player.mediaplay.f r20, final com.bilibili.app.gemini.base.resolver.qn.AutoQualityRange r21, final com.bilibili.ship.theseus.united.page.playingarea.a r22, final boolean r23, com.bilibili.ship.theseus.keel.player.h r24, com.bilibili.ship.theseus.united.page.videoquality.C6435i r25) {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.QualityStrategyProvider.c(kotlinx.coroutines.CoroutineScope, com.bilibili.ship.theseus.united.page.screenstate.c, com.bilibili.ship.theseus.united.player.mediaplay.f, com.bilibili.app.gemini.base.resolver.qn.AutoQualityRange, com.bilibili.ship.theseus.united.page.playingarea.a, boolean, com.bilibili.ship.theseus.keel.player.h, com.bilibili.ship.theseus.united.page.videoquality.i):com.bilibili.player.tangram.playercore.E");
    }

    public static ClosedRange d(Ref.ObjectRef objectRef, com.bilibili.ship.theseus.united.page.playingarea.a aVar, com.bilibili.ship.theseus.united.page.screenstate.c cVar, float f7, f fVar, AutoQualityRange autoQualityRange, int i7) {
        ClosedRange highRatio;
        if ((i7 & 32) != 0) {
            autoQualityRange = (AutoQualityRange) objectRef.element;
        }
        a.C1102a c1102aE = e(aVar, f7, aVar.c(), !cVar.h().f102988b);
        int i8 = c1102aE.f102351a;
        int i9 = c1102aE.f102352b;
        QualityScene qualitySceneA = vk.a.a(autoQualityRange, i8, i9);
        int i10 = a.a.a[vk.a.a(autoQualityRange, i8, i9).ordinal()];
        if (i10 == 1) {
            highRatio = autoQualityRange.getHighRatio();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            highRatio = autoQualityRange.getLowRatio();
        }
        ClosedRange closedRangeH = h(F.c(highRatio), fVar, qualitySceneA, autoQualityRange);
        defpackage.a.b("[theseus-united-QualityStrategyProvider-rangeQualityStrategy$currentAutoQualityRange] ", "Quality Strategy current auto range:" + closedRangeH + " width:" + i8 + " height:" + i9 + " autoQualityRange:" + autoQualityRange + " scene:" + qualitySceneA, "QualityStrategyProvider-rangeQualityStrategy$currentAutoQualityRange");
        return closedRangeH;
    }

    public static final a.C1102a e(com.bilibili.ship.theseus.united.page.playingarea.a aVar, float f7, a.C1102a c1102a, boolean z6) {
        int i7;
        if (!z6 && c1102a.f102351a > 0 && c1102a.f102352b > 0) {
            return c1102a;
        }
        int i8 = c1102a.f102351a;
        int iIntValue = i8;
        if (i8 == 0) {
            iIntValue = ((Number) aVar.d().getFirst()).intValue();
        }
        float fE = aVar.e(new PlayingAreaDescription(f7));
        int iRoundToInt = !Float.isNaN(fE) ? MathKt.roundToInt(iIntValue / fE) : MathKt.roundToInt(iIntValue / 1.7777778f);
        return (!z6 || c1102a.f102351a <= 0 || (i7 = c1102a.f102352b) <= 0) ? new a.C1102a(iIntValue, iRoundToInt) : new a.C1102a(iIntValue, Math.min(iRoundToInt, i7));
    }

    public static QualityScene f(com.bilibili.ship.theseus.united.page.playingarea.a aVar, com.bilibili.ship.theseus.united.page.screenstate.c cVar, Ref.ObjectRef objectRef, float f7, a.C1102a c1102a, int i7) {
        if ((i7 & 16) != 0) {
            c1102a = e(aVar, f7, aVar.c(), !cVar.h().f102988b);
        }
        return vk.a.a((AutoQualityRange) objectRef.element, c1102a.f102351a, c1102a.f102352b);
    }

    public static final void g(boolean z6, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow2, Ref.BooleanRef booleanRef, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow3, Ref.ObjectRef<AutoQualityRange> objectRef, com.bilibili.ship.theseus.united.page.playingarea.a aVar, com.bilibili.ship.theseus.united.page.screenstate.c cVar, float f7, f fVar, boolean z7, boolean z8) {
        ClosedRange closedRangeD = d(objectRef, aVar, cVar, f7, fVar, null, 96);
        if (z7 && z6) {
            mutableStateFlow.setValue(RangesKt.rangeTo(new com.bilibili.player.tangram.basic.a(0), new com.bilibili.player.tangram.basic.a(0)));
            mutableStateFlow2.setValue(RangesKt.rangeTo(new com.bilibili.player.tangram.basic.a(0), new com.bilibili.player.tangram.basic.a(0)));
        } else {
            if (booleanRef.element) {
                mutableStateFlow.setValue(RangesKt.rangeTo(new com.bilibili.player.tangram.basic.a(Integer.MAX_VALUE), new com.bilibili.player.tangram.basic.a(Integer.MAX_VALUE)));
            } else if (z7 || ((z8 && z6) || com.bilibili.player.tangram.basic.a.c(((com.bilibili.player.tangram.basic.a) ((ClosedRange) mutableStateFlow.getValue()).getEndInclusive()).f79320a))) {
                mutableStateFlow.setValue(closedRangeD);
            }
            if (com.bilibili.player.tangram.basic.a.c(((com.bilibili.player.tangram.basic.a) closedRangeD.getEndInclusive()).f79320a) && Intrinsics.compare(((com.bilibili.player.tangram.basic.a) closedRangeD.getEndInclusive()).f79320a, ((com.bilibili.player.tangram.basic.a) ((ClosedRange) mutableStateFlow2.getValue()).getEndInclusive()).f79320a) > 0) {
                mutableStateFlow2.setValue(closedRangeD);
            }
        }
        mutableStateFlow3.setValue(mutableStateFlow2.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.ranges.ClosedRange h(kotlin.ranges.ClosedRange r7, com.bilibili.ship.theseus.united.player.mediaplay.f r8, com.bilibili.app.gemini.base.resolver.qn.QualityScene r9, com.bilibili.app.gemini.base.resolver.qn.AutoQualityRange r10) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.QualityStrategyProvider.h(kotlin.ranges.ClosedRange, com.bilibili.ship.theseus.united.player.mediaplay.f, com.bilibili.app.gemini.base.resolver.qn.QualityScene, com.bilibili.app.gemini.base.resolver.qn.AutoQualityRange):kotlin.ranges.ClosedRange");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static void i(AutoQualityControl autoQualityControl, f fVar) throws NoWhenBranchMatchedException {
        String feature;
        if (autoQualityControl == null || autoQualityControl.getFeature() == null) {
            return;
        }
        String strA = a(fVar);
        if (strA.length() <= 0 || (feature = autoQualityControl.getFeature()) == null || feature.length() == 0) {
            String feature2 = autoQualityControl.getFeature();
            defpackage.a.b("[theseus-united-QualityStrategyProvider-updateAiPredict] ", z.a("ai predict update fail avid:", strA, " feature:", feature2 != null ? feature2 : ""), "QualityStrategyProvider-updateAiPredict");
        } else {
            h hVar = h.b;
            String feature3 = autoQualityControl.getFeature();
            hVar.a(new m.a(strA, feature3 != null ? feature3 : ""));
        }
    }
}
