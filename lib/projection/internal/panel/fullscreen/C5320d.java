package com.bilibili.lib.projection.internal.panel.fullscreen;

import Yt0.Z;
import android.view.View;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.bililive.infra.arch.jetpack.liveData.SafeMutableLiveData;
import com.bilibili.bililive.videoliveplayer.net.beans.praise.LiveCollectionPraiseProcess;
import com.bilibili.search2.utils.SearchInlineSpeedSetDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.lib.projection.internal.panel.fullscreen.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/d.class */
public final /* synthetic */ class C5320d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f63410b;

    public /* synthetic */ C5320d(Object obj, int i7) {
        this.f63409a = i7;
        this.f63410b = obj;
    }

    public final Object invoke(Object obj) {
        Object obj2 = this.f63410b;
        switch (this.f63409a) {
            case 0:
                int i7 = ProjectionFullScreenActivity.f63352c1;
                Ie0.i.a((View) obj2, (WindowSizeClass) obj, 0, 0);
                break;
            case 1:
                SearchInlineSpeedSetDialog searchInlineSpeedSetDialog = (SearchInlineSpeedSetDialog) obj2;
                searchInlineSpeedSetDialog.f88799c.invoke((Z) obj);
                searchInlineSpeedSetDialog.f88800d.setValue(Boolean.TRUE);
                break;
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    ((com.bilibili.upper.module.template.vm.g) obj2).M0();
                }
                break;
            default:
                ((SafeMutableLiveData) ((mL.a) obj2).o.getValue()).setValue((LiveCollectionPraiseProcess) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
