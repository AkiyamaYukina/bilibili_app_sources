package com.bilibili.playset.detail.widget;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.bilibili.playset.detail.widget.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/m.class */
public final class C5928m implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1<Float, Unit> f84653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0<Float> f84654b;

    /* JADX WARN: Multi-variable type inference failed */
    public C5928m(Function1<? super Float, Unit> function1, Function0<Float> function0) {
        this.f84653a = function1;
        this.f84654b = function0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i7) {
        if (list.isEmpty()) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).maxIntrinsicHeight(i7);
        }
        return RangesKt.coerceAtLeast(list.get(1).maxIntrinsicHeight(i7) + list.get(0).maxIntrinsicHeight(i7), 0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i7) {
        if (list.isEmpty()) {
            return 0;
        }
        return list.size() == 1 ? list.get(0).maxIntrinsicWidth(i7) : RangesKt.coerceAtLeast(Math.max(list.get(0).maxIntrinsicWidth(i7), list.get(1).maxIntrinsicWidth(i7)), 0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo139measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j7) {
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m3844getMaxWidthimpl(j7), Constraints.m3843getMaxHeightimpl(j7), null, new M11.a(2), 4, null);
        }
        int iM3843getMaxHeightimpl = Constraints.m3843getMaxHeightimpl(j7);
        final Placeable placeableMo3163measureBRTryo0 = list.get(0).mo3163measureBRTryo0(Constraints.m3835copyZbe2FdA$default(j7, 0, 0, 0, Integer.MAX_VALUE, 3, null));
        final int height = placeableMo3163measureBRTryo0.getHeight();
        Placeable placeableMo3163measureBRTryo02 = list.size() > 1 ? list.get(1).mo3163measureBRTryo0(Constraints.m3835copyZbe2FdA$default(j7, 0, 0, 0, RangesKt.coerceAtLeast(iM3843getMaxHeightimpl - RangesKt.coerceAtMost(0, height), 0), 3, null)) : null;
        this.f84653a.invoke(Float.valueOf(RangesKt.coerceAtLeast(height - r0, 0.0f)));
        int iM3844getMaxWidthimpl = Constraints.m3844getMaxWidthimpl(j7);
        final Function0<Float> function0 = this.f84654b;
        final Placeable placeable = placeableMo3163measureBRTryo02;
        return MeasureScope.layout$default(measureScope, iM3844getMaxWidthimpl, iM3843getMaxHeightimpl, null, new Function1(function0, placeableMo3163measureBRTryo0, placeable, height) { // from class: com.bilibili.playset.detail.widget.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Function0 f84649a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Placeable f84650b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Placeable f84651c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f84652d;

            {
                this.f84649a = function0;
                this.f84650b = placeableMo3163measureBRTryo0;
                this.f84651c = placeable;
                this.f84652d = height;
            }

            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int iRoundToInt = MathKt.roundToInt(((Number) this.f84649a.invoke()).floatValue());
                Placeable.PlacementScope.placeRelative$default(placementScope, this.f84650b, 0, -iRoundToInt, 0.0f, 4, null);
                Placeable placeable2 = this.f84651c;
                if (placeable2 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, this.f84652d - iRoundToInt, 0.0f, 4, null);
                }
                return Unit.INSTANCE;
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i7) {
        if (list.isEmpty()) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).minIntrinsicHeight(i7);
        }
        return RangesKt.coerceAtLeast(list.get(1).minIntrinsicHeight(i7) + list.get(0).minIntrinsicHeight(i7), 0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i7) {
        if (list.isEmpty()) {
            return 0;
        }
        return list.size() == 1 ? list.get(0).minIntrinsicWidth(i7) : RangesKt.coerceAtLeast(Math.max(list.get(0).minIntrinsicWidth(i7), list.get(1).minIntrinsicWidth(i7)), 0);
    }
}
