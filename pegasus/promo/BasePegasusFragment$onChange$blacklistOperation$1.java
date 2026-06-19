package com.bilibili.pegasus.promo;

import android.app.Activity;
import com.bilibili.relation.blacklist.BlackListManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/BasePegasusFragment$onChange$blacklistOperation$1.class */
public final /* synthetic */ class BasePegasusFragment$onChange$blacklistOperation$1 extends FunctionReferenceImpl implements Function8<Activity, Long, Integer, String, String, String, String, BlackListManager.Callback, Unit> {
    public BasePegasusFragment$onChange$blacklistOperation$1(Object obj) {
        super(8, obj, BlackListManager.class, "delBlacklist", "delBlacklist(Landroid/app/Activity;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bilibili/relation/blacklist/BlackListManager$Callback;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        invoke((Activity) obj, ((Number) obj2).longValue(), ((Number) obj3).intValue(), (String) obj4, (String) obj5, (String) obj6, (String) obj7, (BlackListManager.Callback) obj8);
        return Unit.INSTANCE;
    }

    public final void invoke(Activity activity, long j7, int i7, String str, String str2, String str3, String str4, BlackListManager.Callback callback) {
        ((BlackListManager) ((CallableReference) this).receiver).delBlacklist(activity, j7, i7, str, str2, str3, str4, callback);
    }
}
