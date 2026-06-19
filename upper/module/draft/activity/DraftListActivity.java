package com.bilibili.upper.module.draft.activity;

import WH0.j;
import YH0.d;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.router.k;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.studio.videoeditor.event.EventFinishEdit;
import com.bilibili.studio.videoeditor.extension.ActivityExtKt;
import com.bilibili.upper.module.draft.activity.DraftListActivity;
import com.bilibili.upper.module.draft.fragment.DraftsFragmentV2;
import kotlin.jvm.internal.Intrinsics;
import lB0.a;
import lB0.a$b;
import org.jetbrains.annotations.Nullable;
import zw0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/activity/DraftListActivity.class */
@StabilityInferred(parameters = 0)
public final class DraftListActivity extends BaseAppCompatActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f113090I = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public FrameLayout f113091B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ImageView f113092C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public FrameLayout f113093D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TintTextView f113094E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public a.a f113095F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public DraftsFragmentV2 f113096G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f113097H = b.i();

    public final void P6() {
        DraftsFragmentV2 draftsFragmentV2 = this.f113096G;
        if (draftsFragmentV2 != null) {
            j jVar = draftsFragmentV2.f113111f;
            int itemCount = jVar != null ? jVar.getItemCount() : 0;
            Activity activity = BiliContext.topActivity();
            boolean zIsActive = ActivityExtKt.isActive(activity);
            Context fapp = activity;
            if (!zIsActive) {
                fapp = FoundationAlias.getFapp();
            }
            String string = fapp.getString(2131851192);
            TintTextView tintTextView = null;
            if (!this.f113097H || itemCount <= 0) {
                TintTextView tintTextView2 = this.f113094E;
                if (tintTextView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTitleContent");
                    tintTextView2 = null;
                }
                tintTextView2.setText(string);
                return;
            }
            TintTextView tintTextView3 = this.f113094E;
            if (tintTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleContent");
            } else {
                tintTextView = tintTextView3;
            }
            tintTextView.setText(string + "（" + itemCount + "）");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2131296445) {
            onBackPressed();
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        View decorView;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(4102);
        }
        setContentView(2131493733);
        this.f113091B = (FrameLayout) findViewById(2131296444);
        this.f113092C = (ImageView) findViewById(2131296445);
        this.f113093D = (FrameLayout) findViewById(2131297527);
        this.f113094E = (TintTextView) findViewById(2131296433);
        ImageView imageView = this.f113092C;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBackIcon");
            imageView2 = null;
        }
        imageView2.setOnClickListener(this);
        int intExtra = getIntent().getIntExtra("jump_from", 0);
        int intExtra2 = getIntent().getIntExtra("show_type", 22);
        boolean booleanExtra = getIntent().getBooleanExtra("is_new_ui", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("RELATION_FROM", true);
        Bundle bundleA = k.a(intExtra, intExtra2, "jump_from", "show_type");
        bundleA.putBoolean("is_new_ui", booleanExtra);
        bundleA.putBoolean("RELATION_FROM", booleanExtra2);
        bundleA.putInt("theme_style", 1);
        DraftsFragmentV2 draftsFragmentV2 = new DraftsFragmentV2();
        draftsFragmentV2.setArguments(bundleA);
        getSupportFragmentManager().beginTransaction().add(2131297527, draftsFragmentV2).commit();
        this.f113096G = draftsFragmentV2;
        a aVarA = a.a();
        a$b a_b = new a$b(this) { // from class: VH0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DraftListActivity f25463a;

            {
                this.f25463a = this;
            }

            @Override // lB0.a$b
            public final void onBusEvent(Object obj) {
                int i7 = DraftListActivity.f113090I;
                this.f25463a.finish();
            }
        };
        aVarA.getClass();
        this.f113095F = a.b(EventFinishEdit.class, a_b);
        d.b(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a.a aVar = this.f113095F;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        StatusBarCompat.tintStatusBar(this, ContextCompat.getColor(this, 2131104090));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        DraftsFragmentV2 draftsFragmentV2 = this.f113096G;
        if (draftsFragmentV2 == null || !draftsFragmentV2.isAdded()) {
            return;
        }
        DraftsFragmentV2 draftsFragmentV22 = this.f113096G;
        if (draftsFragmentV22 != null) {
            draftsFragmentV22.lf();
        }
        P6();
    }
}
