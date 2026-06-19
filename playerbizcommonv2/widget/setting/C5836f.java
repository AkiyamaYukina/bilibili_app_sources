package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.material.s5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.I0;
import com.bilibili.playerbizcommonv2.widget.setting.E;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/f.class */
public final /* synthetic */ class C5836f implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f83341a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        Modifier.Companion companion;
        int i7;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1021806584, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingSecondListCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PlayerSettingCompose.kt:539)");
            }
            F f7 = this.f83341a;
            int i8 = 0;
            for (Object obj4 : f7.f83089c) {
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                E e7 = (E) obj4;
                if (!(e7 instanceof E.a)) {
                    throw s5.a(composer, 1861166851);
                }
                composer.startReplaceGroup(1861672648);
                PlayerSettingComposeKt.e((E.a) e7, composer, 0);
                composer.endReplaceGroup();
                if (i8 != f7.f83089c.size() - 1) {
                    composer.startReplaceGroup(1861864104);
                    companion = Modifier.Companion;
                    i7 = 8;
                } else {
                    composer.startReplaceGroup(1862063527);
                    companion = Modifier.Companion;
                    i7 = 20;
                }
                I0.a(i7, 6, composer, companion);
                i8++;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
