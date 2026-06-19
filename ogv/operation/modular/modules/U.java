package com.bilibili.ogv.operation.modular.modules;

import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.lib.fasthybrid.container.game.GamePageFragment;
import com.bilibili.lib.neuron.api.Neurons;
import com.mall.logic.page.ip.IPDressViewModel;
import com.mall.ui.composePage.shopreplay.MallShopLiveReplayFragment;
import com.mall.ui.page.ip.dress.MallIpDressPendantFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/U.class */
public final /* synthetic */ class U implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f70418b;

    public /* synthetic */ U(Object obj, int i7) {
        this.f70417a = i7;
        this.f70418b = obj;
    }

    public final Object invoke() {
        Object obj = this.f70418b;
        switch (this.f70417a) {
            case 0:
                V v7 = (V) obj;
                Neurons.reportExposure$default(false, v7.f70424f, v7.h, (List) null, 8, (Object) null);
                return Unit.INSTANCE;
            case 1:
                com.bilibili.ship.theseus.ugc.intro.questionaire.c cVar = (com.bilibili.ship.theseus.ugc.intro.questionaire.c) obj;
                cVar.h.invoke(cVar);
                return Unit.INSTANCE;
            case 2:
                return new ViewModelProvider((MallShopLiveReplayFragment) obj).get(com.mall.ui.composePage.shopreplay.u.class);
            case 3:
                return new ViewModelProvider((MallIpDressPendantFragment) obj).get(IPDressViewModel.class);
            case 4:
                return Integer.valueOf(((k8.a) obj).getConfig().getPeekHeight());
            case 5:
                GamePageFragment.a aVar = GamePageFragment.Companion;
                return ((GamePageFragment) obj).requireArguments().getParcelable("app_info");
            default:
                return (TextView) ((qk0.o) obj).f126116b.findViewById(2131297143);
        }
    }
}
