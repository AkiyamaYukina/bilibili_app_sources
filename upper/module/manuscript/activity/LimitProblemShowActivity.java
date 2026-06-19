package com.bilibili.upper.module.manuscript.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.compose.foundation.lazy.staggeredgrid.C3526g;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bF0.C4950E;
import com.bilibili.adcommon.utils.ext.ViewExtKt;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.teenagersmode.TeenagersMode;
import com.bilibili.upper.module.manuscript.model.ArchiveAppealViewModel;
import com.bilibili.upper.module.manuscript.vm.ProblemShowViewModel;
import eJ0.y;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/LimitProblemShowActivity.class */
@StabilityInferred(parameters = 0)
public final class LimitProblemShowActivity extends BaseToolbarActivity implements IPvTracker {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f113421H = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final gI0.p f113422D = new gI0.p();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Lazy f113423E = LazyKt.lazy(new BS0.C(this, 5));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final Lazy f113424F = LazyKt.lazy(new Ob1.s(this, 3));

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public C4950E f113425G;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/LimitProblemShowActivity$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113426a;

        public a(Function1 function1) {
            this.f113426a = function1;
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
            return this.f113426a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113426a.invoke(obj);
        }
    }

    public final ProblemShowViewModel Q6() {
        return (ProblemShowViewModel) this.f113423E.getValue();
    }

    public final void R6(int i7) {
        TintTextView tintTextView;
        TintTextView tintTextView2;
        if (i7 == 2) {
            C4950E c4950e = this.f113425G;
            if (c4950e == null || (tintTextView2 = c4950e.f54704f) == null) {
                return;
            }
            tintTextView2.setText(getResources().getText(2131851398));
            return;
        }
        C4950E c4950e2 = this.f113425G;
        if (c4950e2 == null || (tintTextView = c4950e2.f54704f) == null) {
            return;
        }
        tintTextView.setText(getResources().getText(2131851181));
    }

    public final void S6(int i7) {
        C4950E c4950e;
        List list;
        if (Q6().f113708i == 3) {
            if (i7 == 2 || (i7 == 1 && (Q6().f113702b.getValue() == null || (Q6().f113702b.getValue() != null && ((list = Q6().f113702b.getValue().reasons) == null || list.isEmpty()))))) {
                C4950E c4950e2 = this.f113425G;
                if (c4950e2 != null) {
                    c4950e2.f54701c.setVisibility(0);
                    return;
                }
                return;
            }
            if (!Q6().f113709j || Q6().f113702b.getValue() == null || Q6().f113702b.getValue().reasons.size() <= 0 || (c4950e = this.f113425G) == null) {
                return;
            }
            c4950e.f54702d.setVisibility(0);
        }
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

    /* JADX WARN: Type inference failed for: r1v10, types: [com.bilibili.upper.module.manuscript.activity.l] */
    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        C4950E c4950e;
        Long longOrNull;
        String queryParameter;
        super.onCreate(bundle);
        String dataString = getIntent().getDataString();
        if (dataString != null && StringsKt.n(dataString, "archive_error")) {
            if (TeenagersMode.getInstance().isEnable()) {
                finish();
            } else {
                Uri uri = Uri.parse(dataString);
                if (uri != null && ((queryParameter = uri.getQueryParameter("aid")) == null || queryParameter.length() == 0)) {
                    finish();
                }
            }
        }
        C4950E c4950eInflate = C4950E.inflate(LayoutInflater.from(this));
        this.f113425G = c4950eInflate;
        setContentView(c4950eInflate != null ? c4950eInflate.f54699a : null);
        ensureToolbar();
        showBackButton();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle("");
        }
        this.mToolbar.setNavigationIcon(2131236409);
        C4950E c4950e2 = this.f113425G;
        if (c4950e2 != null) {
            c4950e2.f54704f.setOnClickListener(new QG0.f(this, 3));
        }
        C4950E c4950e3 = this.f113425G;
        if (c4950e3 != null) {
            c4950e3.f54705g.setOnClickListener(new BV.a(this, 2));
        }
        C4950E c4950e4 = this.f113425G;
        if (c4950e4 != null) {
            c4950e4.f54703e.setLayoutManager(new LinearLayoutManager(this));
        }
        C4950E c4950e5 = this.f113425G;
        if (c4950e5 != null) {
            c4950e5.f54701c.setVisibility(8);
        }
        Q6().f113705e.observe(this, new a(new C3526g(this, 2)));
        Q6().f113702b.observe(this, new a(new EQ.t(this, 1)));
        Q6().f113706f.observe(this, new a(new com.bilibili.lib.fasthybrid.blrouter.j(this, 1)));
        EQ.v vVar = new EQ.v(this, 3);
        C4950E c4950e6 = this.f113425G;
        eJ0.y yVar = null;
        if (c4950e6 != null) {
            RecyclerView recyclerView = c4950e6.f54703e;
            HashMap<Integer, eJ0.y> map = eJ0.D.f117255a;
            eJ0.y yVar2 = map.get(Integer.valueOf(recyclerView.getId()));
            yVar = yVar2;
            if (yVar2 == null) {
                yVar = new eJ0.y(recyclerView);
                map.put(Integer.valueOf(recyclerView.getId()), yVar);
            }
            yVar.f117304c = getLifecycle();
            yVar.f117305d = true;
        }
        if (yVar != null) {
            View view = yVar.f117302a;
            if (view instanceof NestedScrollView) {
                final eJ0.y yVar3 = yVar;
                ((NestedScrollView) view).setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener(yVar3) { // from class: eJ0.x

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final y f117301a;

                    {
                        this.f117301a = yVar3;
                    }

                    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                    public final void onScrollChange(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10) {
                        y yVar4 = this.f117301a;
                        Iterator<y.a> it = yVar4.f117303b.values().iterator();
                        while (it.hasNext()) {
                            yVar4.a(it.next());
                        }
                    }
                });
            } else if (view instanceof RecyclerView) {
                ((RecyclerView) view).addOnScrollListener(new eJ0.B(yVar));
            }
            Lifecycle lifecycle = yVar.f117304c;
            if (lifecycle != null) {
                lifecycle.addObserver(new eJ0.C(yVar));
            }
        }
        k kVar = new k(yVar, vVar);
        gI0.p pVar = this.f113422D;
        pVar.f119898d = kVar;
        pVar.f119897c = new Function4(this) { // from class: com.bilibili.upper.module.manuscript.activity.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LimitProblemShowActivity f113547a;

            {
                this.f113547a = this;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int i7 = LimitProblemShowActivity.f113421H;
                this.f113547a.Q6().M0(iIntValue, (String) obj3, (String) obj4, zBooleanValue);
                return Unit.INSTANCE;
            }
        };
        ((ArchiveAppealViewModel) this.f113424F.getValue()).f113661c.observe(this, new a(new Hi.d(this, 2)));
        Q6().f113707g.observe(this, new a(new com.bilibili.opd.app.bizcommon.imageselector.page.B(this, 1)));
        String dataString2 = getIntent().getDataString();
        if (dataString2 == null) {
            return;
        }
        if (StringsKt.n(dataString2, "archive_error")) {
            Uri uri2 = Uri.parse(dataString2);
            if (uri2 != null) {
                String queryParameter2 = uri2.getQueryParameter("aid");
                Q6().h = (queryParameter2 == null || (longOrNull = StringsKt.toLongOrNull(queryParameter2)) == null) ? 0L : longOrNull.longValue();
                Q6().f113708i = 3;
                String queryParameter3 = uri2.getQueryParameter("is_owner");
                String str = queryParameter3;
                if (queryParameter3 == null) {
                    str = CaptureSchema.OLD_INVALID_ID_STRING;
                }
                Q6().f113709j = str.equals("1");
                C4950E c4950e7 = this.f113425G;
                if (c4950e7 != null) {
                    c4950e7.f54702d.setVisibility(8);
                }
            }
        } else {
            Bundle bundleExtra = getIntent().getBundleExtra("param_control");
            if (bundleExtra != null) {
                Q6().h = bundleExtra.getLong("aid");
                Q6().f113708i = bundleExtra.getInt(GameCardButton.extraParamSource);
                Q6().f113709j = bundleExtra.getBoolean("is_owner", true);
                if (!Q6().f113709j && (c4950e = this.f113425G) != null) {
                    ViewExtKt.gone(c4950e.f54702d);
                }
            }
        }
        Q6().I0();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (isFinishing()) {
            return;
        }
        ((ArchiveAppealViewModel) this.f113424F.getValue()).J0();
    }
}
