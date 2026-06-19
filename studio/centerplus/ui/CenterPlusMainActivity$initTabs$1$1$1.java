package com.bilibili.studio.centerplus.ui;

import com.bilibili.studio.centerplus.widgets.TabEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/CenterPlusMainActivity$initTabs$1$1$1.class */
final /* synthetic */ class CenterPlusMainActivity$initTabs$1$1$1 extends FunctionReferenceImpl implements Function2<TabEvent, fw0.d, Unit> {
    public CenterPlusMainActivity$initTabs$1$1$1(Object obj) {
        super(2, obj, CenterPlusMainActivity.class, "initTabLayoutEvent", "initTabLayoutEvent(Lcom/bilibili/studio/centerplus/widgets/TabEvent;Lcom/bilibili/studio/centerplus/widgets/TabBean;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((TabEvent) obj, (fw0.d) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(TabEvent tabEvent, fw0.d dVar) {
        CenterPlusMainActivity.access$initTabLayoutEvent((CenterPlusMainActivity) ((CallableReference) this).receiver, tabEvent, dVar);
    }
}
