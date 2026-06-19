package com.bilibili.upper.module.editvideo;

import L50.a;
import R50.r;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.studio.videoeditor.D;
import com.bilibili.studio.videoeditor.G;
import com.bilibili.studio.videoeditor.H;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.FileInfo;
import com.bilibili.upper.module.contribute.picker.ui.EditorCustomise;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/editvideo/BiliEditorRouterActivity.class */
@StabilityInferred(parameters = 0)
public final class BiliEditorRouterActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public String f113142B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public String f113143C;

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 1001) {
            setResult(i8, intent);
            finish();
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        this.f113142B = data != null ? data.getQueryParameter("filePath") : null;
        this.f113143C = data != null ? data.getQueryParameter("livekey") : null;
        String str = this.f113142B;
        if (str == null) {
            finish();
            return;
        }
        H.a().f108867b = 6;
        EditVideoInfo editVideoInfo = new EditVideoInfo();
        editVideoInfo.setLiveKey(this.f113143C);
        editVideoInfo.setCaller("undefined");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(new FileInfo(str));
        r rVarU = a.a.a.a != null ? r.u() : null;
        R50.a aVarS = null;
        if (rVarU != null) {
            aVarS = rVarU.s(str);
        }
        SelectVideo selectVideo = new SelectVideo();
        selectVideo.videoPath = str;
        selectVideo.bizFrom = 120;
        selectVideo.duration = aVarS != null ? aVarS.a.getDuration() : 0L;
        selectVideo.mimeType = "video";
        arrayList2.add(selectVideo);
        editVideoInfo.setVideoList(arrayList);
        editVideoInfo.setSelectVideoList(arrayList2);
        editVideoInfo.setEditorMode(34);
        editVideoInfo.setUseBmmSdkGray(false);
        D editorCustomise = new EditorCustomise(this);
        editorCustomise.setIsNewUI(true);
        editorCustomise.setRecommendMusic(false);
        editorCustomise.setNeedOpenTemplatePanel(false);
        ((EditorCustomise) editorCustomise).requestCode = 1001;
        G.b().d(this, editVideoInfo, editorCustomise, 1001);
    }
}
