package com.bilibili.ship.theseus.united.player.oldway;

import Fr0.j;
import Fr0.m;
import Fr0.q;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.service.audio.DolbyType;
import com.bilibili.playerbizcommonv2.service.audio.VideoType;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.view.t;
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
import kotlinx.coroutines.DelayKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IToastService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayInBusinessFusionService.class */
@StabilityInferred(parameters = 0)
public final class OldWayInBusinessFusionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C7893a f104654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final j f104655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BusinessType f104656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final t f104657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IToastService f104658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f104659g;

    @NotNull
    public final a h = new a(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayInBusinessFusionService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayInBusinessFusionService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OldWayInBusinessFusionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OldWayInBusinessFusionService oldWayInBusinessFusionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oldWayInBusinessFusionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                    OldWayInBusinessFusionService oldWayInBusinessFusionService = this.this$0;
                    oldWayInBusinessFusionService.f104655c.t(oldWayInBusinessFusionService.h);
                    oldWayInBusinessFusionService.f104658f.setToastAvailable(!oldWayInBusinessFusionService.f104657e.f104125a.f104104a.f104092a);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                OldWayInBusinessFusionService oldWayInBusinessFusionService2 = this.this$0;
                oldWayInBusinessFusionService2.f104655c.B(oldWayInBusinessFusionService2.h);
                oldWayInBusinessFusionService2.f104658f.setToastAvailable(oldWayInBusinessFusionService2.f104659g);
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayInBusinessFusionService$a.class */
    public static final class a extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OldWayInBusinessFusionService f104660a;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayInBusinessFusionService$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayInBusinessFusionService$a$a.class */
        public static final /* synthetic */ class C1170a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f104661a;

            static {
                int[] iArr = new int[BusinessType.values().length];
                try {
                    iArr[BusinessType.UGC.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[BusinessType.OGV.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[BusinessType.CHEESE.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                f104661a = iArr;
            }
        }

        public a(OldWayInBusinessFusionService oldWayInBusinessFusionService) {
            this.f104660a = oldWayInBusinessFusionService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // Fr0.p
        public final void onAudioStateChanged(boolean z6, int i7) throws NoWhenBranchMatchedException {
            VideoType videoType;
            OldWayInBusinessFusionService oldWayInBusinessFusionService = this.f104660a;
            C7893a.C1318a c1318aC = oldWayInBusinessFusionService.f104654b.c();
            if (c1318aC == null) {
                return;
            }
            int i8 = C1170a.f104661a[oldWayInBusinessFusionService.f104656d.ordinal()];
            if (i8 == 1) {
                videoType = VideoType.UGC;
            } else if (i8 == 2) {
                videoType = VideoType.PGC;
            } else {
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                videoType = VideoType.CHEESE;
            }
            if (z6) {
                C7893a.C1318a.C1319a c1319a = c1318aC.f123395a;
                m.a(c1319a.f123397a, c1319a.f123398b, DolbyType.AUDIO, videoType, "play");
            }
        }
    }

    @Inject
    public OldWayInBusinessFusionService(@NotNull CoroutineScope coroutineScope, @NotNull C7893a c7893a, @NotNull j jVar, @NotNull BusinessType businessType, @NotNull t tVar, @NotNull IToastService iToastService) {
        this.f104653a = coroutineScope;
        this.f104654b = c7893a;
        this.f104655c = jVar;
        this.f104656d = businessType;
        this.f104657e = tVar;
        this.f104658f = iToastService;
        this.f104659g = iToastService.isToastAvailable();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
