package com.bilibili.pegasus.components.interest.ui.v27.page;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import java.util.List;
import kntr.watch.later.watchlater.utils.k;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/j.class */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f76493b;

    public /* synthetic */ j(Object obj, int i7) {
        this.f76492a = i7;
        this.f76493b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        List<InterestChooseItem> listU;
        InterestChooseItem interestChooseItem;
        List<InterestChooseSubItem> subItems;
        InterestChooseSubItem interestChooseSubItem;
        switch (this.f76492a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                ((InterestChooseV27SecondTab) this.f76493b).getClass();
                InterestChooseV27PageViewModel interestChooseV27PageViewModel = c.f76482a;
                if (interestChooseV27PageViewModel != null && (stateFlow = interestChooseV27PageViewModel.f76495b) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null && (listU = interestChoose.u()) != null && (interestChooseItem = (InterestChooseItem) CollectionsKt.getOrNull(listU, iIntValue)) != null && (subItems = interestChooseItem.getSubItems()) != null && (interestChooseSubItem = (InterestChooseSubItem) CollectionsKt.getOrNull(subItems, iIntValue2)) != null) {
                    com.bilibili.pegasus.components.interest.e.o(interestChooseItem, iIntValue + 1, interestChooseSubItem.j(), interestChooseSubItem.i(), interestChooseSubItem.f77423i + 1, interestChoose.D(), interestChoose.O(), null, false, 896);
                }
                break;
            default:
                Composer composer = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1094818645, iIntValue3, -1, "kntr.watch.later.watchlater.compose.WatchLaterToolBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WatchLaterPageCompose.kt:231)");
                    }
                    IconKt.m2023Iconww6aTOc(BiliIconfont.INSTANCE.getArrow_back_left_line_500(composer, 6), (String) null, SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(Modifier.Companion, Dp.m3880constructorimpl(k.a((kntr.watch.later.watchlater.utils.e) this.f76493b)), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3880constructorimpl(24)), k.c(composer), composer, Painter.$stable | 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
