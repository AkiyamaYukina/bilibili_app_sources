package com.bilibili.pegasus.promo;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.relation.blacklist.BlackListManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/BasePegasusFragment$onChange$blacklistOperation$2.class */
public final /* synthetic */ class BasePegasusFragment$onChange$blacklistOperation$2 extends FunctionReferenceImpl implements Function8<FragmentActivity, Long, Integer, String, String, String, String, BlackListManager.Callback, Unit> {
    public BasePegasusFragment$onChange$blacklistOperation$2(Object obj) {
        super(8, obj, BlackListManager.class, "addBlacklist", "addBlacklist(Landroidx/fragment/app/FragmentActivity;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bilibili/relation/blacklist/BlackListManager$Callback;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        invoke((FragmentActivity) obj, ((Number) obj2).longValue(), ((Number) obj3).intValue(), (String) obj4, (String) obj5, (String) obj6, (String) obj7, (BlackListManager.Callback) obj8);
        return Unit.INSTANCE;
    }

    public final void invoke(FragmentActivity fragmentActivity, long j7, int i7, String str, String str2, String str3, String str4, BlackListManager.Callback callback) {
        ((BlackListManager) ((CallableReference) this).receiver).addBlacklist(fragmentActivity, j7, i7, str, str2, str3, str4, callback);
    }
}
