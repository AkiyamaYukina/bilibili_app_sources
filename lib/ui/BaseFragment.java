package com.bilibili.lib.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.C4584b;
import androidx.fragment.app.Fragment;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.lib.ui.mixin.IFragmentShowHide;
import com.bilibili.spmid.SPMID;
import com.bilibili.spmid.SPMTrackNodeWrapper;
import java.util.HashMap;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BaseFragment.class */
public abstract class BaseFragment extends androidx_fragment_app_Fragment implements IFragmentShowHide, SPMTrackNodeWrapper {

    @Nullable
    private Context mApplicationContext;
    private boolean mNeedPendingUserVisibileHint = false;
    private boolean mLastUserVisibileHint = false;
    private boolean mCurrentHiddenStatus = false;

    public static void dumpMemInfo(Fragment fragment, boolean z6) {
        if (z6) {
            try {
                com.bilibili.base.i.b(fragment);
            } catch (Exception e7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFragmentShow$1() {
        dumpMemInfo(this, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUserVisibleCompat$0(boolean z6) {
        dumpMemInfo(this, z6);
    }

    public static void unbindDrawables(View view) {
        if (view == null) {
            return;
        }
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup) || (view instanceof AdapterView)) {
            return;
        }
        int i7 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i7 >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                unbindDrawables(viewGroup.getChildAt(i7));
                i7++;
            }
        }
    }

    public boolean activityDie() {
        return p3() == null || p3().isFinishing() || getFragmentManager().isDestroyed();
    }

    @Override // com.bilibili.spmid.SPMTrackNodeWrapper
    @Nullable
    public Pair<SPMID, HashMap<String, String>> fillTrackParams() {
        return new Pair<>(new SPMID(getClass().getName(), SPMID.Segment.Second), (Object) null);
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public View getViewRecyclable() {
        return null;
    }

    public boolean isActivityDie() {
        return activityDie();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mCurrentHiddenStatus = C4584b.a(this);
        if (this.mNeedPendingUserVisibileHint) {
            setUserVisibleCompat(this.mLastUserVisibileHint);
            this.mNeedPendingUserVisibileHint = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.mApplicationContext = activity.getApplicationContext();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public void onFragmentHide(@NotNull Flag flag) {
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public void onFragmentShow(@NotNull Flag flag) {
        if (com.bilibili.base.i.a) {
            HandlerThreads.runOn(2, new Runnable(this) { // from class: com.bilibili.lib.ui.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BaseFragment f64839a;

                {
                    this.f64839a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f64839a.lambda$onFragmentShow$1();
                }
            });
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z6) {
        super.onHiddenChanged(z6);
        boolean zA = C4584b.a(this);
        if (this.mCurrentHiddenStatus != zA) {
            setUserVisibleCompat(!zA);
            this.mCurrentHiddenStatus = zA;
            onHiddenChangedCompat(zA);
        }
    }

    @Deprecated
    public void onHiddenChangedCompat(boolean z6) {
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i7, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        PermissionsChecker.onPermissionResult(this, i7, strArr, iArr);
        PermissionRequestUtils.onRequestPermissionsResult(p3(), i7, strArr, iArr);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setTag(2131311980, this);
    }

    @CallSuper
    public void setUserVisibleCompat(final boolean z6) {
        if (com.bilibili.base.i.a) {
            HandlerThreads.runOn(2, new Runnable(this, z6) { // from class: com.bilibili.lib.ui.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BaseFragment f64837a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f64838b;

                {
                    this.f64837a = this;
                    this.f64838b = z6;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f64837a.lambda$setUserVisibleCompat$0(this.f64838b);
                }
            });
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z6) {
        super.setUserVisibleHint(z6);
        if (p3() != null) {
            setUserVisibleCompat(z6);
        } else {
            this.mNeedPendingUserVisibileHint = true;
            this.mLastUserVisibileHint = z6;
        }
    }
}
