package com.bilibili.opd.app.bizcommon.context;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/KFCAppCompatActivity.class */
public abstract class KFCAppCompatActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final HashMap<String, String> f73511G = new HashMap<>();
    public static final String HTTP_SCHEMAS_ANDROID_COM_APK_RES_ANDROID = "http://schemas.android.com/apk/res/android";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f73512B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Object f73513C = new Object();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List<ActivityLifecycleListener> f73514D = new ArrayList();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final List<b> f73515E = new ArrayList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final List<m> f73516F = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
    
        r10 = r0 + "://" + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getMyUrl(android.app.Activity r4, java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.context.KFCAppCompatActivity.getMyUrl(android.app.Activity, java.lang.String):java.lang.String");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        List<b> list = this.f73515E;
        if (list != null && ((ArrayList) list).size() > 0) {
            List<b> list2 = this.f73515E;
            b bVar = (b) ((ArrayList) list2).get(((ArrayList) list2).size() - 1);
            if (bVar != null && bVar.dispatchGenericMotionEvent(motionEvent)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        List<b> list = this.f73515E;
        if (list != null && ((ArrayList) list).size() > 0) {
            List<b> list2 = this.f73515E;
            b bVar = (b) ((ArrayList) list2).get(((ArrayList) list2).size() - 1);
            if (bVar != null && bVar.dispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        List<b> list = this.f73515E;
        if (list != null && ((ArrayList) list).size() > 0) {
            List<b> list2 = this.f73515E;
            b bVar = (b) ((ArrayList) list2).get(((ArrayList) list2).size() - 1);
            if (bVar != null && bVar.dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        List<b> list = this.f73515E;
        if (list != null && ((ArrayList) list).size() > 0) {
            List<b> list2 = this.f73515E;
            b bVar = (b) ((ArrayList) list2).get(((ArrayList) list2).size() - 1);
            if (bVar != null && bVar.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        List<b> list = this.f73515E;
        if (list != null && ((ArrayList) list).size() > 0) {
            List<b> list2 = this.f73515E;
            b bVar = (b) ((ArrayList) list2).get(((ArrayList) list2).size() - 1);
            if (bVar != null && bVar.dispatchTrackballEvent(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    public abstract Environment getEnvironment();

    public boolean isStoped() {
        return this.f73512B;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        synchronized (this.f73513C) {
            Iterator it = ((ArrayList) this.f73514D).iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onActivityResult(this, i7, i8, intent);
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Environment environment = getEnvironment();
        if (environment != null) {
            environment.activityOnCreate(this);
        }
        synchronized (this.f73513C) {
            Iterator it = ((ArrayList) this.f73514D).iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onCreate(this, bundle);
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (getEnvironment() != null) {
            getEnvironment().activityOnDestory(this);
        }
        synchronized (this.f73513C) {
            Iterator it = ((ArrayList) this.f73514D).iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onDestroy(this);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        List<b> list = this.f73515E;
        if (list != null && ((ArrayList) list).size() > 0) {
            List<b> list2 = this.f73515E;
            b bVar = (b) ((ArrayList) list2).get(((ArrayList) list2).size() - 1);
            if (bVar != null && bVar.onKeyDown(i7, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onPause() {
        super.onPause();
        if (getEnvironment() != null) {
            getEnvironment().activityOnPause(this);
        }
        synchronized (this.f73513C) {
            Iterator it = ((ArrayList) this.f73514D).iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onPause(this);
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onResume() {
        super.onResume();
        if (getEnvironment() != null) {
            getEnvironment().activityOnResume(this);
        }
        synchronized (this.f73513C) {
            Iterator it = ((ArrayList) this.f73514D).iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onResume(this);
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onStart() {
        super.onStart();
        if (getEnvironment() != null) {
            getEnvironment().activityOnStart(this);
        }
        this.f73512B = false;
        synchronized (this.f73513C) {
            Iterator it = ((ArrayList) this.f73514D).iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onStart(this);
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f73512B = true;
        if (getEnvironment() != null) {
            getEnvironment().activityOnStop(this);
        }
        synchronized (this.f73513C) {
            Iterator it = ((ArrayList) this.f73514D).iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onStop(this);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z6) {
        List<m> list = this.f73516F;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((m) it.next()).onWindowFocusChanged(z6);
            }
        }
        super.onWindowFocusChanged(z6);
    }

    public void registerLifecycleListener(ActivityLifecycleListener activityLifecycleListener) {
        if (activityLifecycleListener == null) {
            return;
        }
        synchronized (this.f73513C) {
            ArrayList arrayList = new ArrayList(this.f73514D);
            if (arrayList.contains(activityLifecycleListener)) {
                return;
            }
            arrayList.add(activityLifecycleListener);
            this.f73514D = arrayList;
        }
    }

    public void removeEventDispatchInterceptor(b bVar) {
        ((ArrayList) this.f73515E).remove(bVar);
    }

    public void removeWindowFocusInterceptor(m mVar) {
        List<m> list = this.f73516F;
        if (list == null || mVar == null) {
            return;
        }
        ((ArrayList) list).remove(mVar);
    }

    public void setEventDispatchInterceptor(b bVar) {
        ((ArrayList) this.f73515E).add(bVar);
    }

    public void setWindowFocusInterceptors(m mVar) {
        List<m> list = this.f73516F;
        if (list != null) {
            ((ArrayList) list).add(mVar);
        }
    }

    public void startActivity(String str) {
        BLRouter bLRouter = BLRouter.INSTANCE;
        BLRouter.routeTo(new RouteRequest.Builder(str).build(), this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i7, @Nullable Bundle bundle) {
        intent.putExtra("_from", getMyUrl(this, getClass().getName()));
        super.startActivityForResult(intent, i7, bundle);
    }

    public void startActivityForResult(String str, int i7) {
        BLRouter bLRouter = BLRouter.INSTANCE;
        BLRouter.routeTo(new RouteRequest.Builder(str).requestCode(i7).build(), this);
    }

    public void unregisterLifecycleListener(ActivityLifecycleListener activityLifecycleListener) {
        if (activityLifecycleListener == null) {
            return;
        }
        synchronized (this.f73513C) {
            ArrayList arrayList = new ArrayList(this.f73514D);
            if (arrayList.contains(activityLifecycleListener)) {
                arrayList.remove(activityLifecycleListener);
                this.f73514D = arrayList;
            }
        }
    }
}
