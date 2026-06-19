package com.bilibili.netdiagnose;

import Pg.s;
import S51.f;
import UR0.h0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.material3.internal.C4094s;
import androidx.compose.material3.internal.C4095t;
import bF0.C5058v0;
import bolts.CancellationTokenSource;
import bolts.Task;
import c90.c;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lifeevent.LifeEventLog;
import com.bilibili.netdiagnose.NetDiagnoseActivity;
import com.bilibili.studio.videoeditor.bgm.i;
import com.bilibili.upper.module.contribute.up.dialog.PublishChinaCreateDialogV6;
import com.bilibili.upper.module.contribute.up.ui.ManuscriptEditFragment;
import com.bilibili.upper.module.contribute.up.ui.a2;
import ej0.C6947a;
import ej0.C6948b;
import fj0.C7115c;
import hj0.C7447a;
import hj0.InterfaceC7448b;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/netdiagnose/NetDiagnoseActivity.class */
public final class NetDiagnoseActivity extends BaseToolbarActivity {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f67342M = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final Lazy f67343D = LazyKt.lazy(new s(this, 4));

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Lazy f67344E = LazyKt.lazy(new C4094s(this, 5));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final Lazy f67345F = LazyKt.lazy(new C4095t(this, 3));

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final Lazy f67346G = LazyKt.lazy(new f(this, 3));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final Lazy f67347H = LazyKt.lazy(new c(this, 5));

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public C6948b f67348I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public String f67349J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public File f67350K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public CancellationTokenSource f67351L;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/netdiagnose/NetDiagnoseActivity$a.class */
    public static final class a implements InterfaceC7448b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NetDiagnoseActivity f67352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.ObjectRef<StringBuilder> f67353b;

        public a(NetDiagnoseActivity netDiagnoseActivity, Ref.ObjectRef<StringBuilder> objectRef) {
            this.f67352a = netDiagnoseActivity;
            this.f67353b = objectRef;
        }

        @Override // hj0.InterfaceC7448b
        public final void a() {
        }

        @Override // hj0.InterfaceC7448b
        public final void b(String str) {
            int i7 = NetDiagnoseActivity.f67342M;
            NetDiagnoseActivity netDiagnoseActivity = this.f67352a;
            TextView textView = (TextView) netDiagnoseActivity.f67344E.getValue();
            if (textView != null) {
                textView.append(str);
            }
            ((StringBuilder) this.f67353b.element).append(str);
            ScrollView scrollView = (ScrollView) netDiagnoseActivity.f67343D.getValue();
            if (scrollView != null) {
                scrollView.post(new com.bilibili.biligame.ui.pay.c(netDiagnoseActivity, 1));
            }
        }

