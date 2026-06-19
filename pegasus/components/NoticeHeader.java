package com.bilibili.pegasus.components;

import ZS0.J1;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4848Z;
import com.bilibili.api.utils.FastJsonUtils;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.biligame.bean.GameCenterBottomTabConfig;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.components.BiliNotice;
import com.bilibili.pegasus.components.NoticeHeader;
import com.google.gson.Gson;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qp0.C8476b;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.ForegroundRelativeLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/NoticeHeader.class */
@StabilityInferred(parameters = 0)
public final class NoticeHeader extends BasePegasusComponent {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f75840m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75838k = "PegasusNoticeHeader";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75839l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(d0.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f75841n = LazyKt.lazy(new J1(this, 4));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/NoticeHeader$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoticeHeader f75842a;

        public a(NoticeHeader noticeHeader) {
            this.f75842a = noticeHeader;
        }

        public final Object invoke() {
            return this.f75842a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/NoticeHeader$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoticeHeader f75843a;

        public b(NoticeHeader noticeHeader) {
            this.f75843a = noticeHeader;
        }

        public final Object invoke() {
            return this.f75843a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/NoticeHeader$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoticeHeader f75844a;

        public c(NoticeHeader noticeHeader) {
            this.f75844a = noticeHeader;
        }

        public final Object invoke() {
            return this.f75844a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.NoticeHeader$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/NoticeHeader$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PegasusHeaderManager $headerManager;
        int label;
        final NoticeHeader this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.NoticeHeader$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/NoticeHeader$onViewCreated$1$1.class */
        public static final class C04821 extends SuspendLambda implements Function2<BiliNotice, Continuation<? super Unit>, Object> {
            final PegasusHeaderManager $headerManager;
            Object L$0;
            int label;
            final NoticeHeader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04821(NoticeHeader noticeHeader, PegasusHeaderManager pegasusHeaderManager, Continuation<? super C04821> continuation) {
                super(2, continuation);
                this.this$0 = noticeHeader;
                this.$headerManager = pegasusHeaderManager;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(BiliNotice biliNotice, PegasusHeaderManager pegasusHeaderManager, NoticeHeader noticeHeader, View view) {
                biliNotice.setCancel(true);
                try {
                    pegasusHeaderManager.removeHeader("PegasusNoticeHeader");
                    ((SharedPreferencesHelper) noticeHeader.f75841n.getValue()).setString("preference_notice_bar", new Gson().toJson(biliNotice));
                } catch (Exception e7) {
                    BLog.d(e7.getMessage());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$1(BiliNotice.Data data, NoticeHeader noticeHeader, View view) {
                if (TextUtils.isEmpty(data.getUri())) {
                    return;
                }
                C8476b.d(noticeHeader.getContext(), ListExtentionsKt.toUri(data.getUri()), GameCenterBottomTabConfig.TAB_TYPE_ACT, null, null, null, null, 248);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04821 c04821 = new C04821(this.this$0, this.$headerManager, continuation);
                c04821.L$0 = obj;
                return c04821;
            }

            public final Object invoke(BiliNotice biliNotice, Continuation<? super Unit> continuation) {
                return create(biliNotice, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                final BiliNotice.Data data;
                BiliNotice biliNotice;
                BiliNotice.Data data2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final BiliNotice biliNotice2 = (BiliNotice) this.L$0;
                if (this.this$0.f75840m) {
                    this.$headerManager.removeHeader("PegasusNoticeHeader");
                    this.this$0.f75840m = false;
                }
                if (biliNotice2 == null || (data = biliNotice2.getData()) == null) {
                    return Unit.INSTANCE;
                }
                C4848Z c4848zInflate = C4848Z.inflate(LayoutInflater.from(this.this$0.getContext()));
                long jCurrentTimeMillis = System.currentTimeMillis();
                long startTime = data.getStartTime();
                long j7 = 1000;
                boolean z6 = jCurrentTimeMillis >= startTime * j7 && jCurrentTimeMillis <= data.getEndTime() * j7;
                String strOptString = ((SharedPreferencesHelper) this.this$0.f75841n.getValue()).optString("preference_notice_bar", "");
                TintImageView tintImageView = c4848zInflate.f53946b;
                final PegasusHeaderManager pegasusHeaderManager = this.$headerManager;
                final NoticeHeader noticeHeader = this.this$0;
                tintImageView.setOnClickListener(new View.OnClickListener(biliNotice2, pegasusHeaderManager, noticeHeader) { // from class: com.bilibili.pegasus.components.Y

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final BiliNotice f75889a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final PegasusHeaderManager f75890b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final NoticeHeader f75891c;

                    {
                        this.f75889a = biliNotice2;
                        this.f75890b = pegasusHeaderManager;
                        this.f75891c = noticeHeader;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NoticeHeader.AnonymousClass1.C04821.invokeSuspend$lambda$0(this.f75889a, this.f75890b, this.f75891c, view);
                    }
                });
                final NoticeHeader noticeHeader2 = this.this$0;
                View.OnClickListener onClickListener = new View.OnClickListener(data, noticeHeader2) { // from class: com.bilibili.pegasus.components.Z

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final BiliNotice.Data f75892a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final NoticeHeader f75893b;

                    {
                        this.f75892a = data;
                        this.f75893b = noticeHeader2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NoticeHeader.AnonymousClass1.C04821.invokeSuspend$lambda$1(this.f75892a, this.f75893b, view);
                    }
                };
                ForegroundRelativeLayout foregroundRelativeLayout = c4848zInflate.f53945a;
                foregroundRelativeLayout.setOnClickListener(onClickListener);
                c4848zInflate.f53948d.setText(data.getTitle());
                c4848zInflate.f53947c.setText(data.getContent());
                if (!TextUtils.isEmpty(strOptString)) {
                    try {
                        biliNotice = (BiliNotice) FastJsonUtils.parse(strOptString, BiliNotice.class);
                    } catch (Exception e7) {
                        e7.printStackTrace();
                        biliNotice = null;
                    }
                    if (biliNotice != null && (data2 = biliNotice.getData()) != null && data2.getId() == data.getId()) {
                        if (biliNotice.isCancel() || !z6) {
                            this.this$0.f75840m = false;
                            this.$headerManager.removeHeader("PegasusNoticeHeader");
                        }
                        return Unit.INSTANCE;
                    }
                }
                if (z6) {
                    this.this$0.f75840m = true;
                    this.$headerManager.addHeader(foregroundRelativeLayout, "PegasusNoticeHeader");
                } else {
                    this.this$0.f75840m = false;
                    this.$headerManager.removeHeader("PegasusNoticeHeader");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NoticeHeader noticeHeader, PegasusHeaderManager pegasusHeaderManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = noticeHeader;
            this.$headerManager = pegasusHeaderManager;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$headerManager, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<BiliNotice> stateFlow = ((d0) this.this$0.f75839l.getValue()).f75952b;
                C04821 c04821 = new C04821(this.this$0, this.$headerManager, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c04821, this) == coroutine_suspended) {
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
        return this.f75838k;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        d0 d0Var = (d0) this.f75839l.getValue();
        Job job = d0Var.f75953c;
        if (job == null || !job.isActive()) {
            d0Var.f75953c = BuildersKt.launch$default(ViewModelKt.getViewModelScope(d0Var), (CoroutineContext) null, (CoroutineStart) null, new NoticeViewModel$loadNotice$1(d0Var, null), 3, (Object) null);
        }
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, pegasusHeaderManager, null), 3, (Object) null);
    }
}
