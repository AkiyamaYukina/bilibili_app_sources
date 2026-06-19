package com.bilibili.opd.app.bizcommon.hybridruntime.web;

import Fm0.C1897e;
import Fm0.C1900h;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.opd.app.bizcommon.context.f;
import com.bilibili.xpref.Xpref;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/a.class */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static volatile a f73712d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f73713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SharedPreferencesOnSharedPreferenceChangeListenerC0467a f73714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<b> f73715c;

    /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.hybridruntime.web.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/a$a.class */
    public final class SharedPreferencesOnSharedPreferenceChangeListenerC0467a implements SharedPreferences.OnSharedPreferenceChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f73716a;

        public SharedPreferencesOnSharedPreferenceChangeListenerC0467a(a aVar) {
            this.f73716a = aVar;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            List<b> list = this.f73716a.f73715c;
            if (list == null) {
                return;
            }
            for (b bVar : (ArrayList) list) {
                if (MultipleThemeUtils.PREFERENCE_KEY.equals(str)) {
                    bVar.Gb(C1900h.a(f.a()));
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/a$b.class */
    public interface b {
        void Gb(String str);
    }

    public static a a(Context context) {
        if (f73712d == null) {
            synchronized (SharedPreferences.class) {
                try {
                    if (f73712d == null) {
                        a aVar = new a();
                        context.getApplicationContext();
                        SparseArray<int[]> sparseArray = C1897e.f6313a;
                        aVar.f73713a = Xpref.getSharedPreferences(context, "bili_preference");
                        aVar.f73715c = new ArrayList();
                        f73712d = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f73712d;
    }
}
