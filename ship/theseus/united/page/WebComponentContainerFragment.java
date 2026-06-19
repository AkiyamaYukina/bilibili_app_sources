package com.bilibili.ship.theseus.united.page;

import J81.H;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.app.provider.IUiObserveContainerStatusBehavior;
import com.bilibili.lib.jsbridge.common.ContainerStatusWatcher;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.ship.theseus.united.page.tab.i;
import com.bilibili.ship.theseus.united.page.tab.u;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import dv0.K0;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/WebComponentContainerFragment.class */
@StabilityInferred(parameters = 0)
public final class WebComponentContainerFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WebFloatLayerService f98812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final u f98813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final i f98814d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f98817g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f98815e = LazyKt.lazy(new H(this, 3));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f98816f = 1;

    @NotNull
    public final HashMap<String, String> h = new HashMap<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/WebComponentContainerFragment$a.class */
    public static final class a implements IUiObserveContainerStatusBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WebComponentContainerFragment f98818a;

        public a(WebComponentContainerFragment webComponentContainerFragment) {
            this.f98818a = webComponentContainerFragment;
        }

        public final Map<String, String> getCallbackIdMap() {
            return MapsKt.toMap(this.f98818a.h);
        }

        public final int getContainerStatus() {
            return this.f98818a.f98816f;
        }

        public final boolean getContainerStatusSwitch() {
            return this.f98818a.f98817g;
        }

        public final boolean isDestroyed() {
            return this.f98818a.getView() == null;
        }

        public final void saveCallbackIdMap(String str, String str2) {
            if (str == null || str2 == null) {
                return;
            }
            this.f98818a.h.put(str, str2);
        }

        public final void setContainerStatusSwitch(boolean z6) {
            this.f98818a.f98817g = z6;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.WebComponentContainerFragment$onCreateView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/WebComponentContainerFragment$onCreateView$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TheseusWebUIComponent $uiComponent;
        final n<K0> $viewEntry;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusWebUIComponent theseusWebUIComponent, n<K0> nVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$uiComponent = theseusWebUIComponent;
            this.$viewEntry = nVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$uiComponent, this.$viewEntry, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusWebUIComponent theseusWebUIComponent = this.$uiComponent;
                n<K0> nVar = this.$viewEntry;
                this.label = 1;
                theseusWebUIComponent.getClass();
                Object objA = theseusWebUIComponent.a(nVar.a, this);
                if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objA = Unit.INSTANCE;
                }
                if (objA == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.WebComponentContainerFragment$onCreateView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/WebComponentContainerFragment$onCreateView$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final WebComponentContainerFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.WebComponentContainerFragment$onCreateView$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/WebComponentContainerFragment$onCreateView$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final WebComponentContainerFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(WebComponentContainerFragment webComponentContainerFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = webComponentContainerFragment;
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
                boolean z6 = this.Z$0;
                WebComponentContainerFragment webComponentContainerFragment = this.this$0;
                int i7 = z6 ? 1 : 2;
                webComponentContainerFragment.f98816f = i7;
                ContainerStatusWatcher.INSTANCE.onChanged(i7);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WebComponentContainerFragment webComponentContainerFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = webComponentContainerFragment;
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
                Flow flow = (Flow) this.this$0.f98815e.getValue();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    @Inject
    public WebComponentContainerFragment(@NotNull WebFloatLayerService webFloatLayerService, @NotNull u uVar, @NotNull i iVar) {
        this.f98812b = webFloatLayerService;
        this.f98813c = uVar;
        this.f98814d = iVar;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String string = requireArguments().getString("link");
        if (string == null) {
            throw new IllegalStateException("Arguments must have link");
        }
        a aVar = new a(this);
        WebFloatLayerService webFloatLayerService = this.f98812b;
        TheseusWebUIComponent.a aVar2 = new TheseusWebUIComponent.a(false, null, 0, 0, 0, false, 0, false, 0, 0, false, false, null, 1048574);
        webFloatLayerService.getClass();
        TheseusWebUIComponent theseusWebUIComponent = new TheseusWebUIComponent(string, webFloatLayerService.a(), aVar2, null, aVar, " PreloadedView", null, 72);
        Context contextRequireContext = requireContext();
        ViewBinding viewBindingB = theseusWebUIComponent.b(contextRequireContext, LayoutInflater.from(contextRequireContext), viewGroup);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(theseusWebUIComponent, new n(viewBindingB), null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        return viewBindingB.getRoot();
    }
}
