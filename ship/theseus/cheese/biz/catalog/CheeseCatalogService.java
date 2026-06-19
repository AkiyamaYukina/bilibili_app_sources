package com.bilibili.ship.theseus.cheese.biz.catalog;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.ship.theseus.cheese.biz.catalog.panels.Status;
import com.bilibili.ship.theseus.cheese.biz.catalog.panels.i;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import eu0.C6979B;
import eu0.C6983b;
import eu0.C6987f;
import eu0.C6990i;
import eu0.C6992k;
import eu0.C6993l;
import eu0.C7000s;
import java.io.File;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService.class */
@StabilityInferred(parameters = 0)
public final class CheeseCatalogService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f89106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f89107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FragmentManager f89108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<C6979B> f89109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C6987f f89110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C6992k f89111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C7000s f89112g;

    @NotNull
    public final C6993l h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f89113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C6990i f89114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C6983b f89115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f89116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f89117m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f89118n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final PageReportService f89119o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final CheeseCatalogRepository f89120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final WebFloatLayerService f89121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.cheese.biz.intro.series.c f89122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f89123s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f89124t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f89125u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f89126v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c> f89127w = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f89128x = SharedFlowKt.MutableSharedFlow$default(1, 0, (BufferOverflow) null, 6, (Object) null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f89129y = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseCatalogService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseCatalogService cheeseCatalogService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCatalogService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
            CheeseCatalogService cheeseCatalogService = this.this$0;
            cheeseCatalogService.f89127w.setValue(new c(cheeseCatalogService.f89109d, cheeseCatalogService.f89110e, cheeseCatalogService.f89111f, cheeseCatalogService.f89112g, cheeseCatalogService.f89113i, cheeseCatalogService.f89114j, cheeseCatalogService.f89115k, cheeseCatalogService.h));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseCatalogService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final CheeseCatalogService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseCatalogService cheeseCatalogService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseCatalogService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f89129y.setValue(Boxing.boxBoolean(this.Z$0));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheeseCatalogService cheeseCatalogService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCatalogService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CheeseCatalogService cheeseCatalogService = this.this$0;
                MutableStateFlow<Boolean> mutableStateFlow = cheeseCatalogService.f89118n.f91107a.f79284a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseCatalogService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseCatalogService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheeseCatalogService cheeseCatalogService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCatalogService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CheeseCatalogService cheeseCatalogService = this.this$0;
                WebFloatLayerService webFloatLayerService = cheeseCatalogService.f89121q;
                CheeseCredentialJsBridge cheeseCredentialJsBridge = new CheeseCredentialJsBridge(cheeseCatalogService);
                this.label = 1;
                if (webFloatLayerService.c("cheese", cheeseCredentialJsBridge, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$CheeseCredentialJsBridge.class */
    public final class CheeseCredentialJsBridge implements com.bilibili.ogv.infra.jsb.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheeseCatalogService f89130a;

        public CheeseCredentialJsBridge(CheeseCatalogService cheeseCatalogService) {
            this.f89130a = cheeseCatalogService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object showFullScreenWeb(@javax.inject.Named("url") @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws kotlin.KotlinNothingValueException {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService$CheeseCredentialJsBridge$showFullScreenWeb$1
                if (r0 == 0) goto L29
                r0 = r7
                com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService$CheeseCredentialJsBridge$showFullScreenWeb$1 r0 = (com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService$CheeseCredentialJsBridge$showFullScreenWeb$1) r0
                r9 = r0
                r0 = r9
                int r0 = r0.label
                r8 = r0
                r0 = r8
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L29
                r0 = r9
                r1 = r8
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r9
                r7 = r0
                goto L33
            L29:
                com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService$CheeseCredentialJsBridge$showFullScreenWeb$1 r0 = new com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService$CheeseCredentialJsBridge$showFullScreenWeb$1
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L33:
                r0 = r7
                java.lang.Object r0 = r0.result
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r9 = r0
                r0 = r7
                int r0 = r0.label
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L6b
                r0 = r8
                r1 = 1
                if (r0 == r1) goto L63
                r0 = r8
                r1 = 2
                if (r0 == r1) goto L5b
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L5b:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L97
            L63:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L86
            L6b:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r7
                r1 = 1
                r0.label = r1
                r0 = r5
                com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService r0 = r0.f89130a
                r1 = r6
                r2 = r7
                java.lang.Object r0 = r0.e(r1, r2)
                r1 = r9
                if (r0 != r1) goto L86
                r0 = r9
                return r0
            L86:
                r0 = r7
                r1 = 2
                r0.label = r1
                r0 = r7
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)
                r1 = r9
                if (r0 != r1) goto L97
                r0 = r9
                return r0
            L97:
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r1 = r0
                r1.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService.CheeseCredentialJsBridge.showFullScreenWeb(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Inject
    public CheeseCatalogService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull FragmentManager fragmentManager, @NotNull List<C6979B> list, @NotNull C6987f c6987f, @NotNull C6992k c6992k, @NotNull C7000s c7000s, @NotNull C6993l c6993l, boolean z6, @NotNull C6990i c6990i, @NotNull C6983b c6983b, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull PageReportService pageReportService, @NotNull CheeseCatalogRepository cheeseCatalogRepository, @NotNull WebFloatLayerService webFloatLayerService, @NotNull com.bilibili.ship.theseus.cheese.biz.intro.series.c cVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar2, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull BiliAccounts biliAccounts) {
        this.f89106a = coroutineScope;
        this.f89107b = componentActivity;
        this.f89108c = fragmentManager;
        this.f89109d = list;
        this.f89110e = c6987f;
        this.f89111f = c6992k;
        this.f89112g = c7000s;
        this.h = c6993l;
        this.f89113i = z6;
        this.f89114j = c6990i;
        this.f89115k = c6983b;
        this.f89116l = theseusFloatLayerService;
        this.f89117m = gVar;
        this.f89118n = hVar;
        this.f89119o = pageReportService;
        this.f89120p = cheeseCatalogRepository;
        this.f89121q = webFloatLayerService;
        this.f89122r = cVar;
        this.f89123s = introContentSizeRepository;
        this.f89124t = cVar2;
        this.f89125u = aVar;
        this.f89126v = biliAccounts;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheeseCatalogService$handleIntent$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService r5, com.bilibili.ship.theseus.cheese.biz.catalog.panels.i.a r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService.a(com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService, com.bilibili.ship.theseus.cheese.biz.catalog.panels.i$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService r16, java.lang.String r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService.b(com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void c(i.a aVar, File file) {
        try {
            aVar.f89222c = new PdfRenderer(ParcelFileDescriptor.open(file, BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE));
            aVar.f89221b.setValue(Status.Finished);
        } catch (Exception e7) {
            aVar.f89221b.setValue(Status.Error);
        }
    }

    public final void d(@NotNull String str, @NotNull Map<String, String> map) {
        PageReportService.g(this.f89119o, str, map, 4);
    }

    @Nullable
    public final Object e(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseCatalogService$showFullScreenWebLayer$2(this, str, null), continuationImpl);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
