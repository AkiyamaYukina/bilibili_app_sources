package com.bilibili.ship.theseus.united.page.background;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import j4.t;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.k;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundResourceService.class */
@StabilityInferred(parameters = 0)
public final class PageBackgroundResourceService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f99029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f99030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final e f99031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f99032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final k f99033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f99034g = new a(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundResourceService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundResourceService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final PageBackgroundResourceService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PageBackgroundResourceService pageBackgroundResourceService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pageBackgroundResourceService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (this.this$0.f99030c.d()) {
                PageBackgroundResourceService.a(this.this$0);
                PageBackgroundResourceService pageBackgroundResourceService = this.this$0;
                pageBackgroundResourceService.f99029b.addCloudConfigObserver(pageBackgroundResourceService.f99034g);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PageBackgroundResourceService$1$invokeSuspend$$inlined$awaitCancel$1(null, this.this$0), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundResourceService$a.class */
    public static final class a implements tv.danmaku.biliplayerv2.service.setting.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PageBackgroundResourceService f99035a;

        public a(PageBackgroundResourceService pageBackgroundResourceService) {
            this.f99035a = pageBackgroundResourceService;
        }

        public final void c() {
            PageBackgroundResourceService.a(this.f99035a);
        }
    }

    @Inject
    public PageBackgroundResourceService(@NotNull CoroutineScope coroutineScope, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull e eVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull k kVar) {
        this.f99028a = coroutineScope;
        this.f99029b = iPlayerSettingService;
        this.f99030c = pageBackgroundPlayRepository;
        this.f99031d = eVar;
        this.f99032e = iPlayerCoreService;
        this.f99033f = kVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static final void a(PageBackgroundResourceService pageBackgroundResourceService) {
        boolean zD = pageBackgroundResourceService.f99030c.d();
        boolean z6 = true;
        e eVar = pageBackgroundResourceService.f99031d;
        if (zD) {
            IPlayerSettingService iPlayerSettingService = pageBackgroundResourceService.f99029b;
            if (!iPlayerSettingService.getCloudConfig().s() || iPlayerSettingService.getCloudConfig().h()) {
                t.a("actionNext:", "PageBResService", eVar.f99044d);
                boolean z7 = eVar.f99044d;
                k kVar = pageBackgroundResourceService.f99033f;
                if (z7) {
                    kVar.switchToNext(iPlayerSettingService.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0) == 4);
                    return;
                }
                if (iPlayerSettingService.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0) != 4) {
                    z6 = false;
                }
                kVar.switchToPrevious(z6);
                return;
            }
        }
        eVar.f99044d = true;
    }
}
