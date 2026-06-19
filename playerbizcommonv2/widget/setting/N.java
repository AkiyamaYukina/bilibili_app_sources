package com.bilibili.playerbizcommonv2.widget.setting;

import a4.C3184b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.biligame.cloudgame.v2.ui.vip.rule.activity.CloudGameVipInfoActivity;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.app.upper.collectionsmanage.CollectionsManageScreenViewModel;
import kntr.common.compose.utils.ResourcesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.compose.resources.StringResource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/N.class */
@StabilityInferred(parameters = 0)
public final class N implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList f83108a;

    public N(@NotNull SnapshotStateList snapshotStateList) {
        this.f83108a = snapshotStateList;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        final int i7 = 0;
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(1369488063, true, new Function2(this, i7) { // from class: com.bilibili.playerbizcommonv2.widget.setting.M

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f83106a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f83107b;

            {
                this.f83106a = i7;
                this.f83107b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                boolean z6 = false;
                Object obj3 = this.f83107b;
                switch (this.f83106a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        boolean z7 = false;
                        if ((iIntValue & 3) != 2) {
                            z7 = true;
                        }
                        if (composer.shouldExecute(z7, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1369488063, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingTopComposeComponent.bindToView.<anonymous> (PlayerSettingCompose.kt:340)");
                            }
                            BiliThemeKt.BiliTheme(ThemeStrategy.ForceDay, false, ComposableLambdaKt.rememberComposableLambda(-790097289, true, new com.bilibili.ad.adview.pegasus.holders.card41.g((N) obj3, 1), composer, 54), composer, 390, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                    case 1:
                        Composer composer2 = (Composer) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        int i8 = CloudGameVipInfoActivity.Q;
                        if ((iIntValue2 & 3) != 2) {
                            z6 = true;
                        }
                        if (composer2.shouldExecute(z6, iIntValue2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116707520, iIntValue2, -1, "com.bilibili.biligame.cloudgame.v2.ui.vip.rule.activity.CloudGameVipInfoActivity.onCreate.<anonymous> (CloudGameVipInfoActivity.kt:82)");
                            }
                            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1954291336, true, new com.bilibili.ad.adview.pegasus.holders.card41.h((CloudGameVipInfoActivity) obj3, 1), composer2, 54), composer2, 384, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        break;
                    default:
                        String str = (String) obj;
                        CollectionsManageScreenViewModel collectionsManageScreenViewModel = (CollectionsManageScreenViewModel) obj3;
                        if (Intrinsics.areEqual(str, (String) obj2)) {
                            collectionsManageScreenViewModel.Q0(ResourcesKt.b((StringResource) C3184b.m8.getValue()));
                        } else {
                            List listL0 = collectionsManageScreenViewModel.L0();
                            ArrayList arrayList = (ArrayList) listL0;
                            if (arrayList.isEmpty()) {
                                collectionsManageScreenViewModel.Q0(ResourcesKt.b((StringResource) C3184b.q8.getValue()));
                            } else {
                                int size = arrayList.size();
                                int i9 = collectionsManageScreenViewModel.o;
                                if (size > i9) {
                                    collectionsManageScreenViewModel.Q0(ResourcesKt.c((StringResource) C3184b.Y7.getValue(), new Object[]{Integer.valueOf(i9)}));
                                } else {
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listL0, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((y21.e) it.next()).a);
                                    }
                                    collectionsManageScreenViewModel.P0(str, ResourcesKt.c((StringResource) C3184b.e8.getValue(), new Object[]{Integer.valueOf(arrayList.size())}), ResourcesKt.b((StringResource) C3184b.n8.getValue()), arrayList2, false);
                                }
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
        return new UIComponent.b(composeView);
    }
}
