package com.bilibili.playerbizcommonv2.widget.quality;

import com.bapis.bilibili.playershared.QnGroup;
import com.bapis.bilibili.playershared.StreamInfo;
import com.bilibili.lib.homepage.mine.MenuItemTipV2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/d0.class */
public final /* synthetic */ class d0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82808a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f82809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f82810c;

    public /* synthetic */ d0(QnGroup qnGroup, Function1 function1) {
        this.f82810c = qnGroup;
        this.f82809b = function1;
    }

    public /* synthetic */ d0(Function1 function1, MenuItemTipV2 menuItemTipV2) {
        this.f82809b = function1;
        this.f82810c = menuItemTipV2;
    }

    public final Object invoke() {
        switch (this.f82808a) {
            case 0:
                StreamInfo streamInfo = (StreamInfo) CollectionsKt.firstOrNull(((QnGroup) this.f82810c).getStreamInfosList());
                if (streamInfo != null) {
                    this.f82809b.invoke(streamInfo);
                }
                break;
            default:
                this.f82809b.invoke((MenuItemTipV2) this.f82810c);
                break;
        }
        return Unit.INSTANCE;
    }
}
