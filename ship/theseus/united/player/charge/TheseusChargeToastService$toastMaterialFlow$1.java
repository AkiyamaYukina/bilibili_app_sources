package com.bilibili.ship.theseus.united.player.charge;

import X1.C3081k;
import android.util.Range;
import com.bapis.bilibili.playershared.FragmentVideo;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function6;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$toastMaterialFlow$1.class */
public final class TheseusChargeToastService$toastMaterialFlow$1 extends SuspendLambda implements Function6<ExtraInfo, Boolean, sb0.c, Boolean, Boolean, Continuation<? super Pair<? extends FullPromptBarVo, ? extends Duration>>, Object> {
    Object L$0;
    Object L$1;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    final TheseusChargeToastService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusChargeToastService$toastMaterialFlow$1(TheseusChargeToastService theseusChargeToastService, Continuation<? super TheseusChargeToastService$toastMaterialFlow$1> continuation) {
        super(6, continuation);
        this.this$0 = theseusChargeToastService;
    }

    public final Object invoke(ExtraInfo extraInfo, boolean z6, sb0.c cVar, boolean z7, boolean z8, Continuation<? super Pair<FullPromptBarVo, Duration>> continuation) {
        TheseusChargeToastService$toastMaterialFlow$1 theseusChargeToastService$toastMaterialFlow$1 = new TheseusChargeToastService$toastMaterialFlow$1(this.this$0, continuation);
        theseusChargeToastService$toastMaterialFlow$1.L$0 = extraInfo;
        theseusChargeToastService$toastMaterialFlow$1.Z$0 = z6;
        theseusChargeToastService$toastMaterialFlow$1.L$1 = cVar;
        theseusChargeToastService$toastMaterialFlow$1.Z$1 = z7;
        theseusChargeToastService$toastMaterialFlow$1.Z$2 = z8;
        return theseusChargeToastService$toastMaterialFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke((ExtraInfo) obj, ((Boolean) obj2).booleanValue(), (sb0.c) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue(), (Continuation<? super Pair<FullPromptBarVo, Duration>>) obj6);
    }

    public final Object invokeSuspend(Object obj) {
        FullPromptBarVo fullPromptBarVo;
        long duration;
        Duration upper;
        List videosList;
        Duration upper2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ExtraInfo extraInfo = (ExtraInfo) this.L$0;
        boolean z6 = this.Z$0;
        sb0.c cVar = (sb0.c) this.L$1;
        boolean z7 = this.Z$1;
        boolean z8 = this.Z$2;
        if (extraInfo == null || (fullPromptBarVo = (FullPromptBarVo) vv0.d.f128455c.a(extraInfo)) == null) {
            return null;
        }
        if (cVar.a != null) {
            Range range = cVar.c;
            if (Duration.compareTo-LRDsOJo((range == null || (upper2 = range.getUpper()) == null) ? Duration.Companion.getZERO-UwyO8pc() : upper2.unbox-impl(), cVar.a.unbox-impl()) >= 0) {
                return null;
            }
        }
        long j7 = Duration.Companion.getZERO-UwyO8pc();
        long j8 = fullPromptBarVo.f102382d;
        if (Duration.compareTo-LRDsOJo(j8, j7) <= 0 || !z6 || z7 || !z8) {
            defpackage.a.b("[theseus-united-TheseusChargeToastService$toastMaterialFlow$1-invokeSuspend] ", com.bilibili.bplus.im.protobuf.b.b(C3081k.b("state error! countdown ", Duration.toString-impl(j8), ", playerAvailable ", ", occupiedState ", z6), z7, ", toastAvailable ", z8), "TheseusChargeToastService$toastMaterialFlow$1-invokeSuspend");
            return null;
        }
        Duration durationQ = this.this$0.f104399d.q();
        FragmentVideo fragmentVideo = (FragmentVideo) vv0.d.f128454b.a(extraInfo);
        if (fragmentVideo == null || (videosList = fragmentVideo.getVideosList()) == null || !(!videosList.isEmpty())) {
            durationQ = null;
        }
        if (durationQ != null) {
            duration = durationQ.unbox-impl();
        } else {
            TheseusChargeToastService theseusChargeToastService = this.this$0;
            Range range2 = cVar.c;
            if (range2 == null || (upper = range2.getUpper()) == null) {
                Integer numBoxInt = Boxing.boxInt(theseusChargeToastService.f104400e.getRealDuration());
                if (numBoxInt.intValue() <= 0) {
                    numBoxInt = null;
                }
                if (numBoxInt == null) {
                    return null;
                }
                duration = DurationKt.toDuration(numBoxInt.intValue(), DurationUnit.MILLISECONDS);
            } else {
                duration = upper.unbox-impl();
            }
        }
        return new Pair(fullPromptBarVo, Duration.box-impl(duration));
    }
}
