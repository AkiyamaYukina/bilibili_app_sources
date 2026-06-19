package com.bilibili.pegasus.components;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.api.PhoneDeviceId;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.recommendmode.RecommendMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import lp0.C7879b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader.class */
@StabilityInferred(parameters = 0)
public final class MemberNoticeHeader extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f75822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75823l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(HeaderViewModel.class), new b(this), new c(this), new d(this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75824m = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new e(this), new f(this), new g(this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final T f75825n = new PassportObserver(this) { // from class: com.bilibili.pegasus.components.T

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MemberNoticeHeader f75883a;

        {
            this.f75883a = this;
        }

        public final void onChange(Topic topic) {
            this.f75883a.b().I0();
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final h f75826o = new h(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final a f75827p = new a(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final String f75828q = "PegasusMemberNoticeHeader";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$a.class */
    public static final class a implements Cs0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MemberNoticeHeader f75829a;

        public a(MemberNoticeHeader memberNoticeHeader) {
            this.f75829a = memberNoticeHeader;
        }

        @Override // Cs0.d
        public final void a(boolean z6) {
            this.f75829a.b().I0();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$b.class */
    public static final class b implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MemberNoticeHeader f75830a;

        public b(MemberNoticeHeader memberNoticeHeader) {
            this.f75830a = memberNoticeHeader;
        }

        public final Object invoke() {
            return this.f75830a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$c.class */
    public static final class c implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MemberNoticeHeader f75831a;

        public c(MemberNoticeHeader memberNoticeHeader) {
            this.f75831a = memberNoticeHeader;
        }

        public final Object invoke() {
            return this.f75831a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$d.class */
    public static final class d implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MemberNoticeHeader f75832a;

        public d(MemberNoticeHeader memberNoticeHeader) {
            this.f75832a = memberNoticeHeader;
        }

        public final Object invoke() {
            return this.f75832a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$e.class */
    public static final class e implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MemberNoticeHeader f75833a;

        public e(MemberNoticeHeader memberNoticeHeader) {
            this.f75833a = memberNoticeHeader;
        }

        public final Object invoke() {
            return this.f75833a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$f.class */
    public static final class f implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MemberNoticeHeader f75834a;

        public f(MemberNoticeHeader memberNoticeHeader) {
            this.f75834a = memberNoticeHeader;
        }

        public final Object invoke() {
            return this.f75834a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$g.class */
    public static final class g implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MemberNoticeHeader f75835a;

        public g(MemberNoticeHeader memberNoticeHeader) {
            this.f75835a = memberNoticeHeader;
        }

        public final Object invoke() {
            return this.f75835a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$h.class */
    public static final class h implements Lh.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MemberNoticeHeader f75836a;

        public h(MemberNoticeHeader memberNoticeHeader) {
            this.f75836a = memberNoticeHeader;
        }

        public final void a() {
            this.f75836a.b().I0();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.MemberNoticeHeader$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PegasusHeaderManager $headerManager;
        final View $view;
        int label;
        final MemberNoticeHeader this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.MemberNoticeHeader$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$onViewCreated$1$1.class */
        public static final class C04811 extends SuspendLambda implements Function2<AlertMessage, Continuation<? super Unit>, Object> {
            final PegasusHeaderManager $headerManager;
            final View $view;
            Object L$0;
            int label;
            final MemberNoticeHeader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04811(MemberNoticeHeader memberNoticeHeader, View view, PegasusHeaderManager pegasusHeaderManager, Continuation<? super C04811> continuation) {
                super(2, continuation);
                this.this$0 = memberNoticeHeader;
                this.$view = view;
                this.$headerManager = pegasusHeaderManager;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04811 c04811 = new C04811(this.this$0, this.$view, this.$headerManager, continuation);
                c04811.L$0 = obj;
                return c04811;
            }

            public final Object invoke(AlertMessage alertMessage, Continuation<? super Unit> continuation) {
                return create(alertMessage, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Realname realname;
                final String url;
                String title;
                LifecycleOwner viewLifecycleOwner;
                LifecycleCoroutineScope lifecycleScope;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AlertMessage alertMessage = (AlertMessage) this.L$0;
                if (alertMessage != null) {
                    final MemberNoticeHeader memberNoticeHeader = this.this$0;
                    Context context = this.$view.getContext();
                    memberNoticeHeader.getClass();
                    if (Intrinsics.areEqual(alertMessage.getType(), "security")) {
                        Security security = alertMessage.getSecurity();
                        if (security != null && (viewLifecycleOwner = memberNoticeHeader.getViewLifecycleOwner()) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
                            BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new MemberNoticeHeader$showSecurity$1(memberNoticeHeader, security, context, null), 3, (Object) null);
                        }
                    } else if (Intrinsics.areEqual(alertMessage.getType(), "realname") && (realname = alertMessage.getRealname()) != null && (url = realname.getUrl()) != null && (title = realname.getTitle()) != null) {
                        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(memberNoticeHeader.getContext()).inflate(2131498414, (ViewGroup) null, false);
                        linearLayout.setOnClickListener(new View.OnClickListener(memberNoticeHeader, url) { // from class: com.bilibili.pegasus.components.U

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final MemberNoticeHeader f75884a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f75885b;

                            {
                                this.f75884a = memberNoticeHeader;
                                this.f75885b = url;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                MemberNoticeHeader memberNoticeHeader2 = this.f75884a;
                                MemberNoticeHeader.c(memberNoticeHeader2.getFragment(), this.f75885b);
                            }
                        });
                        linearLayout.findViewById(2131298371).setOnClickListener(new View.OnClickListener(memberNoticeHeader) { // from class: com.bilibili.pegasus.components.V

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final MemberNoticeHeader f75886a;

                            {
                                this.f75886a = memberNoticeHeader;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                MemberNoticeHeader memberNoticeHeader2 = this.f75886a;
                                memberNoticeHeader2.b().getClass();
                                ((AlertService) ServiceGenerator.createService(AlertService.class)).closeAlert(BiliAccounts.get(BiliContext.application()).getAccessKey(), PhoneDeviceId.get()).enqueue();
                                PegasusHeaderManager headerManager = memberNoticeHeader2.getHeaderManager();
                                if (headerManager != null) {
                                    headerManager.removeHeader("PegasusMemberNoticeHeader");
                                }
                            }
                        });
                        ((TextView) linearLayout.findViewById(2131308733)).setText(title);
                        PegasusHeaderManager headerManager = memberNoticeHeader.getHeaderManager();
                        if (headerManager != null) {
                            headerManager.removeHeader("PegasusMemberNoticeHeader");
                        }
                        PegasusHeaderManager headerManager2 = memberNoticeHeader.getHeaderManager();
                        if (headerManager2 != null) {
                            headerManager2.addHeader(linearLayout, "PegasusMemberNoticeHeader");
                        }
                        memberNoticeHeader.f75822k = true;
                    }
                } else if (this.this$0.f75822k) {
                    this.$headerManager.removeHeader("PegasusMemberNoticeHeader");
                    this.this$0.f75822k = false;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MemberNoticeHeader memberNoticeHeader, View view, PegasusHeaderManager pegasusHeaderManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = memberNoticeHeader;
            this.$view = view;
            this.$headerManager = pegasusHeaderManager;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$view, this.$headerManager, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AlertMessage> stateFlow = this.this$0.b().f75787d;
                C04811 c04811 = new C04811(this.this$0, this.$view, this.$headerManager, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c04811, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.MemberNoticeHeader$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MemberNoticeHeader this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.MemberNoticeHeader$onViewCreated$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$onViewCreated$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Action, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final MemberNoticeHeader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MemberNoticeHeader memberNoticeHeader, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = memberNoticeHeader;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Action action, Continuation<? super Unit> continuation) {
                return create(action, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Action action = (Action) this.L$0;
                if ((action instanceof C7879b) && ((C7879b) action).f123308b) {
                    this.this$0.b().I0();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MemberNoticeHeader memberNoticeHeader, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = memberNoticeHeader;
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
                SharedFlow<Action> sharedFlow = ((PegasusViewModel) this.this$0.f75824m.getValue()).f79014f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    public static void c(Fragment fragment, String str) {
        if (str == null || StringsKt.isBlank(str) || fragment == null || !ListExtentionsKt.isViewAlive(fragment)) {
            return;
        }
        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse(str)).requestCode(200).data(Uri.parse(str)).build(), fragment);
    }

    public final HeaderViewModel b() {
        return (HeaderViewModel) this.f75823l.getValue();
    }

    @NotNull
    public final String getComponentName() {
        return this.f75828q;
    }

    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 200) {
            b().I0();
            b().f75784a = 0L;
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            b().I0();
        }
        BiliAccounts.get(getContext()).subscribe(this.f75825n, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        RecommendMode.addObserver(this.f75827p);
        PegasusStyle.INSTANCE.registerObserver(this.f75826o);
    }

    public final void onDestroy() {
        super.onDestroy();
        BiliAccounts.get(getContext()).unsubscribe(this.f75825n, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        RecommendMode.removeObserver(this.f75827p);
        PegasusStyle.INSTANCE.unRegisterObserver(this.f75826o);
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, view, pegasusHeaderManager, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
