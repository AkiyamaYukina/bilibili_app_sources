package com.bilibili.pegasus.common.inline;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import com.airbnb.lottie.LottieAnimationView;
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
import jp0.c;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/z.class */
@StabilityInferred(parameters = 0)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LottieAnimationView f75623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TintImageView f75624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TintTextView f75625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final FunctionReferenceImpl f75626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Lifecycle f75627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f75628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f75629g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f75630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f75631j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f75632k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f75633l = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/z$a.class */
    public static final class a implements ResCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.a f75634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f75635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f75636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final z f75637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c.a f75638e;

        public a(c.a aVar, boolean z6, boolean z7, z zVar, c.a aVar2) {
            this.f75634a = aVar;
            this.f75635b = z6;
            this.f75636c = z7;
            this.f75637d = zVar;
            this.f75638e = aVar2;
        }

        @Override // com.bilibili.lib.resmanager.ResCallback
        public final void onFailure(int i7, String str) {
            StringBuilder sbA = G0.b.a("inline like res download failure \n errMsg = ", str, " \n resUrl = ", this.f75638e.b(), " \n night theme : ");
            sbA.append(this.f75635b);
            sbA.append(" \n isSelected :");
            sbA.append(this.f75636c);
            BLog.w("InlineLikeButtonHelper", sbA.toString());
        }

        @Override // com.bilibili.lib.resmanager.ResCallback
        public final void onSuccess(ResResponse resResponse) {
            File file;
            if (!Intrinsics.areEqual(this.f75634a.a(), DigestUtils.getFileMD5(resResponse.getPath()))) {
                File file2 = resResponse.getFile();
                if (file2 == null || !file2.exists() || (file = resResponse.getFile()) == null) {
                    return;
                }
                file.delete();
                return;
            }
            z zVar = this.f75637d;
            boolean z6 = this.f75636c;
            boolean z7 = this.f75635b;
            if (z7 && z6) {
                zVar.h = resResponse.getPath();
                return;
            }
            if (z7 && !z6) {
                zVar.f75630i = resResponse.getPath();
                return;
            }
            if (!z7 && z6) {
                zVar.f75628f = resResponse.getPath();
            } else {
                if (z7 || z6) {
                    return;
                }
                zVar.f75629g = resResponse.getPath();
            }
        }
    }

    public z(@NotNull LottieAnimationView lottieAnimationView, @NotNull TintImageView tintImageView, @NotNull TintTextView tintTextView, @Nullable Function1<? super Long, Unit> function1, @Nullable Lifecycle lifecycle) {
        this.f75623a = lottieAnimationView;
        this.f75624b = tintImageView;
        this.f75625c = tintTextView;
        this.f75626d = (FunctionReferenceImpl) function1;
        this.f75627e = lifecycle;
    }

    public static void c(final z zVar, final jp0.c cVar, final BasePegasusData basePegasusData, String str, String str2) {
        zVar.f75632k = str;
        zVar.f75633l = str2;
        boolean zH = cVar.h();
        String strD = cVar.d();
        TintTextView tintTextView = zVar.f75625c;
        ListExtentionsKt.setText(tintTextView, strD);
        CharSequence text = tintTextView.getText();
        tintTextView.setContentDescription(((Object) text) + tintTextView.getResources().getString(2131841358));
        zVar.f75631j = true;
        LottieAnimationView lottieAnimationView = zVar.f75623a;
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.addAnimatorListener(new A(zVar, cVar));
        final String str3 = "7";
        lottieAnimationView.setOnClickListener(new View.OnClickListener(zVar, cVar, basePegasusData, str3) { // from class: com.bilibili.pegasus.common.inline.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final z f75619a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final jp0.c f75620b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BasePegasusData f75621c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f75622d;

            {
                this.f75619a = zVar;
                this.f75620b = cVar;
                this.f75621c = basePegasusData;
                this.f75622d = str3;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LifecycleCoroutineScope coroutineScope;
                z zVar2 = this.f75619a;
                jp0.c cVar2 = this.f75620b;
                BasePegasusData basePegasusData2 = this.f75621c;
                String str4 = this.f75622d;
                Lifecycle lifecycle = zVar2.f75627e;
                if (lifecycle == null || (coroutineScope = LifecycleKt.getCoroutineScope(lifecycle)) == null) {
                    return;
                }
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PegasusInlineLikeButtonHelperV2$requestLike$1(zVar2, cVar2, basePegasusData2, str4, null), 3, (Object) null);
            }
        });
        TintImageView tintImageView = zVar.f75624b;
        tintImageView.setVisibility(0);
        tintImageView.setSelected(zH);
        tintTextView.setSelected(zH);
        zVar.a(cVar.e(), true, true);
        zVar.a(cVar.b(), true, false);
        zVar.a(cVar.f(), false, true);
        zVar.a(cVar.c(), false, false);
    }

    public static void e(z zVar, jp0.c cVar, BasePegasusData basePegasusData) {
        LifecycleCoroutineScope coroutineScope;
        Lifecycle lifecycle = zVar.f75627e;
        if (lifecycle == null || (coroutineScope = LifecycleKt.getCoroutineScope(lifecycle)) == null) {
            return;
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PegasusInlineLikeButtonHelperV2$requestLike$1(zVar, cVar, basePegasusData, "7", null), 3, (Object) null);
    }

    public final void a(c.a aVar, boolean z6, boolean z7) {
        if (aVar != null) {
            ResManager.download(new ResDownloadRequest(aVar.b(), null, 2, null).reportBizType("pegasus_inline"), new a(aVar, z6, z7, this, aVar));
        }
    }

    public final String b(boolean z6, boolean z7) {
        boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(this.f75623a.getContext().getApplicationContext());
        return (zIsNightTheme && z6 && z7) ? this.h : (zIsNightTheme && z6 && !z7) ? "inline_click_to_like_night.json" : (zIsNightTheme && !z6 && z7) ? this.f75630i : (!zIsNightTheme || z6 || z7) ? (!zIsNightTheme && z6 && z7) ? this.f75628f : (zIsNightTheme || !z6 || z7) ? (zIsNightTheme || z6 || !z7) ? (zIsNightTheme || z6 || z7) ? null : "inline_click_to_dislike.json" : this.f75629g : "inline_click_to_like.json" : "inline_click_to_dislike_night.json";
    }

    public final void d(@Nullable String str, boolean z6) {
        TintTextView tintTextView = this.f75625c;
        ListExtentionsKt.setText(tintTextView, str);
        this.f75624b.setSelected(z6);
        tintTextView.setSelected(z6);
    }
}
