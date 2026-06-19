package com.bilibili.pegasus.common.inline;

import I00.b;
import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.pvtracker.PageViewTracker;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qp0.C8476b;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/l.class */
@StabilityInferred(parameters = 0)
public final class l<T extends BasePegasusPlayerData & I00.b> implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T f75572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LottieAnimationView f75573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final View f75574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public a<T> f75575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f75576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75578g;

    @NotNull
    public final k h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final b f75579i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/l$a.class */
    public interface a<T extends BasePegasusPlayerData> {
        void a();

        void b(@NotNull T t7);

        void c(@NotNull T t7);

        void d(@NotNull T t7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/l$b.class */
    public static final class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l<T> f75580a;

        public b(l<T> lVar) {
            this.f75580a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            l<T> lVar = this.f75580a;
            if (lVar.f75577f) {
                if (BiliAccounts.get(lVar.f75576e).isLogin()) {
                    m mVar = new m(lVar);
                    IVideoLikeRouteService.ActionLikeTriplePolymer.Companion companion = IVideoLikeRouteService.ActionLikeTriplePolymer.Companion;
                    IVideoLikeRouteService.ActionLikeTriplePolymer.Builder builder = new IVideoLikeRouteService.ActionLikeTriplePolymer.Builder();
                    builder.setAid(Long.valueOf(lVar.f75572a.getAid()));
                    builder.setFrom("76");
                    builder.setSpmid(PlayerParamsBuilderKt.SPMID_RECOMMEND);
                    builder.setFromSpmid(PlayerParamsBuilderKt.SPMID_RECOMMEND);
                    builder.setActionId(PageViewTracker.getInstance().currentPolarisActionId());
                    IVideoLikeRouteService.ActionLikeTriplePolymer actionLikeTriplePolymerBuild = builder.build();
                    IVideoLikeRouteService iVideoLikeRouteService = (IVideoLikeRouteService) BLRouter.INSTANCE.get(IVideoLikeRouteService.class, "video_like");
                    if (iVideoLikeRouteService != null) {
                        iVideoLikeRouteService.reportActionLikeTriple(actionLikeTriplePolymerBuild, mVar);
                    }
                } else {
                    a<T> aVar = lVar.f75575d;
                    if (aVar != null) {
                        aVar.a();
                    }
                    Context context = lVar.f75576e;
                    Lazy lazy = C8476b.f126257a;
                    sg.s.b(context, "activity://main/login/");
                }
                l<T> lVar2 = this.f75580a;
                a<T> aVar2 = lVar2.f75575d;
                if (aVar2 != null) {
                    aVar2.b(lVar2.f75572a);
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.bilibili.pegasus.common.inline.k] */
    public l(@NotNull T t7, @NotNull LottieAnimationView lottieAnimationView, @NotNull View view, boolean z6) {
        this.f75572a = t7;
        this.f75573b = lottieAnimationView;
        this.f75574c = view;
        view.setOnLongClickListener(this);
        if (z6) {
            NewPlayerUtilsKt.setVisibleOrGone(view, t7.getLikeButton() != null);
        }
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.setVisibility(8);
        this.f75576e = view.getContext();
        this.h = new View.OnTouchListener(this) { // from class: com.bilibili.pegasus.common.inline.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final l f75571a;

            {
                this.f75571a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                l lVar = this.f75571a;
                int action = motionEvent.getAction();
                if (action != 1 && action != 3) {
                    return false;
                }
                if (lVar.f75578g && lVar.f75577f && lVar.f75573b.getProgress() < 0.3f) {
                    lVar.f75577f = false;
                    lVar.f75573b.setSpeed(-1.5f);
                    lVar.f75573b.resumeAnimation();
                }
                lVar.f75578g = false;
                return false;
            }
        };
        this.f75579i = new b(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(@Nullable View view) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        this.f75578g = true;
        a<T> aVar = this.f75575d;
        if (aVar != null) {
            aVar.d(this.f75572a);
        }
        if (this.f75572a.hasTripleLike()) {
            PromoToast.showBottomToast(this.f75576e, 2131845512);
            return true;
        }
        AccountInfo accountInfoFromCache = BiliAccountInfo.Companion.get().getAccountInfoFromCache();
        if (accountInfoFromCache != null && accountInfoFromCache.getSilence() == 1) {
            PromoToast.showBottomToast(this.f75576e, 2131847121);
            return true;
        }
        SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        if (bLKVSharedPreference != null && (editorEdit = bLKVSharedPreference.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("has_show_triple_like_guide", true)) != null) {
            editorPutBoolean.apply();
        }
        this.f75574c.setOnTouchListener(this.h);
        LottieAnimationView lottieAnimationView = this.f75573b;
        lottieAnimationView.removeAllAnimatorListeners();
        this.f75577f = true;
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setProgress(0.0f);
        lottieAnimationView.setSpeed(1.0f);
        lottieAnimationView.addAnimatorListener(this.f75579i);
        lottieAnimationView.playAnimation();
        return this.f75578g;
    }
}
