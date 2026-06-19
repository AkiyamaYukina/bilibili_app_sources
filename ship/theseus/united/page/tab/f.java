package com.bilibili.ship.theseus.united.page.tab;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import dv0.C6863f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/f.class */
@StabilityInferred(parameters = 0)
public final class f extends com.bilibili.app.gemini.ui.m<C6863f> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f103174e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f103175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f103176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public AnimatorSet f103177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f103178d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/f$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow<Boolean> f103179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow<Long> f103180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public CommentTabStyle f103181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow<Boolean> f103182d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public ColorStateList f103183e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public TabControl f103184f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f103185g;
        public float h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f103186i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f103187j;

        public a() {
            Boolean bool = Boolean.FALSE;
            this.f103179a = StateFlowKt.MutableStateFlow(bool);
            this.f103180b = StateFlowKt.MutableStateFlow(0L);
            this.f103182d = StateFlowKt.MutableStateFlow(bool);
            this.f103185g = "";
            this.h = 13.0f;
            this.f103186i = 10.0f;
        }
    }

    public f(@NotNull a aVar) {
        this.f103175a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.united.page.tab.f r11, android.widget.FrameLayout r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 1504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.tab.f.c(com.bilibili.ship.theseus.united.page.tab.f, android.widget.FrameLayout, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C6863f c6863f = (C6863f) viewBinding;
        String str = this.f103175a.f103185g;
        String string = str;
        if (str == null) {
            string = c6863f.f116972a.getContext().getString(2131851614);
        }
        this.f103176b = string;
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CommentTabUIComponent$bind$2(this, c6863f.f116973b, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C6863f.inflate(layoutInflater, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.view.ViewGroup r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, android.content.res.ColorStateList r15, float r16, float r17, boolean r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.tab.f.d(android.view.ViewGroup, java.lang.String, java.lang.String, java.lang.String, android.content.res.ColorStateList, float, float, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final View e(ViewGroup viewGroup, String str, String str2, ColorStateList colorStateList, float f7, float f8, boolean z6) {
        View viewA = p.a(viewGroup, 2131500281, viewGroup, false);
        ((LinearLayout) viewA.findViewById(2131311422)).setGravity(z6 ? 80 : 17);
        TintTextView tintTextView = (TintTextView) viewA.findViewById(2131308533);
        TintTextView tintTextView2 = (TintTextView) viewA.findViewById(2131312848);
        tintTextView.setText(str);
        tintTextView.setTextSize(1, f7);
        tintTextView.setTypeface(z6 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        tintTextView2.setTextSize(f8);
        if (str2.length() > 0) {
            String strA = str2;
            if (z6) {
                strA = android.support.v4.media.a.a("(", str2, ")");
            }
            tintTextView2.setText(strA);
            tintTextView2.setVisibility(0);
        } else {
            tintTextView2.setVisibility(8);
        }
        if (colorStateList != null) {
            tintTextView.setTextColor(colorStateList);
            tintTextView2.setTextColor(colorStateList);
        }
        g(tintTextView);
        viewA.setFocusable(true);
        return viewA;
    }

    public final TintTextView f(ViewGroup viewGroup, String str, ColorStateList colorStateList, float f7, boolean z6) {
        TintTextView tintTextView = new TintTextView(viewGroup.getContext());
        tintTextView.setText(str);
        tintTextView.setGravity(17);
        tintTextView.setEllipsize(TextUtils.TruncateAt.END);
        tintTextView.setSingleLine();
        tintTextView.setTextSize(1, f7);
        tintTextView.setTypeface(z6 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        if (colorStateList != null) {
            tintTextView.setTextColor(colorStateList);
        }
        g(tintTextView);
        tintTextView.setFocusable(true);
        return tintTextView;
    }

    public final void g(TintTextView tintTextView) {
        TabControl tabControl;
        Context context = tintTextView.getContext();
        if (context == null || (tabControl = this.f103175a.f103184f) == null || tabControl.e() || !tabControl.b()) {
            return;
        }
        if (((Boolean) v.f103217a.getValue()).booleanValue() && tabControl.a()) {
            tintTextView.setAlpha(tabControl.c());
        } else {
            tintTextView.setTextColor(ContextCompat.getColor(context, R$color.Ga5));
        }
    }
}
