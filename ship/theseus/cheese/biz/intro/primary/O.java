package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kntr.app.game.gamebind.bean.RoleItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/O.class */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f89651a;

    static {
        final int i7 = 0;
        f89651a = ComposableLambdaKt.composableLambdaInstance(1257488298, false, new Function2(i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.N

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f89650a;

            {
                this.f89650a = i7;
            }

            public final Object invoke(Object obj, Object obj2) {
                switch (this.f89650a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1257488298, iIntValue, -1, "com.bilibili.ship.theseus.cheese.biz.intro.primary.ComposableSingletons$CheesePrimaryFloatLayerComponentKt.lambda$1257488298.<anonymous> (CheesePrimaryFloatLayerComponent.kt:233)");
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    default:
                        ((Integer) obj).intValue();
                        return ((RoleItem) obj2).getId();
                }
            }
        });
    }
}
