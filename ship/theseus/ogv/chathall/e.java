package com.bilibili.ship.theseus.ogv.chathall;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.theme.R$color;
import j5.C7642d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.V;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/e.class */
@StabilityInferred(parameters = 0)
public final class e extends AlertDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f91750a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/e$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f91751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public CharSequence f91752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f91753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f91754d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f91755e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f91756f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Function1<? super Context, Unit> f91757g;
        public boolean h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f91758i = true;

        public a(@NotNull Context context) {
            this.f91751a = context;
            this.f91753c = ContextCompat.getColor(context, R$color.Ga10);
            this.f91754d = ContextCompat.getColor(context, R$color.Ga5);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/e$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public CharSequence f91759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f91760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f91761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f91762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f91763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public com.bilibili.ship.theseus.ogv.chathall.a f91764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public com.bilibili.ship.theseus.ogv.chathall.b f91765g;
        public int h;
    }

    public e(@NotNull Context context) {
        super(context);
        this.f91750a = new b();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        b bVar = this.f91750a;
        int iMin = Math.min(ScreenUtil.getScreenWidth(getContext()), ScreenUtil.getScreenHeight(getContext())) - Uj0.c.b(32, getContext());
        if (iMin == bVar.h) {
            return;
        }
        bVar.h = iMin;
        bVar.notifyPropertyChanged(743);
    }

    @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            C7642d.a(window, 0);
        }
        setContentView(2131500424);
        ((V) DataBindingUtil.bind(((ViewGroup) findViewById(R.id.content)).getChildAt(0))).q(this.f91750a);
    }
}
