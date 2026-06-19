package com.bilibili.studio.videoeditor.help.mux;

import androidx.annotation.Keep;
import com.bilibili.api.BiliConfig;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.danmaku.v1.EditorDanmakuInfo;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorTimelineVideoFx;
import com.bilibili.studio.editor.repository.entity.BiliEditorMusicRhythmEntity;
import com.bilibili.studio.videoeditor.bean.EditUseInfo;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureUsageInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditTtsInfo;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import com.bilibili.studio.videoeditor.util.ResolutionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/mux/MuxInfo.class */
@Keep
public class MuxInfo extends MuxInfoOld {
    public long allDuration;
    public BiliEditorMusicRhythmEntity biliEditorMusicRhythmEntity;
    public ArrayList<BiliEditorStickerInfo> biliEditorStickerInfoList;
    public List<BiliEditorTimelineVideoFx> biliEditorTimelineFxList;
    public List<CaptionInfo> captionInfoList;
    public CaptureUsageInfo captureUsageInfo;
    public List<EditorDanmakuInfo> danmakuInfoList;
    public String dstDCIMPath;
    public String dstMediaPath;
    public EditUseInfo editUseInfo;
    public EditorMusicInfo editorMusicInfo;
    public Map<String, String> eventExtraInfo;
    public String from;
    public boolean isFastVideo;
    public List<MuxVideoTrack> muxVideoTracks;
    public String publishNavId;
    public List<RecordInfo> recordInfoList;
    public List<EditTtsInfo> ttsInfoList;
    public int videoBitrate;
    public int videoHeight;
    public int videoWidth;
    public int videoFps = 30;
    public ResolutionType resolutionType = ResolutionType.RES_1080;
    public boolean isHdrExport = false;
    public boolean skipVideoTranscode = false;
    public long projectVersion = BiliConfig.getBiliVersionCode();
}
