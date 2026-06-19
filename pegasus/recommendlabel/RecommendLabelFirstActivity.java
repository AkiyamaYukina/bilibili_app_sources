package com.bilibili.pegasus.recommendlabel;

import BX.g;
import Wf0.C3036i;
import Wf0.C3037j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.View;
import android.view.Window;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.app.comm.list.common.data.DislikeReason;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.common.widget.bottomsheet.ListBottomSheetItem;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionActivityViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.pegasus.data.FeedbackType;
import com.bilibili.pegasus.recommendlabel.InterfaceC5739h;
import com.bilibili.pegasus.recommendlabel.InterfaceC5755y;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstActivity.class */
@StabilityInferred(parameters = 0)
public final class RecommendLabelFirstActivity extends BaseAppCompatActivity implements IPvTracker {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final KProperty<Object>[] f78628K = {new PropertyReference1Impl(RecommendLabelFirstActivity.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliAppFragmentKeywordBlockerBinding;", 0)};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public String f78632E;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final String f78629B = "RecommendLabelFirstActivity";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f78630C = ReflectionActivityViewBindings.inflateViewBindingActivity(this, gl.d.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f78631D = new ViewModelLazy(Reflection.getOrCreateKotlinClass(RecommendLabelViewModel.class), new c(this), new b(this), new d(this));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncher<Intent> f78633F = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: com.bilibili.pegasus.recommendlabel.B

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecommendLabelFirstActivity f78569a;

        {
            this.f78569a = this;
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            RecommendLabelFirstActivity recommendLabelFirstActivity = this.f78569a;
            BLog.d(recommendLabelFirstActivity.f78629B, "registerForActivityResult " + activityResult.getResultCode() + " " + activityResult.getData());
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(recommendLabelFirstActivity), (CoroutineContext) null, (CoroutineStart) null, new RecommendLabelFirstActivity$launcher$1$1(recommendLabelFirstActivity, null), 3, (Object) null);
        }
    });

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final String f78634G = "RecommendLabelClick";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final List<ListBottomSheetItem> f78635H = CollectionsKt.listOf(new ListBottomSheetItem[]{new ListBottomSheetItem(0, 0, 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, 2131241971, "取消固定", (String) null), new ListBottomSheetItem(0, 0, 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, 2131239016, "删除偏好", (String) null)});

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final List<ListBottomSheetItem> f78636I = CollectionsKt.listOf(new ListBottomSheetItem[]{new ListBottomSheetItem(0, 0, 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, 2131241970, "固定偏好", (String) null), new ListBottomSheetItem(0, 0, 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, 2131239016, "删除偏好", (String) null)});

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final a f78637J = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstActivity$a.class */
    public static final class a implements g.a {
        public final void a(String str) {
            Neurons.reportClick$default(true, "main.recommend-label.screenshot.0.click", (Map) null, 4, (Object) null);
            BLog.i("RecommendLabelReporter", "reportScreenshotClick");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstActivity$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecommendLabelFirstActivity f78638a;

        public b(RecommendLabelFirstActivity recommendLabelFirstActivity) {
            this.f78638a = recommendLabelFirstActivity;
        }

        public final Object invoke() {
            return this.f78638a.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstActivity$c.class */
    public static final class c implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecommendLabelFirstActivity f78639a;

        public c(RecommendLabelFirstActivity recommendLabelFirstActivity) {
            this.f78639a = recommendLabelFirstActivity;
        }

        public final Object invoke() {
            return this.f78639a.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstActivity$d.class */
    public static final class d implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecommendLabelFirstActivity f78640a;

        public d(RecommendLabelFirstActivity recommendLabelFirstActivity) {
            this.f78640a = recommendLabelFirstActivity;
        }

        public final Object invoke() {
            return this.f78640a.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstActivity$onCreate$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstActivity$onCreate$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final RecommendLabelFirstActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstActivity$onCreate$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstActivity$onCreate$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RecommendLabelFirstActivity f78641a;

            public a(RecommendLabelFirstActivity recommendLabelFirstActivity) {
                this.f78641a = recommendLabelFirstActivity;
            }

            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC5755y interfaceC5755y = (InterfaceC5755y) obj;
                boolean z6 = interfaceC5755y instanceof InterfaceC5755y.a;
                RecommendLabelFirstActivity recommendLabelFirstActivity = this.f78641a;
                if (z6) {
                    PromoToast.showMidToast(recommendLabelFirstActivity, ((InterfaceC5755y.a) interfaceC5755y).f78794a);
                } else {
                    BLog.e(recommendLabelFirstActivity.f78629B, "unhandled event " + interfaceC5755y);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RecommendLabelFirstActivity recommendLabelFirstActivity, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = recommendLabelFirstActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                MutableSharedFlow<InterfaceC5755y> mutableSharedFlow = this.this$0.P6().f78650c;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstActivity$onCreate$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstActivity$onCreate$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final RecommendLabelFirstActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RecommendLabelFirstActivity recommendLabelFirstActivity, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = recommendLabelFirstActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
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
            this.this$0.P6().I0(new InterfaceC5739h.e(1));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final RecommendLabelViewModel P6() {
        return (RecommendLabelViewModel) this.f78631D.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "main.recommend-label.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        bundle.putString("from", this.f78632E);
        return bundle;
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle extras;
        Bundle bundle2;
        String string;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && (bundle2 = extras.getBundle("fragment_args")) != null && (string = bundle2.getString("from")) != null) {
            this.f78632E = string;
        }
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        KProperty<Object>[] kPropertyArr = f78628K;
        KProperty<Object> kProperty = kPropertyArr[0];
        ViewBindingProperty viewBindingProperty = this.f78630C;
        setContentView(((gl.d) viewBindingProperty.getValue(this, kProperty)).a);
        Window window2 = getWindow();
        if (window2 != null) {
            WindowCompat.setDecorFitsSystemWindows(window2, false);
            StatusBarCompat.setStatusBarMode(this, !MultipleThemeUtils.isNightTheme(this));
            window2.setStatusBarColor(0);
        }
        final int i7 = 0;
        ((gl.d) viewBindingProperty.getValue(this, kPropertyArr[0])).b.setContent(ComposableLambdaKt.composableLambdaInstance(1067836618, true, new Function2(this, i7) { // from class: com.bilibili.pegasus.recommendlabel.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f78795a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f78796b;

            {
                this.f78795a = i7;
                this.f78796b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Object obj3 = this.f78796b;
                switch (this.f78795a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        KProperty<Object>[] kPropertyArr2 = RecommendLabelFirstActivity.f78628K;
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1067836618, iIntValue, -1, "com.bilibili.pegasus.recommendlabel.RecommendLabelFirstActivity.onCreate.<anonymous> (RecommendLabelFirstActivity.kt:62)");
                            }
                            RecommendLabelFirstActivity recommendLabelFirstActivity = (RecommendLabelFirstActivity) obj3;
                            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(835995154, true, new Function2((f0) SnapshotStateKt.collectAsState(recommendLabelFirstActivity.P6().f78649b, null, composer, 0, 1).getValue(), recommendLabelFirstActivity) { // from class: com.bilibili.pegasus.recommendlabel.C

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final f0 f78570a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final RecommendLabelFirstActivity f78571b;

                                {
                                    this.f78570a = f0Var;
                                    this.f78571b = recommendLabelFirstActivity;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
                                /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
                                /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
                                /* JADX WARN: Removed duplicated region for block: B:30:0x013d  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
                                    /*
                                        Method dump skipped, instruction units count: 377
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.C.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                                }
                            }, composer, 54), composer, 384, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                    default:
                        FeedbackType feedbackType = (FeedbackType) obj;
                        DislikeReason dislikeReason = (DislikeReason) obj2;
                        q9.q qVar = (q9.q) obj3;
                        la.b.a(qVar, feedbackType, dislikeReason, new com.bilibili.studio.videoeditor.template.A(qVar, feedbackType, dislikeReason));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        ViewCompat.setOnApplyWindowInsetsListener(((gl.d) viewBindingProperty.getValue(this, kPropertyArr[0])).a, new OnApplyWindowInsetsListener(this) { // from class: com.bilibili.pegasus.recommendlabel.A

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RecommendLabelFirstActivity f78568a;

            {
                this.f78568a = this;
            }

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                KProperty<Object>[] kPropertyArr2 = RecommendLabelFirstActivity.f78628K;
                int i8 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
                RecommendLabelFirstActivity recommendLabelFirstActivity = this.f78568a;
                BLog.d(recommendLabelFirstActivity.f78629B, "navigationBarHeight=" + i8);
                recommendLabelFirstActivity.P6().I0(new InterfaceC5739h.m(i8));
                return windowInsetsCompat;
            }
        });
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onStart() {
        super.onStart();
        a aVar = this.f78637J;
        if (aVar == null) {
            return;
        }
        if (C3037j.f26832a == null) {
            C3037j.f26832a = new C3036i(this);
        }
        HandlerThread handlerThread = BX.g.a;
        BX.g.b(this, aVar, true);
        C3036i c3036i = C3037j.f26832a;
        if (c3036i != null) {
            HashSet hashSet = BX.g.d;
            if (hashSet.contains(c3036i)) {
                return;
            }
            hashSet.add(c3036i);
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onStop() {
        super.onStop();
        a aVar = this.f78637J;
        if (aVar == null) {
            return;
        }
        HandlerThread handlerThread = BX.g.a;
        BX.g.c(this, aVar);
        if (BX.g.c.isEmpty()) {
            C3036i c3036i = C3037j.f26832a;
            if (c3036i != null) {
                BX.g.d.remove(c3036i);
            }
            C3037j.f26832a = null;
        }
    }
}
