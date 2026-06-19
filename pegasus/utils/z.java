package com.bilibili.pegasus.utils;

import android.animation.Animator;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.commons.security.DigestUtils;
import com.bilibili.lib.resmanager.ResCallback;
import com.bilibili.lib.resmanager.ResDownloadRequest;
import com.bilibili.lib.resmanager.ResManager;
import com.bilibili.lib.resmanager.ResResponse;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/z.class */
@StabilityInferred(parameters = 0)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LottieAnimationView f78900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TintImageView f78901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TintTextView f78902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final l f78903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final FunctionReferenceImpl f78904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Lifecycle f78905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f78906g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f78907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f78908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f78909k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f78910l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public String f78911m = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/z$a.class */
    public static final class a implements ResCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LikeButtonItemV2.LikeResource f78912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f78914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final z f78915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LikeButtonItemV2.LikeResource f78916e;

        public a(LikeButtonItemV2.LikeResource likeResource, boolean z6, boolean z7, z zVar, LikeButtonItemV2.LikeResource likeResource2) {
            this.f78912a = likeResource;
            this.f78913b = z6;
            this.f78914c = z7;
            this.f78915d = zVar;
            this.f78916e = likeResource2;
        }

        @Override // com.bilibili.lib.resmanager.ResCallback
        public final void onFailure(int i7, String str) {
            StringBuilder sbA = G0.b.a("inline like res download failure \n errMsg = ", str, " \n resUrl = ", this.f78916e.url, " \n night theme : ");
            sbA.append(this.f78913b);
            sbA.append(" \n isSelected :");
            sbA.append(this.f78914c);
            BLog.w("InlineLikeButtonHelper", sbA.toString());
        }

        @Override // com.bilibili.lib.resmanager.ResCallback
        public final void onSuccess(ResResponse resResponse) {
            File file;
            if (!Intrinsics.areEqual(this.f78912a.contentHash, DigestUtils.getFileMD5(resResponse.getPath()))) {
                File file2 = resResponse.getFile();
                if (file2 == null || !file2.exists() || (file = resResponse.getFile()) == null) {
                    return;
                }
                file.delete();
                return;
            }
            z zVar = this.f78915d;
            boolean z6 = this.f78914c;
            boolean z7 = this.f78913b;
            if (z7 && z6) {
                zVar.f78907i = resResponse.getPath();
                return;
            }
            if (z7 && !z6) {
                zVar.f78908j = resResponse.getPath();
                return;
            }
            if (!z7 && z6) {
                zVar.f78906g = resResponse.getPath();
            } else {
                if (z7 || z6) {
                    return;
                }
                zVar.h = resResponse.getPath();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/z$b.class */
    public static final class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f78917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LikeButtonItemV2 f78918b;

        public b(z zVar, LikeButtonItemV2 likeButtonItemV2) {
            this.f78917a = zVar;
            this.f78918b = likeButtonItemV2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f78917a.f78901b.setVisibility(0);
            this.f78917a.f78900a.setVisibility(8);
            this.f78917a.f78909k = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f78917a.f78901b.setVisibility(4);
            this.f78917a.f78902c.setSelected(this.f78918b.isSelected());
            ListExtentionsKt.setText(this.f78917a.f78902c, this.f78918b.getFormatCount());
        }
    }

    public z(@NotNull LottieAnimationView lottieAnimationView, @NotNull TintImageView tintImageView, @NotNull TintTextView tintTextView, @Nullable l lVar, @Nullable Function1<? super Long, Unit> function1, @Nullable Lifecycle lifecycle) {
        this.f78900a = lottieAnimationView;
        this.f78901b = tintImageView;
        this.f78902c = tintTextView;
        this.f78903d = lVar;
        this.f78904e = (FunctionReferenceImpl) function1;
        this.f78905f = lifecycle;
    }

    public static void f(z zVar, LikeButtonItemV2 likeButtonItemV2, BasicIndexItem basicIndexItem, int i7) {
        LifecycleCoroutineScope coroutineScope;
        if ((i7 & 2) != 0) {
            basicIndexItem = null;
        }
        Lifecycle lifecycle = zVar.f78905f;
        if (lifecycle == null || (coroutineScope = LifecycleKt.getCoroutineScope(lifecycle)) == null) {
            return;
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PegasusInlineLikeButtonHelper$requestLike$1(zVar, likeButtonItemV2, basicIndexItem, "7", null), 3, (Object) null);
    }

    public final void a(LikeButtonItemV2.LikeResource likeResource, boolean z6, boolean z7) {
        if (likeResource != null) {
            ResManager.download(new ResDownloadRequest(likeResource.url, null, 2, null).reportBizType("pegasus_inline"), new a(likeResource, z6, z7, this, likeResource));
        }
    }

    public final String b(boolean z6, boolean z7) {
        boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(this.f78900a.getContext().getApplicationContext());
        return (zIsNightTheme && z6 && z7) ? this.f78907i : (zIsNightTheme && z6 && !z7) ? "inline_click_to_like_night.json" : (zIsNightTheme && !z6 && z7) ? this.f78908j : (!zIsNightTheme || z6 || z7) ? (!zIsNightTheme && z6 && z7) ? this.f78906g : (zIsNightTheme || !z6 || z7) ? (zIsNightTheme || z6 || !z7) ? (zIsNightTheme || z6 || z7) ? null : "inline_click_to_dislike.json" : this.h : "inline_click_to_like.json" : "inline_click_to_dislike_night.json";
    }

    public final void c(@NotNull final LikeButtonItemV2 likeButtonItemV2, @Nullable final BasicIndexItem basicIndexItem, @NotNull String str, @NotNull String str2, @NotNull final String str3) {
        this.f78910l = str;
        this.f78911m = str2;
        boolean zIsSelected = likeButtonItemV2.isSelected();
        String formatCount = likeButtonItemV2.getFormatCount();
        TintTextView tintTextView = this.f78902c;
        ListExtentionsKt.setText(tintTextView, formatCount);
        CharSequence text = tintTextView.getText();
        tintTextView.setContentDescription(((Object) text) + tintTextView.getResources().getString(2131841358));
        this.f78909k = true;
        LottieAnimationView lottieAnimationView = this.f78900a;
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.addAnimatorListener(new b(this, likeButtonItemV2));
        lottieAnimationView.setOnClickListener(new View.OnClickListener(this, likeButtonItemV2, basicIndexItem, str3) { // from class: com.bilibili.pegasus.utils.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final z f78896a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LikeButtonItemV2 f78897b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BasicIndexItem f78898c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f78899d;

            {
                this.f78896a = this;
                this.f78897b = likeButtonItemV2;
                this.f78898c = basicIndexItem;
                this.f78899d = str3;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LifecycleCoroutineScope coroutineScope;
                z zVar = this.f78896a;
                LikeButtonItemV2 likeButtonItemV22 = this.f78897b;
                BasicIndexItem basicIndexItem2 = this.f78898c;
                String str4 = this.f78899d;
                Lifecycle lifecycle = zVar.f78905f;
                if (lifecycle == null || (coroutineScope = LifecycleKt.getCoroutineScope(lifecycle)) == null) {
                    return;
                }
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PegasusInlineLikeButtonHelper$requestLike$1(zVar, likeButtonItemV22, basicIndexItem2, str4, null), 3, (Object) null);
            }
        });
        TintImageView tintImageView = this.f78901b;
        tintImageView.setVisibility(0);
        tintImageView.setSelected(zIsSelected);
        tintTextView.setSelected(zIsSelected);
        a(likeButtonItemV2.likeNightResource, true, true);
        a(likeButtonItemV2.dislikeNightResource, true, false);
        a(likeButtonItemV2.likeResource, false, true);
        a(likeButtonItemV2.dislikeResource, false, false);
    }

    public final void e(@Nullable String str, boolean z6) {
        TintTextView tintTextView = this.f78902c;
        ListExtentionsKt.setText(tintTextView, str);
        this.f78901b.setSelected(z6);
        tintTextView.setSelected(z6);
    }
}
