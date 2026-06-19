package com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.task;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.bilibili.commons.compress.ZipUtils;
import com.bilibili.commons.io.FileUtils;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.bean.FrameUploadBean;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import qz0.c;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/upload/task/SubFrameUploadPreTask.class */
@Keep
public class SubFrameUploadPreTask {
    private final List<FrameUploadBean> frameUploadBeans;
    public final d.a mListener;
    private final String rootFile;

    public SubFrameUploadPreTask(String str, List<FrameUploadBean> list, d.a aVar) {
        BLog.e("AiFrameManager", "[分步骤上传】SubFrameUploadPreTask: " + list.size() + ",rootFile=" + str);
        this.frameUploadBeans = list;
        this.rootFile = str;
        this.mListener = aVar;
    }

    private void copyAndCompressList() {
        List<FrameUploadBean> list = this.frameUploadBeans;
        if (list == null) {
            return;
        }
        for (FrameUploadBean frameUploadBean : list) {
            frameUploadBean.copyFile = c.a(frameUploadBean.frameFile);
        }
    }

    @Nullable
    private String generateDescriptionFile() {
        JSONObject jSONObject = new JSONObject();
        for (FrameUploadBean frameUploadBean : this.frameUploadBeans) {
            File file = frameUploadBean.copyFile;
            if (file != null && file.exists()) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    String name = frameUploadBean.copyFile.getName();
                    jSONObject2.put("material_id", frameUploadBean.srcFilePath);
                    jSONObject2.put("material_type", frameUploadBean.materialType);
                    jSONObject2.put("time", frameUploadBean.projectFrameTime);
                    jSONObject2.put("file_duration", frameUploadBean.materialDuration);
                    jSONObject2.put("trim_in", frameUploadBean.trimIn);
                    jSONObject2.put("trim_out", frameUploadBean.trimOut);
                    jSONObject2.put("time_in_file", frameUploadBean.frameTime);
                    jSONObject.put(name, jSONObject2);
                } catch (JSONException e7) {
                    e7.printStackTrace();
                }
            }
        }
        String string = jSONObject.toString();
        File file2 = new File(this.rootFile, "frame_info.json");
        if (file2.exists()) {
            file2.delete();
        }
        try {
            FileUtils.write(file2, string);
            return file2.getAbsolutePath();
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    @Nullable
    private Pair<String, Integer> packZip(String str) {
        if (this.frameUploadBeans.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<FrameUploadBean> it = this.frameUploadBeans.iterator();
        while (it.hasNext()) {
            File file = it.next().copyFile;
            if (file != null) {
                arrayList.add(file);
            }
        }
        File file2 = new File(str);
        int size = arrayList.size();
        int i7 = size;
        if (file2.exists()) {
            i7 = size;
            if (file2.length() > 0) {
                i7 = size + 1;
            }
        }
        File[] fileArr = new File[i7];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            fileArr[i8] = (File) arrayList.get(i8);
        }
        if (i7 > arrayList.size()) {
            fileArr[i7 - 1] = file2;
        }
        File file3 = new File(this.rootFile, "frame.zip");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            ZipUtils.zip(file3, fileArr);
            return Pair.create(file3.getAbsolutePath(), Integer.valueOf(arrayList.size()));
        } catch (IOException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    @Nullable
    public Pair<String, Integer> start() {
        copyAndCompressList();
        return packZip(generateDescriptionFile());
    }
}
