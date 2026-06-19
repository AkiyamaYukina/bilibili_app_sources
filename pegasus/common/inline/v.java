package com.bilibili.pegasus.common.inline;

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
import com.bilibili.pegasus.data.base.BasePegasusData;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/v.class */
@StabilityInferred(parameters = 0)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LottieAnimationView f75601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TintImageView f75602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TintTextView f75603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final FunctionReferenceImpl f75604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Lifecycle f75605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f75606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f75607g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f75608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f75609j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f75610k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f75611l = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/v$a.class */
    public static final class a implements ResCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LikeButtonItemV2.LikeResource f75612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f75613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f75614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v f75615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LikeButtonItemV2.LikeResource f75616e;

        public a(LikeButtonItemV2.LikeResource likeResource, boolean z6, boolean z7, v vVar, LikeButtonItemV2.LikeResource likeResource2) {
            this.f75612a = likeResource;
            this.f75613b = z6;
            this.f75614c = z7;
            this.f75615d = vVar;
            this.f75616e = likeResource2;
        }

        @Override // com.bilibili.lib.resmanager.ResCallback
        public final void onFailure(int i7, String str) {
            StringBuilder sbA = G0.b.a("inline like res download failure \n errMsg = ", str, " \n resUrl = ", this.f75616e.url, " \n night theme : ");
            sbA.append(this.f75613b);
            sbA.append(" \n isSelected :");
            sbA.append(this.f75614c);
            BLog.w("InlineLikeButtonHelper", sbA.toString());
        }

        @Override // com.bilibili.lib.resmanager.ResCallback
        public final void onSuccess(ResResponse resResponse) {
            File file;
            if (!Intrinsics.areEqual(this.f75612a.contentHash, DigestUtils.getFileMD5(resResponse.getPath()))) {
                File file2 = resResponse.getFile();
                if (file2 == null || !file2.exists() || (file = resResponse.getFile()) == null) {
                    return;
                }
                file.delete();
                return;
            }
            v vVar = this.f75615d;
            boolean z6 = this.f75614c;
            boolean z7 = this.f75613b;
            if (z7 && z6) {
                vVar.h = resResponse.getPath();
                return;
            }
            if (z7 && !z6) {
                vVar.f75608i = resResponse.getPath();
                return;
            }
            if (!z7 && z6) {
                vVar.f75606f = resResponse.getPath();
            } else {
                if (z7 || z6) {
                    return;
                }
                vVar.f75607g = resResponse.getPath();
            }
        }
    }

    public v(@NotNull LottieAnimationView lottieAnimationView, @NotNull TintImageView tintImageView, @NotNull TintTextView tintTextView, @Nullable Function1<? super Long, Unit> function1, @Nullable Lifecycle lifecycle) {
        this.f75601a = lottieAnimationView;
        this.f75602b = tintImageView;
        this.f75603c = tintTextView;
        this.f75604d = (FunctionReferenceImpl) function1;
        this.f75605e = lifecycle;
    }

    public static void d(final v vVar, final LikeButtonItemV2 likeButtonItemV2, final BasePegasusData basePegasusData, String str, String str2) {
        vVar.f75610k = str;
        vVar.f75611l = str2;
        boolean zIsSelected = likeButtonItemV2.isSelected();
        String formatCount = likeButtonItemV2.getFormatCount();
        TintTextView tintTextView = vVar.f75603c;
        ListExtentionsKt.setText(tintTextView, formatCount);
        CharSequence text = tintTextView.getText();
        tintTextView.setContentDescription(((Object) text) + tintTextView.getResources().getString(2131841358));
        vVar.f75609j = true;
        LottieAnimationView lottieAnimationView = vVar.f75601a;
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.addAnimatorListener(new w(vVar, likeButtonItemV2));
        final String str3 = "7";
        lottieAnimationView.setOnClickListener(new View.OnClickListener(vVar, likeButtonItemV2, basePegasusData, str3) { // from class: com.bilibili.pegasus.common.inline.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final v f75597a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LikeButtonItemV2 f75598b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BasePegasusData f75599c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f75600d;

            {
                this.f75597a = vVar;
                this.f75598b = likeButtonItemV2;
                this.f75599c = basePegasusData;
                this.f75600d = str3;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LifecycleCoroutineScope coroutineScope;
                v vVar2 = this.f75597a;
                LikeButtonItemV2 likeButtonItemV22 = this.f75598b;
                BasePegasusData basePegasusData2 = this.f75599c;
                String str4 = this.f75600d;
                Lifecycle lifecycle = vVar2.f75605e;
                if (lifecycle == null || (coroutineScope = LifecycleKt.getCoroutineScope(lifecycle)) == null) {
                    return;
                }
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PegasusInlineLikeButtonHelper$requestLike$1(vVar2, likeButtonItemV22, basePegasusData2, str4, null), 3, (Object) null);
            }
        });
        TintImageView tintImageView = vVar.f75602b;
        tintImageView.setVisibility(0);
        tintImageView.setSelected(zIsSelected);
        tintTextView.setSelected(zIsSelected);
        vVar.b(likeButtonItemV2.likeNightResource, true, true);
        vVar.b(likeButtonItemV2.dislikeNightResource, true, false);
        vVar.b(likeButtonItemV2.likeResource, false, true);
        vVar.b(likeButtonItemV2.dislikeResource, false, false);
    }

    public static void f(v vVar, LikeButtonItemV2 likeButtonItemV2, BasePegasusData basePegasusData, int i7) {
        LifecycleCoroutineScope coroutineScope;
        if ((i7 & 2) != 0) {
            basePegasusData = null;
        }
        Lifecycle lifecycle = vVar.f75605e;
        if (lifecycle == null || (coroutineScope = LifecycleKt.getCoroutineScope(lifecycle)) == null) {
            return;
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PegasusInlineLikeButtonHelper$requestLike$1(vVar, likeButtonItemV2, basePegasusData, "7", null), 3, (Object) null);
    }

    public final void a() {
        this.f75602b.setVisibility(8);
        this.f75601a.setVisibility(8);
        this.f75603c.setVisibility(8);
    }

    public final void b(LikeButtonItemV2.LikeResource likeResource, boolean z6, boolean z7) {
        if (likeResource != null) {
            ResManager.download(new ResDownloadRequest(likeResource.url, null, 2, null).reportBizType("pegasus_inline"), new a(likeResource, z6, z7, this, likeResource));
        }
    }

    public final String c(boolean z6, boolean z7) {
        boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(this.f75601a.getContext().getApplicationContext());
        return (zIsNightTheme && z6 && z7) ? this.h : (zIsNightTheme && z6 && !z7) ? "inline_click_to_like_night.json" : (zIsNightTheme && !z6 && z7) ? this.f75608i : (!zIsNightTheme || z6 || z7) ? (!zIsNightTheme && z6 && z7) ? this.f75606f : (zIsNightTheme || !z6 || z7) ? (zIsNightTheme || z6 || !z7) ? (zIsNightTheme || z6 || z7) ? null : "inline_click_to_dislike.json" : this.f75607g : "inline_click_to_like.json" : "inline_click_to_dislike_night.json";
    }

    public final void e(@Nullable String str, boolean z6) {
        TintTextView tintTextView = this.f75603c;
        ListExtentionsKt.setText(tintTextView, str);
        this.f75602b.setSelected(z6);
        tintTextView.setSelected(z6);
    }
}
