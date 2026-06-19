package com.bilibili.ship.theseus.ugc.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.common.ModuleType;
import com.bapis.bilibili.app.viewunite.v1.AIRelateAsyncReply;
import com.bapis.bilibili.app.viewunite.v1.AIRelateAsyncReq;
import com.bapis.bilibili.app.viewunite.v1.AsyncModule;
import com.bilibili.ship.theseus.ugc.intro.videomentioned.module.n;
import com.bilibili.ship.theseus.united.page.ad.AdRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/relate/UgcAiRelateAsyncRepository.class */
@StabilityInferred(parameters = 0)
public final class UgcAiRelateAsyncRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DetailRelateService f98453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MerchandiseService f98454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final n f98455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IntroRecycleViewService f98456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f98457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final AdRepository f98458g;

    @NotNull
    public final Map<String, String> h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.relate.UgcAiRelateAsyncRepository$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/relate/UgcAiRelateAsyncRepository$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AIRelateAsyncReq $request;
        int label;
        final UgcAiRelateAsyncRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UgcAiRelateAsyncRepository ugcAiRelateAsyncRepository, AIRelateAsyncReq aIRelateAsyncReq, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ugcAiRelateAsyncRepository;
            this.$request = aIRelateAsyncReq;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$request, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            UgcAiRelateAsyncRepository ugcAiRelateAsyncRepository;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                try {
                    try {
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            BLog.i("UgcAiRelateAsyncRepository$3-invokeSuspend", "[theseus-ugc-UgcAiRelateAsyncRepository$3-invokeSuspend] AIRelateAsync request start");
                            CoroutineDispatcher io2 = Dispatchers.getIO();
                            UgcAiRelateAsyncRepository$3$reply$1 ugcAiRelateAsyncRepository$3$reply$1 = new UgcAiRelateAsyncRepository$3$reply$1(this.$request, null);
                            this.label = 1;
                            Object objWithContext = BuildersKt.withContext(io2, ugcAiRelateAsyncRepository$3$reply$1, this);
                            obj = objWithContext;
                            if (objWithContext == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        AIRelateAsyncReply aIRelateAsyncReply = (AIRelateAsyncReply) obj;
                        Boolean boolBoxBoolean = aIRelateAsyncReply != null ? Boxing.boxBoolean(aIRelateAsyncReply.hasCm()) : null;
                        Boolean boolBoxBoolean2 = aIRelateAsyncReply != null ? Boxing.boxBoolean(aIRelateAsyncReply.hasSupplement()) : null;
                        Integer numBoxInt = null;
                        if (aIRelateAsyncReply != null) {
                            AsyncModule module = aIRelateAsyncReply.getModule();
                            numBoxInt = null;
                            if (module != null) {
                                numBoxInt = Boxing.boxInt(module.getModulesCount());
                            }
                        }
                        BLog.i("UgcAiRelateAsyncRepository$3-invokeSuspend", "[theseus-ugc-UgcAiRelateAsyncRepository$3-invokeSuspend] " + ("AIRelateAsync request success, hasCm=" + boolBoxBoolean + ", hasSupplement=" + boolBoxBoolean2 + ", modulesCount=" + numBoxInt));
                        if (aIRelateAsyncReply != null) {
                            UgcAiRelateAsyncRepository.a(this.this$0, aIRelateAsyncReply);
                        }
                        BLog.i("UgcAiRelateAsyncRepository$3-invokeSuspend", "[theseus-ugc-UgcAiRelateAsyncRepository$3-invokeSuspend] AIRelateAsync deferred complete");
                        ugcAiRelateAsyncRepository = this.this$0;
                    } catch (CancellationException e7) {
                        throw e7;
                    }
                } catch (Exception e8) {
                    BLog.e("UgcAiRelateAsyncRepository$3-invokeSuspend", "[theseus-ugc-UgcAiRelateAsyncRepository$3-invokeSuspend] AIRelateAsync request failed", e8);
                    BLog.i("UgcAiRelateAsyncRepository$3-invokeSuspend", "[theseus-ugc-UgcAiRelateAsyncRepository$3-invokeSuspend] AIRelateAsync deferred complete");
                    ugcAiRelateAsyncRepository = this.this$0;
                }
                ugcAiRelateAsyncRepository.f98457f.f100864o.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLog.i("UgcAiRelateAsyncRepository$3-invokeSuspend", "[theseus-ugc-UgcAiRelateAsyncRepository$3-invokeSuspend] AIRelateAsync deferred complete");
                this.this$0.f98457f.f100864o.setValue(Boolean.TRUE);
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/relate/UgcAiRelateAsyncRepository$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f98459a;

        static {
            int[] iArr = new int[ModuleType.values().length];
            try {
                iArr[ModuleType.MERCHANDISE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ModuleType.VIDEO_MENTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ModuleType.RELATED_RECOMMEND.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f98459a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0134  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UgcAiRelateAsyncRepository(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r13, @org.jetbrains.annotations.Nullable com.bapis.bilibili.app.viewunite.ugcanymodel.ViewUgcAny r14, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService r15, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseService r16, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.ugc.intro.videomentioned.module.n r17, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService r18, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.view.a r19, @org.jetbrains.annotations.NotNull mv0.C8043a r20, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository r21, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.ad.AdRepository r22, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.ad.PageAdRepository r23, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository r24, @org.jetbrains.annotations.NotNull wv0.a r25, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r26, @org.jetbrains.annotations.NotNull java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.relate.UgcAiRelateAsyncRepository.<init>(kotlinx.coroutines.CoroutineScope, com.bapis.bilibili.app.viewunite.ugcanymodel.ViewUgcAny, com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService, com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseService, com.bilibili.ship.theseus.ugc.intro.videomentioned.module.n, com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService, com.bilibili.ship.theseus.united.page.view.a, mv0.a, com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository, com.bilibili.ship.theseus.united.page.ad.AdRepository, com.bilibili.ship.theseus.united.page.ad.PageAdRepository, com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository, wv0.a, java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.bilibili.ship.theseus.ugc.relate.UgcAiRelateAsyncRepository r7, com.bapis.bilibili.app.viewunite.v1.AIRelateAsyncReply r8) {
        /*
            Method dump skipped, instruction units count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.relate.UgcAiRelateAsyncRepository.a(com.bilibili.ship.theseus.ugc.relate.UgcAiRelateAsyncRepository, com.bapis.bilibili.app.viewunite.v1.AIRelateAsyncReply):void");
    }
}
