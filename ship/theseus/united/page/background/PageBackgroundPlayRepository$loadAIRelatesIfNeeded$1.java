package com.bilibili.ship.theseus.united.page.background;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
import com.bapis.bilibili.app.view.v1.ContinuousPlayReply;
import com.bapis.bilibili.app.view.v1.ContinuousPlayReq;
import com.bapis.bilibili.app.view.v1.Relate;
import com.bapis.bilibili.app.view.v1.ViewMoss;
import com.bapis.bilibili.app.view.v1.ViewMossKtxKt;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.biliid.api.EnvironmentManager;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.playerbizcommon.utils.PlayUrlFlagsManager;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import tv.danmaku.android.log.BLog;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1.class */
public final class PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final GeminiCommonPlayableParams $anchor;
    int label;
    final PageBackgroundPlayRepository this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final GeminiCommonPlayableParams $anchor;
        int label;
        final PageBackgroundPlayRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1$1$1.class */
        public static final class C09451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final GeminiCommonPlayableParams $anchor;
            int label;
            final PageBackgroundPlayRepository this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1$1$1$1.class */
            public static final class C09461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final ContinuousPlayReply $continuousPlayReply;
                int label;
                final PageBackgroundPlayRepository this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09461(PageBackgroundPlayRepository pageBackgroundPlayRepository, ContinuousPlayReply continuousPlayReply, Continuation<? super C09461> continuation) {
                    super(2, continuation);
                    this.this$0 = pageBackgroundPlayRepository;
                    this.$continuousPlayReply = continuousPlayReply;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C09461(this.this$0, this.$continuousPlayReply, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.this$0.d()) {
                        List<Relate> relatesList = this.$continuousPlayReply.getRelatesList();
                        PageBackgroundPlayRepository pageBackgroundPlayRepository = this.this$0;
                        for (Relate relate : relatesList) {
                            pageBackgroundPlayRepository.f98999i.add(new a(8, relate.getAid(), relate.getCid(), relate.getTrackid()));
                        }
                        this.this$0.f99008r.tryEmit(Unit.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09451(GeminiCommonPlayableParams geminiCommonPlayableParams, PageBackgroundPlayRepository pageBackgroundPlayRepository, Continuation<? super C09451> continuation) {
                super(2, continuation);
                this.$anchor = geminiCommonPlayableParams;
                this.this$0 = pageBackgroundPlayRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C09451(this.$anchor, this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                List relatesList;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                try {
                    try {
                    } catch (Exception e7) {
                        BLog.e("PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1$1$1-invokeSuspend", "[theseus-united-PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1$1$1-invokeSuspend] Request ai relates failed!!!", e7);
                    }
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        BLog.i("PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1$1$1-invokeSuspend", "[theseus-united-PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1$1$1-invokeSuspend] start to load ai relates.");
                        ContinuousPlayReq.b deviceType = ContinuousPlayReq.newBuilder().setAid(this.$anchor.getAvid()).setFrom("9501").setTrackid(this.$anchor.getTrackId()).setSpmid(this.$anchor.getSpmid()).setFromSpmid(this.$anchor.getFromSpmid()).setAutoplay(this.$anchor.getFromAutoPlay()).setPlayerArgs((PlayerArgs) PlayerArgs.newBuilder().setQn(PlayerSettingHelper.getDefaultQuality()).setFnver(PlayUrlFlagsManager.getFnVer()).setFnval(PlayUrlFlagsManager.getFnVal()).setSoftFnval(PlayUrlFlagsManager.getSoftFnVal()).setForceHost(PlayerSettingHelper.getForceHost()).setVoiceBalance(IjkOptionsHelper.getVolumeBalance() ? 1L : 0L).putAllExtraContent(dj1.b.a()).build()).setDeviceType(EnvironmentManager.getInstance().isFirstStart() ? 1L : 0L);
                        String str = this.this$0.h;
                        String str2 = str;
                        if (str == null) {
                            str2 = "";
                        }
                        ContinuousPlayReq.b sessionId = deviceType.setSessionId(str2);
                        PageBackgroundPlayRepository pageBackgroundPlayRepository = this.this$0;
                        long j7 = pageBackgroundPlayRepository.f98998g;
                        pageBackgroundPlayRepository.f98998g = 1 + j7;
                        ContinuousPlayReq continuousPlayReqBuild = sessionId.setDisplayId(j7).build();
                        ViewMoss viewMoss = new ViewMoss("IGNORED IN 5.46 AS PLACEHOLDER", 443, (CallOptions) null, 4, (DefaultConstructorMarker) null);
                        this.label = 1;
                        Object objSuspendContinuousPlay = ViewMossKtxKt.suspendContinuousPlay(viewMoss, continuousPlayReqBuild, this);
                        obj = objSuspendContinuousPlay;
                        if (objSuspendContinuousPlay == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    ContinuousPlayReply continuousPlayReply = (ContinuousPlayReply) obj;
                    BLog.i("PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1$1$1-invokeSuspend", "[theseus-united-PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1$1$1-invokeSuspend] " + ("Request ai relates success, size:" + ((continuousPlayReply == null || (relatesList = continuousPlayReply.getRelatesList()) == null) ? null : Boxing.boxInt(relatesList.size()))));
                    if (continuousPlayReply != null) {
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        C09461 c09461 = new C09461(this.this$0, continuousPlayReply, null);
                        this.label = 2;
                        if (BuildersKt.withContext(main, c09461, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                } finally {
                    this.this$0.f98996e = false;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GeminiCommonPlayableParams geminiCommonPlayableParams, PageBackgroundPlayRepository pageBackgroundPlayRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$anchor = geminiCommonPlayableParams;
            this.this$0 = pageBackgroundPlayRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$anchor, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C09451 c09451 = new C09451(this.$anchor, this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c09451, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1(GeminiCommonPlayableParams geminiCommonPlayableParams, PageBackgroundPlayRepository pageBackgroundPlayRepository, Continuation<? super PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1> continuation) {
        super(2, continuation);
        this.$anchor = geminiCommonPlayableParams;
        this.this$0 = pageBackgroundPlayRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PageBackgroundPlayRepository$loadAIRelatesIfNeeded$1(this.$anchor, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$anchor, this.this$0, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
