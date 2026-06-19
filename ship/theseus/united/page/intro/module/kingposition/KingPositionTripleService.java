package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.community.Community;
import com.bilibili.community.like.LikeTripleResponse;
import com.bilibili.playset.widget.favorite.FavFrom;
import com.bilibili.playset.widget.favorite.FavSnackBarUtil;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.tencent.connect.common.Constants;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionTripleService.class */
@StabilityInferred(parameters = 0)
public final class KingPositionTripleService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f100434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BusinessType f100435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f100436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f100437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final RelationRepository f100438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final KingPositionRepository f100439g;

    @NotNull
    public final C8043a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f100440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.intro.module.owner.r f100441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f100442k;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionTripleService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionTripleService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KingPositionTripleService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionTripleService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionTripleService$1$1.class */
        public static final class C10191 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final KingPositionTripleService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10191(KingPositionTripleService kingPositionTripleService, Continuation<? super C10191> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionTripleService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10191(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                try {
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        com.bilibili.community.like.d dVar = new com.bilibili.community.like.d(this.this$0.f100437e.a(), this.this$0.h.a().f123881c, this.this$0.f100438f.j(), true, this.this$0.h.a().f123882d, this.this$0.h.a().f123879a, this.this$0.h.a().f123880b, PageViewTracker.getInstance().currentPolarisActionId(), 384);
                        Community community = Community.a;
                        Context context = this.this$0.f100434b;
                        this.label = 1;
                        Object objD = community.d(context, dVar, this);
                        obj2 = objD;
                        if (objD == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        obj2 = ((Result) obj).unbox-impl();
                    }
                    KingPositionTripleService kingPositionTripleService = this.this$0;
                    if (Result.isSuccess-impl(obj2)) {
                        LikeTripleResponse likeTripleResponse = (LikeTripleResponse) obj2;
                        KingPositionTripleService.a(kingPositionTripleService, likeTripleResponse.h(), likeTripleResponse.g(), likeTripleResponse.b(), likeTripleResponse.a(), likeTripleResponse.e(), likeTripleResponse.c(), kingPositionTripleService.f100438f.i(), likeTripleResponse.d());
                    }
                    KingPositionTripleService kingPositionTripleService2 = this.this$0;
                    if (Result.exceptionOrNull-impl(obj2) != null) {
                        kingPositionTripleService2.f100439g.f100334l.tryEmit(Unit.INSTANCE);
                        com.bilibili.ship.theseus.united.utils.q.c(kingPositionTripleService2.f100434b.getString(2131851613));
                    }
                    return Unit.INSTANCE;
                } finally {
                    this.this$0.f100439g.f100342t.tryEmit(Unit.INSTANCE);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(KingPositionTripleService kingPositionTripleService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionTripleService;
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
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                KingPositionTripleService kingPositionTripleService = this.this$0;
                SharedFlow<Unit> sharedFlow = kingPositionTripleService.f100439g.f100341s;
                C10191 c10191 = new C10191(kingPositionTripleService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c10191, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionTripleService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f100443a;

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
            f100443a = iArr;
        }
    }

    @Inject
    public KingPositionTripleService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull com.bilibili.ship.theseus.united.page.view.t tVar, @NotNull BusinessType businessType, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull RelationRepository relationRepository, @NotNull KingPositionRepository kingPositionRepository, @NotNull C8043a c8043a, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.united.page.intro.module.owner.r rVar) {
        this.f100433a = coroutineScope;
        this.f100434b = context;
        this.f100435c = businessType;
        this.f100436d = dVar;
        this.f100437e = aVar;
        this.f100438f = relationRepository;
        this.f100439g = kingPositionRepository;
        this.h = c8043a;
        this.f100440i = componentActivity;
        this.f100441j = rVar;
        this.f100442k = !tVar.f104125a.f104104a.f104092a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(KingPositionTripleService kingPositionTripleService, boolean z6, boolean z7, boolean z8, int i7, String str, boolean z9, boolean z10, String str2) throws NoWhenBranchMatchedException {
        String str3;
        kingPositionTripleService.getClass();
        defpackage.a.b("[theseus-united-KingPositionTripleService-onTripleLikeSuccess] ", "triple like result -> " + z6 + " && " + z7 + " && " + z8, "KingPositionTripleService-onTripleLikeSuccess");
        RelationRepository relationRepository = kingPositionTripleService.f100438f;
        if (z6) {
            relationRepository.o(true);
        }
        if (z7) {
            relationRepository.m(i7);
        }
        if (z8) {
            relationRepository.n(true);
        }
        KingPositionRepository kingPositionRepository = kingPositionTripleService.f100439g;
        if (z6 && z7 && z8) {
            MutableSharedFlow<Unit> mutableSharedFlow = kingPositionRepository.f100332j;
            Unit unit = Unit.INSTANCE;
            mutableSharedFlow.tryEmit(unit);
            kingPositionRepository.f100348z.tryEmit(unit);
        } else {
            kingPositionRepository.f100334l.tryEmit(Unit.INSTANCE);
        }
        boolean z11 = z9 && !kingPositionTripleService.f100436d.d();
        if (z11) {
            kingPositionTripleService.f100441j.f100676f.tryEmit(new com.bilibili.playerbizcommonv2.utils.i(str2));
        }
        if (!z6 || !z7 || !z8 || z11 || z10) {
            if (kingPositionTripleService.f100442k) {
                com.bilibili.ship.theseus.united.utils.q.c(str);
                return;
            }
            return;
        }
        int i8 = a.f100443a[kingPositionTripleService.f100435c.ordinal()];
        if (i8 == 1) {
            str3 = "3";
        } else if (i8 == 2) {
            str3 = "4";
        } else {
            if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        }
        FavSnackBarUtil.Scene scene = FavSnackBarUtil.Scene.DetailPage;
        FavFrom favFrom = FavFrom.Triple;
        com.bilibili.ship.theseus.united.page.view.a aVar = kingPositionTripleService.f100437e;
        FavSnackBarUtil.c(kingPositionTripleService.f100440i, scene, str, 2131851776, true, favFrom, str3, aVar.a(), aVar.c(), kingPositionTripleService.h.a().f123880b, new y(kingPositionTripleService));
    }
}
