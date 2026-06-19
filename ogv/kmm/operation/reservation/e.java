package com.bilibili.ogv.kmm.operation.reservation;

import ak0.C3230b;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.framework.exposure.core.ExposureEntry;
import java.util.Map;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ql0.InterfaceC8453a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/reservation/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f68663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExposureEntry f68664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f68665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final KomponentScope<?> f68666d;

    public e(InterfaceC8453a interfaceC8453a, final l lVar, KomponentScope<?> komponentScope) {
        this.f68665c = lVar;
        this.f68666d = komponentScope;
        this.f68663a = interfaceC8453a.getReport();
        final int i7 = 0;
        this.f68664b = new ExposureEntry(C3230b.f31310a, new Function0(i7, this, lVar) { // from class: com.bilibili.ogv.kmm.operation.reservation.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f68660a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f68661b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f68662c;

            {
                this.f68660a = i7;
                this.f68661b = this;
                this.f68662c = lVar;
            }

            public final Object invoke() {
                switch (this.f68660a) {
                    case 0:
                        e eVar = (e) this.f68661b;
                        eVar.f68665c.f68688a.a(eVar.f68666d, 1, eVar.f68663a);
                        l lVar2 = (l) this.f68662c;
                        lVar2.f68689b.a("pgc.cinema-tab.film-activity.notice.show", eVar.f68663a);
                        break;
                    default:
                        ((A8.l) this.f68661b).invoke();
                        ((ComposeView) this.f68662c).setVisibility(8);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }
}
