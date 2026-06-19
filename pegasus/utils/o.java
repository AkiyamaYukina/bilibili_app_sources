package com.bilibili.pegasus.utils;

import I00.b;
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
import com.bilibili.pegasus.api.modelv2.BasePlayerItem;
import com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.model.ChannelLargeCoverSingleV9Item;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/o.class */
@StabilityInferred(parameters = 0)
public final class o<T extends BasePlayerItem & I00.b> implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChannelLargeCoverSingleV9Item f78876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LottieAnimationView f78877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final View f78878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public a<T> f78879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f78880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f78881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f78882g;

    @NotNull
    public final n h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final p f78883i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/o$a.class */
    public interface a<T extends BasePlayerItem> {
        void a();

        void b(@NotNull ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item);

        void c(@NotNull ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item);

        void d(@NotNull ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.bilibili.pegasus.utils.n] */
    public o(@NotNull ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item, @NotNull LottieAnimationView lottieAnimationView, @NotNull View view) {
        this.f78876a = channelLargeCoverSingleV9Item;
        this.f78877b = lottieAnimationView;
        this.f78878c = view;
        view.setOnLongClickListener(this);
        NewPlayerUtilsKt.setVisibleOrGone(view, ((BasePlayerItem) channelLargeCoverSingleV9Item).likeButton != null);
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.setVisibility(8);
        this.f78880e = view.getContext();
        this.h = new View.OnTouchListener(this) { // from class: com.bilibili.pegasus.utils.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o f78875a;

            {
                this.f78875a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                o oVar = this.f78875a;
                int action = motionEvent.getAction();
                if (action != 1 && action != 3) {
                    return false;
                }
                if (oVar.f78882g && oVar.f78881f && oVar.f78877b.getProgress() < 0.3f) {
                    oVar.f78881f = false;
                    oVar.f78877b.setSpeed(-1.5f);
                    oVar.f78877b.resumeAnimation();
                }
                oVar.f78882g = false;
                return false;
            }
        };
        this.f78883i = new p(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(@Nullable View view) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        this.f78882g = true;
        a<T> aVar = this.f78879d;
        if (aVar != null) {
            aVar.b(this.f78876a);
        }
        if (this.f78876a.hasTripleLike()) {
            PromoToast.showBottomToast(this.f78880e, 2131845512);
            return true;
        }
        AccountInfo accountInfoFromCache = BiliAccountInfo.Companion.get().getAccountInfoFromCache();
        if (accountInfoFromCache != null && accountInfoFromCache.getSilence() == 1) {
            PromoToast.showBottomToast(this.f78880e, 2131847121);
            return true;
        }
        SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        if (bLKVSharedPreference != null && (editorEdit = bLKVSharedPreference.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("has_show_triple_like_guide", true)) != null) {
            editorPutBoolean.apply();
        }
        this.f78878c.setOnTouchListener(this.h);
        LottieAnimationView lottieAnimationView = this.f78877b;
        lottieAnimationView.removeAllAnimatorListeners();
        this.f78881f = true;
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setProgress(0.0f);
        lottieAnimationView.setSpeed(1.0f);
        lottieAnimationView.addAnimatorListener(this.f78883i);
        lottieAnimationView.playAnimation();
        return this.f78882g;
    }
}
