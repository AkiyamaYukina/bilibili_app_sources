package com.bilibili.studio.comm.manager.hdr;

import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.List;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import yw0.C9104b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/hdr/d.class */
public final class d {
    @JvmStatic
    public static final boolean a(@Nullable EditVideoInfo editVideoInfo) {
        if (!zw0.b.e()) {
            return false;
        }
        List<BClip> userTrackBClipList = editVideoInfo != null ? editVideoInfo.getUserTrackBClipList() : null;
        List<BClip> list = userTrackBClipList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (BClip bClip : userTrackBClipList) {
            if (bClip.getOutPoint() - bClip.getInPoint() >= 10000 && (!bClip.isVideo() || !C9104b.d(bClip.videoPath))) {
                return false;
            }
        }
        BLog.i("UpperHdrUtils", "isAllHdr");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(boolean r8, @org.jetbrains.annotations.Nullable P50.n r9, @org.jetbrains.annotations.Nullable com.bilibili.studio.editor.timeline.UpperLiveWindowExt r10) {
        /*
            kotlin.Lazy<com.bilibili.studio.comm.manager.hdr.a> r0 = com.bilibili.studio.comm.manager.hdr.a.f105396e
            r16 = r0
            com.bilibili.studio.comm.manager.hdr.a r0 = com.bilibili.studio.comm.manager.hdr.a.C1185a.a()
            boolean r0 = r0.g()
            r15 = r0
            r0 = 0
            r14 = r0
            r0 = r15
            if (r0 != 0) goto L17
            r0 = 0
            return r0
        L17:
            r0 = r8
            if (r0 == 0) goto L21
            r0 = 3
            r12 = r0
            goto L24
        L21:
            r0 = 1
            r12 = r0
        L24:
            r0 = r10
            if (r0 == 0) goto L4b
            r0 = r12
            r1 = 1
            if (r0 == r1) goto L3a
            r0 = r12
            r1 = 2
            if (r0 == r1) goto L44
            r0 = r12
            r1 = 3
            if (r0 == r1) goto L3f
        L3a:
            r0 = 0
            r11 = r0
            goto L46
        L3f:
            r0 = 2
            r11 = r0
            goto L46
        L44:
            r0 = 1
            r11 = r0
        L46:
            r0 = r10
            r1 = r11
            r0.setHDRDisplayModeX(r1)
        L4b:
            r0 = r8
            if (r0 == 0) goto L55
            r0 = 3
            r13 = r0
            goto L58
        L55:
            r0 = 1
            r13 = r0
        L58:
            r0 = r9
            if (r0 == 0) goto L8c
            r0 = r14
            r11 = r0
            r0 = r13
            r1 = 1
            if (r0 == r1) goto L7e
            r0 = r13
            r1 = 2
            if (r0 == r1) goto L7c
            r0 = r13
            r1 = 3
            if (r0 == r1) goto L77
            r0 = r14
            r11 = r0
            goto L7e
        L77:
            r0 = 2
            r11 = r0
            goto L7e
        L7c:
            r0 = 1
            r11 = r0
        L7e:
            r0 = r9
            R50.v r0 = (R50.v) r0
            com.bilibili.studio.kaleidoscope.sdk.Timeline r0 = r0.a
            r1 = r11
            boolean r0 = r0.changeVideoBitDepth(r1)
        L8c:
            r0 = r13
            java.lang.String r1 = "UpperHdrUtils"
            r2 = r12
            java.lang.String r3 = "switchHdrPreview,"
            java.lang.String r4 = ", "
            java.lang.String r5 = ", "
            r6 = r8
            java.lang.StringBuilder r2 = cf.e.a(r2, r3, r4, r5, r6)
            androidx.compose.foundation.text.selection.P0.a(r0, r1, r2)
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.comm.manager.hdr.d.b(boolean, P50.n, com.bilibili.studio.editor.timeline.UpperLiveWindowExt):boolean");
    }
}
