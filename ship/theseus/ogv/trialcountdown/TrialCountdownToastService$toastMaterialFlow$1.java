package com.bilibili.ship.theseus.ogv.trialcountdown;

import android.util.Range;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/trialcountdown/TrialCountdownToastService$toastMaterialFlow$1.class */
public final class TrialCountdownToastService$toastMaterialFlow$1 extends SuspendLambda implements Function5<ExtraInfo, PlayerAvailability, sb0.c, Boolean, Continuation<? super Pair<? extends FullPromptBarVo, ? extends Duration>>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;

    public TrialCountdownToastService$toastMaterialFlow$1(Continuation<? super TrialCountdownToastService$toastMaterialFlow$1> continuation) {
        super(5, continuation);
    }

    public final Object invoke(ExtraInfo extraInfo, PlayerAvailability playerAvailability, sb0.c cVar, boolean z6, Continuation<? super Pair<FullPromptBarVo, Duration>> continuation) {
        TrialCountdownToastService$toastMaterialFlow$1 trialCountdownToastService$toastMaterialFlow$1 = new TrialCountdownToastService$toastMaterialFlow$1(continuation);
        trialCountdownToastService$toastMaterialFlow$1.L$0 = extraInfo;
        trialCountdownToastService$toastMaterialFlow$1.L$1 = playerAvailability;
        trialCountdownToastService$toastMaterialFlow$1.L$2 = cVar;
        trialCountdownToastService$toastMaterialFlow$1.Z$0 = z6;
        return trialCountdownToastService$toastMaterialFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke((ExtraInfo) obj, (PlayerAvailability) obj2, (sb0.c) obj3, ((Boolean) obj4).booleanValue(), (Continuation<? super Pair<FullPromptBarVo, Duration>>) obj5);
    }

    public final Object invokeSuspend(Object obj) {
        FullPromptBarVo fullPromptBarVo;
        Range range;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ExtraInfo extraInfo = (ExtraInfo) this.L$0;
        PlayerAvailability playerAvailability = (PlayerAvailability) this.L$1;
        sb0.c cVar = (sb0.c) this.L$2;
        boolean z6 = this.Z$0;
        if (extraInfo == null || (fullPromptBarVo = (FullPromptBarVo) vv0.d.f128455c.a(extraInfo)) == null) {
            return null;
        }
        if (Duration.compareTo-LRDsOJo(fullPromptBarVo.f102382d, Duration.Companion.getZERO-UwyO8pc()) <= 0 || z6) {
            return null;
        }
        if ((playerAvailability == PlayerAvailability.READY || playerAvailability == PlayerAvailability.LOADING) && (range = cVar.c) != null) {
            return new Pair(fullPromptBarVo, range.getUpper());
        }
        return null;
    }
}
