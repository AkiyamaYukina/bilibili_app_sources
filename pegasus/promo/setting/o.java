package com.bilibili.pegasus.promo.setting;

import androidx.preference.Preference;
import com.bapis.bilibili.app.dynamic.v2.DynamicMoss;
import com.bapis.bilibili.app.dynamic.v2.UpdateTabSettingReq;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.moss.api.CallOptions;
import io.reactivex.rxjava3.functions.Function;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/o.class */
public final /* synthetic */ class o implements Preference.OnPreferenceChangeListener, Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f78566a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.following.ImageNotFoundException */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r9) throws com.bilibili.following.ImageNotFoundException {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.promo.setting.o.apply(java.lang.Object):java.lang.Object");
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeListener
    public boolean onPreferenceChange(Preference preference, Object obj) {
        if (!(obj instanceof Boolean)) {
            return true;
        }
        final boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((RecommendSettingFragment) this.f78566a).getClass();
        Iterator it = ((CopyOnWriteArraySet) Eh.c.a.getValue()).iterator();
        while (it.hasNext()) {
            ((Eh.e) it.next()).a(zBooleanValue);
        }
        HandlerThreads.post(3, new Runnable(zBooleanValue) { // from class: com.bilibili.pegasus.promo.setting.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f78567a;

            {
                this.f78567a = zBooleanValue;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    new DynamicMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeUpdateTabSetting(UpdateTabSettingReq.newBuilder().setStatusValue(this.f78567a ? 1 : 2).build());
                } catch (Throwable th) {
                    BLog.i("RecommendSettingFragment", "update settings failed", th);
                }
            }
        });
        return true;
    }
}
