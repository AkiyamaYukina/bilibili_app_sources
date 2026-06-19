package com.bilibili.upper.widget;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.mobile.BLHumanActionParamsType;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.swiperefresh.TintSwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/BaseSwipeRecyclerViewFragmentWithGradient.class */
@StabilityInferred(parameters = 0)
public class BaseSwipeRecyclerViewFragmentWithGradient extends BaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public LoadingImageView f114304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TintSwipeRefreshLayout f114305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public RecyclerView f114306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public FrameLayout f114307f;

    @Nullable
    public ImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ImageView f114309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public TextView f114310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ImageView f114311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f114312l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C6696k f114303b = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f114308g = true;

    /* JADX INFO: renamed from: com.bilibili.upper.widget.BaseSwipeRecyclerViewFragmentWithGradient$setRefreshCompleted$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/BaseSwipeRecyclerViewFragmentWithGradient$setRefreshCompleted$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $interval;
        int label;
        final BaseSwipeRecyclerViewFragmentWithGradient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j7, BaseSwipeRecyclerViewFragmentWithGradient baseSwipeRecyclerViewFragmentWithGradient, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$interval = j7;
            this.this$0 = baseSwipeRecyclerViewFragmentWithGradient;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$interval, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                long j7 = BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE;
                long j8 = this.$interval;
                this.label = 1;
                if (DelayKt.delay(j7 - j8, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.setRefreshCompleted();
            return Unit.INSTANCE;
        }
    }

    public void jf() {
    }

    public void kf() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494243, viewGroup, false);
        if (viewInflate != null) {
            this.f114304c = viewInflate.findViewById(2131305811);
            this.f114305d = viewInflate.findViewById(2131303590);
            this.f114306e = (RecyclerView) viewInflate.findViewById(2131306580);
            this.f114307f = (FrameLayout) viewInflate.findViewById(2131302585);
        }
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        CoroutineScopeKt.cancel$default(this.f114303b, (CancellationException) null, 1, (Object) null);
        super.onDestroy();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        TintSwipeRefreshLayout tintSwipeRefreshLayout = this.f114305d;
        if (tintSwipeRefreshLayout != null) {
            tintSwipeRefreshLayout.setRefreshing(false);
            tintSwipeRefreshLayout.destroyDrawingCache();
            tintSwipeRefreshLayout.clearAnimation();
        }
    }

    public void onRefresh() {
        this.f114312l = SystemClock.elapsedRealtime();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Drawable background;
        super.onViewCreated(view, bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        FrameLayout frameLayout = this.f114307f;
        View viewInflate = layoutInflater.inflate(2131494811, (ViewGroup) frameLayout, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(2131302849);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(2131304362);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(2131304427);
        ImageView imageView4 = (ImageView) viewInflate.findViewById(2131304215);
        TextView textView = (TextView) viewInflate.findViewById(2131310619);
        this.f114310j = textView;
        if (this.f114308g && textView != null) {
            textView.setVisibility(4);
        }
        if (frameLayout == null || !MultipleThemeUtils.isWhiteTheme(frameLayout.getContext())) {
            imageView.setImageResource(2131236540);
            imageView2.setImageResource(2131236541);
            imageView3.setImageResource(2131236544);
        } else {
            imageView.setImageResource(2131236539);
            imageView2.setImageResource(2131236542);
            imageView3.setImageResource(2131236543);
        }
        imageView.setOnClickListener(new XO.r(this, 3));
        imageView2.setOnClickListener(new On0.p(this, 2));
        this.h = imageView3;
        this.f114309i = imageView2;
        this.f114311k = imageView4;
        imageView3.setVisibility(8);
        FrameLayout frameLayout2 = this.f114307f;
        if (frameLayout2 != null) {
            frameLayout2.addView(viewInflate);
        }
        TintSwipeRefreshLayout tintSwipeRefreshLayout = this.f114305d;
        if (tintSwipeRefreshLayout != null) {
            tintSwipeRefreshLayout.setColorSchemeResources(new int[]{2131103284});
            tintSwipeRefreshLayout.setProgressViewOffset(false, (int) wj.a.a(tintSwipeRefreshLayout.getContext(), 88.0f), (int) wj.a.a(tintSwipeRefreshLayout.getContext(), 138.0f));
            tintSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener(this) { // from class: com.bilibili.upper.widget.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BaseSwipeRecyclerViewFragmentWithGradient f114478a;

                {
                    this.f114478a = this;
                }

                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
                public final void onRefresh() {
                    this.f114478a.onRefresh();
                }
            });
        }
        FrameLayout frameLayout3 = this.f114307f;
        if (frameLayout3 != null) {
            frameLayout3.setBackgroundColor(getResources().getColor(2131104254));
        }
        FrameLayout frameLayout4 = this.f114307f;
        if (frameLayout4 != null && (background = frameLayout4.getBackground()) != null) {
            background.setAlpha(0);
        }
        RecyclerView recyclerView = this.f114306e;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new C6688c(this));
        }
        RecyclerView recyclerView2 = this.f114306e;
        if (recyclerView2 == null) {
            return;
        }
        onViewCreated(recyclerView2, bundle);
    }

    public void onViewCreated(@NotNull RecyclerView recyclerView, @Nullable Bundle bundle) {
    }

    public final void setRefreshCompleted() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f114312l;
        if (jElapsedRealtime < 500) {
            BuildersKt.launch$default(this.f114303b, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(jElapsedRealtime, this, null), 3, (Object) null);
            return;
        }
        TintSwipeRefreshLayout tintSwipeRefreshLayout = this.f114305d;
        if (tintSwipeRefreshLayout != null) {
            tintSwipeRefreshLayout.post(new EV.u(this, 1));
        }
    }
}
