package com.bilibili.studio.editor.moudle.editormain.ui.fragments.danmaku;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.bplus.im.pblink.w;
import com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuListFragment;
import com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuSettingFragment;
import com.bilibili.studio.editor.moudle.danmaku.ui.BiliEditorDanmakuFragment;
import com.bilibili.studio.editor.moudle.danmaku.v1.EditorDanmakuInfo;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/danmaku/BiliEditorDanmakuFragmentV3.class */
public final class BiliEditorDanmakuFragmentV3 extends BiliEditorDanmakuFragment {
    @Override // com.bilibili.studio.editor.moudle.danmaku.ui.BiliEditorDanmakuFragment
    public final void Gf() {
        List<EditorDanmakuInfo> danmakuInfoList;
        List<EditorDanmakuInfo> danmakuInfoList2;
        EditorDanmakuInfo editorDanmakuInfo;
        EditVideoInfo editVideoInfo = this.f105686c;
        Integer numValueOf = (editVideoInfo == null || (danmakuInfoList2 = editVideoInfo.getDanmakuInfoList()) == null || (editorDanmakuInfo = (EditorDanmakuInfo) CollectionsKt.lastOrNull(danmakuInfoList2)) == null) ? null : Integer.valueOf(editorDanmakuInfo.reverseType);
        EditVideoInfo editVideoInfo2 = this.f105686c;
        int size = (editVideoInfo2 == null || (danmakuInfoList = editVideoInfo2.getDanmakuInfoList()) == null) ? 0 : danmakuInfoList.size();
        super.Gf();
        EditVideoInfo editVideoInfo3 = this.f105686c;
        Integer numValueOf2 = null;
        if (editVideoInfo3 != null) {
            List<EditorDanmakuInfo> danmakuInfoList3 = editVideoInfo3.getDanmakuInfoList();
            numValueOf2 = null;
            if (danmakuInfoList3 != null) {
                EditorDanmakuInfo editorDanmakuInfo2 = (EditorDanmakuInfo) CollectionsKt.lastOrNull(danmakuInfoList3);
                numValueOf2 = null;
                if (editorDanmakuInfo2 != null) {
                    numValueOf2 = Integer.valueOf(editorDanmakuInfo2.reverseType);
                }
            }
        }
        EditVideoInfo editVideoInfo4 = this.f105686c;
        int size2 = 0;
        if (editVideoInfo4 != null) {
            List<EditorDanmakuInfo> danmakuInfoList4 = editVideoInfo4.getDanmakuInfoList();
            size2 = 0;
            if (danmakuInfoList4 != null) {
                size2 = danmakuInfoList4.size();
            }
        }
        if (size2 >= size) {
            if (numValueOf2 != null) {
                int iIntValue = numValueOf2.intValue();
                mf(this.f105686c, iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? BackUpTag.COMPOUND_CAPTION_OTHER : BackUpTag.COMPOUND_CAPTION_COOPERATE : BackUpTag.COMPOUND_CAPTION_LIVE : BackUpTag.COMPOUND_CAPTION_MANUSCRIPT);
                return;
            }
            return;
        }
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            mf(this.f105686c, iIntValue2 != 1 ? iIntValue2 != 2 ? iIntValue2 != 3 ? BackUpTag.COMPOUND_CAPTION_OTHER : BackUpTag.COMPOUND_CAPTION_COOPERATE : BackUpTag.COMPOUND_CAPTION_LIVE : BackUpTag.COMPOUND_CAPTION_MANUSCRIPT);
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final void mf(@Nullable EditVideoInfo editVideoInfo, @Nullable BackUpTag backUpTag) {
        this.f105685b.n(editVideoInfo, backUpTag);
    }

    @Override // com.bilibili.studio.editor.moudle.danmaku.ui.BiliEditorDanmakuFragment, androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501848, viewGroup, false);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean qf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean rf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.moudle.danmaku.ui.BiliEditorDanmakuFragment
    @NotNull
    public final BiliEditorDanmakuListFragment xf(long j7) {
        Bundle bundleA = w.a(j7, "select_id");
        BiliEditorDanmakuListFragmentV3 biliEditorDanmakuListFragmentV3 = new BiliEditorDanmakuListFragmentV3();
        biliEditorDanmakuListFragmentV3.setArguments(bundleA);
        return biliEditorDanmakuListFragmentV3;
    }

    @Override // com.bilibili.studio.editor.moudle.danmaku.ui.BiliEditorDanmakuFragment
    @NotNull
    public final BiliEditorDanmakuSettingFragment yf() {
        return new BiliEditorDanmakuSettingFragmentV3();
    }
}
