package com.bilibili.pegasus.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.vm.G;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.pegasus.vm.StatesKt$collectFirstConfig$$inlined$filter$1$2;
import dp0.C6828a;
import kntr.app.oversea.translation.setting.guidance.J;
import kntr.base.localization.Localization;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/OverseaTranslationGuidanceComponent.class */
@StabilityInferred(parameters = 0)
public final class OverseaTranslationGuidanceComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75846k = "oversea_guidance_component";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75847l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/OverseaTranslationGuidanceComponent$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OverseaTranslationGuidanceComponent f75848a;

        public a(OverseaTranslationGuidanceComponent overseaTranslationGuidanceComponent) {
            this.f75848a = overseaTranslationGuidanceComponent;
        }

        public final Object invoke() {
            return this.f75848a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/OverseaTranslationGuidanceComponent$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OverseaTranslationGuidanceComponent f75849a;

        public b(OverseaTranslationGuidanceComponent overseaTranslationGuidanceComponent) {
            this.f75849a = overseaTranslationGuidanceComponent;
        }

        public final Object invoke() {
            return this.f75849a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/OverseaTranslationGuidanceComponent$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OverseaTranslationGuidanceComponent f75850a;

        public c(OverseaTranslationGuidanceComponent overseaTranslationGuidanceComponent) {
            this.f75850a = overseaTranslationGuidanceComponent;
        }

        public final Object invoke() {
            return this.f75850a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.OverseaTranslationGuidanceComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/OverseaTranslationGuidanceComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final View $view;
        int label;
        final OverseaTranslationGuidanceComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.OverseaTranslationGuidanceComponent$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/OverseaTranslationGuidanceComponent$onViewCreated$1$1.class */
        public static final class C04831 extends SuspendLambda implements Function2<C6828a, Continuation<? super Unit>, Object> {
            final View $view;
            int label;
            final OverseaTranslationGuidanceComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04831(OverseaTranslationGuidanceComponent overseaTranslationGuidanceComponent, View view, Continuation<? super C04831> continuation) {
                super(2, continuation);
                this.this$0 = overseaTranslationGuidanceComponent;
                this.$view = view;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04831(this.this$0, this.$view, continuation);
            }

            public final Object invoke(C6828a c6828a, Continuation<? super Unit> continuation) {
                return create(c6828a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Fragment fragment = this.this$0.getFragment();
                if (fragment != null) {
                    final Context context = this.$view.getContext();
                    final LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
                    Localization localization = Localization.INSTANCE;
                    if (!kntr.base.localization.p.b(localization.getCurrent())) {
                        BLog.i("OverseaTranslationGuidanceDialog", "current locale " + localization.getCurrent() + " does not support AI translation");
                    } else if (BiliGlobalPreferenceHelper.getInstance(BiliContext.application()).getSharedPreferences().getBoolean("SP_KEY_OVERSEA_TRANSLATION_GUIDANCE_DIALOG_SHOWN", false)) {
                        BLog.i("OverseaTranslationGuidanceDialog", "guidanceShown");
                    } else {
                        MainDialogManager.addDialog(new MainDialogManager.DialogManagerInfo("oversea_translation", new MainDialogManager.IDialogInterface(context, viewLifecycleOwner) { // from class: En0.d

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final Context f4634a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final LifecycleOwner f4635b;

                            {
                                this.f4634a = context;
                                this.f4635b = viewLifecycleOwner;
                            }

                            public final void onShow() {
                                Context context2 = this.f4634a;
                                J.a = new e(0);
                                LifecycleOwner lifecycleOwner = this.f4635b;
                                Lifecycle.State currentState = null;
                                Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
                                if (lifecycle != null) {
                                    currentState = lifecycle.getCurrentState();
                                }
                                if (currentState == Lifecycle.State.DESTROYED) {
                                    BLog.i("OverseaTranslationGuidanceDialog", "lifecycle DESTROYED, abort and release queue");
                                    MainDialogManager.showNextDialog("oversea_translation", false);
                                } else if (lifecycle != null && !currentState.isAtLeast(Lifecycle.State.RESUMED)) {
                                    lifecycle.addObserver(new f(context2, lifecycle));
                                } else if (BLRouter.routeTo(new RouteRequest.Builder("bilibili://oversea/translation-enabled-guidance").build(), context2).getCode() == RouteResponse.Code.OK) {
                                    SharedPreferences.Editor editorEdit = BiliGlobalPreferenceHelper.getInstance(BiliContext.application()).getSharedPreferences().edit();
                                    editorEdit.putBoolean("SP_KEY_OVERSEA_TRANSLATION_GUIDANCE_DIALOG_SHOWN", true);
                                    editorEdit.apply();
                                }
                            }
                        }, 90, false), context);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OverseaTranslationGuidanceComponent overseaTranslationGuidanceComponent, View view, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = overseaTranslationGuidanceComponent;
            this.$view = view;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$view, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<C6828a> stateFlow = ((PegasusViewModel) this.this$0.f75847l.getValue()).f79027t;
                C04831 c04831 = new C04831(this.this$0, this.$view, null);
                this.label = 1;
                Object objCollect = stateFlow.collect(new StatesKt$collectFirstConfig$$inlined$filter$1$2(new G.a(c04831)), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
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

    @NotNull
    public final String getComponentName() {
        return this.f75846k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, view, null), 3, (Object) null);
    }
}
