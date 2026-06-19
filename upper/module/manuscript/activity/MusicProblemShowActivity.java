package com.bilibili.upper.module.manuscript.activity;

import ES0.W;
import Ky0.C2468j;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import bF0.C4950E;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.upper.module.manuscript.vm.ProblemShowViewModel;
import gI0.J;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/MusicProblemShowActivity.class */
@StabilityInferred(parameters = 0)
public final class MusicProblemShowActivity extends BaseToolbarActivity implements IPvTracker {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f113517G = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final J f113518D = new J();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Lazy f113519E = LazyKt.lazy(new W(this, 7));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public C4950E f113520F;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/MusicProblemShowActivity$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113521a;

        public a(Function1 function1) {
            this.f113521a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f113521a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113521a.invoke(obj);
        }
    }

    public final ProblemShowViewModel Q6() {
        return (ProblemShowViewModel) this.f113519E.getValue();
    }

    public final void R6() {
        TintLinearLayout tintLinearLayout;
        TintLinearLayout tintLinearLayout2;
        C4950E c4950e = this.f113520F;
        if (c4950e != null && (tintLinearLayout2 = c4950e.f54702d) != null) {
            tintLinearLayout2.setVisibility(8);
        }
        C4950E c4950e2 = this.f113520F;
        if (c4950e2 == null || (tintLinearLayout = c4950e2.f54701c) == null) {
            return;
        }
        tintLinearLayout.setVisibility(0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "creation.question-details-page.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        bundle.putLong(GameCardButton.extraAvid, Q6().h);
        return bundle;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 != 1 || i8 == 0) {
            return;
        }
        Q6().f113710k = true;
        Q6().f113711l = i8;
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (Q6().f113710k) {
            setResult(Q6().f113711l);
        }
        super.onBackPressed();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Long longOrNull;
        super.onCreate(bundle);
        Lazy lazy = zw0.b.f130950a;
        Boolean bool = (Boolean) ConfigManager.Companion.ab().get("upper_manuscript_transcode_error", Boolean.TRUE);
        if (!(bool != null ? bool.booleanValue() : true)) {
            finish();
        }
        C4950E c4950eInflate = C4950E.inflate(LayoutInflater.from(this));
        this.f113520F = c4950eInflate;
        setContentView(c4950eInflate != null ? c4950eInflate.f54699a : null);
        ensureToolbar();
        showBackButton();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle("");
        }
        this.mToolbar.setNavigationIcon(2131236409);
        C4950E c4950e = this.f113520F;
        if (c4950e != null) {
            c4950e.f54705g.setOnClickListener(new Jf.a(this, 2));
        }
        C4950E c4950e2 = this.f113520F;
        if (c4950e2 != null) {
            c4950e2.f54703e.setLayoutManager(new LinearLayoutManager(this));
        }
        C4950E c4950e3 = this.f113520F;
        int i7 = 8;
        if (c4950e3 != null) {
            c4950e3.f54701c.setVisibility(8);
        }
        Q6().f113705e.observe(this, new a(new Hk0.x(this, 1)));
        Q6().f113704d.observe(this, new a(new C2468j(this, 3)));
        Q6().f113706f.observe(this, new a(new Hk0.z(this, 4)));
        String dataString = getIntent().getDataString();
        if (dataString == null || !StringsKt.n(dataString, "/user_center/transcode_error")) {
            Bundle bundleExtra = getIntent().getBundleExtra("param_control");
            if (bundleExtra != null) {
                Q6().h = bundleExtra.getLong("aid");
                Q6().f113708i = bundleExtra.getInt(GameCardButton.extraParamSource);
                Q6().f113709j = bundleExtra.getBoolean("is_owner", true);
            }
        } else {
            Uri uri = Uri.parse(getIntent().getDataString());
            ProblemShowViewModel problemShowViewModelQ6 = Q6();
            String queryParameter = uri.getQueryParameter("aid");
            problemShowViewModelQ6.h = (queryParameter == null || (longOrNull = StringsKt.toLongOrNull(queryParameter)) == null) ? 0L : longOrNull.longValue();
            Q6().f113708i = 3;
            Q6().f113709j = Intrinsics.areEqual(uri.getQueryParameter("is_owner"), "1");
        }
        C4950E c4950e4 = this.f113520F;
        if (c4950e4 != null) {
            c4950e4.f54704f.setVisibility(8);
        }
        C4950E c4950e5 = this.f113520F;
        if (c4950e5 != null) {
            TintLinearLayout tintLinearLayout = c4950e5.f54702d;
            if (Q6().f113709j) {
                i7 = 0;
            }
            tintLinearLayout.setVisibility(i7);
        }
        Q6().J0();
    }
}
