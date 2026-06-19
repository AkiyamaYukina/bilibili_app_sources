package com.bilibili.opd.app.bizcommon.context;

import X1.F;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/TranslateErrorActivity.class */
public class TranslateErrorActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public FrameLayout f73528B;

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        this.f73528B = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f73528B.setId(R.id.primary);
        setContentView(this.f73528B);
        this.f73528B.removeAllViews();
        TextView textView = new TextView(this);
        StringBuilder sbB = F.b(402, "载入页面失败 (", ")\nUri: ");
        sbB.append(getIntent().getData());
        textView.setText(sbB.toString());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.f73528B.addView(textView);
    }
}
