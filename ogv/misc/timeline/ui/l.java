package com.bilibili.ogv.misc.timeline.ui;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.VerticalAnchorable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/l.class */
public final class l implements Function1<ConstrainScope, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f69580a = new Object();

    public final Object invoke(Object obj) {
        ConstrainScope constrainScope = (ConstrainScope) obj;
        HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
        VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
        HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainScope.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        constrainScope.setHeight(Dimension.Companion.getFillToConstraints());
        return Unit.INSTANCE;
    }
}
