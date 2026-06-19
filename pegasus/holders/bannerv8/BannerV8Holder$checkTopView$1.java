package com.bilibili.pegasus.holders.bannerv8;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.adcommon.utils.ext.AdExtensions;
import com.bilibili.app.comm.list.widget.swiper.SwiperBanner;
import com.bilibili.gripper.api.ad.biz.pegasus.banner.AdBannerData;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import com.bilibili.lib.homepage.splash.model.SelectedSplashTopViewIdInfo;
import com.bilibili.lib.homepage.splash.model.SplashState;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/BannerV8Holder$checkTopView$1.class */
final class BannerV8Holder$checkTopView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final SplashViewModel $viewModel;
    int label;
    final BannerV8Holder this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.holders.bannerv8.BannerV8Holder$checkTopView$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/BannerV8Holder$checkTopView$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<SplashState, Continuation<? super Boolean>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(SplashState splashState, Continuation<? super Boolean> continuation) {
            return create(splashState, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SplashState splashState = (SplashState) this.L$0;
            SelectedSplashTopViewIdInfo selectedSplashTopViewIdInfo = splashState.getSelectedSplashTopViewIdInfo();
            boolean z6 = false;
            if (selectedSplashTopViewIdInfo != null) {
                z6 = false;
                if (selectedSplashTopViewIdInfo.getSelectedSplashId() == AdExtensions.toLongOrDefault(splashState.getRealShowTopViewId(), -1L)) {
                    z6 = true;
                }
            }
            return Boxing.boxBoolean(z6);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/BannerV8Holder$checkTopView$1$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BannerV8Holder f77706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SplashViewModel f77707b;

        public a(BannerV8Holder bannerV8Holder, SplashViewModel splashViewModel) {
            this.f77706a = bannerV8Holder;
            this.f77707b = splashViewModel;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.pegasus.BasePegasusHolder, com.bilibili.pegasus.holders.bannerv8.BannerV8Holder, java.lang.Object] */
        @Override // java.lang.Runnable
        public final void run() {
            gp0.c cVar;
            List<gp0.b> listK;
            gp0.b bVar;
            AdBannerData adBannerDataA;
            RecyclerView recyclerView;
            ?? r02 = this.f77706a;
            String realShowTopViewId = ((SplashState) this.f77707b.getState().getValue()).getRealShowTopViewId();
            int i7 = BannerV8Holder.f77681u;
            r02.getClass();
            Rect rect = new Rect();
            V8Banner v8Banner = r02.f77682f;
            int selectPosition = v8Banner != null ? v8Banner.getSelectPosition() : -1;
            if (selectPosition >= 0 && (cVar = (gp0.c) r02.getBindData()) != null && (listK = cVar.k()) != null && (bVar = (gp0.b) CollectionsKt.getOrNull(listK, selectPosition)) != null && (adBannerDataA = bVar.a()) != null && adBannerDataA.isTopView()) {
                AdBannerData adBannerDataA2 = bVar.a();
                View viewFindViewByPosition = null;
                if (Intrinsics.areEqual(adBannerDataA2 != null ? adBannerDataA2.getSplashId() : null, realShowTopViewId) && h.b(bVar.getType())) {
                    RecyclerView.LayoutManager layoutManager = (v8Banner == null || (recyclerView = v8Banner.getRecyclerView()) == null) ? null : recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        viewFindViewByPosition = linearLayoutManager.findViewByPosition(v8Banner.getViewPager2().getCurrentItem());
                    }
                    if (viewFindViewByPosition != null) {
                        viewFindViewByPosition.getGlobalVisibleRect(rect);
                    } else {
                        r02.itemView.getGlobalVisibleRect(rect);
                        rect.left = r02.itemView.getPaddingStart() + rect.left;
                        rect.top = r02.itemView.getPaddingTop() + rect.top;
                        rect.right -= r02.itemView.getPaddingEnd();
                        rect.bottom -= r02.itemView.getPaddingBottom();
                    }
                }
            }
            this.f77707b.update(new fa0.d(rect));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/BannerV8Holder$checkTopView$1$b.class */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f77708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BannerV8Holder f77709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SplashViewModel f77710c;

        public b(View view, BannerV8Holder bannerV8Holder, SplashViewModel splashViewModel) {
            this.f77708a = view;
            this.f77709b = bannerV8Holder;
            this.f77710c = splashViewModel;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BannerV8Holder bannerV8Holder = this.f77709b;
            bannerV8Holder.f77682f.post(new a(bannerV8Holder, this.f77710c));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerV8Holder$checkTopView$1(SplashViewModel splashViewModel, BannerV8Holder bannerV8Holder, Continuation<? super BannerV8Holder$checkTopView$1> continuation) {
        super(2, continuation);
        this.$viewModel = splashViewModel;
        this.this$0 = bannerV8Holder;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BannerV8Holder$checkTopView$1(this.$viewModel, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow state = this.$viewModel.getState();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (FlowKt.first(state, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        q4.r.a("topview ", ((SplashState) this.$viewModel.getState().getValue()).getRealShowTopViewId(), " get", "BannerV8Holder");
        BannerV8Holder bannerV8Holder = this.this$0;
        SwiperBanner swiperBanner = bannerV8Holder.f77682f;
        OneShotPreDrawListener.add(swiperBanner, new b(swiperBanner, bannerV8Holder, this.$viewModel));
        return Unit.INSTANCE;
    }
}
