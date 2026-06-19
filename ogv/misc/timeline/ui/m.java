package com.bilibili.ogv.misc.timeline.ui;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.VerticalAnchorable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/m.class */
public final class m implements Function1<ConstrainScope, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstrainedLayoutReference f69581a;

    public m(ConstrainedLayoutReference constrainedLayoutReference) {
        this.f69581a = constrainedLayoutReference;
    }

    public final Object invoke(Object obj) {
        ConstrainScope constrainScope = (ConstrainScope) obj;
        HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
        VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), this.f69581a.getEnd(), 0.0f, 0.0f, 6, null);
        constrainScope.setWidth(Dimension.Companion.getFillToConstraints());
        return Unit.INSTANCE;
    }
}
