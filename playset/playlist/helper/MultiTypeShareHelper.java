package com.bilibili.playset.playlist.helper;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import kntr.common.share.core.model.ShareLocalContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/helper/MultiTypeShareHelper.class */
@StabilityInferred(parameters = 0)
public final class MultiTypeShareHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final FragmentActivity f85316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f85318c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public a f85319d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/helper/MultiTypeShareHelper$a.class */
    public interface a {
        void Q9();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/helper/MultiTypeShareHelper$b.class */
    public static final class b implements ShareLocalContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FragmentActivity f85320a;

        public b(FragmentActivity fragmentActivity) {
            this.f85320a = fragmentActivity;
        }

        public final Object getCurrentCtx() {
            return this.f85320a;
        }
    }

    public MultiTypeShareHelper(@Nullable FragmentActivity fragmentActivity) {
        this.f85316a = fragmentActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.NotNull com.bilibili.playset.api.MultitypePlaylist.Info r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            long r1 = r1.id
            r0.f85317b = r1
            r0 = r20
            com.bilibili.playset.api.Upper r0 = r0.upper
            r23 = r0
            r0 = r23
            if (r0 == 0) goto L1c
            r0 = r23
            long r0 = r0.mid
            r21 = r0
            goto L1e
        L1c:
            r0 = 0
            r21 = r0
        L1e:
            r0 = r23
            if (r0 == 0) goto L33
            r0 = r23
            java.lang.String r0 = r0.name
            r24 = r0
            r0 = r24
            r23 = r0
            r0 = r24
            if (r0 != 0) goto L37
        L33:
            java.lang.String r0 = ""
            r23 = r0
        L37:
            r0 = r19
            r1 = r23
            r0.f85318c = r1
            r0 = r20
            java.lang.String r0 = r0.cover
            r20 = r0
            r0 = r20
            if (r0 != 0) goto L4c
            java.lang.String r0 = ""
            r20 = r0
            goto L4c
        L4c:
            r0 = r19
            androidx.fragment.app.FragmentActivity r0 = r0.f85316a
            r23 = r0
            r0 = r23
            if (r0 != 0) goto L58
            return
        L58:
            com.bilibili.playset.playlist.helper.MultiTypeShareHelper$b r0 = new com.bilibili.playset.playlist.helper.MultiTypeShareHelper$b
            r1 = r0
            r2 = r23
            r1.<init>(r2)
            r24 = r0
            r0 = 0
            r1 = 0
            r2 = r20
            r3 = r21
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = r19
            java.lang.String r4 = r4.f85318c
            r5 = r19
            long r5 = r5.f85317b
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "19"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1048451(0xfff83, float:1.469193E-39)
            kntr.common.share.common.handler.dynamic.c r0 = v71.c.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r25 = r0
            kntr.common.share.domain.model.h r0 = new kntr.common.share.domain.model.h
            r1 = r0
            kntr.common.share.domain.model.ShareParams r2 = new kntr.common.share.domain.model.ShareParams
            r3 = r2
            java.lang.String r4 = ""
            r5 = r19
            long r5 = r5.f85317b
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r8 = 0
            r9 = 0
            r10 = 48
            r11 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = 0
            r4 = 6
            r1.<init>(r2, r3, r4)
            r20 = r0
            r0 = r23
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            r1 = 0
            r2 = 0
            com.bilibili.playset.playlist.helper.MultiTypeShareHelper$shareMultitypePlaylist$1 r3 = new com.bilibili.playset.playlist.helper.MultiTypeShareHelper$shareMultitypePlaylist$1
            r4 = r3
            r5 = r20
            r6 = r25
            r7 = r24
            r8 = r19
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r4 = 3
            r5 = 0
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.helper.MultiTypeShareHelper.a(com.bilibili.playset.api.MultitypePlaylist$Info):void");
    }
}
