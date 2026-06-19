package com.bilibili.lib.projection.internal.control;

import T9.e;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.lib.projection.internal.control.NewBubbleHelper;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/a.class */
public final class a<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewBubbleHelper f63066a;

    public a(NewBubbleHelper newBubbleHelper) {
        this.f63066a = newBubbleHelper;
    }

    public final void accept(Object obj) {
        ProjectionOperationConfig.NewThirdProjBubbleConfig newThirdProjBubbleConfig;
        Object next;
        List<ProjectionOperationConfig.NewThirdProjBubbleConfig> list;
        Object next2;
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        ProjectionOperationConfig.ThirdProjBubbleConfig thirdProjBubble = ((ProjectionOperationConfig) pair.getSecond()).getThirdProjBubble();
        NewBubbleHelper newBubbleHelper = this.f63066a;
        newBubbleHelper.getClass();
        if (thirdProjBubble == null || (list = thirdProjBubble.getList()) == null) {
            newThirdProjBubbleConfig = null;
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (Intrinsics.areEqual(String.valueOf(((ProjectionOperationConfig.NewThirdProjBubbleConfig) next2).getScene()), newBubbleHelper.f63025b)) {
                        break;
                    }
                }
            }
            newThirdProjBubbleConfig = (ProjectionOperationConfig.NewThirdProjBubbleConfig) next2;
        }
        if (!zBooleanValue || newThirdProjBubbleConfig == null) {
            return;
        }
        ProjectionOperationConfig.NewThirdProjBubbleConfig newThirdProjBubbleConfig2 = null;
        if (thirdProjBubble != null) {
            List<ProjectionOperationConfig.NewThirdProjBubbleConfig> list2 = thirdProjBubble.getList();
            newThirdProjBubbleConfig2 = null;
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                do {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!Intrinsics.areEqual(String.valueOf(((ProjectionOperationConfig.NewThirdProjBubbleConfig) next).getScene()), newBubbleHelper.f63025b));
                newThirdProjBubbleConfig2 = (ProjectionOperationConfig.NewThirdProjBubbleConfig) next;
            }
        }
        e.a("mShowNewThirdBubbleListener is null: ", "ott-dev-test", newBubbleHelper.f63032j == null);
        NewBubbleHelper.a aVar = newBubbleHelper.f63032j;
        if (aVar != null) {
            aVar.a(newThirdProjBubbleConfig2);
        }
    }
}
