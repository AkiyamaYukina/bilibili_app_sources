package com.bilibili.ship.theseus.playlist.di.biz.ugc;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.playlist.PlaylistOrderEnum;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.ToolbarListenRepository;
import com.bilibili.ship.theseus.united.page.toolbar.j;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistListenClickService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistListenClickService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Activity f95375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ToolbarListenRepository f95376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final j f95377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8043a f95379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f95380g;

    @NotNull
    public final IPlayerSettingService h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.ugc.PlaylistListenClickService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistListenClickService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistListenClickService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.ugc.PlaylistListenClickService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistListenClickService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistListenClickService f95381a;

            public a(PlaylistListenClickService playlistListenClickService) {
                this.f95381a = playlistListenClickService;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                PlaylistListenClickService.a(this.f95381a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistListenClickService playlistListenClickService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistListenClickService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlaylistListenClickService playlistListenClickService = this.this$0;
                SharedFlow<Unit> sharedFlow = playlistListenClickService.f95376c.h;
                a aVar = new a(playlistListenClickService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.ugc.PlaylistListenClickService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistListenClickService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistListenClickService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.ugc.PlaylistListenClickService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistListenClickService$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistListenClickService f95382a;

            public a(PlaylistListenClickService playlistListenClickService) {
                this.f95382a = playlistListenClickService;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                PlaylistListenClickService.a(this.f95382a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlaylistListenClickService playlistListenClickService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playlistListenClickService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlaylistListenClickService playlistListenClickService = this.this$0;
                SharedFlow<Unit> sharedFlow = playlistListenClickService.f95377d.f103403g;
                a aVar = new a(playlistListenClickService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistListenClickService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f95383a;

        static {
            int[] iArr = new int[PlaylistOrderEnum.values().length];
            try {
                iArr[PlaylistOrderEnum.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlaylistOrderEnum.REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PlaylistOrderEnum.RANDOM.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[PlaylistOrderEnum.LATEST_PUBLISH.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[PlaylistOrderEnum.MOST_PLAY.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f95383a = iArr;
        }
    }

    @Inject
    public PlaylistListenClickService(@NotNull CoroutineScope coroutineScope, @NotNull Activity activity, @NotNull ToolbarListenRepository toolbarListenRepository, @NotNull j jVar, @NotNull PlaylistRepository playlistRepository, @NotNull C8043a c8043a, @NotNull h hVar, @NotNull IPlayerSettingService iPlayerSettingService) {
        this.f95374a = coroutineScope;
        this.f95375b = activity;
        this.f95376c = toolbarListenRepository;
        this.f95377d = jVar;
        this.f95378e = playlistRepository;
        this.f95379f = c8043a;
        this.f95380g = hVar;
        this.h = iPlayerSettingService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.bilibili.ship.theseus.united.utils.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.bilibili.ship.theseus.playlist.di.biz.ugc.PlaylistListenClickService r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.biz.ugc.PlaylistListenClickService.a(com.bilibili.ship.theseus.playlist.di.biz.ugc.PlaylistListenClickService):void");
    }
}
