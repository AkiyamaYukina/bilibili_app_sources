package com.bilibili.playset.editor;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.pvtracker.IPvTracker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorActivity.class */
public class PlaySetEditorActivity extends BaseToolbarActivity implements IPvTracker {
    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final String getPvEventId() {
        return "playlist.edit-playlist.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final Bundle getPvExtra() {
        return null;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i7 = 0;
        super.onCreate(bundle);
        setContentView(2131493811);
        ensureToolbar();
        showBackButton();
        Bundle extras = getIntent().getExtras();
        if (bundle == null) {
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            PlaySetEditorFragment playSetEditorFragment = new PlaySetEditorFragment();
            if (extras != null) {
                if (!BundleUtil.getBoolean(extras, "is_default", new boolean[]{false})) {
                    i7 = 2;
                }
                extras.putInt("page_type", i7);
                playSetEditorFragment.setArguments(extras);
            }
            fragmentTransactionBeginTransaction.add(2131299396, playSetEditorFragment).commit();
        }
    }
}
