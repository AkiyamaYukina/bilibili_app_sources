package com.bilibili.ogv.story;

import com.bilibili.bangumi.data.page.detail.SeasonRepository;
import com.bilibili.bangumi.data.page.detail.a;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.detail.vo.BangumiRouterParams;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStorySeasonListDialog$loadStorySeason$1.class */
public final class OgvStorySeasonListDialog$loadStorySeason$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final OgvStorySeasonListDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvStorySeasonListDialog$loadStorySeason$1(OgvStorySeasonListDialog ogvStorySeasonListDialog, Continuation<? super OgvStorySeasonListDialog$loadStorySeason$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvStorySeasonListDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvStorySeasonListDialog$loadStorySeason$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SeasonRepository seasonRepository = SeasonRepository.a;
                OgvStorySeasonListDialog ogvStorySeasonListDialog = this.this$0;
                int i8 = OgvStorySeasonListDialog.f73031n;
                ogvStorySeasonListDialog.getClass();
                a.a aVar = new a.a(BangumiRouterParams.SeasonMode.NORMAL, (Long) null, ogvStorySeasonListDialog.f73032a, ((Number) ogvStorySeasonListDialog.f73033b.getValue()).longValue(), -1, ogvStorySeasonListDialog.f73035d, "", ogvStorySeasonListDialog.f73036e, ogvStorySeasonListDialog.f73037f, -1);
                int i9 = this.this$0.f73034c;
                this.label = 1;
                Object objA = seasonRepository.a(aVar, true, i9, this);
                obj = objA;
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.f73042l.q((BangumiUniformSeason) obj);
            this.this$0.f73042l.v(false);
            this.this$0.f73042l.s(false);
        } catch (Exception e7) {
            this.this$0.f73042l.v(false);
            this.this$0.f73042l.s(true);
            com.bilibili.biligame.dialogdispatcher.e.a("[ogv-story-OgvStorySeasonListDialog$loadStorySeason$1-invokeSuspend] ", e7.getMessage(), "OgvStorySeasonListDialog$loadStorySeason$1-invokeSuspend", e7);
        }
        return Unit.INSTANCE;
    }
}
