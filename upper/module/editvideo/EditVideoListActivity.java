package com.bilibili.upper.module.editvideo;

import C0.d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.ActionBar;
import com.alibaba.fastjson.JSON;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/editvideo/EditVideoListActivity.class */
public class EditVideoListActivity extends BaseToolbarActivity {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public EditVideoListFragment f113144D;

    public final void Q6() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        String string = getString(2131849030);
        Bundle bundleExtra = getIntent().getBundleExtra("param_control");
        String string2 = string;
        if (bundleExtra != null) {
            ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("INTENT_VIDEOS");
            string2 = string;
            if (parcelableArrayList != null) {
                string2 = string;
                if (parcelableArrayList.size() > 0) {
                    StringBuilder sbA = d.a(string, "(");
                    sbA.append(parcelableArrayList.size());
                    sbA.append(")");
                    string2 = sbA.toString();
                }
            }
        }
        supportActionBar.setTitle(string2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f113144D != null) {
            Intent intent = new Intent();
            intent.putExtra("INTENT_VIDEOS_JSON", JSON.toJSONString(this.f113144D.f113148e.f17043a));
            intent.putExtra("KEY_IS_DELETE_FIRST", Boolean.valueOf(this.f113144D.f113148e.f17046d));
            setResult(-1, intent);
        }
        super.onBackPressed();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131493811);
        ensureToolbar();
        showBackButton();
        Q6();
        EditVideoListFragment editVideoListFragment = (EditVideoListFragment) getSupportFragmentManager().findFragmentByTag("EditVideoListFragment");
        this.f113144D = editVideoListFragment;
        if (editVideoListFragment == null) {
            this.f113144D = new EditVideoListFragment();
            Bundle bundleExtra = getIntent().getBundleExtra("param_control");
            if (bundleExtra != null) {
                ArrayList<? extends Parcelable> parcelableArrayList = bundleExtra.getParcelableArrayList("INTENT_VIDEOS");
                boolean z6 = bundleExtra.getBoolean("KEY_CAN_ADD_VIDEO", false);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArrayList("INTENT_VIDEOS", parcelableArrayList);
                bundle2.putBoolean("KEY_CAN_ADD_VIDEO", z6);
                this.f113144D.setArguments(bundle2);
            }
            getSupportFragmentManager().beginTransaction().replace(2131299396, this.f113144D).commitAllowingStateLoss();
        }
    }
}
