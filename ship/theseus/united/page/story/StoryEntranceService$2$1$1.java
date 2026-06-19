package com.bilibili.ship.theseus.united.page.story;

import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryEntranceService$2$1$1.class */
public final class StoryEntranceService$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $actionType;
    int label;
    final StoryEntranceService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryEntranceService$2$1$1(StoryEntranceService storyEntranceService, String str, Continuation<? super StoryEntranceService$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = storyEntranceService;
        this.$actionType = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(StoryEntranceService storyEntranceService, String str) {
        storyEntranceService.d();
        storyEntranceService.a(str, true);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StoryEntranceService$2$1$1(this.this$0, this.$actionType, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PageReportService.g(this.this$0.f103026l, "united.player-video-detail.story-back.type.click", MapsKt.mapOf(TuplesKt.to("back_way", "1")), 4);
            final StoryEntranceService storyEntranceService = this.this$0;
            StoryTransitionAnimService storyTransitionAnimService = storyEntranceService.f103031q;
            final String str = this.$actionType;
            Function0 function0 = new Function0(storyEntranceService, str) { // from class: com.bilibili.ship.theseus.united.page.story.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final StoryEntranceService f103084a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f103085b;

                {
                    this.f103084a = storyEntranceService;
                    this.f103085b = str;
                }

                public final Object invoke() {
                    return StoryEntranceService$2$1$1.invokeSuspend$lambda$0(this.f103084a, this.f103085b);
                }
            };
            this.label = 1;
            if (storyTransitionAnimService.a(function0, false, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
