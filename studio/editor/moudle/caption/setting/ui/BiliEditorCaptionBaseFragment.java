package com.bilibili.studio.editor.moudle.caption.setting.ui;

import Xz0.d;
import ax0.c;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.videoeditor.util.V;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/BiliEditorCaptionBaseFragment.class */
public class BiliEditorCaptionBaseFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList<Runnable> f105800b = new ArrayList<>();

    @Nullable
    public static CaptionListItem kf(@NotNull c cVar) {
        CaptionListItem captionListItem;
        if (V.d(cVar.f54261a)) {
            Iterator it = cVar.f54261a.iterator();
            while (it.hasNext()) {
                captionListItem = (CaptionListItem) it.next();
                if (captionListItem.isSelected()) {
                    break;
                }
            }
            captionListItem = null;
        } else {
            captionListItem = null;
        }
        return captionListItem;
    }

    public static void mf(@NotNull CaptionListItem captionListItem, @NotNull String str) {
        d dVar = d.f28458a;
        int id = captionListItem.getId();
        dVar.getClass();
        d.y("editor", "error", str, String.valueOf(id), "download failed");
    }

    public static void nf(@NotNull CaptionListItem captionListItem, @NotNull String str) {
        if (captionListItem.isDownloaded()) {
            return;
        }
        d.z(d.f28458a, "editor", "start", str, String.valueOf(captionListItem.getId()));
    }

    public static void of(@NotNull CaptionListItem captionListItem, @NotNull String str) {
        d.z(d.f28458a, "editor", "success", str, String.valueOf(captionListItem.getId()));
    }

    public final void jf(@NotNull Runnable runnable) {
        if (isResumed()) {
            runnable.run();
        } else {
            this.f105800b.add(runnable);
        }
    }

    public final boolean lf() {
        return isAdded() && !isDetached();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f105800b.clear();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f105800b.isEmpty()) {
            return;
        }
        Iterator<T> it = this.f105800b.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f105800b.clear();
    }

    public void pf() {
    }
}
