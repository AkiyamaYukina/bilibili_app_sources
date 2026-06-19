package com.bilibili.upper.module.cover_v2.ui;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.adcommon.utils.ext.AdExtensions;
import com.bilibili.lib.tribe.core.internal.Hooks;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/InternationalMultiCoverActivity.class */
@StabilityInferred(parameters = 0)
public final class InternationalMultiCoverActivity extends MultiCoverActivity {
    @Override // com.bilibili.upper.module.cover_v2.ui.MultiCoverActivity
    public final int U6() {
        return 2131502333;
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.MultiCoverActivity
    public final float V6() {
        return 1.3333334f;
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.MultiCoverActivity
    public final void a7() {
        super.a7();
        X6().f112884g.setVisibility(8);
        X6().f112883f.setVisibility(8);
        TextView textView = (TextView) X6().f112885i.findViewById(2131318175);
        textView.setTextSize(8.0f);
        textView.setTextColor(Color.parseColor("#99FFFFFF"));
        textView.setHeight(AdExtensions.getToPx(48));
        textView.setWidth(AdExtensions.getToPx(48));
        textView.setText("Upload\nThumbnail");
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.MultiCoverActivity, androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }
}
