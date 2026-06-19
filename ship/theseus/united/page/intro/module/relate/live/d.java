package com.bilibili.ship.theseus.united.page.intro.module.relate.live;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommon.utils.PlayerExtensionsKt;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService$createLiveComponent$contract$1;
import com.bilibili.ship.theseus.united.page.intro.module.relate.z0;
import dv0.C6864f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.ForegroundConstraintLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/live/d.class */
@StabilityInferred(parameters = 0)
public final class d extends m<C6864f0> implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DetailRelateService$createLiveComponent$contract$1 f101291a;

    public d(@NotNull DetailRelateService$createLiveComponent$contract$1 detailRelateService$createLiveComponent$contract$1) {
        this.f101291a = detailRelateService$createLiveComponent$contract$1;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C6864f0 c6864f0 = (C6864f0) viewBinding;
        ForegroundConstraintLayout foregroundConstraintLayout = c6864f0.f116974a;
        Context context = foregroundConstraintLayout.getContext();
        TextView textView = c6864f0.f116980g;
        TintTextView tintTextView = c6864f0.f116982j;
        PlayerExtensionsKt.setGone(tintTextView);
        TintTextView tintTextView2 = c6864f0.f116983k;
        PlayerExtensionsKt.setGone(tintTextView2);
        DetailRelateService$createLiveComponent$contract$1 detailRelateService$createLiveComponent$contract$1 = this.f101291a;
        if (detailRelateService$createLiveComponent$contract$1.c()) {
            tintTextView = tintTextView2;
        }
        ActivityColorRepository activityColorRepository = detailRelateService$createLiveComponent$contract$1.f100938d.f100871f;
        Integer numE = activityColorRepository.e();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new RelateLiveComponent$bind$2(this, c6864f0.f116984l, c6864f0.f116976c, c6864f0.f116975b, c6864f0.f116981i, context, c6864f0.f116977d, numE != null ? numE.intValue() : ContextCompat.getColor(context, R$color.Ga5), c6864f0.h, textView, c6864f0.f116979f, tintTextView, c6864f0.f116978e, activityColorRepository, foregroundConstraintLayout, c6864f0, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C6864f0.inflate(layoutInflater, viewGroup, false);
    }
}
