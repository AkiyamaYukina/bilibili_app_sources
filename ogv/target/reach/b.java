package com.bilibili.ogv.target.reach;

import android.util.Log;
import androidx.fragment.app.z;
import com.cmic.promopush.PromoPush;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/target/reach/b.class */
public final class b implements PromoPush.OnCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f73140a;

    public b(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f73140a = cancellableContinuationImpl;
    }

    public final void onResult(String str, List<JSONObject> list, String str2) {
        boolean zAreEqual = Intrinsics.areEqual(str, jL0.a.Success);
        CancellableContinuationImpl cancellableContinuationImpl = this.f73140a;
        if (!zAreEqual && !Intrinsics.areEqual(str, jL0.a.Success_Part)) {
            Log.i("TargetReachInteractService$resPreload$2$1-onResult", "[ogv-target-reach-TargetReachInteractService$resPreload$2$1-onResult] " + z.a("activities promos obtain failed resultCode:", str, " desc:", str2));
            com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, "");
            return;
        }
        List<JSONObject> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, list.toString());
            return;
        }
        Log.i("TargetReachInteractService$resPreload$2$1-onResult", "[ogv-target-reach-TargetReachInteractService$resPreload$2$1-onResult] " + z.a("activities promos list empty resultCode:", str, " desc:", str2));
        com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, "");
    }
}
