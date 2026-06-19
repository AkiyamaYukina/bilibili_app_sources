package com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommon.utils.PlayerExtensionsKt;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6302a;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6306c;
import com.bilibili.ship.theseus.united.page.intro.module.relate.z0;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import dv0.C6856b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.ForegroundConstraintLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/bangumi/a.class */
@StabilityInferred(parameters = 0)
public final class a extends m<C6856b0> implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC1041a f101124a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/bangumi/a$a.class */
    public interface InterfaceC1041a {
        @NotNull
        Flow<String> A();

        @Nullable
        C6302a B();

        @Nullable
        String C();

        @NotNull
        String D();

        long E();

        int F();

        boolean a();

        @NotNull
        String b();

        @NotNull
        ExposureEntryV c();

        @NotNull
        ActivityColorRepository d();

        @NotNull
        StatInfoData e();

        void f(@NotNull Rect rect, boolean z6);

        @NotNull
        String g();

        boolean h();

        @NotNull
        C6306c i();

        @NotNull
        String j();

        void k();
    }

    public a(@NotNull InterfaceC1041a interfaceC1041a) {
        this.f101124a = interfaceC1041a;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C6856b0 c6856b0 = (C6856b0) viewBinding;
        ForegroundConstraintLayout foregroundConstraintLayout = c6856b0.f116904a;
        Context context = foregroundConstraintLayout.getContext();
        TextView textView = c6856b0.f116912j;
        TextView textView2 = c6856b0.f116913k;
        TintTextView tintTextView = c6856b0.f116911i;
        PlayerExtensionsKt.setGone(tintTextView);
        TintTextView tintTextView2 = c6856b0.f116914l;
        PlayerExtensionsKt.setGone(tintTextView2);
        if (!this.f101124a.h()) {
            tintTextView2 = tintTextView;
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new RelateBangumiComponent$bind$2(this, c6856b0.f116915m, textView, c6856b0.f116906c, c6856b0.f116907d, c6856b0.h, c6856b0.f116908e, c6856b0.f116910g, c6856b0.f116909f, context, tintTextView2, textView2, c6856b0.f116905b, foregroundConstraintLayout, c6856b0, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C6856b0.inflate(layoutInflater, viewGroup, false);
    }
}
