package com.bilibili.playset.editor;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer;
import com.bilibili.pvtracker.IPvTracker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetCreateActivity.class */
public class PlaySetCreateActivity extends BaseToolbarActivity implements IPvTracker, IMiniPlayerContainer {
    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    public final Rect getContainerUnavailableRect() {
        return new Rect();
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    public final String getMiniPlayerContainerKey() {
        return "play_set_create_page";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final String getPvEventId() {
        return "playlist.new-playlist.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final Bundle getPvExtra() {
        return null;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131493811);
        ensureToolbar();
        showBackButton();
        if (bundle == null) {
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            PlaySetEditorFragment playSetEditorFragment = new PlaySetEditorFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("page_type", 1);
            playSetEditorFragment.setArguments(bundle2);
            fragmentTransactionBeginTransaction.add(2131299396, playSetEditorFragment).commit();
        }
    }
}
