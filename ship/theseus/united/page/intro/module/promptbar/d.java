package com.bilibili.ship.theseus.united.page.intro.module.promptbar;

import androidx.compose.material.s5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.bilibili.ship.theseus.united.page.intro.module.promptbar.w;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/d.class */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f100711a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1686060606, iIntValue, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.bindToView.<anonymous>.<anonymous> (PromptBarUIComponent.kt:44)");
            }
            w wVar = this.f100711a;
            int i7 = w.b.f100775a[wVar.f100770a.i().ordinal()];
            PromptBarVo promptBarVo = wVar.f100770a;
            if (i7 == 1) {
                composer.startReplaceGroup(-1101568717);
                wVar.h(promptBarVo, composer, 0);
                composer.endReplaceGroup();
            } else if (i7 == 2) {
                composer.startReplaceGroup(-1101565547);
                wVar.i(promptBarVo, composer, 0);
                composer.endReplaceGroup();
            } else if (i7 == 3) {
                composer.startReplaceGroup(211312526);
                if (promptBarVo.a().size() == 1) {
                    composer.startReplaceGroup(211377533);
                    wVar.j(promptBarVo, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(211481941);
                    wVar.i(promptBarVo, composer, 0);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                if (i7 != 4) {
                    throw s5.a(composer, -1101570496);
                }
                composer.startReplaceGroup(-1101550891);
                wVar.g(promptBarVo, composer, 0);
                composer.endReplaceGroup();
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
