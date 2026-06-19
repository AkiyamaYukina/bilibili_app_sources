package com.bilibili.ship.theseus.cheese.biz.certificate;

import Ea.r;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.magicasakura.widgets.TintTextView;
import fu0.C7183e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/b.class */
@StabilityInferred(parameters = 0)
public final class b extends m<C7183e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Flow<Integer> f89255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f89256b;

    public b(@NotNull Flow flow, @NotNull a aVar) {
        this.f89255a = flow;
        this.f89256b = aVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C7183e c7183e = (C7183e) viewBinding;
        TintTextView tintTextView = c7183e.f119540d.f119536b;
        View view = c7183e.f119538b;
        ConstraintLayout constraintLayout = c7183e.f119537a;
        Context context = constraintLayout.getContext();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = NewPlayerUtilsKt.toPx(40.0f) + (ScreenUtil.getScreenWidth(context) - NewPlayerUtilsKt.toPx(12.0f));
        view.setLayoutParams(layoutParams);
        tintTextView.setOnClickListener(new r(this, 1));
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseCertificateUnlockComponent$bind$4(this, constraintLayout, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C7183e.inflate(layoutInflater, viewGroup, false);
    }
}
