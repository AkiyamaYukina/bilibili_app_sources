package com.bilibili.ship.theseus.ogv.operation.layout;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.VerticalAnchorable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/layout/b.class */
public final /* synthetic */ class b implements Function1 {
    public final Object invoke(Object obj) {
        ConstrainScope constrainScope = (ConstrainScope) obj;
        VerticalAnchorable start = constrainScope.getStart();
        ConstraintLayoutBaseScope.VerticalAnchor start2 = constrainScope.getParent().getStart();
        float f7 = 12;
        VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(start, start2, Dp.m3880constructorimpl(f7), 0.0f, 4, null);
        HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), Dp.m3880constructorimpl(f7), 0.0f, 4, null);
        HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainScope.getParent().getBottom(), Dp.m3880constructorimpl(f7), 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