        @Override // hj0.InterfaceC7448b
        public final void c(C7447a c7447a, String str) {
            int i7 = NetDiagnoseActivity.f67342M;
            NetDiagnoseActivity netDiagnoseActivity = this.f67352a;
            netDiagnoseActivity.Q6(true);
            netDiagnoseActivity.f67349J = str;
            BLog.e("DiagnoseResult:" + c7447a);
            LifeEventLog.report("net.diagnose", MapsKt.mapOf(TuplesKt.to("detail", ((StringBuilder) this.f67353b.element).toString())));
        }
    }

    public final void Q6(boolean z6) {
        Button button = (Button) this.f67346G.getValue();
        if (button != null) {
            button.setEnabled(z6);
        }
        Button button2 = (Button) this.f67347H.getValue();
        if (button2 != null) {
            button2.setEnabled(z6);
        }
        Button button3 = (Button) this.f67345F.getValue();
        if (button3 != null) {
            button3.setEnabled(z6);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        final File file;
        super.onActivityResult(i7, i8, intent);
        if (i7 == 1001 && (file = this.f67350K) != null && file.exists()) {
            Task.callInBackground(new Callable(file) { // from class: dj0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final File f116438a;

                {
                    this.f116438a = file;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    File file2 = this.f116438a;
                    int i9 = NetDiagnoseActivity.f67342M;
                    boolean zDelete = file2.delete();
                    BLog.e("NetDiagnoseActivity", file2.getAbsolutePath() + " deleted:" + zDelete);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131499562);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setTitle(getString(2131831885));
            getToolbar().setNavigationOnClickListener(new a2(this, 1));
        }
        Button button = (Button) this.f67346G.getValue();
        if (button != null) {
            button.setOnClickListener(new i(this, 1));
        }
        Button button2 = (Button) this.f67347H.getValue();
        if (button2 != null) {
            button2.setOnClickListener(new h0(this, 4));
        }
        Button button3 = (Button) this.f67345F.getValue();
        if (button3 != null) {
            final int i7 = 1;
            button3.setOnClickListener(new View.OnClickListener(this, i7) { // from class: HG0.g0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f8539a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f8540b;

                {
                    this.f8539a = i7;
                    this.f8540b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f8539a) {
                        case 0:
                            PublishChinaCreateDialogV6 publishChinaCreateDialogV6 = (PublishChinaCreateDialogV6) this.f8540b;
                            ManuscriptEditFragment.ViewData viewData = publishChinaCreateDialogV6.e;
                            if (!viewData.can_no_statement) {
                                eJ0.t.c(2131857287, publishChinaCreateDialogV6.getContext());
                                break;
                            } else if (!viewData.noStatement) {
                                viewData.noStatement = true;
                                viewData.copyrightChoosed = 3;
                                viewData.neutralMark = "";
                                viewData.neutralMarkPos = -1;
                                com.bilibili.upper.module.contribute.up.manager.Y y6 = publishChinaCreateDialogV6.f;
                                if (y6 != null) {
                                    y6.i();
                                    y6.h();
                                }
                                C5058v0 c5058v0 = publishChinaCreateDialogV6.d;
                                if (c5058v0 != null) {
                                    c5058v0.f56241b.setChecked(true);
                                }
                                RG0.a aVar = publishChinaCreateDialogV6.b;
                                aVar.m0(aVar.i0());
                                V v7 = publishChinaCreateDialogV6.c;
                                if (v7 != null) {
                                    v7.f8490a.invoke();
                                }
                                break;
                            }
                            break;
                        default:
                            NetDiagnoseActivity netDiagnoseActivity = (NetDiagnoseActivity) this.f8540b;
                            C6948b c6948b = netDiagnoseActivity.f67348I;
                            if (c6948b != null) {
                                C6947a c6947a = c6948b.f117319b;
                                if (c6947a != null) {
                                    c6947a.f117317c.f120882a = true;
                                    c6947a.f117316b = null;
                                }
                                ((ExecutorService) c6948b.f117318a.getValue()).shutdownNow();
                            }
                            netDiagnoseActivity.Q6(false);
                            TextView textView = (TextView) netDiagnoseActivity.f67344E.getValue();
                            if (textView != null) {
                                textView.setText("");
                            }
                            C6948b c6948b2 = new C6948b();
                            netDiagnoseActivity.f67348I = c6948b2;
                            ((ArrayList) c6948b2.f117320c.getValue()).add(new C7115c());
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            objectRef.element = new StringBuilder();
                            C6948b c6948b3 = netDiagnoseActivity.f67348I;
                            if (c6948b3 != null) {
                                C6948b.a(c6948b3, new NetDiagnoseActivity.a(netDiagnoseActivity, objectRef));
                            }
                            break;
                    }
                }
            });
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CancellationTokenSource cancellationTokenSource = this.f67351L;
        if (cancellationTokenSource != null) {
            cancellationTokenSource.cancel();
        }
        C6948b c6948b = this.f67348I;
        if (c6948b != null) {
            C6947a c6947a = c6948b.f117319b;
            if (c6947a != null) {
                c6947a.f117317c.f120882a = true;
                c6947a.f117316b = null;
            }
            ((ExecutorService) c6948b.f117318a.getValue()).shutdownNow();
        }
    }
}
