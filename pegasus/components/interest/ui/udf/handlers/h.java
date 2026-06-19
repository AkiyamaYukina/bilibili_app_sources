package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/h.class */
@StabilityInferred(parameters = 1)
public final class h implements Co0.a<Actions.ReportActions> {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/h$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f76429a;

        static {
            int[] iArr = new int[Actions.ReportActions.Type.values().length];
            try {
                iArr[Actions.ReportActions.Type.Show.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Actions.ReportActions.Type.Click.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Actions.ReportActions.Type.Fold.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f76429a = iArr;
        }
    }

    @Nullable
    public static String b() {
        return com.bilibili.pegasus.request.b.g() ? "1" : "2";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02bc  */
    @Override // Co0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Co0.b a(kotlinx.coroutines.flow.StateFlow r10, com.bilibili.pegasus.components.interest.ui.udf.actions.Actions r11) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 5123
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.udf.handlers.h.a(kotlinx.coroutines.flow.StateFlow, com.bilibili.pegasus.components.interest.ui.udf.actions.Actions):Co0.b");
    }
}
