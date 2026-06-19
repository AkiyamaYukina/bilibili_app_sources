package com.bilibili.opd.app.bizcommon.context;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/KFCFragmentLoaderActivity.class */
public abstract class KFCFragmentLoaderActivity extends KFCAppCompatActivity {
    public static final String KEY_REQ_CODE_ORIGIN = "req_code_origin";
    public static final int REQ_CODE_LOGIN = 10000;
    public static final String TAG_PRIM_FRAGMENT = "prim_fragment";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f73520H;
    protected FrameLayout rootView;

    public Fragment getFragment() {
        return getSupportFragmentManager().findFragmentById(R.id.primary);
    }

    public String getFragmentName() {
        return this.f73520H;
    }

    public Object getPageDetector() {
        return null;
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (i7 != 10000) {
            super.onActivityResult(i7, i8, intent);
        } else if (i8 == -1) {
            startActivityForResult(getIntent(), getIntent().getIntExtra(KEY_REQ_CODE_ORIGIN, 0));
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCAppCompatActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        this.rootView = frameLayout;
        int i7 = -1;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.rootView.setId(R.id.primary);
        setContentView(this.rootView);
        if (getFragment() != null) {
            return;
        }
        String stringExtra = getIntent().getStringExtra("_fragment");
        this.f73520H = stringExtra;
        int i8 = TextUtils.isEmpty(stringExtra) ? 202 : 0;
        Exception e7 = null;
        try {
            fragment = (Fragment) getClassLoader().loadClass(this.f73520H).newInstance();
            try {
                onFragmentCreated(fragment);
                BLog.i("loader", "(Fragment) " + this.f73520H);
            } catch (Exception e8) {
                e7 = e8;
                BLog.e(e7.getMessage());
                i8 = 211;
            }
        } catch (Exception e9) {
            e7 = e9;
            fragment = null;
        }
        if (i8 == 0) {
            if (isFinishing()) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.replace(R.id.primary, fragment, TAG_PRIM_FRAGMENT);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            return;
        }
        this.rootView.removeAllViews();
        TextView textView = new TextView(this);
        StringBuilder sb = new StringBuilder("载入页面失败 (");
        if (i8 > 0) {
            i7 = i8;
        }
        sb.append(i7);
        sb.append(")");
        textView.setText(sb.toString());
        if (getEnvironment().isDebug() && e7 != null) {
            textView.append("\n");
            textView.append(e7.toString());
        }
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.rootView.addView(textView);
    }

    public void onFragmentCreated(Fragment fragment) {
    }
}
