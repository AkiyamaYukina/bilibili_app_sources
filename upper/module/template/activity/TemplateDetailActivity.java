package com.bilibili.upper.module.template.activity;

import GO.q;
import OC0.h;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.studio.videoeditor.event.EventFinishEdit;
import com.bilibili.upper.module.template.activity.TemplateDetailActivity;
import com.bilibili.upper.module.template.fragment.TemplateDetailFragment;
import kotlin.Lazy;
import lB0.a;
import lB0.a$b;
import org.jetbrains.annotations.Nullable;
import qw0.C8488a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/activity/TemplateDetailActivity.class */
@StabilityInferred(parameters = 0)
public final class TemplateDetailActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f113984C = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public a.a f113985B;

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        q.b(this);
        h.x(this);
        setContentView(2131493802);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("TemplateDetailFragment") == null) {
            TemplateDetailFragment templateDetailFragment = new TemplateDetailFragment();
            templateDetailFragment.setArguments(getIntent().getBundleExtra("param_control"));
            supportFragmentManager.beginTransaction().replace(2131305460, templateDetailFragment, "TemplateDetailFragment").commitAllowingStateLoss();
        }
        a aVarA = a.a();
        a$b a_b = new a$b(this) { // from class: LI0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TemplateDetailActivity f14539a;

            {
                this.f14539a = this;
            }

            @Override // lB0.a$b
            public final void onBusEvent(Object obj) {
                int i7 = TemplateDetailActivity.f113984C;
                this.f14539a.finish();
            }
        };
        aVarA.getClass();
        this.f113985B = a.b(EventFinishEdit.class, a_b);
        Lazy<C8488a> lazy = C8488a.f126360e;
        C8488a.C1345a.a().a();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        a.a aVar = this.f113985B;
        if (aVar != null) {
            aVar.a();
        }
        this.f113985B = null;
        Lazy<C8488a> lazy = C8488a.f126360e;
        C8488a.C1345a.a().b();
        super.onDestroy();
    }
}
