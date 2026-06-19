package com.bilibili.pegasus.components;

import androidx.lifecycle.Observer;
import bi0.AbstractC5109a;
import com.bilibili.inline.reporter.AutoPlayTriggerType;
import com.bilibili.inline.reporter.InlinePlayReporterKt;
import com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerEventCompatService;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/K.class */
public final /* synthetic */ class K implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f75816b;

    public /* synthetic */ K(Object obj, int i7) {
        this.f75815a = i7;
        this.f75816b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f75815a) {
            case 0:
                InlinePlayReporterKt.reportTryAutoPlayEvent$default(AutoPlayTriggerType.MINI_PLAYER_CLOSE, (String) null, true, 2, (Object) null);
                InlineComponent.d((InlineComponent) this.f75816b, false, 3);
                break;
            default:
                List list = (List) obj;
                if (!list.isEmpty() && ((AbstractC5109a.f) CollectionsKt.lastOrNull(list)) != null) {
                    ((OldWayPlayerEventCompatService) this.f75816b).f104695j.dispatchSubtitleModeChanged();
                }
                break;
        }
    }
}
