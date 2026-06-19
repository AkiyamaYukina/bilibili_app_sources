package com.bilibili.studio.videoeditor.nvsstreaming;

import L50.a;
import P50.d;
import P50.m;
import P50.n;
import P50.s;
import P50.u;
import R50.B;
import R50.f;
import R50.g;
import R50.r;
import R50.v;
import R50.x;
import R50.y;
import android.graphics.Bitmap;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.bilibili.lib.editor.engine.studio.StudioRationalImplX;
import com.bilibili.studio.comm.report.editor.bean.EditorAction;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.kaleidoscope.sdk.VideoTrack;
import com.bilibili.studio.videoeditor.extension.h;
import nw0.C8145a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/nvsstreaming/EditProxyUtils.class */
@Keep
public class EditProxyUtils {
    @Nullable
    public static u appendVideoTrack(n nVar) {
        B xVar;
        if (nVar == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        VideoTrack videoTrackAppendVideoTrack = ((v) nVar).a.appendVideoTrack();
        if (videoTrackAppendVideoTrack == null) {
            xVar = null;
        } else {
            xVar = new x(videoTrackAppendVideoTrack);
            xVar.b = videoTrackAppendVideoTrack;
        }
        C8145a.b().c(new EditorAction(EditorAction.ACTION_APPEND_VT, System.currentTimeMillis() - jCurrentTimeMillis));
        return xVar;
    }

    public static void changeTrimInPoint(s sVar, long j7, boolean z6) {
        if (sVar == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((g) sVar).a.changeTrimInPoint(j7, z6);
        C8145a.b().c(new EditorAction(EditorAction.ACTION_TRIM_IN, System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static long changeTrimOutPoint(s sVar, long j7, boolean z6) {
        if (sVar == null) {
            return 0L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jChangeTrimOutPoint = ((y) sVar).b.changeTrimOutPoint(j7, z6);
        C8145a.b().c(new EditorAction(EditorAction.ACTION_TRIM_OUT, System.currentTimeMillis() - jCurrentTimeMillis));
        return jChangeTrimOutPoint;
    }

    @Nullable
    public static Bitmap grabImageFromTimeline(i iVar, long j7) {
        Bitmap bitmapGrabImageFromTimeline = null;
        if (iVar.f108304f != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            r rVarU = a.a.a.a != null ? r.u() : null;
            (rVarU != null ? rVarU.a : null).getClass();
            StudioRationalImplX studioRationalImplX = new StudioRationalImplX(1, 5);
            r rVar = iVar.f108304f;
            bitmapGrabImageFromTimeline = null;
            if (rVar != null) {
                bitmapGrabImageFromTimeline = rVar.b.grabImageFromTimeline(v.p(iVar.i()), j7, StudioRationalImplX.unbox(studioRationalImplX));
            }
            C8145a.b().c(new EditorAction(EditorAction.ACTION_GRAB_IMAGE, System.currentTimeMillis() - jCurrentTimeMillis));
        }
        return bitmapGrabImageFromTimeline;
    }

    public static void removeAllClips(u uVar) {
        if (uVar == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i7 = 0;
        while (true) {
            B b7 = (B) uVar;
            if (i7 >= b7.b.getClipCount()) {
                b7.r();
                C8145a.b().c(new EditorAction(EditorAction.ACTION_REMOVE_CLIP, System.currentTimeMillis() - jCurrentTimeMillis));
                return;
            }
            h.b(b7.s(i7));
            i7++;
        }
    }

    public static boolean removeAllClips(d dVar) {
        int i7 = 0;
        if (dVar == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            f fVar = (f) dVar;
            if (i7 >= fVar.b.getClipCount()) {
                boolean zRemoveAllClips = ((x) dVar).a.removeAllClips();
                C8145a.b().c(new EditorAction(EditorAction.ACTION_REMOVE_CLIP, System.currentTimeMillis() - jCurrentTimeMillis));
                return zRemoveAllClips;
            }
            h.b(fVar.t(i7));
            i7++;
        }
    }

    public static boolean removeTimeline(m mVar, n nVar) {
        if (mVar == null || nVar == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zQ = mVar.q(nVar);
        C8145a.b().c(new EditorAction(EditorAction.ACTION_REMOVE_TL, System.currentTimeMillis() - jCurrentTimeMillis));
        return zQ;
    }

    public static void stop(m mVar) {
        if (mVar == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        mVar.stop();
        C8145a.b().c(new EditorAction(EditorAction.ACTION_STOP, System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static void stop(m mVar, int i7) {
        if (mVar == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        mVar.stop(i7);
        C8145a.b().c(new EditorAction(EditorAction.ACTION_STOP_INTERRUPT, System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
