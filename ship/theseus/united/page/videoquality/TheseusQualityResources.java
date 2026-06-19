package com.bilibili.ship.theseus.united.page.videoquality;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import com.alipay.sdk.app.PayTask;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ComposeExposureLayoutInfoCollectorKt;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusQualityResources.class */
@StabilityInferred(parameters = 0)
public final class TheseusQualityResources {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final KProperty<Object>[] f103833i = {new MutablePropertyReference1Impl(TheseusQualityResources.class, "seenVisionEnteringDate", "getSeenVisionEnteringDate()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(TheseusQualityResources.class, "seenCtccToastDate", "getSeenCtccToastDate()Ljava/lang/String;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f103835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f103836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f103837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lifecycle f103838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f103839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Cj0.e f103840g;

    @NotNull
    public final Cj0.e h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusQualityResources$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusQualityResources$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusQualityResources this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusQualityResources$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusQualityResources$1$1.class */
        public static final class C11551 extends SuspendLambda implements Function2<ExtraInfo, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public C11551(Continuation<? super C11551> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11551 c11551 = new C11551(continuation);
                c11551.L$0 = obj;
                return c11551;
            }

            public final Object invoke(ExtraInfo extraInfo, Continuation<? super Boolean> continuation) {
                return create(extraInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ExtraInfo extraInfo = (ExtraInfo) this.L$0;
                Set set = extraInfo != null ? (Set) vv0.d.f128459g.a(extraInfo) : null;
                return Boxing.boxBoolean(!(set == null || set.isEmpty()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusQualityResources theseusQualityResources, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusQualityResources;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [androidx.lifecycle.LifecycleObserver, java.lang.Object] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ExtraInfo> stateFlow = this.this$0.f103837d.f99566b;
                C11551 c11551 = new C11551(null);
                this.label = 1;
                if (FlowKt.first(stateFlow, c11551, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Mutex mutex = K.f103726a;
            this.this$0.f103838e.addObserver(new Object());
            BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), (CoroutineStart) null, new QualityVisionResources$preload$2(null), 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public TheseusQualityResources(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull PageReportService pageReportService, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull Lifecycle lifecycle, @NotNull BiliAccountInfo biliAccountInfo) {
        this.f103834a = coroutineScope;
        this.f103835b = context;
        this.f103836c = pageReportService;
        this.f103837d = episodeExtraInfoRepository;
        this.f103838e = lifecycle;
        this.f103839f = biliAccountInfo;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        this.f103840g = Cj0.f.e(new SharedPreferencesHelper(context).getSharedPreferences(), "seenVisionEnteringDate");
        this.h = Cj0.f.e(new SharedPreferencesHelper(context).getSharedPreferences(), "seenCtccToastDate");
    }

    @NotNull
    public static PlayerToast c(@NotNull String str) {
        return qb.g.a(32, 17, "extra_title", str).duration(PayTask.f60018j).build();
    }

    @NotNull
    public final Map<String, String> a() {
        Map<String, String> mapA = this.f103836c.a(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mapA.entrySet()) {
            String key = entry.getKey();
            if (Intrinsics.areEqual(key, "season_type") || Intrinsics.areEqual(key, "season_id") || Intrinsics.areEqual(key, "ep_id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final PlayerToast b(final String str, ExposureEntry exposureEntry) {
        Modifier modifierCollectExposureLayoutInfo = exposureEntry != null ? ComposeExposureLayoutInfoCollectorKt.collectExposureLayoutInfo(Modifier.Companion, exposureEntry) : Modifier.Companion;
        PlayerToast.Builder builderLocation = new PlayerToast.Builder().location(32);
        FrameLayout frameLayout = new FrameLayout(this.f103835b);
        ComposeView composeView = new ComposeView(frameLayout.getContext(), null, 0, 6, null);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        final Modifier modifier = modifierCollectExposureLayoutInfo;
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-525319638, true, new Function2(modifier, str) { // from class: com.bilibili.ship.theseus.united.page.videoquality.w0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f103962a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Modifier f103963b;

            {
                this.f103962a = str;
                this.f103963b = modifier;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-525319638, iIntValue, -1, "com.bilibili.ship.theseus.united.page.videoquality.TheseusQualityResources.qualityVisionSwitchSuccessToast.<anonymous>.<anonymous>.<anonymous> (TheseusQualityResources.kt:181)");
                    }
                    com.bilibili.playerbizcommonv2.widget.quality.n0.a(0, composer, Modifier.Companion.then(this.f103963b), this.f103962a);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        frameLayout.addView(composeView);
        return builderLocation.setCustomView(frameLayout).toastItemType(19).duration(PayTask.f60018j).build();
    }
}
