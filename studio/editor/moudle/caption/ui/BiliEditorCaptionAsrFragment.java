package com.bilibili.studio.editor.moudle.caption.ui;

import TB0.r;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.studio.editor.base.BiliEditorBaseFragment;
import com.bilibili.studio.editor.moudle.caption.ui.BiliEditorCaptionAsrFragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.upper.module.aistory.fragment.AIStoryContainerFragment;
import com.mall.ui.page.home.view.q2;
import dI.d;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nx0.b;
import nx0.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/ui/BiliEditorCaptionAsrFragment.class */
public class BiliEditorCaptionAsrFragment extends BiliEditorBaseFragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ox0.a f106011l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public a f106012m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/ui/BiliEditorCaptionAsrFragment$a.class */
    public interface a {
        void a(boolean z6, boolean z7, boolean z8);

        void onCancel();
    }

    @NotNull
    public ConstraintLayout Af(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        r rVarInflate = r.inflate(layoutInflater, viewGroup, false);
        this.f106011l.e(rVarInflate);
        return rVarInflate.f23948a;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return Af(layoutInflater, viewGroup);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        ox0.a aVar = this.f106011l;
        ImageView imageView = aVar.a;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("asrCancel");
            imageView = null;
        }
        final int i7 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: FF0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f6053a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f6054b;

            {
                this.f6053a = i7;
                this.f6054b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (this.f6053a) {
                    case 0:
                        ((AIStoryContainerFragment) this.f6054b).nf();
                        break;
                    case 1:
                        ((q2) this.f6054b).f.setVisibility(8);
                        break;
                    default:
                        BiliEditorCaptionAsrFragment.a aVar2 = ((BiliEditorCaptionAsrFragment) this.f6054b).f106012m;
                        if (aVar2 != null) {
                            aVar2.onCancel();
                        }
                        break;
                }
            }
        });
        aVar.a().setOnClickListener(new d(1, this, aVar));
        TextView textView = aVar.c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoAsrItemTitle");
            textView = null;
        }
        textView.setText(getString(2131842086));
        TextView textView2 = aVar.d;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("musicAsrItemTitle");
            textView2 = null;
        }
        textView2.setText(getString(2131842447));
        TextView textView3 = aVar.e;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioAsrItemTitle");
            textView3 = null;
        }
        textView3.setText(getString(2131841777));
        TextView textView4 = aVar.c;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoAsrItemTitle");
            textView4 = null;
        }
        textView4.setAlpha(yf() ? 1.0f : 0.3f);
        CheckBox checkBoxD = aVar.d();
        checkBoxD.setAlpha(yf() ? 1.0f : 0.3f);
        checkBoxD.setEnabled(yf());
        checkBoxD.setChecked(yf());
        TextView textView5 = aVar.e;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioAsrItemTitle");
            textView5 = null;
        }
        textView5.setAlpha(xf() ? 1.0f : 0.3f);
        CheckBox checkBoxB = aVar.b();
        checkBoxB.setAlpha(xf() ? 1.0f : 0.3f);
        checkBoxB.setEnabled(xf());
        checkBoxB.setChecked(xf());
        TextView textView6 = aVar.d;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("musicAsrItemTitle");
            textView6 = null;
        }
        textView6.setAlpha(wf() ? 1.0f : 0.3f);
        CheckBox checkBoxC = aVar.c();
        float f7 = 0.3f;
        if (wf()) {
            f7 = 1.0f;
        }
        checkBoxC.setAlpha(f7);
        checkBoxC.setEnabled(wf());
        checkBoxC.setChecked(wf());
        zf();
        this.f105692j = false;
        ox0.a aVar2 = this.f106011l;
        aVar2.d().setOnCheckedChangeListener(new nx0.a(aVar2, this));
        aVar2.c().setOnCheckedChangeListener(new b(aVar2, this));
        aVar2.b().setOnCheckedChangeListener(new c(aVar2, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean wf() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r0 = r0.f105686c
            com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo r0 = r0.getEditorMusicInfo()
            r6 = r0
            r0 = 0
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r3
            com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r0 = r0.f105686c
            com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo r0 = r0.getEditorMusicInfo()
            com.bilibili.studio.videoeditor.bean.BMusic r0 = r0.themeMusic
            if (r0 != 0) goto L3c
            r0 = r3
            com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r0 = r0.f105686c
            com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo r0 = r0.getEditorMusicInfo()
            java.util.ArrayList<com.bilibili.studio.videoeditor.bean.BMusic> r0 = r0.bMusicList
            r6 = r0
            r0 = r5
            r4 = r0
            r0 = r6
            if (r0 == 0) goto L3e
            r0 = r5
            r4 = r0
            r0 = r6
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            r1 = 1
            if (r0 != r1) goto L3e
        L3c:
            r0 = 1
            r4 = r0
        L3e:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.ui.BiliEditorCaptionAsrFragment.wf():boolean");
    }

    public final boolean xf() {
        boolean z6 = false;
        if (this.f105686c.getRecordInfoList() != null) {
            z6 = false;
            if (!r0.isEmpty()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean yf() {
        List<BClip> userTrackBClipList = this.f105686c.getUserTrackBClipList();
        if (userTrackBClipList == null) {
            return false;
        }
        Iterator<T> it = userTrackBClipList.iterator();
        while (it.hasNext()) {
            if (((BClip) it.next()).clipMediaType == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.CAPTION;
    }

    public final void zf() {
        ox0.a aVar = this.f106011l;
        boolean z6 = aVar.d().isChecked() || aVar.c().isChecked() || aVar.b().isChecked();
        aVar.a().setEnabled(z6);
        aVar.a().setAlpha(z6 ? 1.0f : 0.4f);
    }
}
