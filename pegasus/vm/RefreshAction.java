package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.data.request.PegasusResponseWrapper;
import kotlin.jvm.internal.Intrinsics;
import mp0.C8028c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/RefreshAction.class */
@StabilityInferred(parameters = 0)
public final class RefreshAction implements com.bilibili.pegasus.n<C8028c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final lp0.c f79048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.request.i f79049b;

    public RefreshAction(@NotNull lp0.c cVar, @NotNull com.bilibili.pegasus.request.i iVar) {
        this.f79048a = cVar;
        this.f79049b = iVar;
    }

    public static Action b(PegasusResponseWrapper pegasusResponseWrapper) {
        return ((Boolean) com.bilibili.pegasus.common.o.f75658b.getValue()).booleanValue() ? new C5766a(pegasusResponseWrapper) : new C5770e(pegasusResponseWrapper);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x033b A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:20:0x006b, B:102:0x032f, B:104:0x033b, B:106:0x034a, B:107:0x0359, B:25:0x0080, B:93:0x02f0, B:95:0x0307, B:97:0x0316, B:26:0x0087, B:61:0x01f0, B:63:0x01fc, B:65:0x020b, B:66:0x021a, B:28:0x00ab, B:50:0x018e, B:52:0x019c, B:54:0x01b6, B:56:0x01c5, B:69:0x0221, B:71:0x0233, B:73:0x023c, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02bb, B:85:0x02c8, B:39:0x010d, B:42:0x0121, B:44:0x0127, B:88:0x02cf), top: B:112:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0359 A[Catch: Exception -> 0x0072, TRY_ENTER, TryCatch #0 {Exception -> 0x0072, blocks: (B:20:0x006b, B:102:0x032f, B:104:0x033b, B:106:0x034a, B:107:0x0359, B:25:0x0080, B:93:0x02f0, B:95:0x0307, B:97:0x0316, B:26:0x0087, B:61:0x01f0, B:63:0x01fc, B:65:0x020b, B:66:0x021a, B:28:0x00ab, B:50:0x018e, B:52:0x019c, B:54:0x01b6, B:56:0x01c5, B:69:0x0221, B:71:0x0233, B:73:0x023c, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02bb, B:85:0x02c8, B:39:0x010d, B:42:0x0121, B:44:0x0127, B:88:0x02cf), top: B:112:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019c A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #0 {Exception -> 0x0072, blocks: (B:20:0x006b, B:102:0x032f, B:104:0x033b, B:106:0x034a, B:107:0x0359, B:25:0x0080, B:93:0x02f0, B:95:0x0307, B:97:0x0316, B:26:0x0087, B:61:0x01f0, B:63:0x01fc, B:65:0x020b, B:66:0x021a, B:28:0x00ab, B:50:0x018e, B:52:0x019c, B:54:0x01b6, B:56:0x01c5, B:69:0x0221, B:71:0x0233, B:73:0x023c, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02bb, B:85:0x02c8, B:39:0x010d, B:42:0x0121, B:44:0x0127, B:88:0x02cf), top: B:112:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021a A[Catch: Exception -> 0x0072, TRY_ENTER, TryCatch #0 {Exception -> 0x0072, blocks: (B:20:0x006b, B:102:0x032f, B:104:0x033b, B:106:0x034a, B:107:0x0359, B:25:0x0080, B:93:0x02f0, B:95:0x0307, B:97:0x0316, B:26:0x0087, B:61:0x01f0, B:63:0x01fc, B:65:0x020b, B:66:0x021a, B:28:0x00ab, B:50:0x018e, B:52:0x019c, B:54:0x01b6, B:56:0x01c5, B:69:0x0221, B:71:0x0233, B:73:0x023c, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02bb, B:85:0x02c8, B:39:0x010d, B:42:0x0121, B:44:0x0127, B:88:0x02cf), top: B:112:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0221 A[Catch: Exception -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0072, blocks: (B:20:0x006b, B:102:0x032f, B:104:0x033b, B:106:0x034a, B:107:0x0359, B:25:0x0080, B:93:0x02f0, B:95:0x0307, B:97:0x0316, B:26:0x0087, B:61:0x01f0, B:63:0x01fc, B:65:0x020b, B:66:0x021a, B:28:0x00ab, B:50:0x018e, B:52:0x019c, B:54:0x01b6, B:56:0x01c5, B:69:0x0221, B:71:0x0233, B:73:0x023c, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02bb, B:85:0x02c8, B:39:0x010d, B:42:0x0121, B:44:0x0127, B:88:0x02cf), top: B:112:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0307 A[Catch: Exception -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0072, blocks: (B:20:0x006b, B:102:0x032f, B:104:0x033b, B:106:0x034a, B:107:0x0359, B:25:0x0080, B:93:0x02f0, B:95:0x0307, B:97:0x0316, B:26:0x0087, B:61:0x01f0, B:63:0x01fc, B:65:0x020b, B:66:0x021a, B:28:0x00ab, B:50:0x018e, B:52:0x019c, B:54:0x01b6, B:56:0x01c5, B:69:0x0221, B:71:0x0233, B:73:0x023c, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02bb, B:85:0x02c8, B:39:0x010d, B:42:0x0121, B:44:0x0127, B:88:0x02cf), top: B:112:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0314  */
    /* JADX WARN: Type inference failed for: r0v50, types: [com.bilibili.pegasus.vm.C] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.Store<mp0.C8028c> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.pegasus.Action> r11) {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.RefreshAction.a(com.bilibili.pegasus.Store, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshAction)) {
            return false;
        }
        RefreshAction refreshAction = (RefreshAction) obj;
        return Intrinsics.areEqual(this.f79048a, refreshAction.f79048a) && Intrinsics.areEqual(this.f79049b, refreshAction.f79049b);
    }

    public final int hashCode() {
        return this.f79049b.hashCode() + (this.f79048a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "RefreshAction(requestParam=" + this.f79048a + ", parser=" + this.f79049b + ")";
    }
}
