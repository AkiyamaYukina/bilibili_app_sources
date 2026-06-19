package com.bilibili.ship.theseus.united.page.intro.module.promptbar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.operation3.module.list.MoreLoadingState;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import kl0.C7772a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/n.class */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f100749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f100750d;

    public /* synthetic */ n(int i7, int i8, Object obj, Object obj2) {
        this.f100747a = i8;
        this.f100749c = obj;
        this.f100750d = obj2;
        this.f100748b = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f100747a) {
            case 0:
                num.intValue();
                ((w) this.f100749c).g((PromptBarVo) this.f100750d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f100748b | 1));
                break;
            default:
                num.getClass();
                C7772a.a((MoreLoadingState) this.f100749c, (Modifier) this.f100750d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f100748b | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
