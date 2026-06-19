package com.bilibili.pegasus.keywordblocker;

import androidx.compose.ui.layout.InterfaceC4420w;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AbstractC4464g0;
import androidx.compose.ui.unit.Constraints;
import com.alibaba.fastjson.JSON;
import com.bilibili.bililive.shared.router.LiveRouterHelper;
import com.bilibili.lib.blrouter.MutableBundleLike;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/t.class */
public final class t extends AbstractC4464g0 implements InterfaceC4420w {
    @Override // androidx.compose.ui.layout.InterfaceC4420w
    @NotNull
    public final MeasureResult g(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, final long j7) {
        final Placeable placeableMo3163measureBRTryo0 = measurable.mo3163measureBRTryo0(j7);
        final int i7 = 0;
        return MeasureScope.layout$default(measureScope, placeableMo3163measureBRTryo0.getWidth(), placeableMo3163measureBRTryo0.getHeight(), null, new Function1(this, j7, placeableMo3163measureBRTryo0, i7) { // from class: com.bilibili.pegasus.keywordblocker.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f78248a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f78249b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f78250c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Object f78251d;

            {
                this.f78248a = i7;
                this.f78249b = j7;
                this.f78250c = this;
                this.f78251d = placeableMo3163measureBRTryo0;
            }

            public final Object invoke(Object obj) {
                int iRoundToInt;
                Object obj2 = this.f78251d;
                long j8 = this.f78249b;
                Object obj3 = this.f78250c;
                switch (this.f78248a) {
                    case 0:
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                        boolean zM3839getHasBoundedHeightimpl = Constraints.m3839getHasBoundedHeightimpl(j8);
                        Placeable placeable = (Placeable) obj2;
                        t tVar = (t) obj3;
                        if (zM3839getHasBoundedHeightimpl) {
                            float fM3843getMaxHeightimpl = Constraints.m3843getMaxHeightimpl(j8);
                            tVar.getClass();
                            iRoundToInt = MathKt.roundToInt(((double) (fM3843getMaxHeightimpl * 0.4f)) - (((double) placeable.getHeight()) * 0.5d));
                        } else {
                            iRoundToInt = 0;
                        }
                        tVar.getClass();
                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, iRoundToInt, 0.0f, 4, null);
                        break;
                    default:
                        ArrayList arrayList = (ArrayList) obj3;
                        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                        LiveRouterHelper liveRouterHelper = LiveRouterHelper.INSTANCE;
                        mutableBundleLike.put("live:mid", String.valueOf(j8));
                        mutableBundleLike.put("live:tags", JSON.toJSONString(arrayList));
                        mutableBundleLike.put("live:desc", (String) obj2);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 4, null);
    }
}
