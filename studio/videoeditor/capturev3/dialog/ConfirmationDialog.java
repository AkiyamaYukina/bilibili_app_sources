package com.bilibili.studio.videoeditor.capturev3.dialog;

import Bm.e;
import Cm.d;
import TB0.C2878j;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bilibili.app.authorspace.ui.J1;
import com.bilibili.base.BiliContext;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.bililive.biz.interact.chatroom.widget.label.i;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.studio.videoeditor.extension.ActivityExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/ConfirmationDialog.class */
public final class ConfirmationDialog extends DialogFragment {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final KProperty<Object>[] f109121p = {new PropertyReference1Impl(ConfirmationDialog.class, "binding", "getBinding()Lcom/bilibili/studio/videoeditor/databinding/BiliAppDialogConfirmBinding;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e f109122b = d.a(this, (Function1) new Object(), UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public CharSequence f109123c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public CharSequence f109124d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CharSequence f109125e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public CharSequence f109126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f109127g;

    @NotNull
    public CharSequence h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f109128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f109129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f109130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f109131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f109132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public b f109133n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public a f109134o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/ConfirmationDialog$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1<View, Unit> f109135a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super View, Unit> function1) {
            this.f109135a = function1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/ConfirmationDialog$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1<View, Unit> f109136a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super View, Unit> function1) {
            this.f109136a = function1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/ConfirmationDialog$c.class */
    public static final class c implements Function1<ConfirmationDialog, C2878j> {
        public final Object invoke(Object obj) {
            return C2878j.bind(((Fragment) obj).requireView());
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public ConfirmationDialog() {
        Activity activity = BiliContext.topActivity();
        this.f109126f = (ActivityExtKt.isActive(activity) ? activity : FoundationAlias.getFapp()).getString(2131849746);
        Activity activity2 = BiliContext.topActivity();
        this.h = (ActivityExtKt.isActive(activity2) ? activity2 : FoundationAlias.getFapp()).getString(2131842224);
        this.f109128i = 17;
        this.f109129j = 17;
        this.f109131l = true;
    }

    public final void hf(@NotNull Function1<? super View, Unit> function1) {
        this.f109134o = new a(function1);
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final void m10421if(@NotNull Function1<? super View, Unit> function1) {
        this.f109133n = new b(function1);
    }

    public final void jf(@NotNull FragmentManager fragmentManager) {
        show(fragmentManager, "ConfirmationDialog");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131493875, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams layoutParamsA = J1.a(window, 0);
            layoutParamsA.dimAmount = 0.2f;
            window.setAttributes(layoutParamsA);
        }
        e eVar = this.f109122b;
        KProperty<Object>[] kPropertyArr = f109121p;
        C2878j c2878j = (C2878j) eVar.getValue(this, kPropertyArr[0]);
        c2878j.f23831f.setGravity(this.f109129j);
        c2878j.f23830e.setGravity(this.f109128i);
        c2878j.f23830e.setHighlightColor(0);
        if (((String) this.f109123c).length() == 0) {
            c2878j.f23831f.setVisibility(8);
        }
        if (this.f109124d.length() == 0) {
            c2878j.f23830e.setVisibility(8);
        }
        if (((String) this.f109125e).length() == 0) {
            c2878j.f23829d.setVisibility(8);
        }
        if (this.f109130k) {
            c2878j.f23827b.setVisibility(8);
        }
        C2878j c2878j2 = (C2878j) this.f109122b.getValue(this, kPropertyArr[0]);
        c2878j2.f23831f.setText(this.f109123c);
        c2878j2.f23830e.setText(this.f109124d);
        if (this.f109132m) {
            c2878j2.f23830e.setMovementMethod(LinkMovementMethod.getInstance());
        }
        c2878j2.f23828c.setText(this.f109126f);
        int i7 = this.f109127g;
        if (i7 != 0) {
            c2878j2.f23828c.setTextColor(i7);
        }
        c2878j2.f23827b.setText(this.h);
        c2878j2.f23828c.setOnClickListener(new i(this, 2));
        c2878j2.f23827b.setOnClickListener(new Zj.a(this, 3));
    }
}
